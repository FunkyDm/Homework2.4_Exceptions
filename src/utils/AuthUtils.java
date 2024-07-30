package utils;

import service.WrongLoginException;
import service.WrongPasswordException;

import java.util.regex.Pattern;

public class AuthUtils {
    private static final Pattern PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");

    private AuthUtils(){

    }

    public static void checkAuthentication(String login, String password, String confirmPassword) {
        if (checkValuePattern(login)) {
            throw new WrongLoginException(login);
        }
        if (checkValuePattern(password)) {
            throw new WrongPasswordException(password);
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password, confirmPassword);
        }
    }

    public static boolean checkValuePattern(String value) {
        return !PATTERN.matcher(value).matches();
    }
}
