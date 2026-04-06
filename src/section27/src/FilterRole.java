package section27.src;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(
    filterName="role",
    urlPatterns="/*"
)
public class FilterRole {
    public FilterRole(){

    }

    public void destrou() {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        chain.doFilter(request, response);
    }

    public void init(FilterConfig fConfig) throws ServletException {}
}
