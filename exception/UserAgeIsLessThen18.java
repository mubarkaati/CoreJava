package exception;

public class UserAgeIsLessThen18 extends RuntimeException {

    public UserAgeIsLessThen18(String msg) {
        super(msg);
    }
}