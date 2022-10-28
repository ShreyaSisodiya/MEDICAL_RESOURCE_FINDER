/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medical_resource_management;

import java.util.ArrayList;
import java.util.HashMap;
import models.Community;
import models.CommunityAdmin;
import models.Doctor;
import models.Hospital;
import models.Patient;
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
    public static HashMap<String, CommunityAdmin > communityAdminMap = new HashMap<String, CommunityAdmin>();
    public static HashMap<String, Community> communityMap = new HashMap<String, Community>();
    public static HashMap<String, Doctor> doctorMap = new HashMap<String, Doctor>();
    //public static HashMap<String, Patient> patientMap = new HashMap<String, Patient>();
    public static HashMap<String, Hospital> hospitalMap = new HashMap<String, Hospital>();
    
    public static ArrayList<String> cityList = new ArrayList<String>();

    public static void main(String[] args) 
    {
        // TODO code application logic here
        cityList.add("New York");
        cityList.add("Boston");

        User Shreya = new User("Shreya", "admin", "System Admin");
        User Charlie = new User("Charlie", "patient","Patient" );
        User Victoria = new User("Victoria", "admin", "Community Admin");
        User Grey = new User("Grey", "doctor", "Doctor");
        
        userMap.put(Charlie.getUserName(), Charlie);
        userMap.put(Shreya.getUserName(), Shreya);
        userMap.put(Victoria.getUserName(), Victoria);
        userMap.put(Grey.getUserName(), Grey);
        
        Community Lenox = new Community("Lenox Hill", 00001,"Ney York");
        Community Yorkville = new Community("Yorkville", 00002, "New York");
        Community BeaconHill = new Community("Beacon Hill",00003,"Boston");
        Community Cambridge = new Community("Cambridge",00004,"Boston");
        
        communityMap.put(Lenox.getCommunityName(), Lenox);
        communityMap.put(Yorkville.getCommunityName(), Yorkville);
        communityMap.put(BeaconHill.getCommunityName(), BeaconHill);
        communityMap.put(Cambridge.getCommunityName(), Cambridge);
        
        Doctor Taylor = new Doctor("hospitalA", "Taylor", "Swift", "female",30, "houseA", "Lenox", 00001, "New York");
        Doctor Lana = new Doctor("hospitalB", "Lana", "Del Rey", "female",30, "houseB", "Yorkville", 00002, "New York");
        Doctor Ariana = new Doctor("hospitalC", "Ariana", "Grande", "female", 30,"houseC", "Beacon Hill", 00003, "Boston");
        Doctor Billie = new Doctor("hospitalD", "Billie", "Ellish", "female",19, "houseD", "Cambridge", 00004, "Boston");
        
        doctorMap.put(Billie.getFirstName(), Billie);
        doctorMap.put(Taylor.getFirstName(), Taylor);
        doctorMap.put(Lana.getFirstName(), Lana);
        doctorMap.put(Ariana.getFirstName(), Ariana);
        
        Hospital HA = new Hospital("A", "Lenox Hill", 00001, "New York");
        Hospital HB = new Hospital("B", "Yorkville", 00002, "New York");
        Hospital HC = new Hospital("C", "Beacon Hill", 00003, "Boston");
        Hospital HD = new Hospital("D", "Cambridge", 00004, "Boston");
            
        hospitalMap.put(HA.getHospitalName(), HA);
        hospitalMap.put(HB.getHospitalName(), HB);
        hospitalMap.put(HC.getHospitalName(), HC);
        hospitalMap.put(HD.getHospitalName(), HD);
        
        CommunityAdmin CA = new CommunityAdmin("Grey", "Grey", "Male", "Cambridge", 00004,"Boston");
        CommunityAdmin CA2 = new CommunityAdmin("Fin", "Fin", "Male", "Market Yard", 00003,"Bsoton");
        
        communityMap.put(CA.getUserName(), CA);
        communityMap.put(CA2.getUserName(), CA2);
        
        doctorMap.put(Billie.getFirstName(), Billie);
        doctorMap.put(Taylor.getFirstName(), Taylor);
        doctorMap.put(Lana.getFirstName(), Lana);
        doctorMap.put(Ariana.getFirstName(), Ariana);
        
        LoginForm logForm = new LoginForm();
        logForm.show();
     }
    
}
