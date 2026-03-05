public class ConditionalLogic {
    public static void main(String[] args) {
        //kondisi logika if else dengan 2 pilihan 
        boolean state = false;
        int angka = 1;

        if(state){
            System.out.println("masuk status Aktif");
        }
        else{
            System.out.println("masuk status Non-Aktif");
        }
        if(angka >10){
            System.out.println("angka lebih besar dari 10");
        }
        else{
            System.out.println("angka kurang dari atau sama dengan 10");
        }
    }
}
