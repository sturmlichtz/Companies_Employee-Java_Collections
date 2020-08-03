public interface Company_Emp_Wage_Interface {
	public void add_Company_Info(String companyName, int empRatePerHour,int maxMonthDays,int maxMonthHours);
	public void display();
	public int getMonthlyWage(String company);
	public int emp_Random_Check();
	public void checkAttendence();
	public int daliy_Wage(Set_Company_Info comapnayInfoRef);
	public int monthly_Wage(Set_Company_Info comapnayInfoRef);
}
