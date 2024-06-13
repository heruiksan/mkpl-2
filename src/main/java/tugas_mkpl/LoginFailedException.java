package tugas_mkpl;

public class LoginFailedException extends RuntimeException{
    private final int userid;

    public LoginFailedException(int userid) {
        super("Login failed for user: " + userid);
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }
}
