package com.example.product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="DiscountServlet",urlPatterns = "/calculate")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));

        double discountAmount = price * percent * 0.01;
        double discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head><title>Product Discount Calculator</title></head>");
        writer.println("<body>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<p>Product Description: " + description + "</p>");
        writer.println("<p>List Price: " + price + "</p>");
        writer.println("<p>Discount Percent: " + percent + "</p>");
        writer.println("<p>Discount Amount: " + discountAmount + "</p>");
        writer.println("<p>Discount Price " + discountPrice + "</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
