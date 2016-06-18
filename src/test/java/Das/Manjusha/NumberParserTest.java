package Das.Manjusha;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
/**
 * Created by manjushadas on 6/18/16.
 */
public class NumberParserTest {
    NumberParser numParser = new NumberParser();
    ArrayList<Integer> workingNum = new ArrayList<>();

    @Test
    public void findDollarsFromInputAndCreateArrayTest() throws Exception {
        String s = "jjhjfk5841578467hfjd";
        int expected = 10;
        int actual = (numParser.findDigitsFromInputAndCreateArrayList(s)).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void unitsToWords2() throws Exception {
        workingNum.add(0);
        String expected = "ZeroDollars";
        String actual = numParser.convertUnitsToWords(workingNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void teenToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        String expected = "ElevenDollars";
        String actual = numParser.convertTeenTensToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void teenThousandsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "ElevenThousand";
        String actual = numParser.convertTeenThousandToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void teenMillionsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "ElevenMillion";
        String actual = numParser.convertTeenMillionToWords(workingNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void teenBillionsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "ElevenBillion";
        String actual = numParser.convertTeenBillionToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void notTeenTwoDigitsToWords() throws Exception {
        workingNum.add(2);
        workingNum.add(1);
        String expected = "TwentyOneDollars";
        String actual = numParser.convertNotTeenTensToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void notTeenThousandTwoDigitsToWords() throws Exception {
        workingNum.add(2);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "TwentyOneThousand";
        String actual = numParser.convertNotTeenThousandToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void notTeenMillionTwoDigitsToWords() throws Exception {
        workingNum.add(2);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "TwentyOneMillion";
        String actual = numParser.convertNotTeenMillionToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void notTeenBillionTwoDigitsToWords() throws Exception {
        workingNum.add(2);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "TwentyOneBillion";
        String actual = numParser.convertNotTeenBillionToWords(workingNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoDigitsToWords() throws Exception {
        workingNum.add(2);
        workingNum.add(1);
        String expected = "TwentyOneDollars";
        String actual = numParser.twoDigitsToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void twoDigitThousandsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(1);
        String expected = "ElevenThousandOneDollars";
        String actual = numParser.fiveDigitsToWords(workingNum);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void twoDigitMillionsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "ElevenMillion";
        String actual = numParser.convertTenMillionsToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void twoDigitBillionsToWords() throws Exception {
        workingNum.add(2);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expected = "TwentyOneBillion";
        String actual = numParser.convertTenBillionsToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void threeDigitsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        String expected = "OneHundredTenDollars";
        String actual = numParser.threeDigitsToWords(workingNum);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void threeDigitsThousandsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "OneHundredElevenThousand";
        String actualResult = numParser.convertHundredThousandsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);
    }

    @Test
    public void threeDigitsMillionToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "OneHundredElevenMillion";
        String actualResult = numParser.convertHundredMillionsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void threeDigitsBillionToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "OneHundredElevenBillion";
        String actualResult = numParser.convertHundredBillionsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void fourDigitsThousandToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "OneThousandDollars";
        String actualResult = numParser.convertThousandsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void fourDigitsMillionToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "OneMillion";
        String actualResult = numParser.convertMillionsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);


    }

    @Test
    public void fourDigitsBillionToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "OneBillion";
        String actualResult = numParser.convertBillionsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);
    }

    @Test
    public void trillionToWordsTest() throws Exception {
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "OneTrillion";
        String actualResult = numParser.convertTrillionsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void fiveDigitsToWords() throws Exception {
        workingNum.add(1);
        workingNum.add(2);
        workingNum.add(3);
        workingNum.add(4);
        workingNum.add(5);
        String expectedResult = "TwelveThousandThreeHundredFortyFiveDollars";
        String actualResult = numParser.fiveDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void unitsToWordsTest() {
        workingNum.add(1);
        String expectedResult = "OneDollar";
        String actualResult = numParser.convertUnitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void teenToWordsTest() {
        workingNum.add(1);
        workingNum.add(2);
        String expectedResult = "TwelveDollars";
        String actualResult = numParser.convertTeenTensToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void notTeenToWordsTest() {
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "NinetyNineDollars";
        String actualResult = numParser.convertNotTeenTensToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void twoDigitsToWordsTest() {
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "NinetyNineDollars";
        String actualResult = numParser.twoDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void threeDigitToWordsTest() {
        workingNum.add(9);
        workingNum.add(1);
        workingNum.add(9);
        String expectedResult = "NineHundredNineteenDollars";
        String actualResult = numParser.threeDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void fiveDigitToWordsTest() {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(0);
        workingNum.add(0);
        workingNum.add(0);
        String expectedResult = "ElevenThousand";
        String actualResult = numParser.convertFiveDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void sixDigitToWordsTest() {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "OneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.sixDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void sevenDigitToWordsTest() {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "OneMillionOneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.sevenDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void eightDigitToWordsTest() {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "ElevenMillionOneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.eightDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void nineDigitToWordsTest() {
        workingNum.add(9);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "NineHundredElevenMillionOneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.nineDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void tenDigitToWordsTest() {
        workingNum.add(9);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "NineBillionOneHundredElevenMillionOneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.tenDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void elevenDigitToWordsTest() {
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "NineteenBillionOneHundredElevenMillionOneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.elevenDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void twelveDigitToWordsTest() {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "OneHundredNineteenBillionOneHundredElevenMillionOneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.twelveDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }

    @Test
    public void thirteenDigitToWordsTest() {
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(1);
        workingNum.add(9);
        workingNum.add(9);
        String expectedResult = "OneTrillionOneHundredNineteenBillionOneHundredElevenMillionOneHundredElevenThousandOneHundredNinetyNineDollars";
        String actualResult = numParser.thirteenDigitsToWords(workingNum);
        Assert.assertEquals("should be equal", expectedResult, actualResult);

    }
}
