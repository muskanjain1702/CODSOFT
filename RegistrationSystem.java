import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }
}

class Student {
    int id;
    String name;
    List<Course> registeredCourses;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    void registerCourse(Course course) {
        if (course.capacity > 0) {
            registeredCourses.add(course);
            course.capacity--;
            System.out.println("Course registration successful.");
        } else {
            System.out.println("Course is full. Registration failed.");
        }
    }

    void dropCourse(Course course) {
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(course);
            course.capacity++;
            System.out.println("Course dropped successfully.");
        } else {
            System.out.println("You are not registered for this course.");
        }
    }
}

public class RegistrationSystem {
    public static void main(String[] args) {
        // Create courses
        Course c1 = new Course("CS101", "Introduction to Programming", "Basic programming concepts", 30, "Mon/Wed 10:00 AM");
        Course c2 = new Course("MATH202", "Calculus II", "Advanced calculus topics", 25, "Tue/Thu 2:00 PM");

        // Create students
        Student s1 = new Student(1, "John Doe");
        Student s2 = new Student(2, "Jane Smith");

        // Display available courses
        System.out.println("Available Courses:");
        System.out.println("1. " + c1.title + " (" + c1.code + ")");
        System.out.println("2. " + c2.title + " (" + c2.code + ")");

        // Simulate student registration
        s1.registerCourse(c1);
        s2.registerCourse(c2);

        // Display course details and available slots
        System.out.println("Course Details:");
        System.out.println("1. " + c1.title + " (" + c1.code + ")");
        System.out.println("   Description: " + c1.description);
        System.out.println("   Capacity: " + c1.capacity);
        System.out.println("   Schedule: " + c1.schedule);
        System.out.println("2. " + c2.title + " (" + c2.code + ")");
        System.out.println("   Description: " + c2.description);
        System.out.println("   Capacity: " + c2.capacity);
        System.out.println("   Schedule: " + c2.schedule);

        // Simulate student dropping a course
        s1.dropCourse(c1);

        // Display updated course details and available slots
        System.out.println("Updated Course Details:");
        System.out.println("1. " + c1.title + " (" + c1.code + ")");
        System.out.println("   Description: " + c1.description);
        System.out.println("   Capacity: " + c1.capacity);
        System.out.println("   Schedule: " + c1.schedule);
        System.out.println("2. " + c2.title + " (" + c2.code + ")");
        System.out.println("   Description: " + c2.description);
        System.out.println("   Capacity: " + c2.capacity);
        System.out.println("   Schedule: " + c2.schedule);
    }
}
