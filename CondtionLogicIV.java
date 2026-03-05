public class CondtionLogicIV {
    public static void main(String[] args) {
        // boolean operator
        int angka1 = 2;
        int angka2 = 3;

        String kata1 = "kamu";
        String kata2 = "kamu";

        // System.out.println(angka1 == angka2);
        // System.out.println(kata1.equals(kata1));
        // maksud kata1.equals "kamu" == (kata1) "kamu" adalah true
        // kalo kata2.equals(kata1) hasilnya false karena "dia" == "kamu" adalah false

        System.out.println(angka1 == angka2 && kata1.equals(kata2));
        System.out.println(angka1 == angka2 || kata1.equals(kata2));
        System.out.println(!(angka1 == angka2) && kata1.equals(kata2));

        // info tambahan
        // && And connect 2 boolean expressions menjadi satu / true
        // || Or connect 2 boolean expressions menjadi satu dan dengan or memilih satu
        // ! Not kebalikan dari truth of boolean esxpresion

    }
}
