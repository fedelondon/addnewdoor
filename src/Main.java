public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(sumpuertas(coche.puertas));
    }

    public static int sumpuertas(int puertas){
        int total = puertas + 1;
        return total;
    }
}