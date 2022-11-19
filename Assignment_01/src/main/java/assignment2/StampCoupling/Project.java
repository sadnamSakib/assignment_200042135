package assignment2.StampCoupling;

import java.util.List;

public class Project {
    String projectID;
    String EmployeeID;
    public Project(Employee emp , String projectID){
        this.EmployeeID = emp.ID;
        this.projectID = projectID;
    }
}
