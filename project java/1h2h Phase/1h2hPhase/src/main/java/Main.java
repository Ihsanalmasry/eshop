import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        
        // THE CODE HERE IS REPEATED 3 TIMES FOR EXECUTING 2 FUNCTIONS  continueinserting();   secondChance();
        // THE CODE HERE IS REPEATED 3 TIMES FOR EXECUTING 2 FUNCTIONS   continueinserting();   secondChance();
        // THE CODE HERE IS REPEATED 3 TIMES FOR EXECUTING 2 FUNCTIONS   continueinserting();   secondChance();
        
        Scanner read = new Scanner(System.in);
        String USER;
        System.out.println("\nHow do you wish to log in ? As a Customer or Administrator or Supplier?? For ending programm tap Close");
        USER = read.nextLine();
        
        switch(USER){
            case "Close":
                System.out.println("\nEnd of programm");
                break;
            case "Customer":
                System.out.println("The Fullname: ");
                String nC = read.nextLine();
                System.out.println("The Tel: ");
                String tC = read.nextLine();
                System.out.println("The email: ");
                String eC = read.nextLine();
                System.out.println("The Username: ");
                String uC = read.nextLine();
                System.out.println("The password: ");
                String pC = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rC = read.nextLine();
                System.out.println("The Shipping Address: ");
                String sC = read.nextLine();
                System.out.println("The Invoicing Address: ");
                String iC = read.nextLine();
                System.out.println("The birth date: (DD/MM/YY)");
                String bC = read.nextLine();
                System.out.println("Are you registered in our newsletter: (True or False)");
                String newC = read.nextLine();
                
                Customer cu = new Customer(nC,tC,eC,uC,pC,rC,sC,iC,bC,newC);
               
                cu.getUserInf();
                 
                 EshopData.getUsers().add(cu);  
                
                
                continueinserting();
                //break;
            case "Administrator":
                System.out.println("The Fullname: ");
                String nA = read.nextLine();
                System.out.println("The Tel: ");
                String tA = read.nextLine();
                System.out.println("The email: ");
                String eA = read.nextLine();
                System.out.println("The Username: ");
                String uA = read.nextLine();
                System.out.println("The password: ");
                String pA = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rA = read.nextLine();
        
                Administrator ad = new Administrator(nA,tA,eA,uA,pA,rA);
                
                ad.getUserInf();
                EshopData.getUsers().add(ad);
                
                continueinserting();
                //break;
            case "Supplier":
                System.out.println("The Fullname: ");
                String nS = read.nextLine();
                System.out.println("The Tel: ");
                String tS = read.nextLine();
                System.out.println("The email: ");
                String eS = read.nextLine();
                System.out.println("The Username: ");
                String uS = read.nextLine();
                System.out.println("The password: ");
                String pS = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rS = read.nextLine();
                System.out.println("The Brand: ");
                String brS = read.nextLine();
                System.out.println("The AFM: ");
                String afmS = read.nextLine();
                
                Supplier su = new Supplier(nS,tS,eS,uS,pS,rS,brS,afmS);
                
                su.getUserInf();
                EshopData.getUsers().add(su);
                
                continueinserting();
                //break;
            default:
                System.out.println("Sorry We Can't Help You!! Try Again");
                secondChance();
                
        }
        }
    public static void secondChance(){
        Scanner read = new Scanner(System.in);
        String USER;
        System.out.println("\nHow do you wish to log in ? As a Customer or Administrator or Supplier?? For ending programm tap Close");
        USER = read.nextLine();
        
        switch(USER){
            case "Close":
                System.out.println("\nEnd of programm");
                break;
            case "Customer":
                System.out.println("The Fullname: ");
                String nC = read.nextLine();
                System.out.println("The Tel: ");
                String tC = read.nextLine();
                System.out.println("The email: ");
                String eC = read.nextLine();
                System.out.println("The Username: ");
                String uC = read.nextLine();
                System.out.println("The password: ");
                String pC = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rC = read.nextLine();
                System.out.println("The Shipping Address: ");
                String sC = read.nextLine();
                System.out.println("The Invoicing Address: ");
                String iC = read.nextLine();
                System.out.println("The birth date: (DD/MM/YY)");
                String bC = read.nextLine();
                System.out.println("Are you registered in our newsletter: (True or False)");
                String newC = read.nextLine();
                
                Customer cu = new Customer(nC,tC,eC,uC,pC,rC,sC,iC,bC,newC);
                
                cu.getUserInf();
                 
                EshopData.getUsers().add(cu);
                
                continueinserting();
                //break;
            case "Administrator":
                System.out.println("The Fullname: ");
                String nA = read.nextLine();
                System.out.println("The Tel: ");
                String tA = read.nextLine();
                System.out.println("The email: ");
                String eA = read.nextLine();
                System.out.println("The Username: ");
                String uA = read.nextLine();
                System.out.println("The password: ");
                String pA = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rA = read.nextLine();
        
                Administrator ad = new Administrator(nA,tA,eA,uA,pA,rA);
                
                ad.getUserInf();
                
                EshopData.getUsers().add(ad);
                
                continueinserting();
                //break;
            case "Supplier":
                System.out.println("The Fullname: ");
                String nS = read.nextLine();
                System.out.println("The Tel: ");
                String tS = read.nextLine();
                System.out.println("The email: ");
                String eS = read.nextLine();
                System.out.println("The Username: ");
                String uS = read.nextLine();
                System.out.println("The password: ");
                String pS = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rS = read.nextLine();
                System.out.println("The Brand: ");
                String brS = read.nextLine();
                System.out.println("The AFM: ");
                String afmS = read.nextLine();
                
                Supplier su = new Supplier(nS,tS,eS,uS,pS,rS,brS,afmS);
                
                su.getUserInf();
                
                EshopData.getUsers().add(su);
                
                continueinserting();
                //break;
            default:
                System.out.println("Sorry We Can't Help You!! Try Again");
                secondChance();
                
            }
    }
    public static void continueinserting(){
        Scanner read = new Scanner(System.in);
        String USER;
        System.out.println("\nHow do you wish to log in ? As a Customer or Administrator or Supplier?? For ending programm tap Close");
        USER = read.nextLine();
        
        switch(USER){
            case "Close":
                System.out.println("\nEnd of programm");
                break;
            case "Customer":
                System.out.println("The Fullname: ");
                String nC = read.nextLine();
                System.out.println("The Tel: ");
                String tC = read.nextLine();
                System.out.println("The email: ");
                String eC = read.nextLine();
                System.out.println("The Username: ");
                String uC = read.nextLine();
                System.out.println("The password: ");
                String pC = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rC = read.nextLine();
                System.out.println("The Shipping Address: ");
                String sC = read.nextLine();
                System.out.println("The Invoicing Address: ");
                String iC = read.nextLine();
                System.out.println("The birth date: (DD/MM/YY)");
                String bC = read.nextLine();
                System.out.println("Are you registered in our newsletter: (True or False)");
                String newC = read.nextLine();
                
                Customer cu = new Customer(nC,tC,eC,uC,pC,rC,sC,iC,bC,newC);
               
                cu.getUserInf();
                 
                EshopData.getUsers().add(cu);
                
                continueinserting();
                //break;
            case "Administrator":
                System.out.println("The Fullname: ");
                String nA = read.nextLine();
                System.out.println("The Tel: ");
                String tA = read.nextLine();
                System.out.println("The email: ");
                String eA = read.nextLine();
                System.out.println("The Username: ");
                String uA = read.nextLine();
                System.out.println("The password: ");
                String pA = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rA = read.nextLine();
        
                Administrator ad = new Administrator(nA,tA,eA,uA,pA,rA);
                
                ad.getUserInf();
                
               EshopData.getUsers().add(ad);
                
                continueinserting();
                //break;
            case "Supplier":
                System.out.println("The Fullname: ");
                String nS = read.nextLine();
                System.out.println("The Tel: ");
                String tS = read.nextLine();
                System.out.println("The email: ");
                String eS = read.nextLine();
                System.out.println("The Username: ");
                String uS = read.nextLine();
                System.out.println("The password: ");
                String pS = read.nextLine();
                System.out.println("The registeration date: (DD/MM/YY)");
                String rS = read.nextLine();
                System.out.println("The Brand: ");
                String brS = read.nextLine();
                System.out.println("The AFM: ");
                String afmS = read.nextLine();
                
                Supplier su = new Supplier(nS,tS,eS,uS,pS,rS,brS,afmS);
                
                su.getUserInf();
                
                EshopData.getUsers().add(su);
                
                continueinserting();
                //break;
            default:
                System.out.println("Sorry We Can't Help You!! Try Again");
                secondChance();
        }
    }
        
}
    
        
    

