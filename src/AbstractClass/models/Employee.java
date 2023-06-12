package AbstractClass.models;

/*
Employee model

@author Anette Larios
@since 12.06.2023
 */
public abstract class Employee {

    private String name;
    private String address;
    private int number;
    //Class constructor
    public Employee(String name, String address, int number){

        System.out.println("Constructing Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    /*
    mailCheck function prints employee's data.

    @author AnetteLarios
     */
    public void mailCheck(){
        System.out.println("Mailing a check to"+ " " + this.name + " " + this.address);
    }

    /*
    toString function it will show clients data
    @return is a String result of the concatenations of a given client's data.
    @author Anette Larios
    @since 12.06.2023
     */
    public String toString(){
        return name + " " + address + " " + number;
    }
    //getters


    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    //setter
    public void setAddress (String address){
        this.address = address;
    }

}

