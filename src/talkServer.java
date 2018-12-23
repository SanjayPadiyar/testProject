
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


class talkServer {
    ServerSocket ss;
    
    talkServer()throws Exception{
        ss=new ServerSocket(12345);
        System.out.println("port Opened");
    }
    public void service()throws Exception
    {
        while(true){
            Socket s=ss.accept();
            Scanner sc=new Scanner(System.in);
            BufferedReader reader=new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter writer =new PrintWriter(s.getOutputStream(),true);
            
            while(true){
                String query=reader.readLine();
                
            }
        }
    }
}
