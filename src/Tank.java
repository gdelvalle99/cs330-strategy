public class Tank extends GameUnit{
    public Tank(){
        System.out.println("new Tank");
        setAttack(new Axe());
        setMove(new Walking());
    }
}