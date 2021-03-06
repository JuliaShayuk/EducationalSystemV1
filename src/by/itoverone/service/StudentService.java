package by.itoverone.service;


import by.itoverone.entity.Student;


import java.util.*;

public class StudentService {

    public static List<Student> getStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: " + " ");
        int size = sc.nextInt();
        List<Student> studentsList = new ArrayList<>();


        for (int i = 0; i < size; i++) {
            System.out.println("Enter a name: " + " ");
            String name = sc.next();

            System.out.println("Enter number of subjects: " + " ");
            int numSubject = sc.nextInt();
            Map<String, List<Integer>> subjectAndMarks = new HashMap<>();

            for (int j = 0; j < numSubject; j++) {
                System.out.println("Enter a subject: " + " ");
                String subject = sc.next();

                System.out.println("Enter number of subject's marks: " + " ");
                int numMarks = sc.nextInt();
                sc.nextLine();
                List<Integer> studentsMarks = new ArrayList<>();
                for (int k = 0; k < numMarks; k++) {
                    System.out.println("Enter a mark: " + " ");
                    int mark = sc.nextInt();

                    studentsMarks.add(mark);
                }
                subjectAndMarks.put(subject, studentsMarks);
            }
            studentsList.add(new Student(name, subjectAndMarks));

        }
        return studentsList;
    }

    public static List<Student> getStudentWithAverageGradeMore7(List<Student> students) {
        List<Student> averageMarks = new ArrayList<>();

        for (Student st : students) {
            Map<String, List<Integer>> newAvgMarks = st.getSubjectAndMarks();
            int sum = 0;
            int count = 0;
            for (Map.Entry<String, List<Integer>> pair : newAvgMarks.entrySet()) {
                List<Integer> subjectMarks = pair.getValue();

                for (int i = 0; i < subjectMarks.size(); i++) {
                    sum = sum + subjectMarks.get(i);
                }
                count = count + subjectMarks.size();
            }
            int avg = sum / count;
            if (avg > 7) {
                averageMarks.add(st);
            }
        }

        return averageMarks;
    }


    public static void printStudent(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


    }
}




