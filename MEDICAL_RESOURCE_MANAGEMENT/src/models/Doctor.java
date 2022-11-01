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
    private int doctorID;
    private String userName;

    public Doctor(String hospitalName, int doctorID, String userName, String firstName, String lastName, String gender, int age, 
            String houseName, String communityName, int pinCode, String cityName) 
    {
        super(firstName, lastName, gender, age, houseName, communityName, pinCode, cityName);
        this.setHospitalName(hospitalName);
        this.setDoctorID(doctorID);
        this.setUserName(userName);
    }

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

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
