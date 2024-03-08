package Week7.Step3;

abstract class Game {
    public String naam;
    public int aantalSpelers;
    public double metaCriticScore;
    public void toonGegevens(){
        System.out.println(naam);
        System.out.println(aantalSpelers);
        System.out.println(metaCriticScore);
    }
}

public class Main {
}