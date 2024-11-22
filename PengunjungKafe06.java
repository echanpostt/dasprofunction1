// package Pertemuan13;

// public class PengunjungKafe06 {
//     public static void daftarPengunjung(String... namaPengunjung) {
//         System.out.println("Daftar Nama Pengunjung: ");
//         for (String nama : namaPengunjung) {
//             System.out.println("- " + nama);
//         }
//     }

//     public static void main(String[] args) {
//         daftarPengunjung("Ali", "Budi", "Citra");
//     }
// }
package Pertemuan13;

public class PengunjungKafe06 {
    public static void daftarPengunjung(Object... data) {
        for (Object item : data) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", 25, "Budi", 30, "Citra", 22);
    }
}
