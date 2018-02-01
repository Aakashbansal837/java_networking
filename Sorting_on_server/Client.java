import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {

            public static void main(String[] args) throws Exception
            {
                                    Socket s=new Socket("localhost",7777);
                                    if(s.isConnected())
                                    {
                                                System.out.println("Connected to server");
                                    }
                                    System.out.println("Enter size of array:");
                                    Scanner scanner=new Scanner(System.in);
                                    int n=scanner.nextInt();
                                    int a[]=new int[n];
                                    System.out.println("Enter element to array:");
                                    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
                                    dout.writeInt(n);
                                    for(int i=0;i<n;i++)
                                    {
                                                a[i]=scanner.nextInt();;
                                                dout.writeInt(a[i]);
                                    }
                                    System.out.println("Data Sent");
                                    DataInputStream din=new DataInputStream(s.getInputStream());
                                    int r;
                                    System.out.println("Receiving Sorted Data....");
                                    for(int i=0;i<n;i++)
                                    {
                                                a[i]=din.readInt();
						System.out.print("  "+a[i]+" ");
                                    }
                                    s.close();
            }
}