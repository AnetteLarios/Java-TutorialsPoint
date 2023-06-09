import models.EmployeeApple;
import models.EmployeeMainCompany;
    /*
    Application main class calls main function that executes the process of creating objects of two classes
    to show how polymorphism works, and how properties can be inherited from another class.

    @author Anette Larios
    @since 09-06-2023
     */

public class ApplicationMain {

    public static void main(String[] args) {
        /*
        Creating a new object called employeeApple1 of type EmployeeApple and giving values.
         */
        EmployeeApple employeeApple1 = new EmployeeApple("John Fray", "California, US",
                                    1, 5000.00);
        /*
        Creating a new object type EmployeeMainCompany called employeeMainCompany and giving values.
         */
        EmployeeMainCompany employeeMainCompany1 = new EmployeeMainCompany("Fernanda Oliveira",
                                            "Sao Paulo, Brazil", 4);
        //calling mail.check() method from 'EmployeeApple' class for 'employeeApple1' object.
        employeeApple1.mailCheck();
        //calling mail.check method from 'EmployeeMainCompany' class for 'employeeMainCompany1' object.
        employeeMainCompany1.mailCheck();
        }
    }

