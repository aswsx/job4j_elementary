package ru.job4j.map;

import java.util.Objects;

public class Student {
    private String name;
    private final String account;
    private final String group;

    public Student(String name, String account, String group) {
        this.name = name;
        this.account = account;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(account, student.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", account='" + account + '\''
                + ", group='" + group + '\''
                + '}';
    }
}