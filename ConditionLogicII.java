public class ConditionLogicII {
    public static void main(String[] args) {

        // note : di IF, ELSE IF, ELSE (menampung kondisi dalam satu waktu)
        // maka di cek terlebih dahulu dari if lalu Else If lalu jika false masuknya ke
        // else

        int angka = 201;

        if (angka > 200) {

            angka = 50;
            // contoh 201 lbh besar dari 200 akan menampilkan angka 50
        } else if (angka == 200) {
            angka = 40;
            // kalau 201 ini akan tetap menampilkan di if pertama
            // contoh 200 sama dengan 200 akan menapilkan angka 400
        } else if (angka == 100) {
            angka = 30;
            // kalau 201 ini akan tetap menapilkan di if pertama
            // contoh di input int angka = 100 dan sama dengan 100 akan meanpilkan angka 30
        } else {
            angka = 20;
            // kalau 201 ini akan tetap menampilkan di if pertama
            // bertujuan false berarti dibawah angka <100
        }
        System.out.println(angka);
    }
}
