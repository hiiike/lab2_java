package Task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
    private List<Student> students;

    public Students(final List<Student> students) {
        this.students = students;
    }

    public Students() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudent(final List<Student> students) {
        this.students = students;
    }

    public String Marks() {
        String result = "";

        for (final Student student : students) {
            result += " Student{" + " name='" + student.getName() + '\'' +
                    ", surname='" + student.getSurname() + '\'' +
                    ", middleName='" + student.getMiddleName() + '\n';
            for (final Subject subject : student.getSubjectList()) {

                result += "name = " + "[" + subject + "]" + student.getMarkList().get(student.getSubjectList().indexOf(subject));
            }

        }

        return result;
    }

    public Student highestMark(){
        Student tmp = students.get(0);
        int average = 0;

        for (final Student student: students) {
            int markOfAllSubjectTogether = 0;
            int i=0;
            for (final Subject subject:student.getSubjectList()){
                for (final Integer mark:student.getMarkList().get(student.getSubjectList().indexOf(subject)).getMark()) {
                    markOfAllSubjectTogether+=mark;
                    i++;
                }
            }
            if(markOfAllSubjectTogether/i > average) {
                tmp = student;
                average = markOfAllSubjectTogether / i;
            }
        }
        return tmp;
    }



    public void printMap(final Subject subject) {
        final Map<Long, List<Integer>> map = new HashMap<>();
        for (final Student student : getStudents()) {
            final int index = student.getSubjectList().indexOf(subject);
            map.put(student.getId(), student.getMarkList().get(index).getMark());
        }
        System.out.println(map);
    }
}


