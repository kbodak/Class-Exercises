public class CSCourse extends Course {
    private static String department = "CS";
    public CSCouse(int number) {
        super(number);
    }
}

@Override
public String toString() {
    String str = CSCourse.department +
                    "course";
    return str;
}

