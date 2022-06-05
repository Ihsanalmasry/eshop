public class CashOnDeliveryPayment extends Payment {
    private double extraammount;
    
    public CashOnDeliveryPayment(double paymentamount, String currency, String dateofpayment, double extraammount){
        super(paymentamount,currency,dateofpayment);
        this.extraammount = extraammount;
    }
    
    public void orderInf(){
        double finalprice = paymentamount + extraammount;
        System.out.println("Your order has been done in: "+dateofpayment+" ,the amount is : "+paymentamount+" "+currency);
        System.out.println("Payment method is : by cash, which costed you "+extraammount+" "+currency+" extra");
        System.out.println("Final ammount is "+finalprice);
    }
}
