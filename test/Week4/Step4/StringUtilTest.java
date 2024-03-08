package Week4.Step4;

import Week4.Step4.StringUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    @Test
    void reverse() {
        assertNull(stringUtil.reverse(null));
        assertEquals("namjaak", stringUtil.reverse("kaajman"));
    }

    @Test
    void isPalindrome() {
        assertFalse(stringUtil.isPalindrome(null));
        assertTrue(stringUtil.isPalindrome("lepel"));
    }

    @Test
    void capitalize() {
        assertNull(stringUtil.capitalize(null));
        assertEquals("Lepel", stringUtil.capitalize("lepel"));
    }

    @Test
    void countOccurrences() {
        assertEquals(3, stringUtil.countOccurrences("kaajman",'a'));
    }
}