package stream;

import java.util.Objects;

public class User {
   
   private int id;
   private String name;
   private int age;
   private String job;
   
   public User() {;}

   public User(int id, String name, int age, String job) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.job = job;
   }

   int getId() {
      return id;
   }

   void setId(int id) {
      this.id = id;
   }

   String getName() {
      return name;
   }

   void setName(String name) {
      this.name = name;
   }

   int getAge() {
      return age;
   }

   void setAge(int age) {
      this.age = age;
   }

   String getJob() {
      return job;
   }

   void setJob(String job) {
      this.job = job;
   }

   @Override
   public String toString() {
      return "User [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      User other = (User) obj;
      return id == other.id;
   }
}
