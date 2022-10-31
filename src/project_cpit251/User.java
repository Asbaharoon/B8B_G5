
package project_cpit251;

public abstract class User {
    String UserName = null;
    String userPassword = null;
    String UserEmail = null;
    int Phone;
    int UserID;
   
    public String getUserN() {
        return UserName;
    }

    public void setUserName(String i) {
        this.UserName = i;
    }

    public String getuserPassword() {
        return userPassword;
    }

    public void setuserPassword(String i) {
        this.userPassword = i;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String y) {
        this.UserEmail = y;

    }


     public int getPhone() {
        return Phone;
    }
    
    
    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

     public int getUserID() {
        return UserID;
    }
    
    
    public void setUserID(int UserID) {
        this.UserID = UserID;
    }
  
     @Override
    public String toString() {
        return " " ;
    }
    
    
}
