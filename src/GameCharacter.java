import java.util.PriorityQueue;

/**
 * Created by Admin on 23.01.2017.
 */
public class GameCharacter {

    private String name;
    private int lives;
    private float charisma;
    private int strength;
    private float fortuna;
    private int age;
    private Profile profile;

    public enum Profile {
        KNIGHT, SAMURAI, VIKING, NONE
    }

    public GameCharacter() {
        lives = 3;
        charisma = 1f;
        strength = 1;
        fortuna = 1f;
        age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setCharisma(float charisma) {
        this.charisma = charisma;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setFortuna(float fortuna) {
        this.fortuna = fortuna;
    }

    public int getLives() {
        return lives;
    }

    public float getCharisma() {
        return charisma;
    }

    public int getStrength() {
        return strength;
    }

    public float getFortuna() {
        return fortuna;
    }
}
