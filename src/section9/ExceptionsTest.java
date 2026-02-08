package section9;

public class ExceptionsTest extends Exception{
    private static final long serialVersionUID = -4238970147140958242L;

    @Override
    public String getMessage(){
        return "Attention: error";
    }
}
