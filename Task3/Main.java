package Task3;

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
        listMark1.add(2);
        listMark1.add(3);
        final List<Integer> listMark2 = new ArrayList<>();
        listMark2.add(5);
        final List<Integer> listMark3 = new ArrayList<>();
        listMark3.add(3);
        listMark3.add(2);

        final List<Mark> listMarkAll = new ArrayList<>();
        final Mark tmp1 = new Mark(listMark1);
        listMarkAll.add(tmp1);
        final Mark tmp2 = new Mark(listMark2);
        listMarkAll.add(tmp2);
        final Mark tmp3 = new Mark(listMark3);
        listMarkAll.add(tmp3);

        final Student student1 = new Student(listSubject,listMarkAll,"Dmytro","Koval","Evgenyevich");
        System.out.println(student1);
        System.out.println(student1.getSubjectList().get(1) + "=" + student1.getMarkList().get(1));
    }

}
