import java.util.*;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static char pinjam;
    static char pilihMenu;
    static char pilih;
    static String nama;
    
    public static void displayWelcome() {
        System.out.println("==================================================");
        System.out.println("===     SELAMAT DATANG DI PERPUSTAKAAN KAMI    ===");
        System.out.println("==================================================");
    }
    public static void displayMenu() {
        System.out.println("== Daftar Menu ==");
        System.out.println("==1. Buku \n==2. Majalah \n==3. Koran \n==4. Keluar");
        System.out.print("> Pilih Menu : ");
        pilihMenu = scanner.next().charAt(0);
        switch (pilihMenu) {
            case '1': {
                 Rak buku1 = new Buku(1,"Mammals","Airlangga","18/11/2018","Celine Christine",2020);
                 Rak buku2 = new Buku(2,"World War II","Gramedia","13/08/2002","Dr.Edward Coumann",2021);
                 Rak buku3 = new Buku(3,"Java Fast Learning","Edu","06/02/2020","John Vardy",2022);
                 System.out.println("\n== Daftar Buku =="); 
                 buku1.display(buku1.getNama()); 
                 buku2.display(buku2.getNama()); 
                 buku3.display(buku3.getNama());
                 System.out.print("> Pilih buku yang ingin ditampilkan : ");
                 pilih = scanner.next().charAt(0);
                    switch (pilih) {
                        case '1':
                            buku1.display();
                            break;
                        case '2':
                            buku2.display();
                            break;
                        case '3':
                            buku3.display();
                            break;
                        default:
                            System.out.println("Tidak ada dalam pilihan\n");
                            displayMenu();
                            break;
                    }
                 break;
            }

            case '2': {
                Rak m1 = new Majalah(1, "Bobo", "Gramedia", "2002", "Bulanan", 20);
                Rak m2 = new Majalah(2, "Tempo", "Gramedia", "2001", "Mingguan", 44);
                Rak m3 = new Majalah(3, "Hidayah", "Gramedia", "2005", "Harian", 11);
                System.out.println("\n== Daftar Majalah ==");
                m1.display(m1.getNama());
                m2.display(m2.getNama());
                m3.display(m3.getNama());
                System.out.print("> Pilih majalah yang ingin ditampilkan : ");
                pilih = scanner.next().charAt(0);
                   switch (pilih) {
                       case '1':
                           m1.display();
                           break;
                       case '2':
                           m2.display();
                           break;
                       case '3':
                           m3.display();
                           break;
                       default:
                           System.out.println("Tidak ada dalam pilihan\n");
                           displayMenu();
                           break;
                   }
                break;
            }
            
            case '3': {
                Rak k1 = new Koran(1, "Argentina kalah 2-1 dari Arab Saudi", "Kompas", "22/11/2022", "Harian");
                Rak k2 = new Koran(2, "Gempa di Cianjur Menewaskan Ratusan Korban Jiwa", "Radar Bogor", "21/11/2022", "Harian");
                Rak k3 = new Koran(3, "Nvidia Merilis RTX 4090 dengan Harga 30 Jutaan", "Jagat", "12/10/2022", "Mingguan");
                System.out.println("\n== Daftar Koran ==");
                k1.display(k1.getNama());
                k2.display(k1.getNama());
                k3.display(k3.getNama());
                System.out.print("> Pilih koran yang ingin ditampilkan : ");
                pilih = scanner.next().charAt(0);
                   switch (pilih) {
                       case '1':
                           k1.display();
                           break;
                       case '2':
                           k2.display();
                           break;
                       case '3':
                           k3.display();
                           break;
                       default:
                           System.out.println("Tidak ada dalam pilihan\n");
                           displayMenu();
                           break;
                   }
                break;
            }

            case '4': {
                System.out.println("===================================================");
                System.out.println("Terima Kasih Atas Kunjungannya, "+nama+"!");
                System.out.println("===================================================");
                System.exit(0);
            }

            default:
                System.out.println("Input tidak sesuai !!\n");
                displayMenu();
        }
            System.out.print("Apakah Anda ingin meminjam [y/n]? ");
            pinjam = scanner.next().charAt(0);
            switch (pinjam) {
                case 'y':
                    if (pilihMenu == '1') {
                        System.out.println("Buku telah dipinjam\n");
                    } 
                    if (pilihMenu == '2') {
                        System.out.println("Majalah telah dipinjam\n");
                    } 
                    if (pilihMenu == '3') {
                        System.out.println("Koran telah dipinjam\n");
                    }
                    displayMenu();
                    break;
                case 'n':
                    System.out.println();
                    displayMenu();
                    break;
                default:
                    System.out.println("Input tidak sesuai !\n");
                    displayMenu();
            }
    }

    public static void displayName() {
        System.out.print("> Masukkan Nama Anda: ");
        nama = scanner.next();
    }

    public static void main(String[] args) {             
        displayWelcome();
        displayName();
        displayMenu();
    }

}