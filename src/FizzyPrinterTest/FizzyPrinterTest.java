package FizzyPrinterTest;

import static org.junit.jupiter.api.Assertions.*;

import Source.FizzyPrinter;
import org.junit.jupiter.api.Test;

public class FizzyPrinterTest {
public void testPrintFizzy_Fizz(){
    FizzyPrinter fizzyprinter=new FizzyPrinter(9);
    String result=fizzyprinter.printFizzy();
    assertEquals("Fizz", result);



}
    @Test
    public void testGetFizzy_Buzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter(10);
        String result = fizzyPrinter.printFizzy();
        assertEquals("Buzz", result);
    }
    @Test
    public void testGetFizzy_Bang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter(14);
        String result = fizzyPrinter.printFizzy();
        assertEquals("Bang", result);
    }



}
