import javafx.print.Printer;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "calculator", urlPatterns = "/calculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
     String description = request.getParameter("description");
     float price = Float.parseFloat(request.getParameter("price"));
     int discount_percent = Integer.parseInt(request.getParameter("discount"));
     float discount = (float)(price*discount_percent*0.01);
     float total = price - discount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product description" + description);
        writer.println("<h1> Product prince" + price);
        writer.println("<h1> Product Discount percent" + discount_percent);
        writer.println("<h1> Product Discount " + discount);
        writer.println("<h1> Product total " + total);
        writer.println("</html>");



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
