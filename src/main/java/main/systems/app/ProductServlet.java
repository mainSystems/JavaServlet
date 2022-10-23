package main.systems.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(ProductServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("ProductServlet: doGet");
    ArrayList<Product> products = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            products.add(new Product(i, "Product" + i, i * 10));
        }

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.printf("<html><body>");
        for (Product elem : products) {
            out.printf("<h1>" + elem.toString() + "</h1>");
        }
        out.printf("</body></html>");
        out.close();
    }

}
