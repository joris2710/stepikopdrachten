package Week5.Step7;

import java.util.ArrayList;

// schrijf hieronder de interface + klassen :)
interface InfoEvent{
    public void toonInfo();
}

class RockConcert implements InfoEvent{
    String naamEvenement;
    String plaats;
    String band;

    public void setBand(String band) {
        this.band = band;
    }

    public void setNaamEvenement(String naamEvenement) {
        this.naamEvenement = naamEvenement;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    @Override
    public void toonInfo() {
        System.out.println(naamEvenement);
        System.out.println(plaats);
        System.out.println(band);
    }
}
class HipHopBattle implements InfoEvent{
    String naamEvenement;
    String plaats;
    ArrayList<String> lineup;

    public void setNaamEvenement(String naamEvenement) {
        this.naamEvenement = naamEvenement;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public void setLineup(ArrayList<String> lineup) {
        this.lineup = lineup;
    }

    @Override
    public void toonInfo() {
        System.out.println(naamEvenement);
        System.out.println(plaats);
        for (String line : lineup){
            System.out.println(line);
        }
    }
}
class DanceFestival implements InfoEvent{
    String naamEvenement;
    String plaats;
    int aantalDagen;

    public void setNaamEvenement(String naamEvenement) {
        this.naamEvenement = naamEvenement;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    @Override
    public void toonInfo(){
        System.out.println(naamEvenement);
        System.out.println(plaats);
        System.out.println(aantalDagen);
    }
}

public class Main {

    public static void main (String [] args) {

        RockConcert rockConcert = new RockConcert ();
        rockConcert.setBand ("URockYo!");
        rockConcert.setPlaats ("Nederland");
        rockConcert.setNaamEvenement ("Great Rock Music 4 U!");
        HipHopBattle hhBattle = new HipHopBattle ();
        hhBattle.setNaamEvenement ("Let's Hip-Hop for you!");
        hhBattle.setPlaats ("Hipperdam, of was het Hopperdam?");
        String hh1 = "Hippi-di-hop";
        String hh2 = "Hop hop hop, hipperdehip!";
        String hh3 = "Chop Cop Chop, Hop Hop Hip!?";
        ArrayList<String> hhLineup = new ArrayList<> ();
        hhLineup.add (hh1);
        hhLineup.add (hh2);
        hhLineup.add (hh3);
        hhBattle.setLineup (new ArrayList<> (hhLineup));
        DanceFestival danceFestival = new DanceFestival ();
        danceFestival.setNaamEvenement ("Dance 4 Joy");
        danceFestival.setPlaats ("The Dancefloor");
        danceFestival.setAantalDagen (5);
        ArrayList<InfoEvent> infoEvenementen = new ArrayList<> ();
        infoEvenementen.add (rockConcert);
        infoEvenementen.add (hhBattle);
        infoEvenementen.add (danceFestival);

        for (InfoEvent info : infoEvenementen) {
            info.toonInfo ();
        }
    }
}