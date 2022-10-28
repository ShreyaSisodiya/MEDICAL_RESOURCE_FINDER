/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author shreyasisodiya
 */
public class CommunityAdmin extends Community
{   
    private String userName;
    private String commName;
    private String commGender;

    public CommunityAdmin(String userName, String commName, String commGender, String communityName, int pinCode, String cityName) {
        super(communityName, pinCode, cityName);
        this.setUserName(userName);
        this.setCommName(commName);
        this.setCommGender(commGender);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }

    public String getCommGender() {
        return commGender;
    }

    public void setCommGender(String commGender) {
        this.commGender = commGender;
    }
   
    
    
}
