package service;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String login) {
        super(login + ": Неправильный логин.");
    }
}
