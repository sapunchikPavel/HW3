import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr1 = new int[arrLength];
        int[] arr2 = new int[arrLength];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Введите " + i + " элемент массива");
            arr2[i] = scanner.nextInt();
        }

        Task1 task = new Task1();
        task.Task11(arr1);
        task.Task11(arr2);

        task.Task12(arr1);
        task.Task12(arr2);

        task.Task14(arr1);
        task.Task14(arr2);

        task.Task16(arr1);
        task.Task16(arr2);


        task.Task15(arr1);
        task.Task15(arr2);
    }

    public void Task11(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public void Task12(int[] array) {
        int tmpMax = array[0];
        int indMax = 0;
        int tmpMin = array[0];
        int indMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > tmpMax) {
                tmpMax = array[i];
                indMax = i;
            } else if (array[i] < tmpMin) {
                tmpMin = array[i];
                indMin = i;
            }
        }
        System.out.println("Наибольший элемент массива: " + tmpMax + " его индекс: " + indMax);
        System.out.println("Наименьший элемент массива: " + tmpMin + " его индекс: " + indMin);
    }

    public void Task14(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                tmp += 1;
            }
        }
        System.out.println((tmp == 0) ? "Нулевых элементов в массиве нет" : "Нулевых элементов: " + tmp);
    }

    public void Task15(int[] array) {
        int j = array.length - 1;
        int tmp;
        for (int i = 0; i < Math.round(array.length / 2); i++) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }

    public void Task16(int[] array) {
        boolean isInc = true;
        int i = 0;
        while (isInc && i < array.length-1){
            if(array[i]>array[i+1]){
                isInc = false;
            }
            i++;
        }
        System.out.println(isInc ? "Массив возрастающий" : "Массив не возрастающий");
    }

}
