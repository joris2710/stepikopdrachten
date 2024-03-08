package Week5.Step8;

class Hoofd {
    private int punterigheid;

    public Hoofd(int punterigheid){
        this.punterigheid = punterigheid;
    }
    public int getPunterigheid(){
        return punterigheid;
    }
}
class Hoed{
    protected int basisPunterigheid;

    public Hoed(int basisPunterigheid){
        this.basisPunterigheid = basisPunterigheid;
    }
}
interface PunthoofdMeter{
    boolean pastOpHoofd(Hoofd hoofd);
}
class BolHoed extends Hoed implements PunthoofdMeter{
    private int bolling;

    public BolHoed(int bolling, int basisPunterigheid){
        super(basisPunterigheid);
        this.bolling = bolling;
    }
    public boolean pastOpHoofd(Hoofd hoofd){
        return hoofd.getPunterigheid() < (basisPunterigheid + bolling);
    }
}
class DeukHoed extends Hoed implements PunthoofdMeter{
    private int deuk;

    public DeukHoed(int basisPunterigheid, int deuk){
        super(basisPunterigheid);
        this.deuk = deuk;
    }
    public boolean pastOpHoofd(Hoofd hoofd){
        return hoofd.getPunterigheid() < (basisPunterigheid - deuk);
    }
}
public class Main {
    public static void main(String[] args) {
        Hoofd hoofd = new Hoofd(500);
        BolHoed bolHoed = new BolHoed(30, 500);
        DeukHoed deukHoed = new DeukHoed(530,40);
        System.out.println(bolHoed.pastOpHoofd(hoofd));
        System.out.println(deukHoed.pastOpHoofd(hoofd));
    }
}