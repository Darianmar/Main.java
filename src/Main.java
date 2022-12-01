import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество смертников");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("введите k-того игрока");
        int k = scan.nextInt();
        int i, j, kill=0;
        a[0]=1;
        for (i = 1; i<n; i++) {
            a[i] = a[i-1]+1;
        }
        System.out.println(Arrays.toString(a));
        j = 0;
        for (i=0; kill <= n-2; i++) {
            if (a[i]>0)// проверка на жизнь
                j++;
            if (j == k) {
                a[i] = 0;// убийство
                j = 0;
                kill++;
            }
            if (i==n-1)
                i = -1;// по циклу идет ++ и i становитс 0
        }
        System.out.println(Arrays.toString(a));
        for (i = 0; i<n; i++)
            if (a[i]>0)
                System.out.println(a[i]);
    }

}