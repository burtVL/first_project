package homework_2;

public class Techer {
    String name;
    String subject;

    public Techer(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Учитель: " + name + ", Предмет: " + subject);
    }
}
