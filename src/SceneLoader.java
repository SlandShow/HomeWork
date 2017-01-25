import javafx.scene.Scene;

import java.util.ArrayList;

/**
 * Created by Admin on 23.01.2017.
 */
public class SceneLoader {

    private ArrayList<GameScene> scenes;
    public static final int MENU_SCENE = 0; // Меню
    public static final int INTRO = 1; // Создание персонажа
    public static int CURRENT_SCENE = 0;


    public SceneLoader() {
        scenes = new ArrayList<GameScene>(); // Всего пять сцен

    }

    public void update() {
       scenes.get(CURRENT_SCENE).update();
    }

    public void draw() {
        scenes.get(CURRENT_SCENE).draw();
    }

    public GameScene getCurrentScene() {
        return scenes.get(CURRENT_SCENE);
    }

    public void changeScene(int num) {
        CURRENT_SCENE = num;
    }

    public void setNewScene(GameScene anotherScene) {
        scenes.add(anotherScene);
    }

}
