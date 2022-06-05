public class BankTransferPayment extends Payment{
    private String bankname;
    private String accountnumber;
    private String recievername;
    private String IBAN;
    
    public BankTransferPayment(double paymentamount, String currency, String dateofpayment,String bankname,String accountnumber,String recievername,String IBAN){
        super(paymentamount,currency,dateofpayment);
        this.bankname = bankname;
        this.accountnumber = accountnumber;
        this.recievername = recievername;
        this.IBAN = IBAN;
    }
    
    public void orderInf(){
        System.out.println("Your order has been done in: "+dateofpayment+" ,the amount is : "+paymentamount+" "+currency);
        System.out.println("Payment method is : BankTransferring. bank name is : "+bankname+" ,account number is : "+accountnumber+" ,the name of whom money has been tranfered to : "+recievername+" ,the IBAN is : "+IBAN);
    }
    
}
