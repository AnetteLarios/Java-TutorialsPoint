package Encapsulation.models;
/*
EncapsulatedClass model for example purposes. It has 3 fields that can only be accessed to assign and view values
through getters and setters.

@author Anette Larios
@since 12.06.2023
 */
public class EncapsulatedClass {
    private String name;
    private String idNum;
    private int age;

    //getters and setters
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIdNum (String idNum){
        this.idNum = idNum;
    }
}
