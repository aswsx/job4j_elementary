package ru.job4j.hashmap;

import java.util.*;

/**
 * 1. Метод averageScore() - вычисляет общий средний балл. *
 * 2. Метод averageScoreByPupil() - вычисляет средний балл по каждому ученику. *
 * То есть берем одного ученика и считаем все его баллы за все предметы и делим на количество предметов. *
 * Возвращает список из объекта Label (имя ученика и средний балл)
 * 3. Метод averageScoreBySubject() - вычисляет средний балл по каждому предмету. *
 * Например, собираем все баллы учеников по предмету география и делим на количество учеников. *
 * Возвращает список из объектов Label (название предмета и средний балл). *
 * 4. Метод bestStudent() - возвращает лучшего ученика. Лучшим считается ученик с наибольшим суммарным баллом по всем
 * предметам. Возвращает объект Label (имя ученика и суммарный балл).
 * 5. Метод bestSubject() - возвращает предмет с наибольшим баллом для всех студентов. Возвращает
 * объект Label (имя предмета, сумма баллов каждого ученика по этому предмету).
 */

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double result;
        double sum = 0;
        int counter = 0;
        List<Label> pupilScore = averageScoreByPupil(pupils);
        for (Label label : pupilScore) {
            sum += label.score();
            counter++;
        }
        result = sum / counter;
        return result;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double result = 0.0;
            double score;
            int counter = 0;
            for (Subject subj : pupil.subjects()) {
                double res = subj.score();
                result += res;
                counter++;
            }
            score = result / counter;
            Label pupilScore = new Label(pupil.name(), score);
            labels.add(pupilScore);
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int counter = 0;
        for (Pupil pupil : pupils) {
            for (Subject subj : pupil.subjects()) {
                map.put(subj.name(), map.getOrDefault(subj.name(), 0) + subj.score());
            }
            counter++;
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int score = entry.getValue() / counter;
            Label pupilScore = new Label(entry.getKey(), score);
            labels.add(pupilScore);
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double result = 0.0;
            for (Subject subj : pupil.subjects()) {
                double res = subj.score();
                result += res;
            }
            Label pupilScore = new Label(pupil.name(), result);
            labels.add(pupilScore);
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(pupils.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subj : pupil.subjects()) {
                map.put(subj.name(), map.getOrDefault(subj.name(), 0) + subj.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int score = entry.getValue();
            Label pupilScore = new Label(entry.getKey(), score);
            labels.add(pupilScore);
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(pupils.size() - 1);
    }
}
