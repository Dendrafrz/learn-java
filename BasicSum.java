public class BasicSum {

    public static void main(String[] args) {

        int angka1 = 20;
        int angka2 = 30;

        int pertambahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian = angka1 / pengurangan;

        System.out.println(pertambahan);
        System.out.println(pengurangan);
        System.out.println(perkalian);
        System.out.println(pembagian);

        // case baru
        // angka1 = angka1+1; / angka1++;
        // angka2 = angka2-1; / angka2--;

        angka1++;
        angka2--;
        System.out.println(angka1);
        System.out.println(angka2);

    }
}
