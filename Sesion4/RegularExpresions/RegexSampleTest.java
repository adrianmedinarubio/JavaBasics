package RegularExpresions;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexSampleTest extends TestCase {

    boolean setUp(String inputRegex, String searchString) {
        Pattern p = Pattern.compile(inputRegex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(searchString);
        return m.matches();
    }

    @Test
    public void testWhen_Email_is_invalid() {
        assertTrue(setUp("[a-zA-Z0-9_+&*-]*@" + "axity.com$", "adrian.medina@ax.com"));
    }

    @Test
    public void testWhen_phone_number_is_valid() {
        String regex = "^[0-9]{10}$";
        assertTrue(setUp(regex, "1234567890"));
    }
    
    @Test
    public void testwhen_phone_number_is_invalid() {
        String regex = "^[0-9]{10}$";
        assertFalse(setUp(regex, "123456789"));
    }

    public static TestSuite Suite(){
        TestSuite suite = new TestSuite(RegexSampleTest.class);
        return suite;
    }

    public static void main(String[] args){
        junit.textui.TestRunner.run(Suite());
    }
}
