package AbstractClass;

import AbstractClass.models.Employee;
import AbstractClass.models.EmployeeModelWithSalary;

/*
    This is a example of how can be applied Abstract classes in Java
    Implements two classes that can use each other methods and fields.

    @author Anette Larios
    @since 12.06.2023
    @version 1.8.0



 */
public class AbstractAppMain {
    //main
    public static void main (String args[]){
        /*
        Creating 'employee0' object type 'EmployeeModelWithSalary' and assigning values
         */
    EmployeeModelWithSalary employee0 = new EmployeeModelWithSalary("Fred Johnson", "New York, USA", 4, 5000.00);
    /*
    Creating 'employee1' object type 'Employee' and assigning values
     */
    Employee employee1 = new EmployeeModelWithSalary("Dakota Brown", "Texas, USA", 2, 7800.00);
    System.out.println("Call mailCheck using EmployeeModelWithSalary reference");
    /*
    Calling mailCheck method from Employee model
     */
    employee0.mailCheck();
    System.out.println("Call mailCheck using Employee reference");
    /*
    Calling mailCheck method from 'EmployeeModelWithSalary'
     */
    employee1.mailCheck();
    }
}
