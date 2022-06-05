public class Administrator extends User{
    
    public Administrator(String FullName,String Tel, String email, String Username, String Password, String rtndate){
        super(FullName,Tel,email,Username,Password,rtndate);
    }
    
    public void getUserInf(){
        System.out.println("The Administrator's name is : "+FullName+" ,Tel: +30 "+Tel+" ,email: "+email);
    }
    
}
