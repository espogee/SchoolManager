package staff;

public class TeacherAssistant extends Staff implements ClassroomActivities {

    public TeacherAssistant (String n) {
        super(n);
    }

    public void teach () {
        System.out.println(name + " taught an extra theme.");
    }

    public void grade () {
        System.out.println(name + " graded the worksheets..");
    }
}