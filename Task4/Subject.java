package Task4;

public class Subject {
    String nameSubject;

    public Subject() {
    }

    public Subject(final String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(final String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public String toString() {
        return "'" + nameSubject + '\'';
    }
}
