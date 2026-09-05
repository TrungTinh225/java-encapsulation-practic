package Bai2;

public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("So diem khong hop le");
            return;
        }
        this.score = score;
    }
}
