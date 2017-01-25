import java.util.Scanner;

/**
 * Created by Admin on 23.01.2017.
 */
public abstract class GameScene {

    protected SceneLoader loader;
    protected Scanner in;
    protected Story story;

    public GameScene(SceneLoader loader) {
        this.loader = loader;
        in = new Scanner(System.in);
        story = new Story("src/res/intro/intro.txt");
    }

    abstract public void draw();

    abstract public void update();

    abstract public void hendler();

}
