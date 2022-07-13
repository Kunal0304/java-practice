package extra;
class Demo
 {

        public static void main(String gg[])
        {
            int n=9,i,c=0, num=5;


 if (n==0||n==1)
 {
    System.out.println(num+"number is not prime");
  
 }
 else
 {
 for (i=2;i < n;i++)
 {
    if (n%i==0)
    {
        c++;
        break;
    }   
 }
   if (c==0)
{
    System.out.println("number is prime");

    
}
 else
 {
    System.out.println("number is not prime");

     
 }
 
 }
        }
}
