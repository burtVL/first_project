package homework_3;

public class GameSettings {
    static int maxPlayers;

    final String gameName;
    int currentPlayers;

    static {
        maxPlayers = 5;
    }

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }

    public void addPlayer() {
        if(currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Невозможно добавить игрока, превышено максимальное количество");
        }
    }

    public void printGameStatus() {
        System.out.println("Игра: " + gameName);
        System.out.println("Текущее количество игроков: " + currentPlayers);
        System.out.println("Максимальное количество игроков в игре: " + maxPlayers);
        System.out.println();
    }
}
