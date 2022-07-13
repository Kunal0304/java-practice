public class Hell03 {
int id;
String name;
int sal;
Hell03(int i,String n,int s){

        i=id;
        n=name;
        s=sal;
}
void show(){
    System.out.println(id+" "+name+" "+sal);
}
    public static void main(String[] args) {
        
        Hell03 h=new Hell03(101,"kunal", 2000);
        h.show();
        Hell03 h1=new Hell03(102,"kush",2500);
        h1.show();
        Hell03 h2=new Hell03(103,"ram",1500);
        h2.show();

    }
    
}
