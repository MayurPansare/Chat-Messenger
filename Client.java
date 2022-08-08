import java.lang.*;
import java.net.*;
import java.io.*;

class Client 
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Client Application is Running...");
        String s1 , s2;

        Socket s = new Socket("localhost", 1100);

        BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());

        while (!(s1 = brk.readLine()).equals("gn")); 
        {
            ps.println(s1);
            s2 = br.readLine();
            System.out.println("Server Says :" +s2);
            System.out.println("Enter Message For Server :");
        }
        s.close();
        br.close();
        brk.close();
        ps.close();
    }
}