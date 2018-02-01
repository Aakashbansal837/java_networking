import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
            public static void main(String args[]) throws Exception
            {
                        ServerSocket ss=new ServerSocket(7777);
                        Socket s=ss.accept();
                        System.out.println("connected..........");
                        DataInputStream din=new DataInputStream(s.getInputStream());
                        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
                        int r,i=0;
                        int n=din.readInt();
                        int a[]=new int[n];
                        System.out.println("data:");
                        int count=0;
                        System.out.println("Receiving Data....");
                        for(i=0;i<n;i++)
                        {
                                    a[i]=din.readInt();
                        }
                        System.out.println("Data Received");
                        System.out.println("Sorting Data........");
                        Arrays.sort(a);
                        System.out.println("Data Sorted");
                        System.out.println("Sending Data........");
                        for(i=0;i<n;i++)
                        {
                                    dout.writeInt(a[i]);
                        }
                        System.out.println("\nData Sent Successfully");
                        s.close();
                        ss.close();
            }
}