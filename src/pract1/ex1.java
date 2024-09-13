package pract1;
import java.util.Scanner;
public class Practik1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] myArray = new int[10];
        for(int i=0;i<10;i++){
            myArray[i] = sc.nextInt();}
        for(int i=0;i<myArray.length;i++){
            sum+=myArray[i];}
        System.out.println("Сумма всех элементов " + sum);
        System.out.println("Cреднее арифметическое всех элементов " +sum/myArray.length);

    }
}
