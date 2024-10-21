import java.util.Scanner;
public class NamaPorseni15 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int jmlPoltek;
        String nama;

        System.out.print("Masukkan jumlah Politeknik yang mengikuti Porseni: ");
        jmlPoltek = input15.nextInt();
        input15.nextLine();

        for (int i = 1; i <= jmlPoltek; i++) {
            System.out.println("Untuk Politeknik ke-" + i);

            System.out.println("=========  CABANG OLAHRAGA BADMINTON =========");
            for (int a = 1; a <= 5; a++){
                System.out.print("Nama peserta ke-" + a + " : ");
                nama = input15.nextLine();
            }                
            System.out.println("========= CABANG OLAHRAGA TENIS MEJA =========");
            for (int b = 1; b <= 5; b++){
                System.out.print("Nama peserta ke-" + b + " : ");
                nama = input15.nextLine();
            }                        
            System.out.println("=========   CABANG OLAHRAGA BASKET   =========");
            for (int c = 1; c <= 5; c++){
                System.out.print("Nama peserta ke-" + c + " : ");
                nama = input15.nextLine();
            }
            System.out.println("=========  CABANG OLAHRAGA BOLA VOLI =========");
            for (int d = 1; d <= 5; d++){
                System.out.print("Nama peserta ke-" + d + " : ");
                nama = input15.nextLine();
            }
        }
    }
}