
public class Game {

    public static void main(String[] args) {

        SceneLoader loader = new SceneLoader();
        loader.setNewScene(new MenuScene(loader));

        while (true) {
            loader.draw();
            loader.update();
        }
    }

}
