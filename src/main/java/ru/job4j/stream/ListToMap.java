package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static Map<String, Student> convert(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(
                        Collectors.toMap(
                                Student::getSurname,
                                student -> student,
                                (student, student2) -> student  //.equals(student2) ? student : student2
                        )
                );
    }
}
