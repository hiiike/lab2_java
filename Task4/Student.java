package Task4;

import java.util.List;

public class Student {
    private List<Subject> subjectList;
    private List<Mark> markList;
    private String name;
    private String surname;
    private String middleName;
    private long id;
    private static long ID=0;

        public Student() {
    }

    public Student(final List<Subject> subjectList, final List<Mark> markList, final String name, final String surname, final String middleName) {
        this.subjectList = subjectList;
        this.markList = markList;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.setId(ID++);
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(final List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
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

    public void addSubject(final String tmp){
        final Subject subj = new Subject(tmp);
        subjectList.add(subj);
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
