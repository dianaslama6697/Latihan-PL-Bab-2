package lombalari;
import java.util.Scanner;
public class LombaLariMain {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Jumlah mahasiswa     : ");
        int jmlh_mhs = in.nextInt();
        LombaLari [] lomba = new LombaLari [jmlh_mhs];
        System.out.print("Panjang lapangan (m) : ");
        double panjang = in.nextDouble();
        System.out.print("Lebar lapangan (m)   : ");
        double lebar = in.nextDouble();
        for (int i = 0 ; i <lomba.length ; i ++){
            System.out.println("-----------------------------");
            System.out.print("NIM \t\t : ");
            String nim = in.next();
            System.out.print("Nama mahasiswa\t : ");
            String nama = in.next();
            System.out.print("Banyak putaran\t : ");
            double putaran = in.nextDouble();
            System.out.print("Waktu tempuh\t : ");
            double waktu = in.nextDouble();
            lomba[i] = new LombaLari(putaran, waktu, panjang, lebar, nama, nim);            
        }
        for ( int i = 0; i < jmlh_mhs; i++){
            System.out.println(lomba[i].getNama());
            System.out.println(lomba[i].getPutaran());
        }
            double max = 0;
            String nama = "";
            for (int i=1; i<jmlh_mhs;i++){
                if (lomba[i].getJuara() > max){
                    max= lomba[i].getJuara();
                    nama = lomba[i].getNama();                    
                }                
            }
            System.out.println("Waktu tercepat dicetak oleh "+nama);
    }
    
}
    
