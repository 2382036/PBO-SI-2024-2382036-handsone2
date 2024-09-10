import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner

        int nomorHari;
        System.out.print("masukan nomor dari 1 sampai 7 :");
        nomorHari = Scanner.nextInt();
        String namaHari = "";

        if (nomorHari == 1){
            namaHari = "Minggu";

        } else if (nomorHari == 2){
            namaHari = "Senin";
        } else if (nomorHari == 3){
            namaHari = "Selasa";
        } else if (nomorHari == 4){
            namaHari = "Rabu";
        } else if (nomorHari == 5){
            namaHari = "Kamis";
        } else if (nomorHari == 6){
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        }  else {
            System.out.println("Masukan nomor dari 1 sampai 7 :");
            System.exit(status: o);
        }
        System.out.println("namaHari");
    }
}
