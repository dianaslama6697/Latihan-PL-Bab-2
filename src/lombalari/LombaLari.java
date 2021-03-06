//Nama    = Dian Aslama
//NIM     = 155150201111137
//Kelas   = TIF-H

//Identifikasi
//Class   = LombaLari
//Objek   = lomba
//Method  = LombaLari (Constructor, getPutaran, getJuara, getNama
//Atribut = putaran, waktu, jarak, keliling, jaraak





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
    public double getJuara(){
        this.jaraak = this.putaran/waktu;
        return jaraak;
    }
    public String getNama (){
        return nama;
    }
}
