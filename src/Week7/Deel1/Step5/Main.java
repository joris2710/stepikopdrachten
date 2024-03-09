package Week7.Deel1.Step5;

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

class FPS extends Game {
    public boolean heeftZombies;
    @Override
    public void toonGegevens(){
        super.toonGegevens();
        System.out.println(heeftZombies);
    }
}

class Platformer extends Game {
    public String heeftLoodgieter;

    @Override
    public void toonGegevens(){
        super.toonGegevens();
        System.out.println(heeftLoodgieter);
    }
}

class RPG extends Game {
    public String heldNaam;
    public String prinsesNaam;

    @Override
    public void toonGegevens(){
        super.toonGegevens();
        System.out.println("De held heet niet " + prinsesNaam + ", de held heet " + heldNaam + "!");
    }
}
public class Main {

}