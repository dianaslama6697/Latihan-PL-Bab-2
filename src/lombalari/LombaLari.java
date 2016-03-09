package lombalari;
public class LombaLari {
    private double putaran, waktu, jarak, keliling, jaraak;
    private String nama, nim;
    LombaLari (double putaran, double waktu, double panjang, double lebar, String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.putaran = putaran;
        this.waktu = waktu;
        this.keliling = (2*panjang)+(2*lebar);
    }
    public double getPutaran(){
        this.putaran = keliling*this.putaran;
        return putaran;
    }
}
