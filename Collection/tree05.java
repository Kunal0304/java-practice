package Collection;

import java.util.TreeSet;

    public class tree05 implements Comparable<tree05> {
    int id ; int age;
    String name,qualification;

    tree05(int age, int id, String name,String qualification){

        this.age=age;
        this.id=id;
        this.name=name;
        this.qualification=qualification;

    }
    @Override
    public int compareTo(tree05 b) {

        if (age>b.age) {
            return +1;
        }
        else if(age<b.age){
            return -1;
        }
        else{
        return 0;
        }
}    
}

class Innertree05 {

    public static void main(String[] args) {
        TreeSet <tree05> aa=new TreeSet<>(); 
        
        tree05 b2 =new tree05(07, 101, "rohan", "B.Com");
        tree05 b1 =new tree05(05, 104, "kunal", "BCA");
        tree05 b4 =new tree05(14, 103, "sham", "MSC");
        tree05 b3 =new tree05(12, 102, "karan", "MCA");

        aa.add(b3);
        aa.add(b2);
        aa.add(b1);
        aa.add(b4);

        // System.out.println(aa);

        for (tree05 b : aa){

            System.out.println(b.age+" "+b.id+" "+b.name+" "+b.qualification);            
        }
    }
}