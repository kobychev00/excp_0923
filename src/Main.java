import expection.WrongLoginException;

public class Main {
    public static void main(String[] args) {


    }

    public static void checkLoginAndPassword(String login, String password, String confirmPassword) {

    }

    public static boolean isLoginCorrect(String login) {

        int maxLoginLength = 20;

        if (login.length() > 20) {
            throw new WrongLoginException (String.format("Длина логина должна быть меньше %s", maxLoginLength));
        }
    }
}