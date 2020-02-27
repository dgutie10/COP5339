package q4_1;

import java.util.*;

/**
 * Invariable: values must not equal null.
 */
public class Student {

    private final String name;
    private final Date enrollmentDate;

    /**
     * Contructor for Student object
     * @precondition name and  date != null
     * @param name Student name in format last, first
     * @param whenEnrolled date of enrollment.
     * @throws NullPointerException if any of the parameters != 0.
     */
    public Student(String name, Date whenEnrolled) {
        if (name == null || whenEnrolled == null){
            throw new NullPointerException("Values provided are null");
        }
        this.name = name;
        this.enrollmentDate = whenEnrolled;
    }

    /**
     * Accessor for name value.
     * @precondition name !=  null.
     * @return value of name.
     */
    public String getName (){ return name; }

    /**
     * Accessor for date value
     * @precondition Date != 0
     * @return Value of date.
     */
    public Date getEnrollmentDate() { return (Date) enrollmentDate.clone(); }

    /**
     * Coparator for value name between two Strudent objects.
      * @return 0 if both values are equal. Greater than 0 if student1 name value is lexicographically
     * less than the student2 name vlaue. Less than 0 if the student1 name value is lexicographically greater
     * than the value of the student2 name.
     * @throws NullPointerException if the value of name is null for any of the two student objects
     */
    public static Comparator<Student> getCompByName() {
        return new Comparator<Student>(){
            public int compare(Student student1, Student student2){
                if (student1.getName() == null  || student2.getName() == null){
                    throw new NullPointerException("The value name if onw of the objects is set to null");
                }
                return student1.getName().compareTo(student2.getName());
            }
        };
    }

    /**
     * Coparator for value Date between two Strudent objects.
     * @return 0 if both values are equal. Greater than 0 if student1 Date value before
     * student2 Dtae. Less than 0 if the student1 Date after student2 Date.
     * @throws NullPointerException if the value of Date is null for any of the two student objects
     */
    public static Comparator<Student> getCompByDate() {
        return  new Comparator<Student>() {
            public int compare(Student student1, Student student2) {
                if (student1.getEnrollmentDate() == null  || student2.getEnrollmentDate() == null){
                    throw new NullPointerException("The value whenEnrroll if onw of the objects is set to null");
                }
                return student1.getEnrollmentDate().compareTo(student2.getEnrollmentDate());

            }
        };
    }


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Doe, John", new Date(118,10,10)));
        students.add(new Student("Doe, Jane", new Date(118,10,7)));
        students.add(new Student("Smith, Sonia", new Date(115, 8, 20)));
        students.add(new Student("Messi, Leo", new Date(119, 8, 11)));
        students.add(new Student("Iniesta, Andres", new Date(120, 1, 5)));

        System.out.println("Sorting by Name:");
        Collections.sort(students, Student.getCompByDate());
        students.forEach((student) -> {
            System.out.println(student.getName() + ", " + student.getEnrollmentDate().toString());
        });

        System.out.println("Sorting by Date:");

        Collections.sort(students, Student.getCompByDate());
        students.forEach((student) -> {
            System.out.println(student.getName() + ", " + student.getEnrollmentDate().toString());
        });

    }
}
