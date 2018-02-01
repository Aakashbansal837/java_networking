import java.io.*;  
import java.net.*;  
import java.util.*;
public class MyClient1 {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.writeUTF("JAVA");
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter a string: ");
String str1=sc.nextLine();
dout.writeUTF(str1);

dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  }  }