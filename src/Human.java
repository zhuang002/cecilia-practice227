/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhuan
 */
// all classes are child class of Object class.
public class Human {
    private final String name;
    private int age = 0;
    private final char gender;
    private Address address = null;
    private String citizen="CA";

    public Human(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    void printInfo() {
        System.out.println(this.name+','+this.age+','+this.gender+','+this.address+','+this.citizen);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return this.gender=='M'?"Male":"Female";
    }

    public Address getAddress() {
        return address;
    }

    public String getCitizen() {
        return citizen;
    }
    
    
    
}
