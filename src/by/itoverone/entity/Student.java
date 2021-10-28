package by.itoverone.entity;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student extends Human {

    private Map<String, List<Integer>> subjectAndMarks;

    public Student(String name, Map<String, List<Integer>> subjectAndMarks) {
        super(name);
        this.subjectAndMarks = subjectAndMarks;

    }

    public Map<String, List<Integer>> getSubjectAndMarks() {
        return subjectAndMarks;
    }

    public void setSubjectAndMarks(Map<String, List<Integer>> subjectAndMarks) {
        this.subjectAndMarks = subjectAndMarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return subjectAndMarks.equals(student.subjectAndMarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjectAndMarks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjectAndMarks=" + subjectAndMarks +
                '}';
    }
}