import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


// содержит бизнес-логику игры
public class GameLogic {
    static String winValue; // поле для хранения победителя
    static final String  X = "X";
    static final String  O = "O";
    static int count = 0;
    static final String ERROR = "ВНИМАНИЕ Введено некорректное значение!";

    boolean winGame(Field ob){ // метод для проверки выйгрыша
        String mas[] = ob.field;
        if (trueLine(mas, X)) {winValue = X; return true;}
        if (trueLine(mas, O)) {winValue = O; return true;}
        if (trueColumn(mas, X)) {winValue = X; return true;}
        if (trueColumn(mas, O)) {winValue = O; return true;}
        if (trueDiag(mas, X)) {winValue = X; return true;}
        if (trueDiag(mas, O)) {winValue = O; return true;}
        return false;
    }

    boolean trueLine(String ob[],String txt){
        for (int i = 0; i < 7; i+=3) {
            if (ob[i].equals(txt) && ob[i + 1].equals(txt) &&
                    ob[i + 2].equals(txt)) return true;
        }
        return false;
    }
    boolean trueColumn(String ob[], String txt){
        for (int i = 0; i < 3; i++) {
            if (ob[i].equals(txt) && ob[i + 3].equals(txt) && ob[i + 6].equals(txt))
                return true;
        }
        return false;
    }
    boolean trueDiag(String ob[], String txt){
        if (ob[0].equals(txt) && ob[4].equals(txt) && ob[8].equals(txt)) return true;
        if (ob[2].equals(txt) && ob[4].equals(txt) && ob[6].equals(txt)) return true;
        return false;
    }

    void start(Field ob){
        int x;
        String value;
        do {
            while (true){
                ob.printf(); // печать поля
                System.out.println("____________________________");
                System.out.println("ВВЕСТИ ДАННЫЕ ПЕРВОМУ ИГРОКУ");
                x = inNumber(); // Вводим номер строки
                value = inValue(); // Вводим значение Х или О
                if (ob.check(x)) {
                    ob.writeValue(x,value);
                    count++;
                    break;
                } else System.out.println("___ДАННОЕ ПОЛЕ ЗАНЯТО___");
            }
            if (winGame(ob)) break;
            if (count == 9) break;
            while (true) {
                ob.printf();
                System.out.println("____________________________");
                System.out.println("ВВЕСТИ ДАННЫЕ ВТОРОМУ ИГРОКУ");
                x = inNumber();
                value = inValue();
                if (ob.check(x)) {
                    ob.writeValue(x, value);
                    count++;
                    break;
                } else System.out.println("___ДАННОЕ ПОЛЕ ЗАНЯТО___");
            }
        } while (!winGame(ob));

        ob.printf();
        winText(ob); // Вывод результата игры



    }
    int inNumber(){ // Метод для считывания столбца и строки
        int numbI = 0;
        boolean istrue = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите номер ячейки: от 1 до 9");
                numbI = scanner.nextInt();
                if (numbI > 0 && numbI < 10) istrue = true;
                else throw new IOException();
            }
            catch (Exception e){
                System.out.println(ERROR);
            }
        } while (!istrue);

        return numbI;
    }

    String inValue(){ // Метод для считывания значения Х или О
        String value = null;
        boolean istrue = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите значение X или O");
                value = scanner.nextLine();
                if (value.equalsIgnoreCase("X") || value.equalsIgnoreCase("O")) istrue = true;
                else throw new IOException();
            }
            catch (Exception e){
                System.out.println(ERROR);
            }
        } while (!istrue);

        return value;
    }

    void winText(Field od){
        if (winGame(od)) System.out.println("ПОБЕДИЛИ " + winValue + winValue + winValue + "!!!");
        else if (count == 9) System.out.println("ПОБЕДИЛА ДРУЖБА!!!");
        else System.out.println("ERROR");
    }
}
