public class NestedConditonLogic {

    // Coba buat sebuah program mengetahui sebuah mahasiswa tidak lulus
    // di semester terakhir dimana "Status" belum lulus akan didapatkan jika
    // Mahasiswa tersebut kurang dari 144 sks dan tidak pernah cuti
    // jika pernah cuti cek apakah mahasiswa tersebut melebihi 120 sks jika kurang
    // belum lulus
    // kemungkinan lain dari kedua hal tersebut maka mahasiswa lulus
    public static void main(String[] args) {
        boolean TidakpernahCuti = true;
        // status pake boolean
        // false = pernah cuti
        // true = gapernah cuti
        int JumlahSKSlulus = 121;

        if (TidakpernahCuti) { // untuk kondisi true jml sks 121;
            if (JumlahSKSlulus < 120) {
                System.out.println("kamu belum lulus");
            } else {
                System.out.println("Kamu LULUS");
            }
        } else { // untuk kondisi false jml sks 121;
            if (JumlahSKSlulus < 130) {
                // 140 SKS UNTUK yang pernah cuti makanya harus "false" boolean;
                System.out.println("kamu belum lulus");
            } else {
                System.out.println("kamu lulus");
            }
        }
    }
}
