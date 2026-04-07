package section27.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public Dispatcher () {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        request.getServletContext().getRequestDispatcher("header.jsp").include(request, response);
        String page = request.getParameter("page");
        if(page != null && page.trim().equals("")) {
            if (page.equals("1")){
                request.setAttribute("object", "test");
                List<String> cart = (List<String>) request.getSession().getAttribute("cart");
                if (cart == null) {
                    cart = new ArrayList<String>();

                    String item = request.getParameter("item");
                    if (item != null && ! item.trim().equals("")) {
                        cart.add(item);
                    }
                }
                request.removeAttribute("object");
                request.getServletContext().getRequestDispatcher("page1.jsp").include(request, response);

            } else if (page.equals("2")) {
                request.getServletContext().getRequestDispatcher("page2.jsp").include(request, response);
            }
        } else {
            request.getServletContext().getRequestDispatcher("body.jsp").include(request, response);
        }
        request.getServletContext().getRequestDispatcher("footer.jsp").include(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
