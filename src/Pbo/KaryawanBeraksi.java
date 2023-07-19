package Pbo;
 import java.util.Scanner;

public class KaryawanBeraksi {
    
    public static void main(String[] args) {
        //objek
        //DataKaryawan biodata = new DataKaryawan("63052304200304","Deri");
        
        //System.out.println(biodata.displayInfo());
        //System.out.println(biodata.displayInfo("Rantu"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       KaryawanDetail[] Karyawan = new KaryawanDetail[2];
        
        //perulangan
        for(int i =0; i<Karyawan.length;i++){  
        System.out.print(" Masukkan NIK "+(i+1)+" = ");
        String nik = scanner.nextLine();
        System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
        String nama = scanner.nextLine();
        
        //objek
        Karyawan[i] = new KaryawanDetail(nik,nama);
        }
        
        //perulangan
        for(KaryawanDetail data : Karyawan) {
            System.out.println("====================");
            System.out.println("Data Diri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIK"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}  

