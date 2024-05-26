/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhuan
 */
public class Address {
    public int streetNumber=0;
    public String street = null;
    public String city = null;
    public String province = "ON";
    public String postCode = null;
    public String country = "CA";

    @Override
    public String toString() {
        return "Address{" + "streetNumber=" + streetNumber + ", street=" + street + ", city=" + city + ", province=" + province + ", postCode=" + postCode + ", country=" + country + '}';
    }
    
    
}
