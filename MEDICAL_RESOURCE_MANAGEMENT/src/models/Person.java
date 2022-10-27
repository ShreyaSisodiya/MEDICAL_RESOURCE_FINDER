/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author shreyasisodiya
 */
public class Person extends House
{
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Person(String firstName, String lastName, String gender, int age, 
            String houseName, String communityName, int pinCode, String cityName) 
    {
        super(houseName, communityName, pinCode, cityName);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGender(gender);
        this.setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
