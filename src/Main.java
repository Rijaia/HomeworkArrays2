import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа по массивам часть 2");
        task1 ();
        task2 ();
        task3 ();
        task4 ();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(){
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void task2(){
        int [] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int index = 0; index < arr.length; index++) {
           if(arr[index] < min){
               min = arr[index];
           }
           if(arr[index] > max){
               max = arr[index];
           }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей");

    }
    public static void task3 (){
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        double i = sum/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+i+" рублей");

    }
    public static void task4 (){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
       for (int i = 0; i < reverseFullName.length/2; i++) {
           char temp = reverseFullName [i];
           reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
           reverseFullName[reverseFullName.length -i - 1] = temp;

       }
       for (char m : reverseFullName){
            System.out.print(m);
        }
    }
}