import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1,2");
        int [] weight = new int[]{1, 2, 3};
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
        int [] weightNew = new int[]{1, 2, 3};
        for (int i = weightNew.length-1; i >= 0; i--){
            System.out.print(weightNew[i]);
            if (i >= 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        double [] doublesNew = {1.57, 7.654, 9.986};
        for (int i = doublesNew.length-1; i >= 0; i--) {
            System.out.print(doublesNew[i]);
            if (i >= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] arrNew = new int[]{4, 5, 6, 7, 8};
        for (int i = arrNew.length-1; i >= 0; i--) {
            System.out.print(arrNew[i]);
            if (i >= 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задание 4");
        int [] weightNewNew = new int[]{1, 2, 3};
        for (int a = 0; a <= weightNewNew.length - 1; a++) {
            if (weightNewNew[a] % 2 != 0){
                weightNewNew[a]=weightNewNew[a] + 1;
                System.out.print(weightNewNew[a] + " ");;
            }
        }














    }
}