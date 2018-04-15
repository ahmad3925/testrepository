import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** @see http://stackoverflow.com/questions/5064027 */
public class ComparatorTest {
    public static void main(String[] args) {
        List<Record> list = new ArrayList<Record>(Arrays.asList(
            new Record("james", "30.0"),
            new Record("joyce", "35.0"),
            new Record("frank", "23.0"),
            new Record("zach",  "34.0")));
        print(list, Sort.DESCENDING, Field.D);
    }

    private static void print(List<Record> list, Sort s, Field f) {
        RecordComparator rc = new RecordComparator(s, f);
        Collections.sort(list, rc);
        for (Record r : list) {
            System.out.println(r);
        }
    }
}
class Record {

    private String s;
    private Double d;

    public Record(String name, String number) {
        this.s = name;
        this.d = Double.valueOf(number);
    }

    @Override
    public String toString() {
        return s + " " + d;
    }

    public int compareTo(Field field, Record record) {
        switch (field) {
            case S: return this.s.compareTo(record.s);
            case D: return this.d.compareTo(record.d);
            default: throw new IllegalArgumentException(
                "Unable to sort Records by " + field.getType());
        }
    }
}

enum Sort { ASCENDING, DESCENDING; }

enum Field {
S(String.class), D(Double.class);

    private Class type;

    Field(Class<? extends Comparable> type) {
        this.type = type;
    }

    public Class getType() {
        return type;
    }
}

class RecordComparator implements Comparator<Record> {

    private Field field;
    private Sort sort;

    public RecordComparator(Sort sort, Field field) {
        this.sort = sort;
        this.field = field;
    }

    @Override
    public final int compare(Record a, Record b) {
        int result = a.compareTo(field, b);
        if (sort == Sort.ASCENDING) return result;
        else return -result;
    }
}