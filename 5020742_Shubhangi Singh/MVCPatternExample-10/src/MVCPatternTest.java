public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("John Doe", 123, 85.0);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade(90.0);
        controller.updateView();
    }
}