package Part1.Lesson5;

public class Exceptions {

    public static void main(String[] args) throws WrongPassException, WrongLoginException {
        System.out.println(validateCreds("Emil", "123", "123"));
    }


    public static class WrongLoginException extends Exception{
        public WrongLoginException(String message) {
            super(message);
        }
    }

    public static class WrongPassException extends Exception{

        public WrongPassException(String message) {
            super(message);
        }
    }

    public static boolean validateCreds(String login, String password, String confirmPassword) {
        try{
            if (!login.matches("^[a-zA-Z0-9_]+$") && login.length() >= 20) {
                throw new WrongLoginException("Login is invalid");
            }
            if (!password.matches("[a-zA-Z0-9]+")) {
                throw new WrongPassException("Pass is invalid");
            }
            if(!password.equals(confirmPassword)){
                throw new WrongPassException("Inserted Passwords do not match");
            }
                return true;

        } catch (WrongLoginException | WrongPassException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
