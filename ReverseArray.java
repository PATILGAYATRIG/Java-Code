import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        sc.close();
        System.out.println("Reverse Array:");
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");

        }

    }

}
