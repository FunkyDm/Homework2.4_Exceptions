package service;

import exception.WrongLoginException;
import exception.WrongPasswordException;
import utils.AuthUtils;

public class Main {

    public static void main(String[] args) {
        try {
            //AuthUtils.checkAuthentication("askjdjas123_", "qwerty123_", "qwerty123_");
            AuthUtils.checkAuthentication("_", null, ".");
            System.out.println("Успешная аутентификация пользователя.");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}