
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Function untuk pilihan pertama atau admin
    static void admin (){
        Scanner scanner = new Scanner(System.in);

        //String untuk menyimpan data username dan password
        String usernameAdmin = "Admin501";
        String passAdmin = "password501";

        // Input user
        System.out.printf("Masukkan Username: ");;
        String checkusernameadmin = scanner.nextLine();

        System.out.printf("Masukkan Password: ");
        String checkpassadmin = scanner.nextLine();

        // Logika untuk pengecekan apakah cocok atau tidak
        if (checkusernameadmin.equals(usernameAdmin) && checkpassadmin.equals(passAdmin)){
            System.out.println("Selamat Login berhasil");
        }else{
            System.out.println("Tidak cocok!");
        }
    }

    // Function untuk opsi pilihan kedua atau mahasiswa
    static void mahasiswa (){
        Scanner scanner = new Scanner(System.in);

        String nameMahasiswa = "M.Aldhitofa Dimas P.";
        String nimMahasiswa = "202410370110501";

        System.out.printf("Masukkan nama: ");
        String checknama = scanner.nextLine();

        System.out.printf("Masukkan NIM:");
        String checknim = scanner.nextLine();

        if (checknama.equals(nameMahasiswa) && checknim.equals(nimMahasiswa)){
            System.out.println("Login Berhasil!!");
            System.out.printf("Nama : "+nameMahasiswa);
            System.out.printf("\nNIM  : "+nimMahasiswa);
        }else {
            System.out.println("Login tidak berhasil! Nama atau NIM salah");
        }
    }
    // Function Main atau utama
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Membuat menu login
        System.out.println("Pilih login yang akan dipilih:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");

        //Input user menentukan pilihan
        System.out.printf("Masukkan pilihan: ");
        int option = scanner.nextInt();

        //Logika if else untuk mengarahkan ke menu yang dipiliha
        if (option == 1 ){
            admin();
        } else if (option == 2) {
            mahasiswa();
        }else {
            System.out.println("Pilihan tidak Valid!");
        }
    }
}