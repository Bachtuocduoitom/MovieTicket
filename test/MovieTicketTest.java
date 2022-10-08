import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;


import static org.junit.Assert.*;

public class MovieTicketTest {

    InputStream stdin = System.in;
    PrintStream stdout = System.out;

    /*@Test
    public void testMain() throws InterruptedException {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("man\n175\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "Height: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("No discount", output);
    }*/

    @Test
    public void testCase1() throws InterruptedException {
        System.setIn(new ByteArrayInputStream("children\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString().trim();
        String key = "Gender: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("Free", output);
    }

    @Test
    public void testCase2() throws InterruptedException {
        System.setIn(new ByteArrayInputStream("man\n-1\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "Height: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("Invalid height", output);
    }

    @Test
    public void testCase3() throws InterruptedException {
        System.setIn(new ByteArrayInputStream("man\n145,5\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "Height: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("Discount 50%", output);
    }

    @Test
    public void testCase4() throws InterruptedException {
        System.setIn(new ByteArrayInputStream("man\n175,9\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "Height: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("No discount", output);
    }

    @Test
    public void testCase5() throws InterruptedException {
        System.setIn(new ByteArrayInputStream("woman\n-3,3\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "Height: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("Invalid height", output);
    }

    @Test
    public void testCase6() throws InterruptedException {
        System.setIn(new ByteArrayInputStream("woman\n149,9\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "Height: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("Discount 50%", output);
    }

    @Test
    public void testCase7() throws InterruptedException {
        System.setIn(new ByteArrayInputStream("woman\n155,5\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);

        MovieTicket.main(new String[0]);
        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "Height: ";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals("No discount", output);
    }

    @Test
    public void testCase8() throws Exception {
        Throwable ilArException = assertThrows(IllegalArgumentException.class, () -> {
            System.setIn(new ByteArrayInputStream("mans\n".getBytes()));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(byteArrayOutputStream);
            System.setOut(ps);

            MovieTicket.main(new String[0]);
            System.setIn(stdin);
        });

        Assert.assertEquals("unknown type \"mans\"", ilArException.getMessage());
    }

}