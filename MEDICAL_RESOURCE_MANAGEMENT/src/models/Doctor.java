/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author shreyasisodiya
 */
public class Doctor extends Person
{
    private String hospitalName;

    public Doctor(String hospitalName, String firstName, String lastName, String gender, int age, String houseName, 
            String communityName, int pinCode, String cityName) 
    {
        super(firstName, lastName, gender, age, houseName, communityName, pinCode, cityName);
        this.setHospitalName(hospitalName);
    }
    
    public String getHospitalName()
    {
        return hospitalName;
    }
    
    public void setHospitalName(String hospitalName) 
    {
        this.hospitalName = hospitalName;
}
    
    
}
