package Tutorial5;

import java.util.Vector;

public class CovidVaccine {
    String SID ;
    private String firstName ;
    private String lastName ;
    Vector<String> previousVaccines ; //moderna v1

    public CovidVaccine(String SID , String firstName , String lastName ) {
        this.SID = SID ;
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.previousVaccines = new Vector<>() ;
    }

    public String getSID() {
        return SID ;
    }

    public void setSID(String SID) {
        this.SID = SID ;
    }

    public int getNumofVaccines() {
        return this.previousVaccines.size() ;
        //retrun the number of vaccines that this 
    }

    public String toString() {
        return "SID: " + SID + " | Name: " + firstName + " " + lastName + 
           " | Vaccines: " + String.join(" , ", previousVaccines);
    }
    
}
