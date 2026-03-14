import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import section15.UserClass;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        List<UserClass> l = m.listUsers();

        List<UserClass> found = m.searchUsers(l, user -> user.getName().equals("Mario"));
        found = m.searchUsers(l, user -> user.getName().equals("Mario"));

        for (UserClass userFound : found) {
            System.out.println(userFound.getSurname() + " " + userFound.getName());
        }

        found = m.searchUsersForName(l, "Mario");
        found = m.searchUsersForSurname(l, "Rossi");

        l.forEach(user -> System.out.println(user.getSurname() + " " + user.getName()));

        for (UserClass user2 : l) {
            System.out.println(user2.getSurname() + " " + user2.getName());
        }

        Iterator<UserClass> i = l.iterator();

        while (i.hasNext()) {
            UserClass u = i.next();

            System.out.println(u.getSurname() + " " + u.getName());
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