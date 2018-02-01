import java.util.*;
import java.io.*;  
class demo
{
public static void main(String ar[]) throws Exception
{
System.out.println("Int = " +Integer.parseInt(ar[0]));
System.out.println("Float = " +Float.valueOf(ar[1]));
System.out.println("String = " +ar[2]);
System.out.println("\n\n After using scanner class : ");
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter a string: ");
String str=sc.nextLine();
System.out.print("\n Enter a int: ");
int a=sc.nextInt();
System.out.print("\n Enter a float: ");
float fa=sc.nextFloat();
System.out.print("\n\n int a: "+a);
System.out.print("\n\n float fa: "+fa);
System.out.print("\n\n string str: "+str);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("\n\n through BufferedReader, enter a String: ");
String str1=br.readLine();
System.out.print("\n\n through BufferedReader, string str: "+str1);
}}
