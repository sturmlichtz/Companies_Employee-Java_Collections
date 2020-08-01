public class Employee_Wage_Computation {
	public static void main(String[] args) {
		final int wagePerHour=20;
		final int fulldayHour=8;
		int dailyWage=0;
		System.out.println("Welcome to Employee Wage Computation");
		int isFullTime=1;
		int empCheck = (int)Math.floor(Math.random()*10)%2;
		if (empCheck == isFullTime){
			System.out.println("Employee is Present");
			dailyWage=(wagePerHour*fulldayHour);
			System.out.println("daily wage is "+dailyWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
