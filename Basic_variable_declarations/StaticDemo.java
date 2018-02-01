import java.util.*;
class abc
{
static int max(int a, int b, int c, int d) 
{
   if (a > b && a > c && a > d) return a;
   if (b > c && b > d)          return b;
   if (c > d)                   return c;
   return d;
}
}

class StaticDemo
{
static int min(int a, int b, int c, int d) 
{
   if (a < b && a < c && a < d) return a;
   if (b < c && b < d)          return b;
   if (c < d)                   return c;
   return d;
}
public static void main(String ar[])
{
	int minimum=min(20,34,6,89);
	System.out.println("Min = " +minimum);
	
	int maximum=abc.max(20,34,6,89);
	System.out.println("Max = " +maximum);
}
}