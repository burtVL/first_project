package homework_3;

public class University {
    static String universityName;

    final int studentID;
    String studentName;

    public University(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    static {
        universityName = "Университет им. Н.И. Лобачевского";
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Студент: " + studentName);
        System.out.println("ID студента: " + studentID);
        System.out.println("Название ВУЗа: " + universityName);
        System.out.println();
    }

}
