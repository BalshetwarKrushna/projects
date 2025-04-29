import java.util.Scanner;

       class CaseStudy1 {
     String name;
     String parent_name;
     String address;
     int age;
     String account_type;
     int acc_no;
     int pan;
     int pin;
     int date_of_birth;
     int total_amount=45000;
     int deposit_money;
     int withdraw_money;
     String current_balance;

     void Create_Account(){
        Scanner sc =new Scanner(System.in);
        System.out.println("*********creating_new_account**********");
        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println("enter parent name");
        parent_name = sc.nextLine();
        System.out.println("enter age");
        age =sc.nextInt();
        System.out.println("enter account no");
        acc_no=sc.nextInt();
        System.out.println("enter address");
        address=sc.nextLine();
        System.out.println("enter pin");
        pin =sc.nextInt();
       
    }

    void Display_account_details(){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter pin");
        pan =sc.nextInt();
        if(pan==pin){
            System.out.println("name ="+name);
            System.out.println("parent name ="+parent_name);
            if(age>18){
            System.out.println("age"+age);
            System.out.println( "acc_no"+acc_no);
            System.out.println("address"+address);
            
            System.out.println("account created succesfully");
            }else{
                System.out.println("age will be  above 18 ,please enter valid age");
            }
        }
        
    }

    void Deposit_money(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter deposit money");
        deposit_money=sc.nextInt();
        System.out.println("money will deposited in account succesfully");
        total_amount=deposit_money+total_amount;
        System.out.println("current balance in account"+total_amount);


        
    }
    void Withdraw_money(){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter withdraw amount");
        withdraw_money=sc.nextInt();
        if(withdraw_money<total_amount){
        total_amount=total_amount - withdraw_money;
        System.out.println(withdraw_money+"amount is withdraw succesfully");
        System.out.println("current balance in account"+total_amount);


        }else{
            System.out.println("insuficient balance");
        }


    }
    void check_balance(){
        System.out.println("current balance in account"+total_amount);
    }

    
}

public class pay{
    public static void main(String[] args) {
        
        CaseStudy1 obj =new CaseStudy1();
        Scanner sc =new Scanner(System.in);
        int ch;
        
        do{
            int choice;
        System.out.println("1.create account\n\t 2.display account details\n\t 3.deposit money\n\t 4.withdrawmoney\n\t 5.checkbalance");
         choice=sc.nextInt();
        switch(choice){
            case 1:
            {
                obj.Create_Account();
                break;
            }
            case 2:
            {
                obj.Display_account_details();
                break;
            }
            case 3:
            {
                obj.Deposit_money();
                break;
            }
            case 4:
            {
                obj.Withdraw_money();
                break;
            }
            case 5:
            {
                 obj.check_balance();
                 break;
            }
        }
        
        System.out.println("1.continue/n/t 2.exit");
         ch=sc.nextInt();
     } while(ch==1);
    }

    
}        