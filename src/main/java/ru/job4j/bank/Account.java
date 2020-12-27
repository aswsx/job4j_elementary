package ru.job4j.bank;

import java.util.Objects;

/**
 *
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     *
     * @param requisite
     * @param balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     *
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
