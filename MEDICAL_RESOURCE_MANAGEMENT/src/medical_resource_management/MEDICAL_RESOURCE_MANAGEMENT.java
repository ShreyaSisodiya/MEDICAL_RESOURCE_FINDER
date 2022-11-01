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
import models.Encounter;
import models.Hospital;
import models.House;
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
    public static HashMap<String, Patient> patientMap = new HashMap<String, Patient>();
    public static HashMap<String, Hospital> hospitalMap = new HashMap<String, Hospital>();
    public static HashMap<String, House> houseMap = new HashMap<String, House>();
    
    public static ArrayList<String> cityList = new ArrayList<String>();
    public static ArrayList<Encounter> encounters = new ArrayList<Encounter>();
    
    public static String citiesName = "";
    public static String comName = "";
    public static String docUserName = "";
    public static String docName = "";
    public static String patUserName = "";

    public static void main(String[] args) 
    {
        // TODO code application logic here
        cityList.add("New York");
        cityList.add("Boston");

        User Shreya = new User("Shreya", "admin", "System Admin");
        User Krishnna = new User("Krishnna", "patient","Patient");
        User Victoria = new User("Victoria", "admin", "Community Admin");
        User Grey = new User("Grey", "doctor", "Doctor");
        User Fin = new User("Fin", "admin", "Community Admin");
        User Bessa = new User("Bessa", "admin", "Community Admin");
        User Charlie = new User("Charlie", "admin", "Community Admin");
        User Taylor = new User("Taylor", "doctor", "Doctor");
        User Lana = new User("Lana", "doctor", "Doctor");
        User Ariana = new User("Ariana", "doctor", "Doctor");
        User Billie = new User("Billie", "doctor", "Doctor");
        User Bob = new User("Bob", "patient", "Patient"); 
        // User Bob = new User("Bob", "patient", "Patient"); 
          
        userMap.put(Krishnna.getUserName(), Krishnna);
        userMap.put(Shreya.getUserName(), Shreya);
        userMap.put(Victoria.getUserName(), Victoria);
        userMap.put(Grey.getUserName(), Grey);
        userMap.put(Fin.getUserName(), Fin);
        userMap.put(Bessa.getUserName(), Bessa);
        userMap.put(Charlie.getUserName(), Charlie);
        userMap.put(Taylor.getUserName(), Taylor);
        userMap.put(Lana.getUserName(), Lana);
        userMap.put(Ariana.getUserName(), Ariana);
        userMap.put(Billie.getUserName(), Billie);
        userMap.put(Bob.getUserName(), Bob);
        
        Community Lenox = new Community("Lenox Hill", 00001,"New York");
        Community Yorkville = new Community("Yorkville", 00002, "New York");
        Community BeaconHill = new Community("Beacon Hill",00003,"Boston");
        Community Cambridge = new Community("Cambridge",00004,"Boston");
        
        communityMap.put(Lenox.getCommunityName(), Lenox);
        communityMap.put(Yorkville.getCommunityName(), Yorkville);
        communityMap.put(BeaconHill.getCommunityName(), BeaconHill);
        communityMap.put(Cambridge.getCommunityName(), Cambridge);
        
        Doctor D1 = new Doctor("hospitalA", "Taylor", "Swift", "female",30, "houseA", "Lenox", 00001, "New York");
        Doctor D2 = new Doctor("hospitalB", "Lana", "Del Rey", "female",30, "houseB", "Yorkville", 00002, "New York");
        Doctor D3 = new Doctor("hospitalC", "Ariana", "Grande", "female", 30,"houseC", "Beacon Hill", 00003, "Boston");
        Doctor D4 = new Doctor("hospitalD", "Billie", "Ellish", "female",19, "houseD", "Cambridge", 00004, "Boston");
        
        doctorMap.put(D4.getFirstName(), D4);
        doctorMap.put(D1.getFirstName(), D1);
        doctorMap.put(D2.getFirstName(), D2);
        doctorMap.put(D3.getFirstName(), D3);
        
        Hospital HA = new Hospital("A",1, "Lenox Hill", 00001, "New York");
        Hospital HB = new Hospital("B",2, "Yorkville", 00002, "New York");
        Hospital HC = new Hospital("C",3, "Beacon Hill", 00003, "Boston");
        Hospital HD = new Hospital("D", 4,"Cambridge", 00004, "Boston");
            
        hospitalMap.put(HA.getHospitalName(), HA);
        hospitalMap.put(HB.getHospitalName(), HB);
        hospitalMap.put(HC.getHospitalName(), HC);
        hospitalMap.put(HD.getHospitalName(), HD);
        
        CommunityAdmin CA = new CommunityAdmin("Victoria", "Victoria", "Female", "Cambridge", 00004,"Boston");
        CommunityAdmin CA2 = new CommunityAdmin("Fin", "Fin", "Male", "Beacon Hill", 00003,"Bsoton");
        CommunityAdmin CA3 = new CommunityAdmin("Charlie", "Charlie", "Female", "Yorkville", 00002,"New York");
        CommunityAdmin CA4 = new CommunityAdmin("Bessa", "Bessa", "Female", "Lenox", 00001,"New York");
   
        communityAdminMap.put(CA.getUserName(), CA);
        communityAdminMap.put(CA2.getUserName(), CA2);
        communityAdminMap.put(CA3.getUserName(), CA3);
        communityAdminMap.put(CA4.getUserName(), CA4);
        
        Patient Nupoor = new Patient(1, "Nupoor","nupoor", "A", "Nupoor", "Korde", "female", 25, "JVue","Cambridge",00004,"Boston");
        
        patientMap.put(Nupoor.getPatientUserName(), Nupoor);
        
        LoginForm logForm = new LoginForm();
        logForm.show();
     }
    
}
