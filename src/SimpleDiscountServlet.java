import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleDiscountServlet", urlPatterns = "/discount")
public class SimpleDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String desc=request.getParameter("description");
        Float price=Float.parseFloat(request.getParameter("price"));
        Float amount=Float.parseFloat(request.getParameter("amount"));

        Float discount=price-price*amount/100;

        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Description: "+desc+"</h1>");
        printWriter.println("<h1>Price: "+price+"VND</h1>");
        printWriter.println("<h1>Amount: "+amount+"%</h1>");
        printWriter.println("<h1>Discount: "+discount+"VND</h1>");
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
