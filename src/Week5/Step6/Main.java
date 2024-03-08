package Week5.Step6;

// maak hieronder de interface en de klasse
interface KanOptellen{
    int telOp(int getal1, int getal2);
}

class Rekenmachine implements KanOptellen{
    public int telOp(int getal1, int getal2){
        return getal1 + getal2;
    }
}

public class Main {
    public static void main(String[] args) {
        KanOptellen optelSom = new Rekenmachine();
        int getal1 = 1;
        int getal2 = 3;
        int antwoord = optelSom.telOp(getal1, getal2);
        System.out.println("Rekensom: " + getal1 + " + " + getal2 + " = " + antwoord);
    }
}