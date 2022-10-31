
package project_cpit251;
public class Consultation {
    int ConID ;
    String ConDate = null;
    String Descrption = null;
    Customers ConsultationAt;
    Lawyer ConsultationLawyer;
    
    
     public int getConID() {
        return ConID;
    }

    public void setConID(int i) {
        this.ConID = i;
    }
    
    public String getConDate() {
        return ConDate;
    }

    public void setConDate(String i) {
        this.ConDate = i;
    }

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String i) {
        this.Descrption = i;
    }

    public Customers getConsultationAt() {
        return ConsultationAt;
    }

    public void setConsultationAt(Customers y) {
        this.ConsultationAt = y;

    }
     public Lawyer getConsultationLawyer() {
        return ConsultationLawyer;
    }

    public void setConsultationLawyer(Lawyer y) {
        this.ConsultationLawyer = y;

    }
}
