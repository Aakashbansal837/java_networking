import java.io.*;  
import java.net.*;  
public class MyServer1 {  
public static void main(String[] args){  
try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println("message= "+str);  
System.out.println("message= "+(String)dis.readUTF());
System.out.println("message= "+(String)dis.readUTF());
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}