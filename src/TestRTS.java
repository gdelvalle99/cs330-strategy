public class TestRTS {
    public static void main(String[] args) {
        GameUnit grunt = new Grunt();
        GameUnit tank = new Tank();
        grunt.performMove();
        tank.performMove();
        grunt.performAttack();
        tank.performAttack();

        // GameUnit newGrunt = new Grunt();
        grunt.setAttack(new Pistol());
        grunt.performAttack();
    }
}