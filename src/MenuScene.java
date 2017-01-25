import java.util.Scanner;

public class MenuScene extends GameScene {


    public MenuScene(SceneLoader loader) {
        super(loader);
    }

    @Override
    public void draw() {
        System.out.println("Do you wanna start the game? \n + (Y/N)");
    }

    @Override
    public void update() {
        hendler();
    }

    @Override
    public void hendler() {
        String answer = in.nextLine();
        if (answer.equals("Y")) {
           // Создаем новую сцену
            loader.changeScene(SceneLoader.INTRO);
            loader.setNewScene(new GameIntro(loader));
        }
        else if (answer.equals("N")) System.exit(0);
    }
}
