import java.util.Random;

public class largestNo {
    public static void main(String[] args) {
        Random rd = new Random();
        int p = rd.nextInt();
        int l = p % 50;
        int n = Math.abs(l);
        System.out.println(n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = rd.nextInt();
            arr[i] = x % 100;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int largest = arr[0];
        for (int j = 0; j < n - 1; j++) {
            if (largest < arr[j + 1]) {
                largest = arr[j + 1];
            }
        }
        System.out.println(largest);

    }
}