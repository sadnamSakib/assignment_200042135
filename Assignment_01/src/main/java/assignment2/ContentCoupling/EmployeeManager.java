package assignment2.ContentCoupling;

public class EmployeeManager {
    public void SalaryIncrementer(Employee emp){
        if(emp.Salary<100000){
            emp.Salary+=(emp.Salary*0.1);
        }
    }
}
