package nl.ertai.tryout;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
	
    @Test
    public void printText() {
        Printer tester = new Printer(); // MyClass is tested

        // assert statements
        assertEquals("blaat", tester.printText());
    }	
	
}	
	
