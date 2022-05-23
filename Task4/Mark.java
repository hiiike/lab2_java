package Task4;
import java.util.List;

public class Mark {
   List<Integer> mark;

    public Mark() {
    }

    public Mark(final List<Integer> mark) {
        this.mark = mark;
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(final List<Integer> mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return " " + mark +
                ' ';
    }
}
