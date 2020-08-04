import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee_Wage_Computation implements Company_Emp_Wage_Interface{
	final int isFullTime=1;
	final int isPartTime=2;
	int working_Hours_In_Day=0;
	int wageForDay=0;
	int noOfCompnay=0;
	ArrayList<Set_Company_Info> companyInfoList = new ArrayList<>();
	HashMap<Integer, Integer> dailyWagesMap = new HashMap();
	public int emp_Random_Check() {
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		return empCheck;
	}
	
	private void welcome_message() {
		System.out.println("Welcome to Employee Wage Computation Program");
	}

	public int monthly_Wage(Set_Company_Info comapnayInfoRef) {	
		int currentDay = 0;
		int monthlyWage = 0;
		int currentHour = 0;
		int empWage=0;
		int DayHours=0;
		while (currentHour<comapnayInfoRef.maxMonthHours && currentDay<comapnayInfoRef.maxMonthDays) {
			currentDay++;
			switch (emp_Random_Check()) {
			case isFullTime:
				DayHours=8;
				break;
			case isPartTime:
				DayHours=4;
				break;
			default:
				DayHours=0;
				break;
			}
			empWage = (comapnayInfoRef.empRatePerHour*DayHours);
			monthlyWage+=empWage;
			currentHour+=DayHours;
			dailyWagesMap.put(currentDay, empWage);
		}	
		return monthlyWage;
	}
	
	
	public void add_Company_Info(String companyName, int empRatePerHour,int maxMonthDays,int maxMonthHours){
		Set_Company_Info refForList =new Set_Company_Info(companyName, empRatePerHour, maxMonthDays, maxMonthHours);
		companyInfoList.add(refForList);	
	}


	public void display() {
		for (int i = 0; i < companyInfoList.size(); i++) {
			Set_Company_Info companyArrayList = companyInfoList.get(i);
			companyArrayList.Set_Emp_Wage(this.monthly_Wage(companyArrayList));
		    Set set = dailyWagesMap.entrySet();
		    Iterator iterator = set.iterator();
		    while(iterator.hasNext()) {
		       Map.Entry mentry = (Map.Entry)iterator.next();
		       System.out.println(" For Day "+ mentry.getKey() + " Salary was : "+mentry.getValue());
		      }
				
			System.out.println("For "+companyArrayList.companyName+ " total monthly wages are :-"+companyArrayList.empMonthlyWage);
		}
	}

	public static void main(String[] args) {
		Employee_Wage_Computation employeeWageRef = new Employee_Wage_Computation();
		employeeWageRef.welcome_message();
		employeeWageRef.add_Company_Info("D-Mart", 10, 2, 10);
		employeeWageRef.add_Company_Info("A-Mart", 20, 2, 12);
		employeeWageRef.display();
	}

}
