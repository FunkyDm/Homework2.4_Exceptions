import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import service.App;

public class Main {

    public static void main(String[] args) {
        try {
            App.checkAuthentication("askjdjas123_", "qwerty123_", "qwerty123_");
            System.out.println("Успешная аутентификация пользователя.");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}