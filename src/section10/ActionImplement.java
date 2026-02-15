package section10;
import section10.Action;

public class ActionImplement implements Action{
    @Override
    public void performAction(){
        System.out.println("I am in the ActionImplement class");
    }
}
