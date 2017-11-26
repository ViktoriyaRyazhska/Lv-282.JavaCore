package hw4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import hw4.Main1c.HTTPError;

class Main1cTest {

	
	@Test
	void testReturnError400() throws NumberFormatException, IOException {
		assertEquals(HTTPError.Bad_Request, Main1c.returnError(400));
	}
	
	@Test
	void testReturnErrorNoCode() throws NumberFormatException, IOException {
		assertEquals(HTTPError.Unknown_Error, Main1c.returnError(200));
	}

}
