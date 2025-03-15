package Homework_5.Museum;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Exhibit picture = new Picture();

        Museum museum = new Museum();

        museum.maintainExhibit(manuscript);
        museum.exhibitInfo(manuscript);

        museum.maintainExhibit(sculpture);
        museum.exhibitInfo(sculpture);

        museum.maintainExhibit(picture);
        museum.exhibitInfo(picture);
    }
}
