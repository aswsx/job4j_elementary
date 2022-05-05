package ru.job4j.collection;

import java.util.*;

public class Departments {

    private Departments() {
    }

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            var start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start += el + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    public static List<String> sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
        return orgs;
    }

    public static List<String> sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
        return orgs;
    }
}