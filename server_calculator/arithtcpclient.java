import java.io.*;
import java.net.*;
public class arithtcpclient
{
public static void main(String[] args) throws IOException
{
System.out.println();
System.out.println("ARITHMETIC CLIENT");
System.out.println("*****************");
System.out.println("Enter the host name to connect");
String str;
DataInputStream inp=new DataInputStream(System.in);
str=inp.readLine();
Socket clientsoc = new Socket(str, 9);
System.out.println("Enter the inputs");
PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);
BufferedReader in = new BufferedReader(new
InputStreamReader(clientsoc.getInputStream()));
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
String userinput;
try
{  while (true) {
do
{ userinput = stdin.readLine();
out.println(userinput);
}while(!userinput.equals("."));
System.out.println("Sever Says : " + in.readLine());
}
}
catch(Exception e)
{
System.exit(0);
}}}

