public abstract class User {
    protected String FullName;
    protected String Tel;
    protected String email;
    protected String Username;
    protected String Password;
    protected String registrationdate;
    
    public User(){
    }
    
    public User(String FullName,String Tel, String email, String Username, String Password, String rtndate){
        this.FullName = FullName;
        this.Tel = Tel;
        this.email = email;
        this.Username = Username;
        this.Password = Password;
        this.registrationdate = rtndate;
        
    }
    
    public abstract void getUserInf();

   
}
