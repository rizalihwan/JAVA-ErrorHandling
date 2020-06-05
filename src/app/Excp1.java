package app;

public class Excp1 {

    //Rizal ihwan sulaiman
    public static void main(String[] args){ 
        int n = 0;
        try {
            n = System.in.read();
        } catch (java.io.IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("Hasil : " + (char)n);

        //jika saya memasukan inputan : rizal
        //maka hasilnya : r
    }
}