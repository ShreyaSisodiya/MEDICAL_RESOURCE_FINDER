/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.cityList;

/**
 *
 * @author shreyasisodiya
 */
public class City
{
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityname) {
        this.cityName = cityName;
    }    
    public static void addCity(String city){
        cityList.add(city);
    }
}
