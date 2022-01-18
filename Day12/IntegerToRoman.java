package Day12;

public class IntegerToRoman {
    public static void main(String[] args) {
        IntegerToRoman itr = new IntegerToRoman();
        System.out.println(itr.intToRoman(1994));

    }
    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }
        String result = "";
        if (num == 1) {
            return "I";
        }
        else if (num == 5) {
            return "V";
        }
        else if (num == 10) {
            return "X";
        }
        else if (num == 50) {
            return "L";
        }
        else if (num == 100) {
            return "C";
        }
        else if (num == 500) {
            return "D";
        }
        else if (num == 1000) {
            return "M";
        }
        else if (num == 4) {
            return "IV";
        }
        else if (num == 40) {
            return "XL";
        }
        else if (num == 90) {
            return "XC";
        }
        else if (num == 400) {
            return "CD";
        }
        else if (num == 900) {
            return "CM";
        }
        else {
            int leastValue = 1;
            for (;leastValue <= 1000; leastValue *= 10) {
                if (leastValue > num) {
                    break;
                }
            }
            leastValue /= 10;
            result += intToRoman(leastValue);
            result += intToRoman(num - leastValue);
            return result;
        }

    }
}
