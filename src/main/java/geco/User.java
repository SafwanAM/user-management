package geco;

/**
 * Created by 21305507 on 30/11/2016.
 */
public class User {

    private geco.PasswordGeneration pwdGen = new geco.PasswordGeneration();

    public String getRandomPassword() {
        return pwdGen.getRandomPassword();
    }
}
