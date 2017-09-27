
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import operations.Calculator;

public class calculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    String firstStr = request.getParameter("first");
    String secondStr = request.getParameter("second");
    String operation = request.getParameter("operation");
    
    Calculator calc = new Calculator(firstStr, secondStr, operation);
    
    int result = 0;
    
    if (operation != null)
    {
        if (firstStr != null && secondStr != null && !firstStr.equals("") && !secondStr.equals(""))
        {
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);
            
            char operationType = operation.charAt(0);
            
            switch (operationType)
            {
                case '+': result = first + second;
                    break;
                case '-': result = first - second;
                    break;
                case '*': result = first * second;
                    break;
                case '%': result = first % second;
                    break;
            }
            
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            return;
        }
    }
    
    getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
