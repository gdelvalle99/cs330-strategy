public class Grunt extends GameUnit {

    public Grunt(){
        System.out.println("new Grunt");
        setAttack(new Axe());
        setMove(new Walking());
    }
}