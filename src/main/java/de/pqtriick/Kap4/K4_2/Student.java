package de.pqtriick.Kap4.K4_2;

import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

    private String name;
    private int matrikel;

    public Student(String name, int matrikel) {
        this.name = name;
        this.matrikel = matrikel;
    }

    public int getMatrikel() {
        return matrikel;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getMatrikel() > o.getMatrikel()) {
            return 1;
        }
        if (this.getMatrikel() == o.getMatrikel()) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Student s1 = new Student("", 100);
        Student s2 = new Student("", 400);
        Student s3 = new Student("", 120);
        Student s4 = new Student("", 1098);
        List<Student> students = new java.util.ArrayList<>(List.of(s1, s2, s3, s4));
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.matrikel);
        }
    }
}
