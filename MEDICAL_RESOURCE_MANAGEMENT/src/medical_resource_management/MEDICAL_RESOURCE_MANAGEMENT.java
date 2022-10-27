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


        User Shreya = new User("Shreya", "admin", "System Admin");
        User Charlie = new User("Charlie", "patient","Patient" );
        User Nupoor = new User("Nupoor", "admin", "Community Admin");
        User Grey = new User("Grey", "doctor", "Doctor");
        
        userMap.put(Charlie.getUserName(), Charlie);
        userMap.put(Shreya.getUserName(), Shreya);
        userMap.put(Nupoor.getUserName(), Nupoor);
        userMap.put(Grey.getUserName(), Grey);
        
        LoginForm logForm = new LoginForm();
        logForm.show();
     }
    
}
