import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class NamedHello extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("YourName");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello, Tell me your name!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, "+name+"</h1>");
		out.print("<form action=\"");
		out.println("NamedHello\"method=POST>");
		out.println("<input type = text length = 20 name = YourName><br><br>");
		out.println("<input type='submit' value='Submit' style='margin-left: 10px;'></form>");
		out.println("</body>");
		out.println("</html>");
	}
}