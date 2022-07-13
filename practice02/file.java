package practice02;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class file {
    public static void main(String[] args) {
        
        String path="D:";
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter file name one");
        String fname1=sc.next();
        System.out.println("enter file name two");
        String fname2=sc.next();

        File f3=new File(path+ fname1);
        File f4=new File(path+ fname2);
        if (f3.exists()||f4.exists()) {

            System.out.println("file exist");            
        }
        else{
            FileOutputStream f1=null;
            FileOutputStream f2=null;
            try {
                f1=new FileOutputStream(f3);
                f2=new FileOutputStream(f4);
                if (f3.canWrite()&&f4.canWrite()) {
                    
                    ByteArrayOutputStream ba= new ByteArrayOutputStream();
                    String data="we are write in a file";
                    byte b[]=data.getBytes();
                    ba.write(b);
                    ba.writeTo(f1);
                    ba.writeTo(f2);
                    System.out.println(f3.getPath()+"written sucessully");
                    System.out.println(f4.getPath()+"written sucessully");
                    
                }
                else
                {
                    System.out.println("unable to write data type");
                }
                f1.close();
                f2.close();

            } catch (Exception e) {
            }

        }

    }
    
}
