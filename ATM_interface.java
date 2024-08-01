import java.util.Scanner;
class ATM
{
     Float Balance=1000.00f;
     int PIN=1234;
     boolean on  = true;
     ATM()
     {
        System.out.println("Enter your Pin");
     }
     public void checkPin()
     {
        Scanner sc = new Scanner(System.in);
        int UserPin = sc.nextInt();
        if(UserPin==PIN)
        {
             menu();
        }
        else
        {
            System.out.println("Enter a valid Pin");
            checkPin();
        }
     }
     public void menu()
     {
        System.out.println("1:Check Balance");
        System.out.println("2:WithDraw Money");
        System.out.println("3:Deposit Money");
        System.out.println("4:Exit");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        
        while(on)
        {
            if(op==1)
        {
            checkBalance();
        }
        else if(op==2)
        {
            withdrawMoney();
        }
        else if(op==3)
        {
            depositMoney();
        }
        else if(op==4)
        {
            on = false;
        }
        else
        {
            System.out.println("Select the valid input");
            menu();  
        }
        }
     }
     public void checkBalance()
     {
          System.out.println("Your Balance is: "+Balance);
          menu();
     }
     public void withdrawMoney()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        if(amount<=Balance)
        {
            Balance = Balance - amount;
            System.out.println("Money Withdrawn Successfully");
        }
        else if(amount>Balance)
        {
            System.out.println("Insufficient Balance");
        }
        menu();
     }
     public void depositMoney()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        Balance = Balance+amount;
        System.out.println("Money deposited Succesfully");
        menu();
     }


}
public class ATM_interface {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();

    }
}
