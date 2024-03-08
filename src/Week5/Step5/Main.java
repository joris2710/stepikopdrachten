package Week5.Step5;

interface GeeftBegroeting {
    String standaardBegroeting();
}

class Volwassene implements GeeftBegroeting {
    // voeg hieronder iets toe
    public String standaardBegroeting(){
        return "Goedendag!";
    }

}
class Kind implements GeeftBegroeting {
    // voeg hieronder iets toe
    public String standaardBegroeting(){
        return "Hoi!";
    }

}
public class Main {
    public static void main(String[] args) {
        GeeftBegroeting[] groetendeMensen = {new Volwassene(), new Kind()};
        for(GeeftBegroeting groet : groetendeMensen){
            System.out.println(groet.standaardBegroeting());
        }
    }
}