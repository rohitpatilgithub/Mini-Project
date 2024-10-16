package BankManager;

class Current extends User {
    @Override
    public void createProfile() {
        this.setName();
        this.setAccountNo();
        this.setPhone();
        System.out.println("Hi "+getName()+" your Current account has been successfully created");
        System.out.println("and your account number is "+getAccountNo());
        System.out.println("Your contact detail is "+getPhone());
    }

    public void applyLoan() {
        System.out.println("Welcome "+this.getName()+",");
        rate = 5.6f;
        System.out.println("Interest rate for loan is "+rate+"%");
        System.out.print("Enter your amount for loan : ");
        loanAmount = sc.nextFloat();
        float temp = loanAmount;
        System.out.print("Enter your tenure for loan : ");
        tenure = sc.nextInt();
        tenure = tenure * 12;
        loanAmount = ((loanAmount * rate) / 100)+temp;
        System.out.println("Loan amount for your account "+getAccountNo()+" would be : "+loanAmount);
        System.out.println("Amount to pay per month will be " + (loanAmount/tenure));
    }
}
