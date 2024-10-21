import java.util.Scanner;

public class PersegiAngka15 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);
        
        int N, i = 1, j;

        System.out.print("Masukkan nilai N (minimal 3): ");
        N = input15.nextInt();

        if (N > 2) {
            while (i <= N) {
                if (i == 1 || i == N) {
                    j = N;
                    while (j != 0) {
                        System.out.print(N + " ");
                        j--;
                    }
                    System.out.println();
                } else {
                    System.out.print(N);
                    j = (N - 2);
                    while (j != 0) {
                        System.out.print("  ");
                        j--;
                    }                        
                    System.out.println(" " + N);
                }
            i++;
            }
        } else {
            System.out.println("Input invalid");
        }
    }
}