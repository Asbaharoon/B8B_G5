
package project_cpit251;

public class Lawyer extends  User {

    String Name = null;
    String Degree = null;
    String Specialty = null;
    double price;
    int numOfConsultations;
    String CasesTyep = null;
  

  
    

    public Lawyer(String name, String degree, String specialty, String casesTyep, double price,int numOfConsultations) {
        this.Name = name;
        this.Degree = degree;
        this.Specialty = specialty;
        this.CasesTyep = casesTyep;
        this.price = price;
        this.numOfConsultations=numOfConsultations;
    }

    public String getN() {
        return Name;
    }

    public void setN(String i) {
        this.Name = i;
    }

    public String getD() {
        return Degree;
    }

    public void setD(String i) {
        this.Degree = i;
    }

    public String getS() {
        return Specialty;
    }

    public void setS(String y) {
        this.Specialty = y;

    }

    public double getP() {
        return price;
    }

    public void setP(double y) {
        this.price = y;
    }
     
     public int getNumOfConsultations() {
        return numOfConsultations;
    }
    
    
    public void setNumOfConsultations(int numOfConsultations) {
        this.numOfConsultations = numOfConsultations;
    }

    public String getC() {
        return CasesTyep;
    }

    public void setC(String y) {
        this.CasesTyep = y;

    }

    @Override
    public String toString() {
        return "The Lawyer name is: "+this.Name +"\n"+"The Degree is: " + this.Degree +"\n"+ "The Specialty is: " + this.Specialty +"\n"+  "The Case Type is : "
                + this.CasesTyep + "\n"+ "The Consultations price is: " + this.price+"\n"+ "The number Of Consultations is: "
                +this.numOfConsultations;
    }

}

