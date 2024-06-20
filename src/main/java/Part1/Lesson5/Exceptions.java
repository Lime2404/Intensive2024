package Part1.Lesson5;

//Exceptions
public class Exceptions {

    public static void main(String[] args) throws WrongPassException, WrongLoginException {
        System.out.println(validateCreds("Emil", "Emil123", "Emil123"));
    }

//5. WrongPasswordException and WrongLoginException are user-defined exception classes with two
// constructors—one by default, the other accepts the exception message and passes it to the constructor of the  Exception class.
    public static class WrongLoginException extends Exception{
        public WrongLoginException() {
        }
        public WrongLoginException(String message) {
            super(message);
        }
    }

    public static class WrongPassException extends Exception{
        public WrongPassException() {
        }
        public WrongPassException(String message) {
            super(message);
        }
    }

//  1. Create a static method that accepts three parameters: login, password, and confirmPassword.
    public static boolean validateCreds(String login, String password, String confirmPassword) {
        try{
//  2.Login must contain only Latin letters, numbers and an underscore.The login must be less than 20 characters long.
            if (!login.matches("^[a-zA-Z0-9_]+$") && login.length() >= 20) {
//  If the login does not meet these requirements, you must throw a WrongLoginException.
                throw new WrongLoginException("Login is invalid");
            }
//  If the login does not meet these requirements, you must throw a WrongLoginException.
            if ( login.length() > 20) {
                throw new WrongLoginException("Login length is over 20 symbols");
            }
//  4.Password must contain only Latin letters, numbers
            if (!password.matches("[a-zA-Z0-9]+")) {
//  if password does not meet these requirements, you must throw a WrongPasswordException.
                throw new WrongPassException("Pass is invalid");
            }
            if(!password.equals(confirmPassword)){
//  7. The method returns true if the values are true or false otherwise.
                throw new WrongPassException("Passwords do not match");
            }
                return true;
//  6. Exception handling is done within the method.
        } catch (WrongLoginException | WrongPassException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
