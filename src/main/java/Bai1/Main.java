package Bai1;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(-1, "Tinh");
        acc1.displayInfor();
        System.out.println("Nap 9000000");
        acc1.deposit(9000000);
        acc1.displayInfor();
        System.out.println("Rut 10000000");
        acc1.withdraw(10000000);
        System.out.println("Rut 8000000");
        acc1.withdraw(8000000);
        acc1.displayInfor();
        System.out.println("So du cuoi cua " + acc1.getOwner() + ": " + acc1.getBalance());
    }
}
