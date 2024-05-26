/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhuan
 */
public class Main {
    public static void main(String[] args) {
        Human cecilia = new Human("Cecilia Li", 18, 'F');
        Address address = new Address();
        address.streetNumber=101;
        address.street="Yong Street";
        address.city="Toronto";
        address.postCode = "M1P 0B1";
        cecilia.setAddress(address);
        cecilia.printInfo();
        
        
        
    }
}
