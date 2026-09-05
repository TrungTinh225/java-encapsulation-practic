package Bai1;

public class BankAccount {
    private double balance;
    private String owner;

    public BankAccount(double balance, String owner){
        if (balance < 0){
            this.balance = 0;
        }else{
            this.balance = balance;
        }
        this.owner = owner;
    }
    public void displayInfor(){
        System.out.println("Chu tai khoan " +this.getOwner());
        System.out.println("So du: "+this.getBalance());
    }

    public double getBalance(){
        return balance;
    }
    public String getOwner(){
        return owner;
    }
    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("So tien phai lon hon 0");
            return;
        }
        this.balance += amount;

    }
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("So tien phai lon hon 0");
            return;
        }
        if (amount > balance){
            System.out.println("So du khong du");
            return;
        }
        this.balance -= amount;

    }

}
