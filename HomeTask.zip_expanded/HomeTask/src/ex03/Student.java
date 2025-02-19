package ex03;

public class Student extends Person {
    private int number;
    public Student(String name, int age, String job, String hobby, int number) {
        super(name, age, job, hobby);
        this.number = number;
    }

    @Override
    public void work() {
        System.out.println(getJob() + "은 공부를 합니다.");
    }

    @Override
    public void hobby() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public void printNumber() {
        System.out.println("학생의 이름은 " + getName() + "이며 학번은 " + number + "입니다.");
    }
}
