
package ahaprogram3;

import java.util.ArrayList;
import java.util.Scanner;

public class Container {
    
    Scanner reader  = new Scanner(System.in);
    public ArrayList<Cans> CanProperties = new ArrayList<Cans>();
    public String contName;
    public String changeName;
    
     public Container(String item){
         this.contName = item;    
     }
     
     public void AddCan (String name, String expidate) {
          if (!CanChecker(name)) {
         CanProperties.add( new Cans(name,expidate) );
            System.out.println("");
            System.out.println("Can added!");
            System.out.println("");
            System.out.println("Can name: " + name + "\nExpiration Date: " + expidate);
            System.out.println("");
          }
          else {
              System.out.println("");
              System.out.println("Cannot add Can. Same can names are not allowed");
              System.out.println("");
          }
          
     }
     
     public void RemoveCan (String nametoRemove) {
        
        if (CanChecker(nametoRemove)) {   
             CanProperties.remove(StringtoObject(nametoRemove));
             System.out.println("");
             System.out.println("Can successfully removed");
             System.out.println("");
         }
         else {
             System.out.println("");
             System.out.println("Can cannot be found");
             System.out.println("");
         }
       
     }
     
     private Cans StringtoObject (String member) {
         Cans member2 = null; 
         for (Cans counter: CanProperties) {
            if (member.equals(counter.getCanName())) {
            member2 = counter;
      }
        }
         return member2;
    }
     
     public void printContents() {
       System.out.println("Here are the contents of " + contName);
         System.out.println("");
         
         for ( Cans items : CanProperties ) {
        System.out.println( items );
    }
         }
     
     public void renameCont(String changename) {
        this.contName = changename;
     }
     
     
     private boolean CanChecker(String item) { 
      for (Cans items : CanProperties) {
      if (item.equals(items.getCanName())) {
        return true;
             }
          }
        return false;
     }
     
      public int getArraysize1() {
        return this.CanProperties.size();
    }
    
    public int getArraysize2() {
        return this.CanProperties.size();
    }
     
     public void removeExpired (String CantoRemove) {
        for ( int i = -1 ; i < CanProperties.size() ; i++) {
        CanProperties.remove(StringtoObject2(CantoRemove));
        }
    }
     
      private Cans StringtoObject2 (String member) {
         Cans member2 = null; 
         for (Cans counter: CanProperties) {
            if (member.equals(counter.getExpiDate())) {
            member2 = counter;
      }
        }
         return member2;
    }
     
     public void printContainer() {  // for OPTION A ONLY
         System.out.println("");
         System.out.println("CONTAINER NAME SUCCESSFUL: ** " + contName + "**");
         System.out.println("");
     }
}

