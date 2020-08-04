public class Set_Company_Info {
	String companyName;
	int maxMonthDays;
	int maxMonthHours;
	int empRatePerHour;
	int empMonthlyWage;
	int empDailyWage;
	public Set_Company_Info(String companyName, int empRatePerHour,int maxMonthDays,int maxMonthHours) {
		this.companyName=companyName;
		this.empRatePerHour=empRatePerHour;
		this.maxMonthDays=maxMonthDays;
		this.maxMonthHours=maxMonthHours;
		empMonthlyWage=0;
	}
	public void Set_Emp_Wage(int empMonthlyWage) {
		this.empMonthlyWage=empMonthlyWage;
	}

}