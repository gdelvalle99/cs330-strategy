public class GameUnit{
    private MoveBehavior moveBehavior;
    private AttackBehavior attackBehavior;
    void performAttack(){
        attackBehavior.attack();
    }
    void performMove(){
        moveBehavior.move();
    }
    void setAttack(AttackBehavior attack){
        attackBehavior = attack;
    }
    void setMove(MoveBehavior move){
        moveBehavior = move;
    }
}