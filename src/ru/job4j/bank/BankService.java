package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>(); //все полизователи со счетами

    public void addUser(User user) { //добавляем пользователя в систему Map.put, сначала пустой new ArrayList<Account>(); проверить наличие пользователя
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) { //новый счет, пользователя найти по пасспорту use findByPassport, проверить наличие счета
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (userAccount != null) {
                if (!userAccount.contains(account)) {
                    userAccount.add(account);
                }
            }
        }


    }

    public User findByPassport(String passport) { //ищем по паспорту foreach, Map.keySet
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) { //ищем по реквизитам, находим пользователя > находим счета > находим счет
        Account rslAccount = null;
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (accounts != null) {
            for (Account account : accounts) {
                if (account != null && account.getRequisite().equals(requisite)) {
                    rslAccount = account;
                    break;
                }
            }
        }
        return rslAccount;
    }

    public boolean transferMoney(String srcPasspord, String srcRequisite, //перевод денег№ если нет денег или не найден счет- false
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPasspord, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
