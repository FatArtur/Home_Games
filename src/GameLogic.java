// содержит бизнес-логику игры
public class GameLogic {
    static String winValue; // поле для хранения победителя

    static boolean check(Field ob, int x, int y){ // метод для проверки заполнено ли в поле значение
        if (ob.field[x - 1][y - 1].equals("-")) return true;
        else return false;
    }

    static boolean winGame(Field ob){ // метод для проверки выйгрыша
        String mas[][] = ob.field;
        for (int i = 0; i < 3; i++) {
            if ((mas[i][0].equals("X")) && (mas[i][1].equals("X")) && (mas[i][2].equals("X"))) {
                winValue = "X";
                return true;
            }
            if (mas[i][0].equals("O") && mas[i][1].equals("O") && mas[i][2].equals("O")) {
                winValue = "O";
                return true;
            }
            if (mas[0][i].equals("X") && mas[1][i].equals("X") && mas[2][i].equals("X")) {
                winValue = "X";
                return true;
            }
            if (mas[0][i].equals("O") && mas[1][i].equals("O") && mas[2][i].equals("O")) {
                winValue = "O";
                return true;
            }
        }
        if (mas[0][0].equals("X") && mas[1][1].equals("X") && mas[2][2].equals("X")) {
            winValue = "X";
            return true;
        }
        if (mas[0][0].equals("O") && mas[1][1].equals("O") && mas[2][2].equals("O")) {
            winValue = "O";
            return true;
        }
        if (mas[2][0].equals("X") && mas[1][1].equals("X") && mas[0][2].equals("X")) {
            winValue = "X";
            return true;
        }
        if (mas[2][0].equals("O") && mas[1][1].equals("O") && mas[0][2].equals("O")) {
            winValue = "O";
            return true;
        }
        return false;
    }

}
