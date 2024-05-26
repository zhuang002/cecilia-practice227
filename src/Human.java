/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhuan
 */
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
        System.out.println(this.name+','+this.age+','+this.gender);
    }
    
    
    
}
