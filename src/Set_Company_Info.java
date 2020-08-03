public class Set_Company_Info {
	String companyName;
	int maxMonthDays;
	int maxMonthHours;
	int empRatePerHour;
	int empMonthlyWage;
	Set_Company_Info(String companyName, int empRatePerHour,int maxMonthDays,int maxMonthHours) {
		this.companyName=companyName;
		this.empRatePerHour=empRatePerHour;
		this.maxMonthDays=maxMonthDays;
		this.maxMonthHours=maxMonthHours;
		empMonthlyWage=0;
	}
	void Set_Emp_Wage(int empMonthlyWage) {
		this.empMonthlyWage=empMonthlyWage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "total wage for comapany " +companyName+" is: "+empMonthlyWage ;
	}
	
}