package BankManager;

public class User implements Bank {

    private String name;
    private long accountNo;
    private long phone;

    int balance = 50000;
    int amount;

    public void setName() {
        System.out.print("Enter your name : ");
        this.name = sc.next();
    }

    public void setAccountNo() {
        this.accountNo = ran.nextLong(1000000,10000000);
    }

    public void setPhone() {
        System.out.print("Enter your contact number : ");
        this.phone = sc.nextLong();
    }

    public String getName() {
        return name;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public long getPhone() {
        return phone;
    }

    // Profile

    @Override
    public void createProfile() {
        this.setName();
        this.setPhone();
        System.out.println("Hi "+name+" your Saving's account has been successfully created");
        System.out.println("Your contact detail is "+phone);
        this.setAccountNo();
        System.out.println("and your account number is "+accountNo);
    }

    @Override
    public void updateProfile() {
        System.out.println("Your name is "+name);
        this.setName();
        System.out.println("Your updated name is "+name);
        this.setPhone();
        System.out.println("Your updated contact is "+phone);
        System.out.println("and your account number is "+accountNo);
    }

    // Withdrawal

    @Override
    public void withdraw() {
        System.out.print("Enter your amount to withdraw : ");
        amount = sc.nextInt();
        if(amount <= balance) {
            System.out.println("Your balance is for your account "+getAccountNo()+" is : "+(balance-amount));
        }
        else {
            System.out.println("In-sufficient balance and you only have."+balance);
        }
    }


    @Override
    public void checkBalance() {
        System.out.println("You have "+balance+" in your account");
    }

    // Loan

    float rate;
    float loanAmount;
    int tenure;

    @Override
    public void applyLoan() {
        System.out.println("Welcome "+this.getName()+",");
        rate = 7.8f;
        System.out.println("Interest rate for loan is "+rate+"%");
        System.out.print("Enter your amount for loan : ");
        loanAmount = sc.nextFloat();
        float temp = loanAmount;
        System.out.print("Enter your tenure for loan : ");
        tenure = sc.nextInt();
        tenure = tenure * 12;
        loanAmount = ((loanAmount * rate) / 100)+temp;
        System.out.println("Loan amount for your account "+accountNo+" would be : "+loanAmount);
        System.out.println("Amount to pay per month will be " + (loanAmount/tenure));
    }

    @Override
    public void currentLoan() {
        System.out.println("Loan amount for your account "+getAccountNo()+" is : "+loanAmount);
        System.out.println("And you have to pay : "+(loanAmount/tenure)+" monthly");
    }
}
