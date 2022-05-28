package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
       
        String line = "---";
        request.setAttribute("line", line);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String first = request.getParameter("firstnum");
       String second = request.getParameter("secondnum");
       
       request.setAttribute("first", first);
       request.setAttribute("second", second);
       
       
       if(!first.matches("[+-]?\\d*") || !second.matches("[+-]?\\d*") || first.isEmpty() || second.isEmpty()){
           String message = "invalid";
           request.setAttribute("message", message);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
        }
       String operator = request.getParameter("operator");
       
       int num1 = Integer.parseInt(first);
       int num2 = Integer.parseInt(second);
       String display;
       
       switch (operator){
           case "+":
                display = Integer.toString(num1+num2);
                request.setAttribute("display", display);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
           case "-":
               display = Integer.toString(num1-num2);
               request.setAttribute("display", display);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
           case "*":
               display = Integer.toString(num1*num2);
               request.setAttribute("display", display);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
           case "%":
               display = Integer.toString(num1%num2);
               request.setAttribute("display", display);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
       }
    }

   

}
