// Package Pertemuan13;
// public class Kafe06 {
// public static void Menu() {
// System.out.println("===== MENU RESTO KAFE =====");
// System.out.println("1. Kopi Hitam - Rp 15.000");
// System.out.println("2. Cappuccino - Rp 20.000");
// System.out.println("3. Latte - Rp 22.000");
// System.out.println("4. Teh Tarik - Rp 12.000");
// System.out.println("5. Roti Bakar - Rp 10.000");
// System.out.println("Mie Goreng - Rp 18.000");
// System.out.println("===========================");
// System.out.println("Silahkan pilih menu yang Anda inginkan.");
// }
// public static void main (String[] args) {
// Menu();
// }
// }

// // package Pertemuan13;

// // import java.util.Scanner;

// // public class Kafe06 {

// // public static void Menu(String namaPelanggan, boolean isMember) {
// // System.out.println("Selamat datang, " + namaPelanggan + "!");

// // if (isMember) {
// // System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap
// pembelian!");
// // }
// // System.out.println("==== MENU RESTO KAFE ====");
// // System.out.println("1. Kopi Hitam - Rp 15,000");
// // System.out.println("2. Capuccino - Rp 20,000");
// // System.out.println("3. Latte - Rp 22,000");
// // System.out.println("4. Teh Tarik - Rp 12,000");
// // System.out.println("5. Roti Bakar - Rp 10,000");
// // System.out.println("6. Mie Goreng - Rp 18,000");
// // System.out.println("============================");
// // System.out.println("Silahkan pilih menu yang anda inginkan ");
// // }

// // public static int hitungTotalHarga23(int pilihanMenu, int banyakItem) {
// // int[] hargaItems = { 15000, 20000, 22000, 12000, 1000, 18000 };

// // int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
// // return hargaTotal;
// // }

// // public static void main(String[] args) {
// // Menu("Andi", true);
// // Scanner sc = new Scanner(System.in);
// // System.out.print("Masukkan nomor menu yang ingin anda pesan : ");
// // int pilihanMenu = sc.nextInt();
// // System.out.print("Masukkan jumlah item yang ingin dipesan :");
// // int banyakItem = sc.nextInt();

// // int totalHarga = hitungTotalHarga23(pilihanMenu, banyakItem);

// // System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
// // }
// // }
// import java.util.Scanner;

// public class Kafe06 {
// static String[] namaMenu = { "Kopi Hitam", "Cappuccino", "Latte", "Teh
// Tarik", "Roti Bakar", "Mie Goreng" };
// static int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

// public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String
// kodePromo) {
// double hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
// switch (kodePromo) {
// case "DISKON50":
// hargaTotal *= 0.5;
// break;
// case "DISKON30":
// hargaTotal *= 0.7;
// break;
// case "":
// break;
// default:
// System.out.println("Kode promo tidak valid. Tidak ada diskon yang
// diberikan.");
// break;
// }
// return hargaTotal;
// }

// public static void Menu(String namaPelanggan, boolean isMember) {
// System.out.println("Selamat Datang, " + namaPelanggan + "!");
// if (isMember) {
// System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap
// pembelian!");
// }
// System.out.println("===== MENU RESTO KAFE =====");
// for (int i = 0; i < namaMenu.length; i++) {
// System.out.printf("%d. %s - Rp %d\n", i + 1, namaMenu[i], hargaItems[i]);
// }
// System.out.println("===========================");
// System.out.println("Silahkan pilih menu yang Anda inginkan.");
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// Menu("Andi", true);
// double totalKeseluruhan = 0;
// String lagi;

// do {
// System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
// int pilihanMenu = sc.nextInt();

// System.out.print("Masukkan jumlah item yang ingin dipesan: ");
// int banyakItem = sc.nextInt();
// sc.nextLine();

// System.out.print("Masukkan kode promo (jika ada): ");
// String kodePromo = sc.nextLine();

// double totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
// totalKeseluruhan += totalHarga;

// System.out.printf("Total untuk %s (%d item): Rp %.2f\n", namaMenu[pilihanMenu
// - 1], banyakItem, totalHarga);

// System.out.print("\nApakah Anda ingin memesan menu lain? (ya/tidak): ");
// lagi = sc.nextLine();
// } while (lagi.equalsIgnoreCase("ya"));
// System.out.println("Total keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
// }
// }