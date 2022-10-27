/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author shreyasisodiya
 */
public class Patient extends Person
{
    private String patientUserName;
    private String patientPassword;
    private String hospitalName;

    public Patient(String patientUserName, String patientPassword, String hospitalName, String firstName, String lastName, 
            String gender, int age, String houseName, String communityName, int pinCode, String cityName)
    {
        super(firstName, lastName, gender, age, houseName, communityName, pinCode, cityName);
        this.setPatientUserName(patientUserName);
        this.setPatientPassword(patientPassword);
        this.setHospitalName(hospitalName);
    }

    public String getPatientUserName() {
        return patientUserName;
    }

    public void setPatientUserName(String patientUserName) {
        this.patientUserName = patientUserName;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    
}
