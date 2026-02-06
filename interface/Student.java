interface Student1 {
    void study();

    public abstract void attendClass();

    abstract void submitAssignment();

}

public class Student implements Student1 {
    @Override
    // showing error because we cannot override the method of interface in interface
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void attendClass() {
        System.out.println("Student is attending class");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Student is submitting assignment");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.study(); // Output: Student is studying
        student.attendClass(); // Output: Student is attending class
        student.submitAssignment(); // Output: Student is submitting assignment
    }

}
