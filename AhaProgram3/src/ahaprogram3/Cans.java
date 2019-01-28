
package ahaprogram3;


public class Cans {
    
    public String CanName;
    public String ExpiDate;
    
     public Cans(String can, String expidate) {
        this.CanName = can;
        this.ExpiDate = expidate;
       
    }

    public String getCanName() {
        return CanName;
    }

    public String getExpiDate() {
        return ExpiDate;
    }
    
     public String toString() {
        return "Can Name: " + this.CanName + ", Expiration Date: " + this.ExpiDate;
    }
}
