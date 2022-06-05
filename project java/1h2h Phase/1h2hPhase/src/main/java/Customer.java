public class Customer extends User {
    private String sendaddress;
    private String invoicingaddress;
    private String birthday;
    private String newsletter;
    
    public Customer(){
    }
    public Customer(String FullName,String Tel, String email, String Username, String Password, String rtndate,String seaddress,String inaddress,String bday,String nletter){
        super(FullName,Tel,email,Username,Password,rtndate);
        sendaddress = seaddress;
        invoicingaddress = inaddress;
        birthday = bday;
        newsletter = nletter;
    }

    Customer(String NAME, String EMAIL, String USERNAME, String PASSWORD, String BIRTHDAY, String ADDRESS, String TELEPHONE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void getUserInf(){
        System.out.println("The Customer's name is : "+FullName+" ,Tel: +30 "+Tel+" ,email: "+email);
    }
}
