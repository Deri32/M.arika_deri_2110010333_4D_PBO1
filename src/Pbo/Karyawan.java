package Pbo;
//class
public class Karyawan {//atribut dan encapculation
    private String nik;
    private String nama;

    //construktor
    public Karyawan(String nik, String nama) {
        this.nik= nik;
        this.nama = nama;
    }

    //setter
    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

 
    //getter
    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }
    
    
    public String displayInfo() {
        return "Nik= "+getNik()+ "\nNama = "+getNama();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    }
    
}
