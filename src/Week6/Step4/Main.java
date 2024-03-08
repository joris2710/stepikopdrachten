package Week6.Step4;

interface Character{
    void valAan(Character doelwit);
    void krijgSchade(int schade);
    void printInformatie();
    String getNaam();
    int getHP();
}

// hier gaan we de Wapen klasse maken, hierdoor hoeven we niet bij elk wapen deze variable/functie uit te schrijven.
class Wapen{
    protected int schade;
    public Wapen(int schade){
        this.schade = schade;
    }
    public int getSchade() {
        return schade;
    }
}

// Vervolgens maken we een Zwaard klasse aan die Wapen de Wapen klasse extend.
class Zwaard extends Wapen {
    private boolean extraScherp;
    /**
     * Hier maken we de constructor aan voor de klasse, let goed op dat we de constructor van de super klasse
     * ook aanroepen, het is ook belangrijk dat de constructor van de super klasse als eerste wordt aangeroepen.
     */
    public Zwaard(int schade, boolean extraScherp){
        super(schade);
        this.extraScherp = extraScherp;
    }

    /**
     * We overriden hier de getSchade methode van Wapen.
     * We checken of extraScherp true is, als dat zo is geven we schade + 5 terug,
     * anders geven we alleen schade terug
     */
    @Override
    public int getSchade(){
        if (extraScherp){
            return super.schade + 5;
        } else {
            return schade;
        }
    }
}

// Boog klasse aanmaken, deze extend ook van de Zwaard klasse.
class Boog extends Wapen {
    private boolean vuurPijlen;
    public Boog(int schade, boolean vuurPijlen){
        super(schade);
        this.vuurPijlen = vuurPijlen;
    }
    /**
     * Hier doen we eigenlijk hetzelfde als bij de getSchade methode van Zwaard, maar dan voegen we 10 toe bij schade
     * ipv 5.
     */
    @Override
    public int getSchade(){
        if (vuurPijlen){
            return schade + 10;
        } else {
            return schade;
        }
    }
}

// Als laatste van de drie maken we een staf klasse aan. Wederom extend deze de Zwaard klasse.
class Staf extends Wapen {
    private boolean zeldzaam;
    public Staf(int schade, boolean zeldzaam){
        super(schade);
        this.zeldzaam = zeldzaam;
    }
    @Override
    public int getSchade(){
        if (zeldzaam){
            return schade + 8;
        } else {
            return schade;
        }
    }
}

// Speler klasse, extend van de Character interface
class Speler implements Character{
    private String naam;
    private boolean gameOver = false;
    private int hp;
    private Wapen wapen;
    public Speler(String naam, int hp, Wapen wapen){
        this.naam = naam;
        this.hp = hp;
        this.wapen = wapen;
    }
    @Override
    public String getNaam(){
        return naam;
    }
    @Override
    public int getHP() {
        return hp;
    }
    private void gameOver(){
        this.gameOver = true;
        this.hp = 0;
        System.out.println("Game over voor speler " + naam);
    }
    @Override
    public void valAan(Character doelwit){
        if (gameOver){
            System.out.println("Deze speler kan niet aanvallen, want deze speler is al game over!");
            return;
        } else {
            doelwit.krijgSchade(wapen.schade);
        }
    }
    @Override
    public void krijgSchade(int schade){
        if (hp - schade <= 0){
            gameOver();
            return;
        } else {
            this.hp =- schade;
            System.out.println("Speler " + naam + " heeft " + schade + " schade gekregen!");
        }
    }
    @Override
    public void printInformatie(){
        System.out.println("Speler: " + naam);
        System.out.println("Game over: " + gameOver);
        System.out.println("Hoeveelheid HP: " + hp);
    }

}
public class Main {
    public static void main(String[] args) {

    }
}