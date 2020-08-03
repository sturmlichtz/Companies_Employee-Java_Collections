public interface Company_Emp_Wage_Interface {
	public void add_Company_Info(String companyName, int empRatePerHour,int maxMonthDays,int maxMonthHours);
	public void display();
	public int getMonthlyWage(String company);
}
