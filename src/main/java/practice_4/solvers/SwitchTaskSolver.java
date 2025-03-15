package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        // Проверка метода возвращающего день недели по числу

        System.out.println(dayOfWeek(3));
        System.out.println(dayOfWeek(10));

        // Проверка метода по описанию сезона

        System.out.println(describeSeason(Season.winter));
        System.out.println(describeSeason(Season.summer));
    }

    public static String dayOfWeek(int day) {
        String dayOfWeek = "";

        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }
        return dayOfWeek;
    }

    public static String describeSeason(Season season) {
        String description = "";

        switch (season) {
            case winter -> description = "Зима - холодно и снежно.";
            case summer -> description = "Лето - жарко.";
            case spring -> description = "Весна - все цветет.";
            case autumn -> description = "Осень - все желтеет.";

        }
        return description;
    }
}
