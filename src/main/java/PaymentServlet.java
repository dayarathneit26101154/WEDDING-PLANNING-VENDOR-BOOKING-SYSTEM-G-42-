import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Get input data from UI form
        String paymentId = request.getParameter("paymentId");
        String weddingId = request.getParameter("weddingId");
        double totalBudget = Double.parseDouble(request.getParameter("totalBudget"));
        double amountPaid = Double.parseDouble(request.getParameter("amountPaid"));
        double remainingBalance = totalBudget - amountPaid;

        // 2. File Handling: Write data into payments.txt file
        try (PrintWriter out = new PrintWriter(new FileWriter("payments.txt", true))) {
            out.println(paymentId + "," + weddingId + "," + totalBudget + "," + amountPaid + "," + remainingBalance);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Response after successful save
        response.setContentType("text/html");
        response.getWriter().println("<h3>Payment Saved Successfully in payments.txt!</h3>");
        response.getWriter().println("<a href='add-payment.jsp'>Go Back</a>");
    }
}
