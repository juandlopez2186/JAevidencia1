package Figure;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class d extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        String h=req.getParameter("h");
        switch(h){
            case "log":
             req.getRequestDispatcher("log.jsp").forward(req,resp);
            break;
            case "controles":
            break;
            case "ctweet":
            break;
            case "etiquetas":
            break;
            case "index":
            break;
            case "cons":
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    
}
