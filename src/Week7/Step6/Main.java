package Week7.Step6;

import java.util.ArrayList;

interface Luiwammes {
    void wasAf();
}

class Ouder implements Luiwammes {
    @Override
    public void wasAf(){
        System.out.println("Ik heb het druk, maar laat ik toch maar even snel die vaat doen...");
    }
}

class Kind implements Luiwammes {
    @Override
    public void wasAf(){
        System.out.println("Ik heb geen zin in de vaat, maar laat ik mijn ouder toch maar blij maken...");
    }
}
class Vaatwasser implements Luiwammes {
    @Override
    public void wasAf(){
        System.out.println("Bzzz, drgghhg, wushush..... piep piep piep en klaar!");
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Luiwammes> afwassers = new ArrayList<>();
        afwassers.add(new Ouder());
        afwassers.add(new Kind());
        afwassers.add(new Vaatwasser());
        for (Luiwammes afwasser : afwassers){
            afwasser.wasAf();
        }
    }
}