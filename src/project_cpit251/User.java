
package project_cpit251;

public  class User {
    String UserName = null;
    String userPassword = null;
    String UserEmail = null;
    String Phone;
    int UserID;
    public User( ) {
        
    }
    public User(String UserName, String userPassword, int UserID) {
        this.UserName = UserName;
        this.userPassword = userPassword;
        this.UserID = UserID;
    }
   
    public String getUserName() {
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


     public String getPhone() {
        return Phone;
    }
    
    
    public void setPhone(String Phone) {
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
