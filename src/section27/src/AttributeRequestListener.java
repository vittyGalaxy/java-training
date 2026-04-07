package section27.src;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AttributeRequestListener implements ServletRequestAttributeListener{
    public AttributeRequestListener(){}

    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
        System.out.println("object removed on request " + arg0.getName());
    }

    public void attributeAdded(ServletRequestAttributeEvent arg0) {
        System.out.println("object added to the request " + arg0.getName());
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
        System.out.println("object modified to request " + arg0.getName());
    }
}
