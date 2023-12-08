import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] weight = new int[]{1, 2, 3};
        float[] dog = {1.57f, 7.654f, 9.986f};
        int[] cat = {34, 6, 13, 4};
        System.out.println("Задача 2");
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int a = 0; a < dog.length; a++) {
            if (a == dog.length - 1) {
                System.out.println(dog[a]);
                break;
            }
            System.out.print(dog[a] + ", ");
        }
        for (int b = 0; b < cat.length; b++) {
            if (b == cat.length - 1) {
                System.out.println(cat[b]);
                break;
            }
            System.out.print(cat[b] + ", ");
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int a = dog.length - 1; a >= 0; a--) {
            if (a == 0) {
                System.out.println(dog[a]);
                break;
            }
            System.out.print(dog[a] + ", ");
        }
        for (int b = cat.length - 1; b >= 0; b--) {
            if (b == 0) {
                System.out.println(cat[b]);
                break;
            }
            System.out.print(cat[b] + ", ");
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
            System.out.print(weight[i] + " ");
        }

    }
}