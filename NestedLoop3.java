public class NestedLoop3 {

    // gimana caranya biar false aja
    public static void main(String[] args) {
        String kalimat = "Welcome";
        for (int a = 0; a < 6; a++) {
            if (a <= 6) {
                System.out.println("Hello");
            } else {
                System.out.println(kalimat);
            }
        }
    }

}
