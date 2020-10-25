import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] array = {1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
            System.out.print(array[i]);
        }
        System.out.println();

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] array2 = new int[8];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * 3;
            System.out.print(array2[i]);
        }
        System.out.println();

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
            System.out.print(array3[i]);
        }
        System.out.println();

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//                и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] array4 = new int[3][3];

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                array4[i][array4.length - i - 1] = 1;
                System.out.print(array4[i][j]);
            }
            System.out.println();
        }

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] array5 = {52, 3, 2, -22, -11};
        int min = 0;
        int max = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] < min) {
                min = array5[i];
            }
            if (array5[i] > max) {
                max = array5[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

//    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//    если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//    checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят


//    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//    при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.


}
