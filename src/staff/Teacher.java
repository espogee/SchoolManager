package staff;

public class Teacher extends Staff implements ClassroomActivities, LabActivities {

    public Teacher (String n) {
        super(n);
    }

    public void teach () {
        System.out.println(name + " taught the main theme.");
    }

    public void grade () {
        System.out.println(name + " graded the exams.");
    }

    public void solveQuestions () {
        System.out.println(name + " answered a hard question.");
    }

    public void designExercises () {
        System.out.println(name + " designed a hard exercise.");
    }
}