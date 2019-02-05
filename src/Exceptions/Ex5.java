package Exceptions;


/**
 * Обработка исключений.
 */
//class UserException extends Exception {
//    public void method() {
//        System.out.println("Мое исключение!");
//    }
//}

public class Ex5 {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("Обработка исключения.");
            e.method();
        }
    }
}