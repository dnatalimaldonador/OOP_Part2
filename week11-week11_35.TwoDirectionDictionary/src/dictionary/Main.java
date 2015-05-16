package dictionary;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Test your dictionary here
        FileWriter FW = new FileWriter("test/tmp/tmp90432.txt");
        FW.write("text");
    }
}
