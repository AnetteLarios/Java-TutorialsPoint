package models;
/*
EmployeeMainCompany is the main model from a fake company

@Author Anette Larios
@since 09-06-2023
 */
public class EmployeeMainCompany {
    private String name;
    private String address;
    private int number;

    //Class constructor
    public EmployeeMainCompany(String name, String address, int number){

        this.name = name;
        this.address  = address;
        this.number = number;
    }
    //Getters
    public String getName(){
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getNumber(){
        return number;
    }
    //setter
    public void setAddress(String address){
        this.address = address;
    }

    /*MailCheck function acts like a message from the MainCompany
    @author Anette Larios
    @since 09-06-2023
    */
    public void mailCheck(){
        System.out.println("Mailing a check from MainCompany to: " + this.name + " " + this.address);
    }
    /* toString function is an object from String class
       it will return the information from a given employee
       @return is a String made by the concatenation of instance 'name', 'address', and 'number', from
       the class 'EmployeeMainCompany'

       @author Anette Larios
       @since 09-06-2023

    */
    public String toString() {
        return name + " " + address + " " + number;
    }


}




