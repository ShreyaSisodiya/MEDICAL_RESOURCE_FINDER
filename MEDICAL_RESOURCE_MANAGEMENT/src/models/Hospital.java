/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author shreyasisodiya
 */
public class Hospital extends Community
{
    private String hospitalName;

    public Hospital(String CommunityName, int pinCode, String cityName) {
        super(CommunityName, pinCode, cityName);
    }

    public Hospital(String hospitalName, String CommunityName, int pinCode, String cityName) {
        super(CommunityName, pinCode, cityName);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
}
