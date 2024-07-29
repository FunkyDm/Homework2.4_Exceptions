import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static final String ALLOWED_SYMBOLS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";

    public static void main(String[] args) {
        try {
            checkAuthentication("askjdjas123_", "qwerty123_", "qwerty123_");
            System.out.println("Успешная аутентификация пользователя.");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void checkAuthentication(String login, String password, String confirmPassword) {
        for (int i = 0; i < login.length(); i++) {
            if (!ALLOWED_SYMBOLS.contains(Character.toString(login.charAt(i))) || login.length() > 20) {
                throw new WrongLoginException("Неправильный логин.");
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (!ALLOWED_SYMBOLS.contains(Character.toString(password.charAt(i))) || password.length() > 20) {
                throw new WrongPasswordException("Неправильный пароль.");
            }
        }
        if (!(password.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
    }
}