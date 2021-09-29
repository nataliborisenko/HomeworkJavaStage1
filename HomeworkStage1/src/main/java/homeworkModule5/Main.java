package homeworkModule5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Petrov", "Petr", "Petrovich", "2002-01-10", Faculty.ECONOMIC, 1, 112);
        Student student2 = new Student("Ivanov", "Ivan", "Ivanovich", "2003-05-18", Faculty.BIOLOGY, 2, 234);
        Student student3 = new Student("Sidorov", "Oleg", "Olegovich", "2000-12-25", Faculty.ECONOMIC, 1, 112);
        Student student4 = new Student("Zaharova", "Mariya", "Ivanovna", "1999-06-15", Faculty.BIOLOGY, 2, 234);
        Student student5 = new Student("Chizhkov", "Vlad", "Vladimirovich", "2002-02-11", Faculty.MEDICAL, 3, 377);
        Student student6 = new Student("Borisenko", "Kseniya", "Dzenisovna", "2001-03-30", Faculty.MEDICAL, 3, 377);
        Student student7 = new Student("Bugarevich", "Ludmila", "Leonidovna", "1998-04-01", Faculty.BIOLOGY, 2, 234);
        Student student8 = new Student("Zdanova", "Viktoriya", "Vladimirovna", "1999-07-07", Faculty.BIOLOGY, 2, 234);
        Student student9 = new Student("Vasilevich", "Olga", "Ivanovna", "2002-11-08", Faculty.ECONOMIC, 1, 112);
        Student student10 = new Student("Chernov", "Yuri", "Sergeevich", "2001-08-04", Faculty.MEDICAL, 3, 377);

        ArrayList<Student> myListOfStudents = new ArrayList<>();
        myListOfStudents.add(student1);
        myListOfStudents.add(student2);
        myListOfStudents.add(student3);
        myListOfStudents.add(student4);
        myListOfStudents.add(student5);
        myListOfStudents.add(student6);
        myListOfStudents.add(student7);
        myListOfStudents.add(student8);
        myListOfStudents.add(student9);
        myListOfStudents.add(student10);

        SortStudents.studentsSpecialFaculty(myListOfStudents, Faculty.MEDICAL);
        System.out.println();
        SortStudents.sortStudentsAccordingNamesOfFaculty(myListOfStudents);
        System.out.println();
        SortStudents.sortStudentsAccordingNumberOfCourse(myListOfStudents);
        System.out.println();
        SortStudents.sortStudentsAccordingNumberOfGroup(myListOfStudents, 234);
        System.out.println();
        SortStudents.sortStudentsAccordingDateOFBirth(myListOfStudents, 2002);
    }
}
