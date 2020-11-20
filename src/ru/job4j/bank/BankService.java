package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>(); //все полизователи со счетами

    public void addUser(User user) { //добавляем пользователя в систему Map.put, сначала пустой new ArrayList<Account>(); проверить наличие пользователя

    }

    public void addAccount(String passport, Account account) { //новый счет, пользователя найти по пасспорту use findByPassport, проверить наличие счета

    }

    public User findByPassport(String passport) { //ищем по паспорту foreach, Map.keySet
        return null;
    }

    public Account findByRequisite(String passport, String requisitee) { //ищем по реквизитам, находим пользователя > находим счета > находим счет
        return null;
    }

    public boolean transferMoney(String srcPasspord, String srcRequisite, //перевод денег№ если нет денег или не найден счет- false
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }


}
