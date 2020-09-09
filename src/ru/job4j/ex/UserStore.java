package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User newUser = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                newUser = user;
                break;
            } else {
                throw new UserNotFoundException("User not found");
            }
        }
        return newUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid()) {
            rsl = true;
        } else {
            throw new UserInvalidException("This user has no access");
        }
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};

        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

