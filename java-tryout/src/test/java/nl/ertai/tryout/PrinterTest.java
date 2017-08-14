package nl.ertai.tryout;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
	
    @Test
    public void printText() {
        // assert statements
        assertEquals("blaat", Printer.printText());
    }
    
    @Test
    public void printTextFail() {
        // assert statements
        assertEquals("blaat2", Printer.printText());
    }
	
}	
	
