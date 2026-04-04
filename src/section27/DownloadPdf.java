package section27;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/downloadpdf")
public class DownloadPdf extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DownloadPdf() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

        response.sendError(404, "error message");
        response.getWriter().append((String)request.getAttribute("attribute name"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.addCookie(new Cookie("web-course", "success"));
        response.sendRedirect("getServletInfo()");
        doGet(request, response);
        actions(request, response);
    }

    private void actions(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.getWriter().append("Served at: ").append(request.getContextPath());

        response.getWriter().append(" - Method: " + request.getMethod());

        response.getWriter().append(" - Context: " + request.getContextPath());

        response.getWriter().append(" - Query string: " + request.getHeader("user-agent"));

        Enumeration<String> en = request.getHeaderNames();

        while(en.hasMoreElements()) {
            String element = en.nextElement();

            response.getWriter().append(" - " + element + ": " + request.getHeader(element));
        }

        response.getWriter().append(" - User agent: " + request.getQueryString());
        
        response.getWriter().append(" parameter = " + request.getParameter("pippo"));

        String[] parameters = request.getParameterValues("pippo");

        for(String s : parameters) {
            response.getWriter().append(" parameter = " + s);
        }

        request.setAttribute("attribute name", "test value");

        response.getWriter().append("- URI: " + request.getRequestURI());
        response.getWriter().append("- URL: " + request.getRequestURL());
        response.getWriter().append("- Servlet: " + request.getServletPath());
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
    
    @Override
    public void destroy() {
        super.destroy();
    }
}
