package Groups;

import java.util.Random;
import java.util.Scanner;

public class Shpora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // создание объекта input для чтения значений с консоли
        Random rand = new Random();

        int size = input.nextInt(); // инициализирем переменную size
        int row = input.nextInt(); //инициализирем переменную row
        int column = input.nextInt(); //инициализирем переменную column

        int[] arr = new int[10]; // создание одномерного массива размером 10
        int[] anotherArr = new int[size]; // создание одномерного массива размером size
        int[][] matrix = new int[row][column]; // создание двумерного массива с размерами row-количество строк column-количество столбцов

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == 0){ // при выполнении условия происходит вывод в консоль вписанной строки с последующим переходом на новую строк
                System.out.println("элемент равен нулю");
            }
            else if(arr[i] == 1){ // 2 условие(обратились к элементу массива и преверили его на равенство 1)
                System.out.print("элемент равен единице"); // после вывода мы остаемся на той же строке
            }
            else{ // если 2 условия не сработали, сработает else
                System.out.println("элемент - другое число");
            }
        }

        for (int i = 0; i<arr.length; i++){ // цикл заполнения одномерного массива
            arr[i] = rand.nextInt(0,10);
        }

        for (int i = 0; i<matrix.length; i++){// циклы заполнения двумерного массива, это внешний цикл
            for (int j = 0; j<matrix[i].length; j++){ // внутренний цикл
                matrix[i][j] = rand.nextInt(0,10); // определение элемента двумерного массива рандомным числом с границами 0 до 10
            }
        }

        for (int i = 0; i<arr.length; i++){ // вывод одномерного массива
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i<matrix.length; i++){// вывод двумерного массива в виде матрицы
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
