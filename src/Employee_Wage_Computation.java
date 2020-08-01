public class Employee_Wage_Computation {
	final int isFullTime=1;
	final int isPartTime=2;
	final int partTimeHours=4;
	final int fullTimeHours=8;
	private int emp_Random_Check() {
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		return empCheck;
	}
	private void welcome_message() {
		System.out.println("Welcome to Employee Wage Computation Program");
	}
	private void checkAttendence(){	
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
	private int daliy_Wage() {
		final int empRatePerHour=20;
		int empWage=0;
		switch (emp_Random_Check()) {
		case isFullTime:
			empWage = (empRatePerHour*fullTimeHours);	
			break;
		case isPartTime:
			empWage= (empRatePerHour*partTimeHours);
			break;
		default:
			break;
		}
		return empWage;
	}
	int monthly_Wage() {
		final int maxHours=100;
		final int maxDays=20;
		int currentDay = 0;
		int currentHour=0;
		int monthlyWage = 0;
		while (currentHour<=maxHours || currentDay<=maxDays) {
			switch (emp_Random_Check()) {
			case isFullTime:
				monthlyWage+=daliy_Wage();
				currentHour+=fullTimeHours;
				break;
			case isPartTime:
				monthlyWage+=daliy_Wage();
				currentHour+=partTimeHours;
				break;
			default:
				break;
			}
			currentDay++;
		}
		return monthlyWage;
	}
	public static void main(String[] args) {
		Employee_Wage_Computation employeeWageRef = new Employee_Wage_Computation();
		employeeWageRef.welcome_message();
		System.out.println("Monthly Wage is "+employeeWageRef.monthly_Wage()); 
	}
}
