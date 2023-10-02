import staff.*;

public class Main {

    public static void main(String[] args) {

        Teacher alice = new Teacher("Alice M.");
        TeacherAssistant bob = new TeacherAssistant("Bob R.");
        LabAssistant charles = new LabAssistant("Charles B.");

        alice.teach();
        alice.designExercises();
        bob.grade();
        charles.solveQuestions();
    }
}
