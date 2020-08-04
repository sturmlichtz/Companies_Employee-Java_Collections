import java.util.ArrayList;

public class Employee_Wage_Computation implements Company_Emp_Wage_Interface{
	final int isFullTime=1;
	final int isPartTime=2;
	final int partTimeHours=4;
	int working_Hours_In_Day=0;
	int wageForDay=0;
	int fullTimeHours=8;
	int noOfCompnay=0;
	ArrayList<Set_Company_Info> companyInfoList = new ArrayList<>();
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
		while (currentHour<comapnayInfoRef.maxMonthHours || currentDay<comapnayInfoRef.maxMonthDays) {
			currentDay++;
			switch (emp_Random_Check()) {
			case isFullTime:
				empWage = (comapnayInfoRef.empRatePerHour*fullTimeHours);
				monthlyWage=monthlyWage+empWage;
				currentHour=currentHour+fullTimeHours;
				break;
			case isPartTime:
				empWage= (comapnayInfoRef.empRatePerHour*partTimeHours);
				monthlyWage=monthlyWage+empWage;
				currentHour=currentHour+partTimeHours;
				break;
			default:
				monthlyWage=monthlyWage+0;
				currentHour=currentHour+0;
				break;
			}
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
			System.out.println(companyArrayList.companyName+ " :-"+companyArrayList.empMonthlyWage);
		}
	}

	public static void main(String[] args) {
		Employee_Wage_Computation employeeWageRef = new Employee_Wage_Computation();
		employeeWageRef.welcome_message();
		employeeWageRef.add_Company_Info("D-Mart", 10, 2, 8);
		employeeWageRef.display();
	}

}
