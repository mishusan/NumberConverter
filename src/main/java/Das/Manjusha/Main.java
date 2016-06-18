package Das.Manjusha;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by manjushadas on 6/18/16.
 */
public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while ((s = in.readLine()) != null) {
                NumberParser numParser = new NumberParser();
                numParser.findDigitsFromInputAndCreateArrayList(s);
                numParser.convertToWords();
            }
        }
    }

