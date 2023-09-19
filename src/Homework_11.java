

public class Homework_11 {
    public static void main(String[] args) {
//        Задача 1 Создать метод, принимающий массив целых чисел,
//                и печатающий его в обратном порядке.
//                Сначала последний элемент, потом предпоследний, и т. д.


        int[] arr = {1, 2, 3, 4, 5, 6, 5, 3, 2, 9};
        printEnd(arr);

        sumOdd(arr);

        plyingEvenIndices(arr);


    }

    public static void printEnd(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("============================");
    }

    //        Задача 2 Создать метод, принимающий массив целых чисел,
//                и возвращающий сумму всех его нечетных элементов

    public static int sumOdd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        System.out.println("============================");
        return sum;
    }

    //    Задача 3 Создать метод, принимающий массив целых чисел,
//    и возвращающий произведение всех его элементов, с четными индексами.
    public static int plyingEvenIndices(int[] arr) {
        int ply = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                ply *= arr[i];
            }
        }
        System.out.println(ply);
        return ply;
    }

}