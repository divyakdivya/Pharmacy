/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Monisha
 */
import java.util.*;
public class Main
 {
         int noOfPharmacies;
        string location;
        Arraylist<Pharmacy>pharmacieslist=new Arraylist<Pharmacy>();
        Arraylist<Pharmacy>nearbypharmacieslist=new Arraylist<Pharmacy>();
		
         public static void main(String[] args) 
         {
        // TODO code application logic here
        pharamaciesList=createPharmaciesList(pharmaciesList);
        nearByPharmaciesList=fetchPharmaciesNearBy(pharmacies,"velachery",2);
         }
		 //METHOD TO CREATE LIST OF PHARMACY
         public ArrayList<pharmacy>createPharmacyList(ArrayList pharmaciesList);
         {
              Pharmacy p1=new Pharmacy();
        p1.setName("JP medicals");
        p1.setLocation("velachery");
        p1.setMobileNumber("9952907395");
        p1.setAddress("MGR NAGAR");
    
     Pharmacy p2=new Pharmacy();
        p2.setName("saxthi medicals");
        p2.setLocation("ADAMBAKKAM");
        p2.setMobileNumber("995245495");
        p2.setAddress("RR NAGAR");
    
     Pharmacy p3=new Pharmacy();
        p3.setName("JPR medicals");
        p3.setLocation("velachery BYPASS");
        p3.setMobileNumber("995346395");
        p3.setAddress("KK NAGAR");
    
     Pharmacy p4=new Pharmacy();
        p4.setName("RAJU medicals");
        p4.setLocation("velachery");
        p4.setMobileNumber("99325395");
        p4.setAddress("RK NAGAR");
    pharmaciesList.add(p1);
    pharmaciesList.add(p2);
    pharmaciesList.add(p3);
    pharmaciesList.add(p4); 
    
    return pharmaciesList;
             
             
         }
         //method to fetch near by pharmacies  based on location
         public ArrayList<Pharmacy>fetchpharmaciesNearBy(ArrayList pharmaciesList, sring location,int noOfPharmacies)
         {
             int size=pharmaciesList size();
             for(i=0;i<size;i++)
             {
               Pharmacy p=new Pharmacy();
               p=pharmaciesList[i];
               if(location.equalsIgnore(p.location)))
               nearByPharmaciesList.add(p);
             }
             return nearByPharmaciesList;
             }
 };
             
            };
