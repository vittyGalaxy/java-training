package section27.src;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(
    filterName="login",
    urlPatterns="/*"
)
public class LoginFilter implements Filter {
    public LoginFilter() {

    }

    public void destroy() {

    }

    public void init(FilterConfig fConfig) throws ServletException {
        
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        req.setAttribute("log", "soo in the filter!");
        chain.doFilter(request, response);
    }
}
