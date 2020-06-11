package Tasks;


import java.util.*;


public class ArraysTasks {
    public static void main(String[] args) {
        int number = 23;
        int[] array = {17, 3, 8, 15, 3, 17};
        int[] numbers = sumArray(array, number);
        System.out.println(Arrays.toString(array));
        System.out.println("Индексы массива которые составляют сумму: " + number +
                " составляют: " + Arrays.toString(numbers));
        System.out.println("____________________");

//        takeArray(array);
        array = new int[]{4, 6, 7, 76, 7, 4, 76, 76};
        takeArray(array);

    }

    static int[] sumArray(int[] mas, int number) {
        int[] result = new int[2];
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] + mas[j] == number) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    static void takeArray(int[] mas) {
        boolean fl = false;
        int[] mas2 = mas.clone();
        int count = 1, value = 0;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        Arrays.sort(mas2);
        System.out.println(Arrays.toString(mas2));
        for (int i = 0; i < mas2.length - 1; i++) {
            if (mas2[i] == mas2[i + 1]) {
                value = mas2[i];
                count++;
            } else if (count > 1) {
                tm.put(value, count);
                count = 1;
            }
        }
        if (count > 1) {
            tm.put(value, count);
            count = 1;
        }

        if (tm.size() > 0) {
            fl = true;
            System.out.println("Result: " + fl);
            Set<Map.Entry<Integer, Integer>> set = tm.entrySet();
            for (Map.Entry<Integer, Integer> me : set) {
                System.out.println("Число " + me.getKey() + " повторяется " +
                        me.getValue() + " раза.");
            }
        } else {
            System.out.println("Result: " + fl);
            System.out.println("Дубликатов нет");
        }


    }
}
