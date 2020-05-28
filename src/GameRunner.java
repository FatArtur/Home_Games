import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Главный класс приложения, содержащий main
public class GameRunner extends GameLogic{
    static int chet = 0; // счетчик

    public static void main(String[] args) {
        int x;
        int y;
        String value;
        boolean intrue = false;

        Field runGame = new Field(); // Создаем поле для игры
        Field.initializ(runGame); // инициализируем поле

        do {
            while (true){
                Field.printf(runGame); // печать поля
                System.out.println("____________________________");
                System.out.println("ВВЕСТИ ДАННЫЕ ПЕРВОМУ ИГРОКУ");
                x = inNumber(Field.X); // Вводим номер строки
                y = inNumber(Field.Y); // Вводим номер столбца
                value = inValue(); // Вводим значение Х или О
                if (check(runGame, x, y)) {
                    runGame.writeValue(x, y, value);
                    chet++;
                    break;
                }
                System.out.println("___ДАННОЕ ПОЛЕ ЗАНЯТО___");
            }
            if (winGame(runGame)) break;
            if (chet == 9) break;
            while (true) {
                Field.printf(runGame); // печать поля
                System.out.println("____________________________");
                System.out.println("ВВЕСТИ ДАННЫЕ ВТОРОМУ ИГРОКУ");
                x = inNumber(Field.X);
                y = inNumber(Field.Y);
                value = inValue();
                if (check(runGame, x, y)) {
                    runGame.writeValue(x, y, value);
                    chet++;
                    break;
                }
                System.out.println("___ДАННОЕ ПОЛЕ ЗАНЯТО___");
            }
        } while (!winGame(runGame));

        Field.printf(runGame);
        winText(runGame); // Вывод результата игры



    }
    static int inNumber(String txt){ // Метод для считывания столбца и строки
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbI = 0;
        String value;
        boolean istrue = false;

        do {
            try {
                System.out.println("Введите номер " + txt + " : от 1 до 3");
                numbI = Integer.parseInt(reader.readLine());
                if (numbI > 0 && numbI < 4) istrue = true;
                else throw new IOException();
            }
            catch (IOException e){
                System.out.println("Введено некорректное значение!");
            }
            catch (NumberFormatException e){
                System.out.println("Введено некорректное значение!");
            }

        } while (!istrue);

        return numbI;
    }

    static String inValue(){ // Метод для считывания значения Х или О
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = null;
        boolean istrue = false;

        do {
            try {
                System.out.println("Введите значение X или O");
                value = reader.readLine();
                if (value.equalsIgnoreCase("X") || value.equalsIgnoreCase("O")) istrue = true;
                else throw new IOException();
            }
            catch (IOException e){
                System.out.println("Введено некорректное значение!");
            }
            catch (NumberFormatException e){
                System.out.println("Введено некорректное значение!");
            }

        } while (!istrue);

        return value;
    }


    static void winText(Field od){
        if (winGame(od)) System.out.println("ПОБЕДИЛИ " + winValue + winValue + winValue + "!!!");
        else if (chet == 9) System.out.println("ПОБЕДИЛА ДРУЖБА!!!");
        else System.out.println("ERROR");
    }

}
