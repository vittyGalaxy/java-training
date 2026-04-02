package section27;

import java.io.IOException;
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
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
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
