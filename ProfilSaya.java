package Zacky;
public class ProfilSaya {
    // Deklarasi Profil
    String Nama;
    String Nim;
    String Kelas;
    String jurusan;
    String Email;

    // Constructor
    public ProfilSaya(String nama, String nim, String kelas,String jurusan, String email) {
        this.Nama = nama;
        this.Nim = nim;
        this.Kelas = kelas;
        this.jurusan = jurusan;
        this.Email = email;
    }

    // menampilkan profil

    public static void main(String[] args) {
        // Membuat objek sertaProfile dan mengisi data
        ProfilSaya profil = new ProfilSaya("Muhammad Zacky","12350110010","D","Teknik Informatika","zackymhd29@gmail.com");

        // Menampilkan profil
            System.out.println("PROFIL SAYA");
            System.out.println("Nama    : " + profil.Nama);
            System.out.println("NIM     : " + profil.Nim);
            System.out.println("Kelas   : " + profil.Kelas);
            System.out.println("Kelas   : " + profil.jurusan);
            System.out.println("Email   : " + profil.Email);
    }
}

