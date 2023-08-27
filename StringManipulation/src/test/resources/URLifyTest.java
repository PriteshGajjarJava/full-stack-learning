package test.resources;
import static org.junit.Assert.*;

import org.junit.Test;

import com.pga.URLify;

import junit.framework.Assert;
public class URLifyTest {

	@Test
	public void test() {
        String input1 = "Hello World   ";
        int trueLen1 = 11;
        String expectedOutput1 = "Hello%20World";
        assertEquals("Test1", URLify.urlify(input1, trueLen1), expectedOutput1);
	}

}
