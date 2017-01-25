import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Admin on 24.01.2017.
 */
public class GameContent {

    private BufferedReader bufferedReader;
    private String content;

    public GameContent(String path) {
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeContentReader(String path) {
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Загрузка txt документа с диалогами/описанием и т.д
    public void loadContent() {
        try {
            content = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getContent() {
        return content;
    }
}
