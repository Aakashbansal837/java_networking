import java.io.*;
import java.net.*;
public class arithtcpserver
{
public static void main(String arg[]) throws Exception
{
System.out.println();
System.out.println("ARITHMETIC SERVER");
System.out.println("*****************");
System.out.println("Server is ready to accept inputs…");
ServerSocket serversoc=new ServerSocket(9);
Socket clientsoc = serversoc.accept();
PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);
BufferedReader in = new BufferedReader(new InputStreamReader(clientsoc.getInputStream()));
String inputline;
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
try
{
while (true)
{
String s,op="",st;
int i=0,c=0;
int[] a=new int[2];
while(true)
{
s=in.readLine();
if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
op=s;
else if(s.equals("."))
break;
else
{
a[i]=Integer.parseInt(s);
i++;
}
}
if(op.equals("+"))
c=a[0]+a[1];
else if(op.equals("-"))
c=a[0]-a[1];
else if(op.equals("*"))
c=a[0]*a[1];
else if(op.equals("/"))
c=a[0]/a[1];

s=Integer.toString(c);
out.println(s);
}
}
catch(Exception e)
{
System.exit(0);
}
}
}
