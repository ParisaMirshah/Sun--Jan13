import java.util.Random;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int anArray[] = new int[500];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (int) (Math.random() * 500);
        }
        for (int j = 0; j < anArray.length; j++) {
            System.out.println(anArray[j]);
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("Hi! Please enter the 'n' number to see the n'th smallest item in array :  ");
        int num = reader.nextInt();

        reader.close();

        findNthSmallest(anArray,num);
    }


    public static void findNthSmallest(int[] array, int n) {
        Arrays.sort(array);
        System.out.println("The " + n + "th smallest number is: " + array[n-1]);

    }

}







