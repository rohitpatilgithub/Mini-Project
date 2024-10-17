package BankManager;

public class Atm extends User{

    int input;
    int acc;
    private Current one = new Current();

    void getAcc(){
        System.out.println("Enter\n1. Savings Account \n2. Current Account");
        acc = sc.nextInt();
        if(acc == 1){
            while(input != 7){
                System.out.println("Enter \n1. Create Profile\n2. Update Profile\n" +
                        "3. Show profile\n4. Withdraw money\n5. Apply loan\n6. Current loan\n7. Exit");
                input = sc.nextInt();
                switch (input){
                    case 1 -> this.createProfile();
                    case 2 -> this.updateProfile();
                    case 3 -> this.showProfile();
                    case 4 -> this.withdraw();
                    case 5 -> this.applyLoan();
                    case 6 -> this.currentLoan();
                    case 7 -> System.out.println("Exit");
                    default -> System.out.println("Error : Enter valid command");
                }
            }
        } else if (acc == 2) {
            while(input != 7){
                System.out.println("Enter \n1. Create Profile\n2. Update Profile\n" +
                        "3. Show profile\n4. Withdraw money\n5. Apply loan\n6. Current loan\n7. Exit");
                input = sc.nextInt();
                switch (input){
                    case 1 -> one.createProfile();
                    case 2 -> one.updateProfile();
                    case 3 -> one.showProfile();
                    case 4 -> one.withdraw();
                    case 5 -> one.applyLoan();
                    case 6 -> one.currentLoan();
                    case 7 -> System.out.println("Exit");
                    default -> System.out.println("Error : Enter valid command");
                }
            }
        }
        else {
            System.out.println("Error : Enter valid command");
        }
    }


    public static void main(String[] args) {
        Atm one = new Atm();
        one.getAcc();
    }
}
