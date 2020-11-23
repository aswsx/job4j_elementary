package ru.job4j.set;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class UniqueName {
    public static int collectUniqueName(List<User> users) {
        Set<User> names = new HashSet<>(users);
        return names.size();
    }

    public static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}