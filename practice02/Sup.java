package practice02;
class Dummy{
    void Demo(){
      System.out.println("Dummy class Demo is running");
        int a=10;
        System.out.println(a);
        }      
    }
class Person extends Dummy
{ 
    Dummy q =new Dummy();
     int age = 50; 
     void Demo(){
       super.Demo();
       System.out.println("person class Demo is running");
     }
} 
class Employee extends Person 
{ 
    int age = 30; 
  void insertStudentAge() 
  { 
    int age = 20; 

     Person p = new Person(); 
     System.out.println(p.age); //50

    System.out.println(super.age);//50
    System.out.println(age); //20

    System.out.println(this.age);//30
  } 

  void Demo(){
    super.Demo();
    System.out.println("employ class Demo is running");
  } 

  public static void main(String[] args) {
      int a=100;
      System.out.println(a);
      Employee d = new Employee();
      d.insertStudentAge();
      d.Demo();
    // System.out.println(this.age); //50

  }


}
