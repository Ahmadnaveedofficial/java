class Person{
    protected  String name;
    protected  int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Student extends Person{
   protected int rollNo;
   protected String dep;
   Student(String name,int age,int rollNo,String dep){
     super(name,age);
     this.rollNo=rollNo;
     this.dep=dep;
   }

   void display(){
     System.out.println("Name: "+name);
     System.out.println("age: "+age);
     System.out.println("rollNo: "+rollNo);
     System.out.println("dep: "+dep);
   }
}

public class Inhertiance{
  public  static void main(){
        Student s=new Student("Ahmad",20,149,"Software Engineering");
        s.display();
    }
}