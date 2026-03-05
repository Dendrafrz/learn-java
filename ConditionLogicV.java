public class ConditionLogicV {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 15;
        int angka3 = 12;
        //gimana caranya menghasilkan output 15

        if (angka1 < angka2 && angka1 > angka3) {
            System.out.println(angka1);
        } else if (angka2 > angka3) {
            System.out.println(angka2);
        } else {
            System.out.println(angka3);
        }
    }

}
