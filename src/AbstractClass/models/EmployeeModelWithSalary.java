package AbstractClass.models;

/*
 EmployeeModelWithSalary is a subclass that inherits 'Employee' methods an properties.

 @author Anette Larios
 @since 12.06.2023
 */
public class EmployeeModelWithSalary extends Employee {
    private double salary;

    //Class constructor
    public EmployeeModelWithSalary(String name, String address, int number, double salary){

        super(name, address, number);
        setSalary(salary);
    }
    /*
    mailCheck function prints employees data.

    @author Anette Larios
    @since 12.06.2023
     */
    public void mailCheck(){

        System.out.println("Within mailcheck of Salary Class");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
    //getter
    public double getSalary(){
        return salary;
    }
    //setter
    public void setSalary(double salary){
        if(salary >= 0.0) {
            this.salary = salary;
        }
    }



}
