
/**
 * Created by Admin on 23.01.2017.
 */
public class Story {

    private GameContent content;
    private String storyContent;
    private String path;

    public Story(String path) {
        content = new GameContent(path);
    }

    public void change(String path) {
        this.path = path;
        content.changeContentReader(path);
    }

    public void makeStory() {
        content.loadContent();
        setStoryContent(content.getContent());
    }

    public String getStoryContent() {
        return storyContent;
    }

    private void setStoryContent(String storyContent) {
        this.storyContent = storyContent;
    }

}
