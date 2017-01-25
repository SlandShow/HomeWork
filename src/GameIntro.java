import java.net.Socket;

public class GameIntro extends GameScene {

    private boolean flag;
    private String answer;
    private GameCharacter character;

    public GameIntro(SceneLoader loader) {
        super(loader);
        flag = true;
        character = new GameCharacter();
    }

    @Override
    public void draw() {

        if (flag) {
            startIntro();
            flag = false;
        }

        System.out.println("Теперь вам предстоит пройти тест.");

    }

    public void startIntro() {
        // Интро
        story.makeStory();
        System.out.println(story.getStoryContent());

        // Имя
        story.makeStory();
        System.out.println(story.getStoryContent());
        hendler();
        character.setName(answer);

        // Возраст
        story.makeStory();
        System.out.println(story.getStoryContent());
        hendler();
        character.setAge(Integer.parseInt(answer));

        // Харизма
        story.makeStory();
        System.out.println(story.getStoryContent());
        hendler();
        character.setCharisma(Float.parseFloat(answer));

        // Сила
        story.makeStory();
        System.out.println(story.getStoryContent());
        hendler();
        character.setStrength(Integer.parseInt(answer));

        // Тип игрока: воин, шиноби, викинг
        story.makeStory();
        System.out.println(story.getStoryContent());
        hendler();
        if (answer.toLowerCase().equals("рыцарь")) character.setProfile(GameCharacter.Profile.KNIGHT);
        else if (answer.toLowerCase().equals("самурай")) character.setProfile(GameCharacter.Profile.SAMURAI);
        else if (answer.toLowerCase().equals("викинг")) character.setProfile(GameCharacter.Profile.VIKING);
        else character.setProfile(GameCharacter.Profile.NONE);

        // Конец создания персонажа
        story.makeStory();
        System.out.println(story.getStoryContent());
    }

    @Override
    public void update() {

    }

    @Override
    public void hendler() {
        String answer = in.nextLine();
        this.answer = answer;
    }
}
