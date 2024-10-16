package BankManager;

import java.util.Random;
import java.util.Scanner;

interface Bank {

    Scanner sc = new Scanner(System.in);
    Random ran = new Random();

    // Profile creation section
    void createProfile();
    void updateProfile();

    // Withdraw
    void withdraw();
    void checkBalance();

    // Loan
    void applyLoan();
    void currentLoan();
}
