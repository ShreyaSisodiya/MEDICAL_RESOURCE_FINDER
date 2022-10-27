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
    
    public Doctor(String firstName, String lastName, String gender, int age, String CommunityName, int pinCode, String cityName, String communityList) {
        super(firstName, lastName, gender, age, CommunityName, pinCode, cityName, communityList);
    }
    private int docID;

    public Doctor(int docID, String firstName, String lastName, String gender, int age, String CommunityName, int pinCode, String cityName, String communityList) {
        super(firstName, lastName, gender, age, CommunityName, pinCode, cityName, communityList);
        this.docID = docID;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }
    
}
