package clientclass;

import java.io.*;
import java.net.*;

public class client {
	public static void main(String[] args)
	{
		try {
			Socket ss = new Socket("128.0.0.1", 1201);
				
			DataInputStream din = new DataInputStream(ss.getInputStream());
			DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
				
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgin="", msgout="";
				
			while(!msgin.equals("end")) {
				msgout = br.readLine();
				dout.writeUTF(msgout);
				msgin = din.readUTF();
				System.out.println(msgin);
					
			}
			ss.close();
		}
		catch(Exception e){}
	}
}
