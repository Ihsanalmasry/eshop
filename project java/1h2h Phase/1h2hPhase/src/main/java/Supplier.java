public class Supplier extends User{
    private String Brand;
    private String AFM;
    
    public Supplier(String FullName,String Tel, String email, String Username, String Password, String rtndate,String Brand, String AFM){
        super(FullName,Tel,email,Username,Password,rtndate);
        this.Brand = Brand;
        this.AFM = AFM;
    }
    
    
    public void getUserInf(){
        System.out.println("The Supplier's name is : "+FullName+" ,Tel: +30 "+Tel+" ,email: "+email+" ,with AFM: "+AFM);
        
    }
    
}
