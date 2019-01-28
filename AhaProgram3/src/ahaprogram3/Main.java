
package ahaprogram3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static Container container1 = new Container ("Unnamed Container1");
    public static Container container2 = new Container ("Unnamed Container2");
    public static Container container3 = new Container ("Unnamed Container3");
    public static Container container4 = new Container ("Unnamed Container4");
    public static Container container5 = new Container ("Unnamed Container5");
    public static boolean loop = false;
    
    public static void main(String[] args) {
      
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello! This is the AHA Program of Rjjalosjos");
        System.out.println("Please type the letter of your option");
        
        
        while (loop != true) {
           
            showOptions();
            InputHandler();
            
            
        }
    }
     
    public static void InputHandler() {
        
        Scanner reader = new Scanner(System.in);
         String optionletter = reader.nextLine();
        if (optionletter.equals("A")) {  // OPTION A
                System.out.println("There are 5 containers.. What container will you name? ");
                System.out.print("Type the number of your container: ");
                String contInput = reader.nextLine();
                
                if (contInput.equals("1")) {
                    System.out.print("Input the name of Container 1: ");
                    String ContInp1 = reader.nextLine();
                    container1.renameCont(ContInp1);                    
                    container1.printContainer();
                    
                } else if (contInput.equals("2")) {
                    System.out.print("Input the name of Container 2: ");
                    String ContInp2 = reader.nextLine();
                    container2.renameCont(ContInp2);                    
                    container2.printContainer();
                } else if (contInput.equals("3")) {
                    System.out.print("Input the name of Container 3: ");
                    String ContInp3 = reader.nextLine();
                    container3.renameCont(ContInp3);                    
                    container3.printContainer();
                } else if (contInput.equals("4")) {
                    System.out.print("Input the name of Container 4: ");
                    String ContInp4 = reader.nextLine();
                    container4.renameCont(ContInp4);                    
                    container4.printContainer();
                    
                } else if (contInput.equals("5")) {
                    System.out.print("Input the name of Container 5: ");
                    String ContInp5 = reader.nextLine();
                    container5.renameCont(ContInp5);                    
                    container5.printContainer();
                }
                
            }
            
            if (optionletter.equals("B")) {    // for option B
                System.out.println("");
                System.out.println("Note: If you want to add same can names, make the names different.");
                System.out.println("Ex. Corned Beef1, Corned Beef2, Corned Beef3");
                System.out.println("Preffered format of expiration date | Ex. 09/20/19 ");
                System.out.println("");
                System.out.println("Which container will you use?");
                System.out.print("Type a number for the container: ");
                String contforAdd = reader.nextLine();
                
                if (contforAdd.equals("1")) {
                    
                    System.out.print("How many cans will you add?: ");
                    int numofCans1 = Integer.parseInt(reader.nextLine());
                    
                    for (int i = 0; i < numofCans1; i++) {
                        System.out.print("Enter the name of Can " + (i + 1) + " : ");
                        String CanName = reader.nextLine();
                        System.out.println("Enter the Expiration Date of Can " + (i + 1) + " : ");
                        String expidate = reader.nextLine();
                        container1.AddCan(CanName, expidate);
                        
                    }
                    System.out.println("**CANS ADDED SUCCESSFULLY**");
                }
                
                if (contforAdd.equals("2")) {
                    
                    System.out.print("How many cans will you add?: ");
                    int numofCans2 = Integer.parseInt(reader.nextLine());
                    
                    for (int i = 0; i < numofCans2; i++) {
                        System.out.print("Enter the name of Can " + (i + 1) + " : ");
                        String CanName = reader.nextLine();
                        System.out.println("Enter the Expiration Date of Can " + (i + 1) + " : ");
                        String expidate = reader.nextLine();
                        container2.AddCan(CanName, expidate);
                        
                    }
                    System.out.println("**CANS ADDED SUCCESSFULLY**");
                }
                
                if (contforAdd.equals("3")) {
                    
                    System.out.print("How many cans will you add?: ");
                    int numofCans3 = Integer.parseInt(reader.nextLine());
                    
                    for (int i = 0; i < numofCans3; i++) {
                        System.out.print("Enter the name of Can " + (i + 1) + " : ");
                        String CanName = reader.nextLine();
                        System.out.println("Enter the Expiration Date of Can " + (i + 1) + " : ");
                        String expidate = reader.nextLine();
                        container3.AddCan(CanName, expidate);
                        
                    }
                    System.out.println("**CANS ADDED SUCCESSFULLY**");
                }
                if (contforAdd.equals("4")) {
                    
                    System.out.print("How many cans will you add?: ");
                    int numofCans4 = Integer.parseInt(reader.nextLine());
                    
                    for (int i = 0; i < numofCans4; i++) {
                        System.out.print("Enter the name of Can " + (i + 1) + " : ");
                        String CanName = reader.nextLine();
                        System.out.println("Enter the Expiration Date of Can " + (i + 1) + " : ");
                        String expidate = reader.nextLine();
                        container4.AddCan(CanName, expidate);
                        
                    }
                    System.out.println("**CANS ADDED SUCCESSFULLY**");
                }
                
                if (contforAdd.equals("5")) {
                    
                    System.out.print("How many cans will you add?: ");
                    int numofCans5 = Integer.parseInt(reader.nextLine());
                    
                    for (int i = 0; i < numofCans5; i++) {
                        System.out.print("Enter the name of Can " + (i + 1) + " : ");
                        String CanName = reader.nextLine();
                        System.out.println("Enter the Expiration Date of Can " + (i + 1) + " : ");
                        String expidate = reader.nextLine();
                        container5.AddCan(CanName, expidate);
                        
                    }
                    System.out.println("**CANS ADDED SUCCESSFULLY**");
                }
                
            }
            
            if (optionletter.equals("C")) {                
                System.out.println("Which container will you use?");
                System.out.print("Type a number for the container: ");
                String contforRemove = reader.nextLine();
                
                if (contforRemove.equals("1")) {                    
                    System.out.print("What can will you remove?: ");
                    String canRemove = reader.nextLine();
                    container1.RemoveCan(canRemove);
                }
                
                if (contforRemove.equals("2")) {                    
                    System.out.print("What can will you remove?: ");
                    String canRemove = reader.nextLine();
                    container2.RemoveCan(canRemove);
                }
                
                if (contforRemove.equals("3")) {                    
                    System.out.print("What can will you remove?: ");
                    String canRemove = reader.nextLine();
                    container3.RemoveCan(canRemove);
                }
                
                if (contforRemove.equals("4")) {                    
                    System.out.print("What can will you remove?: ");
                    String canRemove = reader.nextLine();
                    container4.RemoveCan(canRemove);
                }
                
                if (contforRemove.equals("5")) {                    
                    System.out.print("What can will you remove?: ");
                    String canRemove = reader.nextLine();
                    container5.RemoveCan(canRemove);
                }
                
                
            }  
            
            if (optionletter.equals("D")) {
                showOptionsDisplay();
                System.out.print("Type a letter: ");
                String letterDisplay = reader.nextLine();
                
                if (letterDisplay.equals("A")) {
                    container1.printContents();
                    System.out.println("");
                }
                
                if (letterDisplay.equals("B")) {
                    container2.printContents();
                    System.out.println("");
                }
                
                if (letterDisplay.equals("C")) {
                    container3.printContents();
                    System.out.println("");
                }
                
                if (letterDisplay.equals("D")) {
                    container4.printContents();
                    System.out.println("");
                }
                
                if (letterDisplay.equals("E")) {
                    container5.printContents();
                    System.out.println("");
                }
                
                if (letterDisplay.equals("F")) {
                    container1.printContents();
                    System.out.println("");
                    container2.printContents();
                    System.out.println("");
                    container3.printContents();
                    System.out.println("");
                    container4.printContents();
                    System.out.println("");
                    container5.printContents();
                    System.out.println("");
                }
            }
            
            if (optionletter.equals("R")) {
                System.out.println("");
                System.out.println("Which container will you use?: ");
                System.out.print("Type a number for the container: ");
                String expiryletter = reader.nextLine();
                
                if (expiryletter.equals("1")) {
                int count1 = container1.getArraysize1();    
                System.out.println("Type the Expired Date of cans to be removed: ");
                String expired = reader.nextLine();
                container1.removeExpired(expired);
                System.out.println(""); 
                int count2 = container1.getArraysize2();
    
                if (count1 != count2) {
                    System.out.println("");
                    System.out.println("All expired cans from this contaniner are succesfully removed");
                }
                else {
                    System.out.println("");
                    System.out.println("Expiry Date cannot be found, Make sure to put the exact date");
                    }   
                }
                
                if (expiryletter.equals("2")) {
                int count1 = container2.getArraysize1();    
                System.out.println("Type the Expired Date of cans to be removed: ");
                String expired = reader.nextLine();
                container2.removeExpired(expired);
                System.out.println(""); 
                int count2 = container2.getArraysize2();
    
                if (count1 != count2) {
                    System.out.println("");
                    System.out.println("All expired cans from this contaniner are succesfully removed");
                }
                else {
                    System.out.println("");
                    System.out.println("Expiry Date cannot be found, Make sure to put the exact date");
                    } 
                }
                
                if (expiryletter.equals("3")) {
                int count1 = container3.getArraysize1();    
                System.out.println("Type the Expired Date of cans to be removed: ");
                String expired = reader.nextLine();
                container3.removeExpired(expired);
                System.out.println(""); 
                int count2 = container3.getArraysize2();
    
                if (count1 != count2) {
                    System.out.println("");
                    System.out.println("All expired cans from this contaniner are succesfully removed");
                }
                else {
                    System.out.println("");
                    System.out.println("Expiry Date cannot be found, Make sure to put the exact date");
                    } 
                }
                
                if (expiryletter.equals("4")) {
                int count1 = container4.getArraysize1();    
                System.out.println("Type the Expired Date of cans to be removed: ");
                String expired = reader.nextLine();
                container4.removeExpired(expired);
                System.out.println(""); 
                int count2 = container4.getArraysize2();
    
                if (count1 != count2) {
                    System.out.println("");
                    System.out.println("All expired cans from this contaniner are succesfully removed");
                }
                else {
                    System.out.println("");
                    System.out.println("Expiry Date cannot be found, Make sure to put the exact date");
                    } 
                }
                
                if (expiryletter.equals("5")) {
                int count1 = container5.getArraysize1();    
                System.out.println("Type the Expired Date of cans to be removed: ");
                String expired = reader.nextLine();
                container5.removeExpired(expired);
                System.out.println(""); 
                int count2 = container5.getArraysize2();
    
                if (count1 != count2) {
                    System.out.println("");
                    System.out.println("All expired cans from this contaniner are succesfully removed");
                }
                else {
                    System.out.println("");
                    System.out.println("Expiry Date cannot be found, Make sure to put the exact date");
                    } 
                }
                
            }
            
            if (optionletter.equals("E")) {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("Thank you for using my program. MWAH!");
                loop = true;
            }
            
        }

    public static void showOptions() {
        System.out.println("A = Name Containers");
        System.out.println("B = Add Cans");
        System.out.println("C = Remove Cans");
        System.out.println("D = Display Cans");
        System.out.println("R = Remove expired cans");
        System.out.println("E = Quit");
        System.out.print("Type a Letter: ");
    }
    
    public static void showOptionsDisplay() {
        System.out.println("");
        System.out.println("Pick an Option");
        System.out.println("A = Display container 1");
        System.out.println("B = Display container 2");
        System.out.println("C = Display container 3");
        System.out.println("D = Display container 4");
        System.out.println("E = Display container 5");
        System.out.println("F = Display all containers"); 
    }
}
