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

        List<UserClass> found = m.search(m.listUsers(), user -> user.getSurname().equals("Rossi"));
        System.out.println("users with the surname Rossi");

        for (UserClass user : found) {
            System.out.println(user.getSurname() + " " + user.getName());
        }

        System.out.println("--------------------------------------------------");
        found = m.search(m.listUsers(), user -> user.getEmail().contains(".it"));

        System.out.println("users with .it emails");

        for (UserClass user : found) {
            System.out.println(user.getSurname() + " " + user.getName());
        }

        System.out.println("--------------------------------------------------");

        found = m.search(m.listUsers(), user -> user.getAge() > 40);

        System.out.println("users aged > 40");

        for (UserClass user : found) {
            System.out.println(user.getSurname() + " " + user.getName());
        }

        System.out.println("--------------------------------------------------");

        UserClass uc = m.searchUser(m.listUsers(), user -> user.getCityResidence().equals("Roma"));

        if (uc != null) {
            System.out.println(uc.getSurname() + " " + uc.getName());
        }
    }

    public List<UserClass> search(List<UserClass> lUsers, Predicate<UserClass> filter) {
        List<UserClass> found = new ArrayList<UserClass>();

        for (UserClass user : lUsers) {
            if (filter.test(user)) {
                found.add(user);
            }
        }

        return found;
    }

    public UserClass searchUser(List<UserClass> lUsers, Predicate<UserClass> filter) {
        UserClass found = null;
        
        for (UserClass user : lUsers) {
            if (filter.test(user)) {
                return user;
        }
        }

        return null;
    }

    private List<UserClass> listUsers() {
        List<UserClass> users = new ArrayList<UserClass>();

        users.add(new UserClass("Mario", "Rossi", 39, "Roma", "mariorossi@gmail.it", "test"));
        users.add(new UserClass("Luigi", "Verdi", 41, "Milano", "luigiverdi@gmail.it", "test"));

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