package Week8.Stap1;

import java.util.ArrayList;
import java.util.Scanner;

class Oefening {

    //Variabelen declareren zoals beschreven in de UML diagram
    private String naam;
    private String spiergroep;
    private int aantalSets;
    private int aantalHerhalingen;
    private int rusttijd;
    public Oefening(String naam, String spiergroep, int aantalSets, int aantalHerhalingen, int rusttijd){
        this.naam = naam;
        this.spiergroep = spiergroep;
        this.aantalSets = aantalSets;
        this.aantalHerhalingen = aantalHerhalingen;
        this.rusttijd = rusttijd;
    }
    public void toonGegevens () {
        System.out.printf ("Oefening voor %s: herhaal %d keer " +
                        "(rust tussendoor %d seconden) %d %s%n",
                spiergroep, aantalSets, rusttijd, aantalHerhalingen, naam);
    }
    public boolean isOefening(String oefening){
        return oefening.equals(this.naam);
    }
}

class Trainingsschema {
    private final String klant;
    private String trainer;
    private ArrayList<Oefening> oefeningen;

    public Trainingsschema(String klant){
        this.klant = klant;
        this.trainer = "";
        this.oefeningen = new ArrayList<>();
    }
    public Trainingsschema(String klant, String trainer){
        this.klant = klant;
        this.trainer = trainer;
        this.oefeningen = new ArrayList<>();
    }
    public void voegOefeningToe(Oefening oefening){
        oefeningen.add(oefening);
    }
    public boolean isSchemaVoor(String klant){
        return klant.equals(this.klant);
    }
    public void toonTrainer(){
        if (!trainer.isEmpty()){
            System.out.println("Uw trainer: " + trainer);
        }
    }
    // Per oefening de methode toonGegevens aanroepen van line 21
    public void toonGegevens(){
        for (Oefening o : oefeningen){
            o.toonGegevens();
        }
    }
}

public class Main {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Trainingsschema> schemas = new ArrayList<>();
        ArrayList<Oefening> oefeningen = new ArrayList<>();
        schemas.add(new Trainingsschema("Arnold Schwarzenegger"));
        schemas.add(new Trainingsschema("Kim Kardashian","Daphne Jongejans"));
        oefeningen.add(new Oefening("Push-ups","Armen",3,3,30));
        oefeningen.add(new Oefening("Sit-ups","Buik",3,4,30));
        oefeningen.add(new Oefening("Squats","Benen",2,5,30));
        oefeningen.add(new Oefening("Supermans","Rug",3,3,15));
        oefeningen.add(new Oefening("Chest-dips","Borst",3,3,30));

        // Dit hierboven moet vast beter kunnen, maar het werkt dus tja

        for (Oefening oefening : oefeningen){
            schemas.get(0).voegOefeningToe(oefening);
        }
        schemas.get(1).voegOefeningToe(oefeningen.get(3));
        schemas.get(1).voegOefeningToe(oefeningen.get(1));

        System.out.println ("Wat is uw naam? ");
        String naam = scanner.nextLine();
        boolean isKlant = false;
        /* Checkt per trainingsschema of de naam er in voorkomt en zet dan de isKlant boolean naar true, als dit aan
        * het einde van de loop nog niet zo is wordt get programma afgesloten, anders gaat hij door*/
        try {
            for (Trainingsschema schema : schemas){
                if (schema.isSchemaVoor(naam)){
                    isKlant = true;
                }
            }
        } finally {
            if (!isKlant){
                System.out.println("U komt niet voor in ons systeem.");
                System.exit(0);
            }
        }
        for (Trainingsschema schema : schemas){
            if (schema.isSchemaVoor(naam)){
                schema.toonTrainer();
                schema.toonGegevens();
            }
        }
    }
}