import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = new int [5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5;j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        ShowArr(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5;j++){
                arr[i][j] += num ;
            }
        }

        ShowArr(arr);

        int summ = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5;j++){
                summ += arr[i][j];
            }
        }

        System.out.println("Сумма всех элементов равна: " + summ);

        String[][] chessArr = new String[8][8];
        for(int i = 0; i < 8; i++){
            if (i%2==0){
                for(int j = 0; j<8;j++){
                    if (j%2==0){
                        chessArr[i][j] = "W";
                    }
                    else{
                        chessArr[i][j] = "B";
                    }
                }
            }
            else {
                for(int j = 0; j<8;j++){
                    if (j%2==0){
                        chessArr[i][j] = "B";
                    }
                    else{
                        chessArr[i][j] = "W";
                    }
                }
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j<8;j++){
                System.out.print(chessArr[i][j] + " "); ;
            }
            System.out.println();
        }


    }

    public static void ShowArr(int[][] array) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5;j++){
                System.out.print(array[i][j] + " "); ;
            }
            System.out.println();
        }

        System.out.println();
    }
}
