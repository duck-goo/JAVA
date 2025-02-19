package ex03;

public class Programmer extends Person {
    private boolean notebook;

    public Programmer(String name, int age, String job, String hobby, boolean notebook) {
        super(name, age, job, hobby);
        this.notebook = notebook;
    }

    @Override
    public void work() {
        System.out.println(getJob() + "은 코딩을 합니다.");
    }

    @Override
    public void hobby() {
        char[] arData = {'A', 'B', 'C', 'D'};
        for(char c : arData) {
            System.out.print(c);
        }
        System.out.println();
    }

    public void isNotebook() {
        if(notebook) {
           System.out.println("노트북이 있습니다.");
        }else{
           System.out.println("노트북이 없습니다.");
        }
    }
}
