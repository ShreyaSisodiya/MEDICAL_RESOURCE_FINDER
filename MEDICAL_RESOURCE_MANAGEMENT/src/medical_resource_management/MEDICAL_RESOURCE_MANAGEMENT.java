/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medical_resource_management;

import java.util.HashMap;

import models.User;
import views.LoginForm;

/**
 *
 * @author shreyasisodiya
 */
public class MEDICAL_RESOURCE_MANAGEMENT
{

    /**
     * @param args the command line arguments
     */
    public static HashMap<String, User> userMap = new HashMap<String, User>();

    public static void main(String[] args) {
        // TODO code application logic here


        User Shreya = new User("Shreya", "admin", "SystemAdmin");
        User Krishnna = new User("Krishnna", "patient","Patient" );
        
        
        userMap.put(Krishnna.getUserName(), Krishnna);
        userMap.put(Shreya.getUserName(), Shreya);
        
        LoginForm logForm = new LoginForm();
        logForm.show();
     }
    
}
