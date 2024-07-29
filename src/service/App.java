package service;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class App {
    public static void checkAuthentication(String login, String password, String confirmPassword) {
        if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
            throw new WrongLoginException(login);
        }
        if (!password.matches("[a-zA-Z0-9_]+") || password.length() > 20) {
            throw new WrongPasswordException(password);
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password, confirmPassword);
        }
    }
}
