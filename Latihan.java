public class Latihan {

    // Buat Program ngecek brp banyak jml huruf "a"
    // contoh : string kalimat = "saya senang sekali"
    // outputnya jumlah huruf a = 4

    public static void main(String[] args) {
        int jumlahHurufA = 0;
        String kalimat1 = "Saya Senang Sekali";

        for (int i = kalimat1.length() - 1; i >= 0; i--) {
            if (kalimat1.charAt(i) == 'a') {
                jumlahHurufA++;
            }
        }
        System.out.println("jumlah huruf a :" + jumlahHurufA);
    }
}
