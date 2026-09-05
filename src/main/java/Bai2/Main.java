package Bai2;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Tinh", 9);
        st1.setScore(15);
        st1.setScore(10);
        System.out.println(st1.getName() + " diem "+ st1.getScore());
    }
}
