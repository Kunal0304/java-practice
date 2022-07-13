package practice02;
 class SuperDemo 
{  
  SuperDemo(){
    System.out.println("hello ");
  }
    int x = 100; 
 } 
class Sub extends SuperDemo 
{ 
    static int x = 200; 
  void display() 
  { 
    // x=300;
    System.out.println("Value of variable of Sub: " +x); // Since we have created an object of class Sub. Therefore, it will print the value of the variable of the class Sub. 

    System.out.println("Value of variable of SuperDemo: " +super.x); // x of class SuperDemo is called. 
 } 
public static void main(String[] args) 
{ 
  Sub s = new Sub(); 
   s.display(); 
 } 
}
