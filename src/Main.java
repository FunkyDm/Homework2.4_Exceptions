import exceptions.WrongLoginException;

public class Main {
    public static final String ALLOWED_SYMBOLS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";

    public static void main(String[] args) {
        
    }

    private static void checkAuthentication(String login, String password, String confirmPassword){
        if(login.length() > 20){
            throw new WrongLoginException("Неправильный логин");
        }
        for(int i = 0; i < login.length(); i++){

        }
    }
}