package com.example.demo.student;

import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class StudentManager {
    private ArrayList<Student> students;
    private HashSet<String> studentNames;
    private HashMap<Student, Integer> studentScores;

    /**
     * 학생 등록
     * @param student
     */
    public void addStudent(Student student, int score) {
        // 중복 체크
        if (studentNames.contains(student.getName())) {
            System.out.println("이미 등록된 학생입니다.");
        }

        // 등록
        this.students.add(student);
        this.studentNames.add(student.getName());
    }

    /**
     * 학생 삭제
     * @param name
     */
    public void deleteStudent(String name) {
        Student student = null;
        for (Student s : this.students) {
            if (Objects.equals(s.getName(), name)) {
                student = s;
            }
        }
        if (Objects.isNull(student)) {
            System.out.println("존재하지 않는 학생입니다.");
            return;
        }

        students.remove(student);
        studentNames.remove(name);
        studentScores.remove(student);

        System.out.println("학생 " + name + "이 삭제되었습니다.");
    }

    /**
     * 학생 목록
     * @return
     */
    public List<String> getAllStudents() {
        List<String> allStudents = new ArrayList<>();

        for (Student student : this.students) {
            allStudents.add(students.toString());
        }

        return allStudents;
    }

    /**
     * 학생 점수 조회
     * @param student
     */
    public int getStudentScore(Student student) {
        if (!studentScores.containsKey(student)) {
            System.out.println("존재하지 않는 학생입니다.");
            return -1;
        }

        return studentScores.get(student);
    }
}
