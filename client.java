import java.io.*;  
import java.net.*;  
public class client {
  
  public InputStream getInputStream() {
    return null;
  }

  public OutputStream getOutputStream() {
    return null;
  }

  public synchronized void close() {}

  public static void main(String[] args) {  
    try{      
      Socket s = new Socket("localhost",6666);  
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());  
      dout.writeUTF("Hello Server");  
      dout.flush();  
      dout.close();  
      s.close();  
    } catch(Exception e){System.out.println(e);}  
  }  
}
