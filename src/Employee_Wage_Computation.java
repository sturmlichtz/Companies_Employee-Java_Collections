import java.util.HashMap;
import java.util.Scanner;

public class Employee_Wage_Computation implements Company_Emp_Wage_Interface{
	Scanner sc = new Scanner(System.in);
	final int isFullTime=1;
	final int isPartTime=2;
	final int partTimeHours=4;
	final int fullTimeHours=8;
	int noOfCompnay=0;
	Set_Company_Info[] companyArray = new Set_Company_Info[2];
	HashMap<String, Set_Company_Info> eachCompanyWageMap = new HashMap<>();
	public int emp_Random_Check() {
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		return empCheck;
	}
	
	private void welcome_message() {
		System.out.println("Welcome to Employee Wage Computation Program");
	}
	
	public void checkAttendence(){	
		switch (emp_Random_Check()) {
		case isFullTime:
			System.out.println("Employee present for full time");	
			break;
		case isPartTime:
			System.out.println("Employee is present for part time");
			break;
		default:
			System.out.println("Employee is absent");
			break;
		}
	}
	public int daliy_Wage(Set_Company_Info comapnayInfoRef) {
		int empWage=0;
		switch (emp_Random_Check()) {
		case isFullTime:
			empWage = (comapnayInfoRef.empRatePerHour*fullTimeHours);	
			break;
		case isPartTime:
			empWage= (comapnayInfoRef.empRatePerHour*partTimeHours);
			break;
		default:
			break;
		}
		return empWage;
	}
	
	public int monthly_Wage(Set_Company_Info comapnayInfoRef) {	
		int currentDay = 0;
		int currentHour=0;
		int monthlyWage = 0;
		while (currentHour<=comapnayInfoRef.maxMonthHours || currentDay<=comapnayInfoRef.maxMonthDays) {
			currentDay++;
			switch (emp_Random_Check()) {
			case isFullTime:
				monthlyWage+=daliy_Wage(comapnayInfoRef);
				currentHour+=fullTimeHours;
				break;
			case isPartTime:
				monthlyWage+=daliy_Wage(comapnayInfoRef);
				currentHour+=partTimeHours;
				break;
			default:
				break;
			}
		}
		return monthlyWage;
	}
	
	public void add_Company_Info(String companyName, int empRatePerHour,int maxMonthDays,int maxMonthHours) {	
		companyArray[noOfCompnay]= new Set_Company_Info(companyName,empRatePerHour,maxMonthDays,maxMonthHours);
		Set_Company_Info companyInfoRef = new Set_Company_Info(companyName, empRatePerHour, maxMonthDays, maxMonthHours);
		eachCompanyWageMap.put(companyName, companyInfoRef);
		noOfCompnay++;
	}
	
	public int getMonthlyWage(String company) {
		return eachCompanyWageMap.get(company).empMonthlyWage;
	}
	
	public void display() {
		for (int i = 0; i < noOfCompnay; i++) {
			Set_Company_Info companyInfoRef = companyArray[i];
			companyInfoRef.Set_Emp_Wage(this.monthly_Wage(companyInfoRef));
			System.out.println(companyInfoRef);
			//int totalwage = this.monthly_Wage(companyArray[i]);
			//System.out.println("Total Monthly Salary for "+companyArray[i].companyName+" is "+totalwage);
	
		}
	}

	public static void main(String[] args) {
		Employee_Wage_Computation employeeWageRef = new Employee_Wage_Computation();
		employeeWageRef.welcome_message();
		employeeWageRef.add_Company_Info("D-Mart", 20, 20, 100);
		employeeWageRef.add_Company_Info("Reliance", 25, 22, 150);
		employeeWageRef.display();
	}

}
