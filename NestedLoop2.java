public class NestedLoop2 {
    public static void main(String[] args) {
        int jmlSegitiga = 10;
        for (int i = jmlSegitiga; i >= 0; i--) {

            String bintang = "";
            for (int ii = 0; ii <= jmlSegitiga; ii++) {
                if (ii <= i) {
                    bintang = bintang + "";
                } else {
                    bintang = bintang + "0";
                }

            }
            System.out.println(bintang);
        }
    }
}
