import java.net.*;
import java.io.*;
import java.util.*;

class ServerTest{
	private ServerSocket ss;
	public static void main(String[] args) throws IOException{
		ServerTest st = new ServerTest();
		System.out.println("server running");
		for(;;)
			st.serve();
	}
	public ServerTest()throws IOException{
		ss = new ServerSocket(13);
	}
	public void serve() throws IOException{
		Socket s = null;
		s = ss.accept();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		out.write("Day & Time: "+(new Date()).toString());
		out.close();
	}
}