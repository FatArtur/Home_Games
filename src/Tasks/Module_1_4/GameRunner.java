package Tasks.Module_1_4;

// Главный класс приложения, содержащий main
public class GameRunner {
    public static void main(String[] args) {
        Field runGame = new Field();
        GameLogic gl = new GameLogic();
        gl.start(runGame);

    }
}
