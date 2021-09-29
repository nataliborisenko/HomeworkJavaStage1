package homeworkModule5;

public class Student extends Person {
    private int id;
    Faculty facultyName;
    private int courseNumber;
    private int groupNumber;

    public Student() {
        super();
    }

    public Student(int id, Faculty type, int courseNumber, int groupNumber) {
        this.id = id;
        facultyName = type;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
    }

    public Student(String surname, String name, String middleName, String dateOfBirth, Faculty type, int courseNumber, int groupNumber) {
        super(surname, name, middleName, dateOfBirth);
        facultyName = type;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
    }

    public Faculty getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(Faculty facultyName) {
        this.facultyName = facultyName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Student{" + "id=" + id +
                ", facultyName='" + facultyName + '\'' +
                ", courseNumber=" + courseNumber +
                ", groupNumber=" + groupNumber +
                "} ";
    }
}

