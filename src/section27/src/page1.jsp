<h1> Title page1</h1>
<p>
    body1

    <%
        List<String> cart = (List<String>) request.getSession().getAttribute("cart");

        if (cart != null && cart.size() > 0) {
            for (String s : cart) {
                out.println(item + <br>);
            }
        } else {
            out.println("There are no items in your cart");
        }    
    %>
</p>