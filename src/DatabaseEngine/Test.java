package DatabaseEngine;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {

		Goal1 g2=new Goal1();
		String result=g2.operator();
		assertEquals("operators",result);
	
	}

}
