import java.util.Scanner;
public class Main2 {
    public static void main(String [] args){
        
        // THE CODE HERE IS REPEATED 3 TIMES FOR EXECUTING 2 FUNCTIONS  continueinserting();   secondChance();
        // THE CODE HERE IS REPEATED 3 TIMES FOR EXECUTING 2 FUNCTIONS   continueinserting();   secondChance();
        // THE CODE HERE IS REPEATED 3 TIMES FOR EXECUTING 2 FUNCTIONS   continueinserting();   secondChance();
        
        Scanner read = new Scanner(System.in);
        String paymentmethod;
        System.out.println("\nWhat is the payment method?? by CREDIT_CARD, by BANK_TRANSFER,by PAYPAL_ACCOUNT or by CASH?? For Ending programm tap Close");
        paymentmethod = read.nextLine();
        switch(paymentmethod){
            case "Close":
                break;
            case "CREDIT_CARD":
                System.out.println("The paymentamount: ");
                double pC = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String currency = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dC = read.nextLine();
                System.out.println("The cardnumber: ");
                String nC = read.nextLine();
                System.out.println("The cardholdername: ");
                String hC = read.nextLine();
                System.out.println("The cvv: ");
                int cvvC = read.nextInt();
                
                
                CreditCardPayment c = new CreditCardPayment(pC,currency,dC,nC,hC,cvvC);
                
                c.orderInf();
                
                continueinserting();
               // break;
            case "BANK_TRANSFER":
                System.out.println("The paymentamount: ");
                double pB = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cB = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dB = read.nextLine();
                System.out.println("The bankname: ");
                String bB = read.nextLine();
                System.out.println("The accountnumber: ");
                String acB = read.nextLine();
                System.out.println("The recievername: ");
                String rB = read.nextLine();
                System.out.println("The IBAN: ");
                String ibanB = read.nextLine();
        
                BankTransferPayment bank = new BankTransferPayment(pB,cB,dB,bB,acB,rB,ibanB);
                
                bank.orderInf();
                
                continueinserting();
                //break;
            case "PAYPAL_ACCOUNT":
                System.out.println("The paymentamount: ");
                double pP = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cP = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dP = read.nextLine();
                System.out.println("The paypalaccountnumber: ");
                String anP = read.nextLine();
                
                
                PaypalPayment paypal = new PaypalPayment(pP,cP,dP,anP);
                
                paypal.orderInf();
                
                continueinserting();
                //break;
             case "CASH":
                System.out.println("The paymentamount: ");
                double pCash = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cCash = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dCash = read.nextLine();
                System.out.println("The extraammount: ");
                double exCash = read.nextDouble();
                
                
                CashOnDeliveryPayment cash = new CashOnDeliveryPayment(pCash,cCash,dCash,exCash);
                
                cash.orderInf();
                
                continueinserting();
                //break;
            default:
                System.out.println("Sorry We Can't Help You!! Try Again");
                
                secondChance();
                
        }
    }
        
    public static void secondChance(){
        Scanner read = new Scanner(System.in);
        String paymentmethod;
        System.out.println("\nWhat is the payment method?? by CREDIT_CARD, by BANK_TRANSFER,by PAYPAL_ACCOUNT or by CASH?? For ending programm tap Close");
        paymentmethod = read.nextLine();
        switch(paymentmethod){
            case "Close":
                break;
            case "CREDIT_CARD":
                System.out.println("The paymentamount: ");
                double pC = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cC = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dC = read.nextLine();
                System.out.println("The cardnumber: ");
                String nC = read.nextLine();
                System.out.println("The cardholdername: ");
                String hC = read.nextLine();
                System.out.println("The cvv: ");
                int cvvC = read.nextInt();
                
                
                CreditCardPayment c = new CreditCardPayment(pC,cC,dC,nC,hC,cvvC);
                
                c.orderInf();
                
                continueinserting();
                //break;
            case "BANK_TRANSFER":
                System.out.println("The paymentamount: ");
                double pB = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cB = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dB = read.nextLine();
                System.out.println("The bankname: ");
                String bB = read.nextLine();
                System.out.println("The accountnumber: ");
                String acB = read.nextLine();
                System.out.println("The recievername: ");
                String rB = read.nextLine();
                System.out.println("The IBAN: ");
                String ibanB = read.nextLine();
        
                BankTransferPayment bank = new BankTransferPayment(pB,cB,dB,bB,acB,rB,ibanB);
                
                bank.orderInf();
                
                continueinserting();
                //break;
            case "PAYPAL_ACCOUNT":
                System.out.println("The paymentamount: ");
                double pP = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cP = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dP = read.nextLine();
                System.out.println("The paypalaccountnumber: ");
                String anP = read.nextLine();
                
                
                PaypalPayment paypal = new PaypalPayment(pP,cP,dP,anP);
                
                paypal.orderInf();
                
                continueinserting();
                //break;
             case "CASH":
                System.out.println("The paymentamount: ");
                double pCash = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cCash = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dCash = read.nextLine();
                System.out.println("The extraammount: ");
                double exCash = read.nextDouble();
                
                
                CashOnDeliveryPayment cash = new CashOnDeliveryPayment(pCash,cCash,dCash,exCash);
                
                cash.orderInf();
                
                continueinserting();
                //break;
            default:
                System.out.println("Sorry We Can't Help You!! Try Again");
                
                secondChance();
                
        }
    }
    
    public static void continueinserting(){
        Scanner read = new Scanner(System.in);
        String paymentmethod;
        System.out.println("\nWhat is the payment method?? by CREDIT_CARD, by BANK_TRANSFER,by PAYPAL_ACCOUNT or by CASH?? for ending programm tap Close");
        paymentmethod = read.nextLine();
        switch(paymentmethod){
            case "Close":
                break;
            case "CREDIT_CARD":
                System.out.println("The paymentamount: ");
                double pC = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String currency = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dC = read.nextLine();
                System.out.println("The cardnumber: ");
                String nC = read.nextLine();
                System.out.println("The cardholdername: ");
                String hC = read.nextLine();
                System.out.println("The cvv: ");
                int cvvC = read.nextInt();
                
                
                CreditCardPayment c = new CreditCardPayment(pC,currency,dC,nC,hC,cvvC);
                
                c.orderInf();
                
                continueinserting();
               // break;
            case "BANK_TRANSFER":
                System.out.println("The paymentamount: ");
                double pB = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cB = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dB = read.nextLine();
                System.out.println("The bankname: ");
                String bB = read.nextLine();
                System.out.println("The accountnumber: ");
                String acB = read.nextLine();
                System.out.println("The recievername: ");
                String rB = read.nextLine();
                System.out.println("The IBAN: ");
                String ibanB = read.nextLine();
        
                BankTransferPayment bank = new BankTransferPayment(pB,cB,dB,bB,acB,rB,ibanB);
                
                bank.orderInf();
                
                continueinserting();
                //break;
            case "PAYPAL_ACCOUNT":
                System.out.println("The paymentamount: ");
                double pP = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cP = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dP = read.nextLine();
                System.out.println("The paypalaccountnumber: ");
                String anP = read.nextLine();
                
                
                PaypalPayment paypal = new PaypalPayment(pP,cP,dP,anP);
                
                paypal.orderInf();
                
                continueinserting();
                //break;
             case "CASH":
                System.out.println("The paymentamount: ");
                double pCash = read.nextDouble();
                System.out.println("The currency: (Euro/Dollar ktl...)");
                String cCash = read.nextLine();
                System.out.println("The dateofpayment: (DD/MM/YY)");
                String dCash = read.nextLine();
                System.out.println("The extraammount: ");
                double exCash = read.nextDouble();
                
                
                CashOnDeliveryPayment cash = new CashOnDeliveryPayment(pCash,cCash,dCash,exCash);
                
                cash.orderInf();
                
                continueinserting();
                //break;
            default:
                System.out.println("Sorry We Can't Help You!! Try Again");
                
                secondChance();
                
        }
    }
    
       
    
}

    
    
