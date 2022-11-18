import java.util.HashMap;
public class LoginInfo

{
    static HashMap<String,String> LoginInfo = new HashMap<String,String>();
    public static void main(String[] args) 
    {
        LoginPageAsUser user = new LoginPageAsUser(LoginInfo);;
    }
}
