package Giris;
import java.util.Scanner;
import java.util.Arrays;

public class minMax {
    public static void main(String[] args) {


                int[] list = {83,182,12,17,-8,-53,-84};

                int number, Max = list[0], Min = list[0];
                Scanner scan = new Scanner(System.in);

                System.out.print("Lütfen bir sayı giriniz : ");
                number = scan.nextInt();
                Arrays.sort(list);
                for(int i: list) {
                    if(i < number) {
                        Min = i;
                    }
                    if(i > number) {
                        Max = i;
                        break;
                    }
                }
                System.out.println(Arrays.toString(list));
                System.out.println("Girilen sayıya en yakın büyük sayı : " + Max);
                System.out.println("Girilen sayıya en yakın küçük sayı : " + Min);
            }

        }

