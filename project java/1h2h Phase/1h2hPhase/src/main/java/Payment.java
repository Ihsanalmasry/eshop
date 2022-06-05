public abstract class Payment {
    protected double paymentamount;
    protected String currency;
    protected String dateofpayment;
    
    public Payment(){
    }
    
    public Payment(double paymentamount, String currency, String dateofpayment){
        this.paymentamount = paymentamount;
        this.currency = currency;
        this.dateofpayment = dateofpayment;
    }
    
    public abstract void orderInf();
}
