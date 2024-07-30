package service;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String password) {
        super(password + ": Неправильный пароль.");
    }

    public WrongPasswordException(String password, String confirmPassword) {
        super(password + " " + confirmPassword + ": Пароли не совпадают.");
    }
}
