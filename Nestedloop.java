public class Nestedloop {
    public static void main(String[] args) {
        int jmlLooping = 0;
        for (int i = 0; i <2; i++) {
            for (int ii = 0; ii <10; ii++) {
                jmlLooping++;
                System.out.println("index looping pertama" + i + "index looping ke 2" + ii);
            }
        }
        System.out.println("Jumlah Looping" + jmlLooping);
    }
}