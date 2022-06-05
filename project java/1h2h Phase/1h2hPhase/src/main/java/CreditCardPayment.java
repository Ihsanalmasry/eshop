public class CreditCardPayment extends Payment {
    private String cardnumber;
    private String cardholdername;
    private int cvv;
    
    public CreditCardPayment(double paymentamount, String currency, String dateofpayment, String cardnumber, String cardholdername,int cvv){
        super(paymentamount,currency,dateofpayment);
        this.cardnumber = cardnumber;
        this.cardholdername = cardholdername;
        this.cvv = cvv;
    }
    
    public void orderInf(){
        System.out.println("Your order has been done in: "+dateofpayment+" ,the amount is : "+paymentamount+" "+currency);
        System.out.println("Payment method is : CreditCard, which has number : "+cardnumber+" ,card holder name is : "+cardholdername+" ,it has cvv number : "+cvv);
    
    }
}
