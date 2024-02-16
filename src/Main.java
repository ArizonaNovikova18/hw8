import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1,2");
        int [] weight = new int[3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
        for (int i = 0; i < weight.length; i++){
            System.out.print(weight[i]);
            if (i < weight.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    double [] doubles = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++){
            System.out.print(doubles[i]);
            if (i < doubles.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] arr = new int[]{4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = weight.length-1; i >= 0; i--){
            System.out.print(weight[i]);
            if (i >= 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubles.length-1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i >= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i >= 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задание 4");
        for (int a = 0; a <= weight.length - 1; a++) {
            if (weight[a] % 2 != 0){
                weight[a]=weight[a] + 1;
                System.out.print(weight[a] + " ");;
            }else {System.out.print(weight[a] + " ");}

        }














    }
}