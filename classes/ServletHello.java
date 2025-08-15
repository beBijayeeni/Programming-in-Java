import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletHello extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello, Tell me your name!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, Tell me your name!</h1><br>");
		out.print("<form action=\"");
		out.println("NamedHello\"method=POST>");
		out.println("<input type = text length = 20 name = YourName><br><br>");
		out.println("<input type='submit' value='Submit' style='margin-left: 10px;'></form>");
		out.println("</body>");
		out.println("</html>");
	}
}