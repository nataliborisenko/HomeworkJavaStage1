package homeworkModule5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class SortStudents {

    public static void studentsSpecialFaculty(ArrayList<Student> myListOfStudents, Faculty type) {
        System.out.println("Students, who study on " + type + " faculty");
        for (Student students : myListOfStudents)
            if (type == students.getFacultyName()) {
                System.out.println(students);
            }
    }

    public static void sortStudentsAccordingDateOFBirth(ArrayList<Student> myListOfStudents, int compareYear) {
        System.out.println("list of students, who were born after " + compareYear + " year: ");
        for (Student students : myListOfStudents) {
            String dateOfBirth = students.getDateOfBirth();
            LocalDate studentDateOfBirth = LocalDate.parse(dateOfBirth);
            int yearOfBirth = studentDateOfBirth.getYear();
            if (yearOfBirth > compareYear) {
                System.out.println(students);
            }
        }
    }

    public static void sortStudentsAccordingNumberOfCourse(ArrayList<Student> myListOfStudents) {
        ArrayList<Integer> listOfCourses = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < listOfCourses.size(); i++) {
            System.out.println("Students of course: " + listOfCourses.get(i));
            for (int y = 0; y < myListOfStudents.size(); y++) {
                if (myListOfStudents.get(y).getCourseNumber() == listOfCourses.get(i)) {
                    System.out.println(myListOfStudents.get(y));
                }
            }
            System.out.println();
        }
    }

    public static void sortStudentsAccordingNamesOfFaculty(ArrayList<Student> myListOfStudents) {
        for (int i = 0; i< Faculty.getArrayOfFacultyNames().length; i++) {
            System.out.println(Faculty.getArrayOfFacultyNames()[i]);

            for (int y = 0; y < myListOfStudents.size(); y++) {
                if (myListOfStudents.get(y).getFacultyName() == Faculty.getArrayOfFacultyNames()[i]) {
                    System.out.println(myListOfStudents.get(y));
                }
            }
        }
    }

    public static void sortStudentsAccordingNumberOfGroup(ArrayList<Student> myListOfStudents, int numberOfGroup) {
        System.out.println("Students, who study in " + numberOfGroup + " group");
        for (int i = 0; i < myListOfStudents.size(); i++) {
            if (myListOfStudents.get(i).getGroupNumber() == numberOfGroup) {
                System.out.println(myListOfStudents.get(i));
            }
        }
    }
}
