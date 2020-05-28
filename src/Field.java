// сущность, описывающая игровое поле
class Field {
    final static String X = "строки";
    final static String Y = "столбца";

    String field[][];

    Field() {
        field = new String[3][3];
    } // конструктор

    static void initializ(Field ob){ // метод для инициализации поля
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ob.field[i][j] = "-";
            }
        }
    }

    static void printf(Field ob){ // метод для вывода на печать поля
        System.out.println("__________");
        for (int i = 0; i < 3; i++) {
            System.out.print("   ");
            for (int j = 0; j < 3; j++) {
                System.out.print(ob.field[i][j]);
            }
            System.out.println();
        }
        System.out.println("__________");
    }

    void writeValue(int x, int y ,String value){  // метод для записи значения в поле
        field[x -1][y -1] = value.toUpperCase();
    }

}

