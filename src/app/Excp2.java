package app;

public class Excp2 {
    public static void main(String[] args) {
        byte[] b = new byte[5];
        try {
            System.in.read(b);
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hasil : " + (char) b[0] + (char) b[1] + (char) b[2]);
    }
    //jika saya input : ngulik
    //maka outputnya : ngu
}