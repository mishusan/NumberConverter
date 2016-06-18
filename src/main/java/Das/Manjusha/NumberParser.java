package Das.Manjusha;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by manjushadas on 6/18/16.
 */
public class NumberParser {

    public String numWord = "";
    ArrayList<Integer> workingNum = new ArrayList<>();
    private static final String[] biggerNum = {
            "", "Thousand", "Million", "Billion", "Trillion"
    };
    private static final String[] bigNum = {
            "", "Hundred", "Thousand", "HundredThousand"
    };

    private static final String[] tensNum = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"
    };

    private static final String[] unitAndTeenNum = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    public ArrayList<Integer> findDigitsFromInputAndCreateArrayList(String s) throws IOException {
        Pattern p = Pattern.compile("(\\d)");
        Matcher m = p.matcher(s);
        while (m.find()) {
            workingNum.add(Integer.parseInt(m.group(1)));
            if (workingNum.get(0) == 0) {
                workingNum.remove(0);
            }
        }
        return workingNum;
    }

    public String convertThousandsToWords(ArrayList<Integer> workingNum) {
        int index = workingNum.get(workingNum.size() - 4);
        if (index == 0) {
            numWord = unitAndTeenNum[index];
            numWord += threeDigitsToWords(workingNum);
        } else {
            numWord = unitAndTeenNum[index] + bigNum[2];
            numWord += threeDigitsToWords(workingNum);
        }

        return numWord;
    }

    public String convertTeenTensToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 2) == 1) {
            int index = 10 + workingNum.get(workingNum.size() - 1);
            if (index == 0){

            }
            numWord = unitAndTeenNum[index] + "Dollars";
        }
        return numWord;
    }

    public String convertTeenThousandToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 5) == 1) {
            int index = 10 + workingNum.get(workingNum.size() - 4);
            numWord = unitAndTeenNum[index] + bigNum[2];
        }
        return numWord;
    }

    public String convertTeenMillionToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 8) == 1) {
            int index = 10 + workingNum.get(workingNum.size() - 7);
            numWord = unitAndTeenNum[index] + biggerNum[2];
        }
        return numWord;
    }


    public String convertTeenBillionToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 11) == 1) {
            int index = 10 + workingNum.get(workingNum.size() - 10);
            numWord = unitAndTeenNum[index] + biggerNum[3];
        }
        return numWord;
    }


    public String convertNotTeenTensToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 2) != 1) {
            int index = workingNum.get(workingNum.size() - 2);
            numWord = tensNum[index];
            index = workingNum.get(workingNum.size() - 1);
            numWord += unitAndTeenNum[index]+"Dollars";
        }
        return numWord;
    }

    public String convertNotTeenThousandToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 5) != 1) {
            int index0 = workingNum.get(workingNum.size() - 5);
            int index1 = workingNum.get(workingNum.size() - 4);
            numWord = tensNum[index0];
            if (index0 == 0 && index1==0) {
                numWord += unitAndTeenNum[index1];
            } else {
                numWord += unitAndTeenNum[index1] + bigNum[2];
            }
        }
        return numWord;
    }

    public String convertNotTeenMillionToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 8) != 1) {
            int index0 = workingNum.get(workingNum.size() - 8);
            int index1 = workingNum.get(workingNum.size() - 7);
            numWord = tensNum[index0];
            if (index0 == 0 && index1==0) {
                numWord += unitAndTeenNum[index1];
            } else {
                numWord += unitAndTeenNum[index1] + biggerNum[2];
            }
        }
        return numWord;
    }

    public String convertNotTeenBillionToWords(ArrayList<Integer> workingNum) {
        if (workingNum.get(workingNum.size() - 11) != 1) {
            int index0 = workingNum.get(workingNum.size() - 11);
            int index1 = workingNum.get(workingNum.size() - 10);
            numWord = tensNum[index0];
            if (index0 == 0 && index1==0) {
                numWord += unitAndTeenNum[index1];
            } else {
                numWord += unitAndTeenNum[index1] + biggerNum[3];
            }
        }
        return numWord;
    }

    public String convertFiveDigitsToWords(ArrayList<Integer> workingNum) {
        convertTeenThousandToWords(workingNum);
        convertNotTeenThousandToWords(workingNum);
        return numWord;
    }

    public String convertHundredThousandsToWords(ArrayList<Integer> workingNum) {
        int index0 = workingNum.get(workingNum.size() - 6);
        int index1 = workingNum.get(workingNum.size() - 5);
        int index2 = workingNum.get(workingNum.size() - 4);
        if (index0 == 0) {
            numWord = unitAndTeenNum[index0];
        } else if (index0 != 0 && index1 == 0 && index2 == 0) {
            numWord = unitAndTeenNum[index0] + bigNum[3];
        } else if (index0 != 0){
            numWord = unitAndTeenNum[index0] + bigNum[1];}
        numWord += convertFiveDigitsToWords(workingNum);

        return numWord;
    }

    public String convertMillionsToWords(ArrayList<Integer> workingNum) {
        int index = workingNum.get(workingNum.size() - 7);
        if (index == 0) {
            numWord = unitAndTeenNum[index];
        } else {
            numWord = unitAndTeenNum[index] + biggerNum[2];
        }
        return numWord;
    }


    public String convertTenMillionsToWords(ArrayList<Integer> workingNum) {
        convertTeenMillionToWords(workingNum);
        convertNotTeenMillionToWords(workingNum);
        return numWord;
    }

    public String convertHundredMillionsToWords(ArrayList<Integer> workingNum) {
        int index0 = workingNum.get(workingNum.size() - 9);
        int index1 = workingNum.get(workingNum.size() - 8);
        int index2 = workingNum.get(workingNum.size() - 7);
        if (index0 == 0) {
            numWord = unitAndTeenNum[index0];
            numWord += convertTenMillionsToWords(workingNum);
        } else if (index0 != 0 && index1 == 0 && index2 == 0) {
            numWord = unitAndTeenNum[index0] + bigNum[1] + biggerNum[2];
        } else if (index0 != 0){
            numWord = unitAndTeenNum[index0] + bigNum[1];
            numWord += convertTenMillionsToWords(workingNum);
        }
        return numWord;
    }
    public String convertBillionsToWords(ArrayList<Integer> workingNum) {
        int index = workingNum.get(workingNum.size() - 10);
        if (index == 0) {
            numWord = unitAndTeenNum[index];
        } else {
            numWord = unitAndTeenNum[index] + biggerNum[3];
        }
        return numWord;
    }


    public String convertTenBillionsToWords(ArrayList<Integer> workingNum) {
        convertTeenBillionToWords(workingNum);
        convertNotTeenBillionToWords(workingNum);
        return numWord;
    }

    public String convertHundredBillionsToWords(ArrayList<Integer> workingNum) {
        int index0 = workingNum.get(workingNum.size() - 12);
        int index1 = workingNum.get(workingNum.size() - 11);
        int index2 = workingNum.get(workingNum.size() - 10);
        if (index0 == 0) {
            numWord = unitAndTeenNum[index0];
            numWord += convertTenBillionsToWords(workingNum);
        } else if (index0 != 0 && index1 == 0 && index2 == 0) {
            numWord = unitAndTeenNum[index0] + bigNum[1] + biggerNum[3];
        } else if (index0 != 0){
            numWord = unitAndTeenNum[index0] + bigNum[1];
            numWord += convertTenBillionsToWords(workingNum);
        }
        return numWord;
    }

    public String convertTrillionsToWords(ArrayList<Integer> workingNum) {
        int index = workingNum.get(workingNum.size() - 13);
        if (index == 0) {
            numWord = unitAndTeenNum[index];
        } else {
            numWord = unitAndTeenNum[index] + biggerNum[4];
        }
        return numWord;
    }

    public String convertUnitsToWords(ArrayList<Integer> workingNum) throws ArrayIndexOutOfBoundsException {
        int index = workingNum.get(workingNum.size() - 1);
        for (int i = 0; i < workingNum.size(); i++)
            if (workingNum.get(workingNum.size() - 1) == 0) {
                numWord = "ZeroDollars";
            } else if
                    (workingNum.get(workingNum.size() - 1) == 1) {
                numWord = unitAndTeenNum[index] + "Dollar";
            } else {
                numWord = unitAndTeenNum[index] + "Dollars";
            }
        return numWord;
    }

    public String twoDigitsToWords(ArrayList<Integer> workingNum) {
        convertTeenTensToWords(workingNum);
        convertNotTeenTensToWords(workingNum);
        return numWord;
    }


    public String threeDigitsToWords(ArrayList<Integer> workingNum) {
        int index0 = workingNum.get(workingNum.size() - 3);
        int index1 = workingNum.get(workingNum.size() - 2);
        int index2 = workingNum.get(workingNum.size() - 1);
        if (index0 == 0) {
            numWord = unitAndTeenNum[index0];
            numWord += twoDigitsToWords(workingNum);
        } else if (index0 != 0 && index1 == 0 && index2 == 0) {
            numWord = unitAndTeenNum[index0] + bigNum[1]+"Dollars";
        } else if (index0!=0){
            numWord = unitAndTeenNum[index0] + bigNum[1];
            numWord += twoDigitsToWords(workingNum);}
        return numWord;
    }

    public String fourDigitsToWords(ArrayList<Integer> workingNum) {
        numWord +=convertThousandsToWords(workingNum);
        return numWord;
    }

    public String fiveDigitsToWords(ArrayList<Integer> workingNum){
        numWord=convertFiveDigitsToWords(workingNum);
        numWord += threeDigitsToWords(workingNum);
        return numWord;
    }

    public String sixDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertHundredThousandsToWords(workingNum);
        numWord += threeDigitsToWords(workingNum);
        return numWord;
    }

    public String sevenDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertMillionsToWords(workingNum);
        numWord += sixDigitsToWords(workingNum);
        return numWord;
    }

    public String eightDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertTenMillionsToWords(workingNum);
        numWord += sixDigitsToWords(workingNum);
        return numWord;
    }

    public String nineDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertHundredMillionsToWords(workingNum);
        numWord += sixDigitsToWords(workingNum);
        return numWord;
    }

    public String tenDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertBillionsToWords(workingNum);
        numWord += nineDigitsToWords(workingNum);

        return numWord;
    }

    public String elevenDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertTenBillionsToWords(workingNum);
        numWord += nineDigitsToWords(workingNum);
        return numWord;
    }

    public String twelveDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertHundredBillionsToWords(workingNum);
        numWord += nineDigitsToWords(workingNum);
        return numWord;
    }

    public String thirteenDigitsToWords(ArrayList<Integer> workingNum) {
        numWord = convertTrillionsToWords(workingNum);
        numWord += twelveDigitsToWords(workingNum);
        return numWord;
    }

    public void convertToWords() {
        switch (workingNum.size()) {
            case 0:
                System.out.println("There are no positive integers to process in this input.");
                break;
            case 1:
                convertUnitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 2:
                twoDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 3:
                threeDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 4:
                fourDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 5:
                fiveDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 6:
                sixDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 7:
                sevenDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 8:
                eightDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 9:
                nineDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 10:
                tenDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 11:
                elevenDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 12:
                twelveDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            case 13:
                thirteenDigitsToWords(workingNum);
                System.out.println(numWord);
                break;
            default:
                System.out.println("This app cannot deal with such a large number!");
        }
    }


}
