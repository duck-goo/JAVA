package ex03;

public class Person {
    
    private String name;
    private int age;
    private String job;
    private String hobby;

    
    public Person() {;}

    public Person(String name, int age, String job, String hobby) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.hobby = hobby;
    }
    
    public void printName() {
        System.out.println(name);
    }

    public void work() {
        System.out.println(job + "은 하는 일이 없습니다.");
    }

    public void hobby() {
        System.out.println("취미는 " + hobby + " 입니다.");
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
    
    public static void main(String[] args) {
    	Person student = new Student("홍길동", 20, "학생", "독서", 20231234);
        Person programmer = new Programmer("이순신", 30, "개발자", "게임", true);

        if(student instanceof Student) {
           Student s = (Student)student;
           s.work();          
           s.hobby();        
           s.printNumber();  
        }

        if(programmer instanceof Programmer) {
           Programmer p = (Programmer)programmer;
           p.work();         
           p.hobby();        
           p.isNotebook();  
        }
    }
}
