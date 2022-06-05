public class PaypalPayment extends Payment {
    private String paypalaccountnumber;
    
    public PaypalPayment(double paymentamount, String currency, String dateofpayment, String paypalaccountnumber){
        super(paymentamount,currency,dateofpayment);
        this.paypalaccountnumber = paypalaccountnumber;
    }
    
    public void orderInf(){
        System.out.println("Your order has been done in: "+dateofpayment+" ,the amount is : "+paymentamount+" "+currency);
        System.out.println("Payment method is : through paypal account, which has number : "+paypalaccountnumber);
    }
}
