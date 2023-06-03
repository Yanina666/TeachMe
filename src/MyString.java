public class MyString {
    public static void numberOfDocument(String number){
        String[] numbers = number.split("-");
    System.out.print(numbers[0]+" "+numbers[2]);
    }

    public static void replaceNumbers(String num){
        String[] nums = num.split("-");
        System.out.println(num);
        String num1 =(nums[1].replace("drd", "***"));
        String num3 =(nums[3].replace("qwe", "***"));
        System.out.println(nums[0]+num1+nums[2]+num3+nums[4]);
    }

    public static void getLowerCase(String values){
        String[] nums = values.split("-");
        System.out.println(values);
        String num1 = (nums[1].toLowerCase());
        String num3 = (nums[3].toLowerCase());
        String num4 = ((nums[4].toLowerCase().
                replace("5","").replace("4", "")));
        String lowerCase = num1+ "/" +num3 + "/" +num4;
        System.out.println(lowerCase);
    }
}
