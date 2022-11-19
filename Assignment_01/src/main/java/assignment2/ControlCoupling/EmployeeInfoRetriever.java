package assignment2.ControlCoupling;

public class EmployeeInfoRetriever {
    public String RetrieveInfo(int infoType,Employee emp){
        if(infoType==1){
            return emp.address;
        }
        else{
            return emp.name;
        }
    }
}
