package staff;

public class LabAssistant extends Staff implements LabActivities {

    public LabAssistant (String n) {
        super(n);
    }

    public void solveQuestions () {
        System.out.println(name + " solved a lot of questions.");
    }

    public void designExercises () {
        System.out.println(name + " designed an easy exercise");
    }
}