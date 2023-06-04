import java.io.Console;

public class MyString {
    public static void numberOfDocument(String number) {
        String[] numbers = number.split("-");
        System.out.print(numbers[0] + " " + numbers[2]);
    }

    public static void replaceNumbers(String num) {
        String[] nums = num.split("-");
        System.out.println(num);
        String num1 = (nums[1].replace("drd", "***"));
        String num3 = (nums[3].replace("qwe", "***"));
        System.out.println(nums[0] + num1 + nums[2] + num3 + nums[4]);
    }

    public static void getLowerCase(String values) {
        String[] nums = values.split("-");
        System.out.println(values);
        String num1 = (nums[1].toLowerCase());
        String num3 = (nums[3].toLowerCase());
        String num4 = ((nums[4].toLowerCase().
                replace("5", "").replace("4", "/")));
        String lowerCase = num1 + "/" + num3 + "/" + num4;
        System.out.println(lowerCase);
    }

    public static void getUpperCase() {
        StringBuilder upperCase = new StringBuilder("5895-drd-4657-qwe-5r4P");
        String num1 = upperCase.substring(5, 8);
        String num2 = upperCase.substring(14, 17);
        char num3 = upperCase.charAt(19);
        char num4 = upperCase.charAt(21);
        String upper = num1 + "/" + num2 + "/" + num3 + "/" + num4;
        System.out.println("Letters: " + upper.toUpperCase());
    }

    public static void comareOfcontainsSymbols(String number) {
        if (number.contains("abc") || number.contains("ABC")) {
            System.out.println("The number contains abc or ABC");
        } else {
            System.out.println("The number doesn't contains abc or ABC");
        }
    }

    public static void checkTheStarts(String number) {
        if (number.startsWith("555")) {
            System.out.println("The number starts with 555");
        } else {
            System.out.println("The number doesn't starts with 555");
        }
    }

    public static void checkTheEnds(String number) {
        if (number.endsWith("1a2b")) {
            System.out.println("The number ends with 1a2b");
        } else {
            System.out.println("The number doesn't ends with 1a2b");
        }
    }
}