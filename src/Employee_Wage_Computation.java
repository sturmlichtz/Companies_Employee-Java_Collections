public class Employee_Wage_Computation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		final int wagePerHour=20;
		final int fullDayHour=8;
		final int partTimeHour=4;
		int dailyWage=0;
		final int isFullTime=1;
		final int isPartTime=2;
		int currentDay=0;
		int monthlyWage=0;
		final int maxMonthDays=20;
		for(currentDay=1;currentDay<=maxMonthDays;currentDay++) {
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case isFullTime:
				dailyWage=(wagePerHour*fullDayHour);
				break;
			case isPartTime:
				dailyWage=(wagePerHour*partTimeHour);
			default:
				break;
			}
			monthlyWage+=dailyWage;
		}
		System.out.println("Total monthly salary is :- "+monthlyWage);
	}
}
