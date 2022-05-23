package Task4;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Subject subj1 = new Subject("English");
        final Subject subj2 = new Subject( "Programming");
        final Subject subj3 = new Subject("History");
        final List<Subject> listSubject = new ArrayList<>();
        listSubject.add(subj1);
        listSubject.add(subj2);
        listSubject.add(subj3);

        final List<Integer> listMark1 = new ArrayList<>();
        listMark1.add(4);
        listMark1.add(5);
        listMark1.add(3);
        final List<Integer> listMark2 = new ArrayList<>();
        listMark2.add(5);
        final List<Integer> listMark3 = new ArrayList<>();
        listMark3.add(3);
        listMark3.add(4);

        final List<Mark> listMarkAll1 = new ArrayList<>();
        final Mark tmp1 = new Mark(listMark1);
        listMarkAll1.add(tmp1);
        final Mark tmp2 = new Mark(listMark2);
        listMarkAll1.add(tmp2);
        final Mark tmp3 = new Mark(listMark3);
        listMarkAll1.add(tmp3);

        final Student student1 = new Student(listSubject,listMarkAll1,"Dmytro","Koval","Evgenyevich");
        System.out.println(student1);
        System.out.println(student1.getSubjectList().get(1) + "=" + student1.getMarkList().get(1));
       // student1.addSubject("Physics");
        System.out.println(student1);

        final List<Integer> listMark4 = new ArrayList<>();
        listMark4.add(3);
        listMark4.add(2);
        listMark4.add(3);
        final List<Integer> listMark5= new ArrayList<>();
        listMark5.add(2);
        listMark5.add(3);
        final List<Integer> listMark6 = new ArrayList<>();
        listMark6.add(1);
        listMark6.add(2);

        final List<Mark> listMarkAll2 = new ArrayList<>();
        final Mark tmp4 = new Mark(listMark4);
        listMarkAll2.add(tmp4);
        final Mark tmp5 = new Mark(listMark5);
        listMarkAll2.add(tmp5);
        final Mark tmp6 = new Mark(listMark6);
        listMarkAll2.add(tmp6);

        final Student student2 = new Student(listSubject,listMarkAll2,"Evgen","Koval","Evgenyevich");
        System.out.println(student2);

        final List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        final Students students = new Students(listStudents);
        System.out.println(students.Marks());

        System.out.println(students.highestMark());

        students.printMap(subj1);
    }

}
