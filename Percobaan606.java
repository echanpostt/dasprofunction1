// package Pertemuan13;

// import java.util.Scanner;

// public class Percobaan606 {
//     static int hitungLuas(int pjg, int lb) {
//         int Luas = pjg * lb;
//         return Luas;
//     }

//     static int hitungVolume(int tinggi, int a, int b) {
//         int volume = hitungLuas(a, b) * tinggi;
//         return volume;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int p, l, t, L, vol;

//         System.out.println("Masukkan panjang");
//         p = input.nextInt();
//         System.out.println("Masukkan lebar");
//         l = input.nextInt();
//         System.out.println("Masukkan tinggi");
//         t = input.nextInt();

//         L = hitungLuas(p, l);
//         System.out.println("Luas Persegi panjang adalah " + L);
//         vol = hitungVolume(t, p, l);
//         System.out.println("Volume balok adalah " + vol);
//     }
// }
public class Percobaan606 {
    public static void TampilHinggakei(int i) {
        for (int j = 1; j <= 1; j++) {
            System.out.print(j);
        }
    }

    public static int Jumlah(int bill, int bil2) {
        return (bill + bil2);
    }

    public static void TampilJumlah(int bill, int bil2) {
        TampilHinggakei(Jumlah(bill, bil2));
    }

    public static void main(String[] args) {

        int temp = Jumlah(1, 1);

        TampilJumlah(temp, 5);
    }
}