package by.itoverone.entity;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student extends Human {

    private Map<String, List<Integer>> marks;

    public Student(int id, String name, String gender, int age, Map<String, List<Integer>> marks) {
        super(id, name, gender, age);
        this.marks = marks;
    }

    public Student(String nameOfStudent, Map<String, List<Integer>> subjectAndMarks) {

    }


    public Map<String, List<Integer>> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, List<Integer>> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return marks.equals(student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }
}