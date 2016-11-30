package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User u;

    @Before
    public void setUp() throws Exception {
        u = new User();
    }

    @Test
    public void testGetRandomPassword() throws Exception {
        String generatedPwd = u.getRandomPassword();
        assertEquals(8, generatedPwd.length());
    }
}