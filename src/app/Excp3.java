package app;

public class Excp3 {
    public static void main(String[] args) {
        byte[] b = new byte[5];
        System.out.println("Input Bilangan Bulat : ");
        try {
            System.in.read(b);
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
        String z = new String(b).trim();
        int f = Integer.valueOf(z);
        System.out.println("Hasil : " + (f+2));
    }
    //Jika saya input : 14
    //maka output : 16
}