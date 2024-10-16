package BankManager;

public class Atm extends User{

    int input;
    int acc;
    Current one = new Current();

    void getAcc(){
        System.out.println("Enter\n1. Savings Account \n2. Current Account");
        acc = sc.nextInt();
        if(acc == 1){
            while(input != 6){
                System.out.println("Enter \n1. Create Profile\n2. Update Profile\n" +
                        "3. Withdraw money\n4. Apply loan\n5. Current loan\n6. Exit");
                input = sc.nextInt();
                switch (input){
                    case 1 -> this.createProfile();
                    case 2 -> this.updateProfile();
                    case 3 -> this.withdraw();
                    case 4 -> this.applyLoan();
                    case 5 -> this.currentLoan();
                    case 6 -> System.out.println("Exit");
                    default -> System.out.println("Error : Enter valid command");
                }
            }
        } else if (acc == 2) {
            while(input != 6){
                System.out.println("Enter \n1. Create Profile\n2. Update Profile\n" +
                        "3. Withdraw money\n4. Apply loan\n5. Current loan\n6. Exit");
                input = sc.nextInt();
                switch (input){
                    case 1 -> one.createProfile();
                    case 2 -> one.updateProfile();
                    case 3 -> one.withdraw();
                    case 4 -> one.applyLoan();
                    case 5 -> one.currentLoan();
                    case 6 -> System.out.println("Exit");
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
