package tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAfrom1stTwoCharsTest {
		
		/*TODO test cases
		 * 1. 1 char : A => ""
		 * 2. 2 chars : AA => ""
		 * 				AB => B
		 * 				BA => B
		 * 				BC => BC
		 * 3. Empty char : "" => ""
		 * 4. 4 chars : ABCD => BCD
		 * 				AACD => CD
		 * 				BACD => BCD
		 * 				BBAA => BBAA
		 * 5. 5 chars : AABAA => BAA
		 * 6. N chars : ABACDACA => BACDACA 
		 */
	
	RemoveAfrom1stTwoChars object;
	
	@BeforeEach
	void setup() {
		object = new RemoveAfrom1stTwoChars();
	}
	

	@Test
	void test1Char() {
		assertEquals("",object.remove("A"));
	}
	
	@Test
	void test2Chars() {
		assertEquals("",object.remove("AA"));
		assertEquals("B",object.remove("AB"));
		assertEquals("B",object.remove("BA"));
		assertEquals("BC",object.remove("BC"));
		
	}
	@Test
	void testEmptyChar() {
		assertEquals("",object.remove(""));
		
	}
	@Test
	void test4Chars() {
		assertEquals("BCD",object.remove("ABCD"));
		assertEquals("CD",object.remove("AACD"));
		assertEquals("BCD",object.remove("BACD"));
		assertEquals("BBAA",object.remove("BBAA"));
	}
	@Test
	void test5Chars() {
		assertEquals("BAA",object.remove("AABAA"));
	}
	@Test
	void testNChars() {
		assertEquals("BACDACA",object.remove("ABACDACA"));
	}
}
