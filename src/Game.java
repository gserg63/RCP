import java.io.IOException;

public class Game {
    Players playerTwo = new Players();
    Input input = new Input();

    public void startGame() throws IOException {

        String playerName = input.inputName();
        String selectPlayerOne = input.selectElement();

        System.out.println("Ваш выбор:");
        System.out.println(selectPlayerOne);
        System.out.println("Выбор противника:");
        System.out.println(playerTwo.player());

        if (selectPlayerOne.equals("Rock") && playerTwo.player().equals("Clippers")) {
            System.out.printf("%s выиграл!", playerName);
        }else if (selectPlayerOne.equals("Clippers") && playerTwo.player().equals("Paper")) {
            System.out.printf("%s выиграл!", playerName);
        }else if (selectPlayerOne.equals("Paper") && playerTwo.player().equals("Rock")) {
            System.out.printf("%s выиграл!", playerName);
        }else if (playerTwo.player().equals("Rock") && selectPlayerOne.equals("Clippers")){
            System.out.printf("%s проиграл!", playerName);
        }else if (playerTwo.player().equals("Clippers") && selectPlayerOne.equals("Paper")){
            System.out.printf("%s проиграл!", playerName);
        }else if (playerTwo.player().equals("Paper") && selectPlayerOne.equals("Rock")){
            System.out.printf("%s проиграл!", playerName);
        }else if (selectPlayerOne.equals(playerTwo.player())){
            System.out.println("Ничья!");
        }
    }
}
