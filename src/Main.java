import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import section15.UserClass;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        UnaryOperator<String> uo = str -> str.toLowerCase();
        UnaryOperator<Long> uo2 = val -> val * val;

        System.out.println(uo.apply("Lowercase Print Test"));

        long n = 10;
        System.out.println("The square of " + n + " is " + uo2.apply(n));


        BinaryOperator<Double> bo = (a1, a2) -> a1 * a2;

        double x = 10.5;
        double y = 15;

        System.out.println("The multiplication between " + x + " and " + y + " is: " + bo.apply(x, y));

        BinaryOperator<String> bo2 = (s1, s2) -> "Hi " + s1 + " " + s2;

        List<UserClass> users = m.listUsers();
        for (UserClass user : users) {
            System.out.println(bo2.apply(user.getName(), user.getSurname()));
        }
    }

    private List<UserClass> listUsers() {
        List<UserClass> users = new ArrayList<UserClass>();

        users.add(new UserClass("Mario", "Rossi", 39, "Roma", "mariorossi@gmail.com", "test"));
        users.add(new UserClass("Luigi", "Verdi", 39, "Roma", "luigiverdi@gmail.com", "test"));

        return users;
    }

    public List<UserClass> searchUsers(List<UserClass> user, Predicate<UserClass> p) {
        List<UserClass> userFound = new ArrayList<UserClass>();

        for (UserClass u : user) {
            if (p.test(u)) {
                userFound.add(u);
            }
        }

        return userFound;
    }

    public List<UserClass> searchUsersForName(List<UserClass> user, String name) {
        List<UserClass> userFound = new ArrayList<UserClass>();

        for (UserClass u : user) {
            if (u.getName().equals(name)) {
                userFound.add(u);
            }
        }

        return userFound;
    }

    public List<UserClass> searchUsersForSurname(List<UserClass> user, String surname) {
        List<UserClass> userFound = new ArrayList<UserClass>();

        for (UserClass u : user) {
            if (u.getSurname().equals(surname)) {
                userFound.add(u);
            }
        }

        return userFound;
    }
}