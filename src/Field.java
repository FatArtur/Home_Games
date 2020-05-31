// сущность, описывающая игровое поле
class Field {
    final static String X = "строки";

    String field[];

    Field() {
        field = new String[9];
        for (int i = 0; i < field.length; i++) { // Инициализация поля
                field[i] = "-";
        }

    }


    void printf(){ // метод для вывода на печать поля
        System.out.print("__________");
        System.out.print("   ");
            for (int j = 0; j < field.length; j++) {
//                System.out.print(field[j]);
                if (j % 3 == 0)
                    System.out.print("\n   ");
                System.out.print(field[j]);
            }
        System.out.println();
        System.out.println("__________");
    }

    void writeValue(int x, String value){  // метод для записи значения в поле
        field[x -1] = value.toUpperCase();
    }

    boolean check(int x){ // метод для проверки заполнено ли в поле значение (на Повтор)
        if (field[x - 1].equals("-")) return true;
        else return false;
    }

}

