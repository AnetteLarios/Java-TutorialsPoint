package InheritanceAndPolymorphism.models;
/*
    EmployeeApple is a class that inherits the properties from 'EmployeeMainCompany' class.

    @author Anette Larios
    @since 06-09-2023
 */
public class EmployeeApple extends EmployeeMainCompany {
    private double annualSalary;

    //class constructor
    public EmployeeApple(String name, String address, int number, double annualSalary){

        super(name, address, number);
        setAnnualSalary(annualSalary);
    }
    /*
    mailCheck is a fuction that acts like a mail from AppleCompany
    Prints a message for the user, shows the name and the annual Salary of the employee

    @author Anette Larios
    @since 06-09-2023
     */
    public void mailCheck(){

        System.out.println("Mailing a check from AppleCompany to: " + getName() + " " +
                            "with annualSalary: "+ annualSalary);
    }
    //getter
    public double getAnnualSalary(){

        return annualSalary;
    }
    //setter
    public void setAnnualSalary(double annualSalary) {

        if (annualSalary >= 0.0) {
            this.annualSalary = annualSalary;
        }
    }
}
