//Author: Shanaldo Carty
//Completed Date: Pending, 2025

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Stack;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email; // NEW
    private LinkedList<String> enrolledCourses;
    private LinkedList<String> completedCourses;
    private LinkedList<String> failedCourses;
    private boolean priority;
    private Stack<String> registrationHistory = new Stack<>();

    // Updated constructor
    public Student(String id, String name, String email) {
        setId(id);
        setName(name);
        setEmail(email);
        this.enrolledCourses = new LinkedList<>();
        this.completedCourses = new LinkedList<>();
        this.failedCourses = new LinkedList<>();
        this.priority = false;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || !id.matches("\\d{7}")) {
            throw new IllegalArgumentException("Student ID must be exactly 7 digits.");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || !name.matches("[A-Z][a-zA-Z]+ [A-Z][a-zA-Z]+")) {
            throw new IllegalArgumentException("Student name must contain a first and last name, each starting with a capital letter.");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.email = email;
    }

    public void addCourse(String courseId) {
        if (!enrolledCourses.contains(courseId)) {
            enrolledCourses.add(courseId);
        }
    }

    public void addCourseToHistory(String courseId) {
        registrationHistory.push(courseId);
    }

    public String undoLastCourseRegistration() {
        return registrationHistory.isEmpty() ? null : registrationHistory.pop();
    }

    public LinkedList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void completeCourse(String courseId) {
        enrolledCourses.remove(courseId);
        completedCourses.add(courseId);
    }

    public void failCourse(String courseId) {
        enrolledCourses.remove(courseId);
        failedCourses.add(courseId);
    }

    public void removeCourse(String courseId) {
        enrolledCourses.remove(courseId);
    }

    public LinkedList<String> getCompletedCourses() {
        return completedCourses;
    }

    public LinkedList<String> getFailedCourses() {
        return failedCourses;
    }

    public boolean hasCompletedCourses(LinkedList<String> requiredCourses) {
        return completedCourses.containsAll(requiredCourses);
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id != null && id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nID: " + id + ", Name: " + name + ", Email: " + email +
                ", Enrolled Courses: " + enrolledCourses +
                ", Completed Courses: " + completedCourses +
                ", Failed Courses: " + failedCourses;
    }
}
