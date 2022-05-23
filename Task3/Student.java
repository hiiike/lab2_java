package Task3;

import java.util.List;

public class Student {
    List<Subject> subjectList;
    List<Mark> markList;
    String name;
    String surname;
    String middleName;

    public Student() {
    }

    public Student(final List<Subject> subjectList, final List<Mark> markList, final String name, final String surname, final String middleName) {
        this.subjectList = subjectList;
        this.markList = markList;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(final List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public List<Mark> getMarkList() {
        return markList;
    }

    public void setMarkList(final List<Mark> markList) {
        this.markList = markList;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "Student{" + " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", subjectList=" + subjectList +
                ", markList=" + markList + " }";
    }
}
