public class Tank extends GameUnit {
    public Tank() {
        System.out.println("new Tank");
        setAttack(new Cannon());
        setMove(new Driving());
    }
}