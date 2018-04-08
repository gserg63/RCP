import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String inputName() throws IOException {
        System.out.println("Введите имя игрока: ");
        String namePlayerOne = br.readLine();
        return namePlayerOne;
    }

    public String selectElement() throws IOException {
        System.out.println("Выберете элемент: \n 1 - Rock \n 2 - Clippers \n 3 - Paper");
        String select = br.readLine();  //реализовать проверку на ввденое значение

        if (select.equals("1")) {
        select = "Rock";
        } else if (select.equals("2")) {
        select = "Clippers";
        } else if (select.equals("3")) {
        select = "Paper";
        }
        return select;

            }
        }
