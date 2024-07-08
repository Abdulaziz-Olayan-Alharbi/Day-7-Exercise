import java.util.Scanner;

public class Day_7_exercise {

    static int find_smallest(int num_1 , int num_2 , int num_3){
        int smallest = num_1;
        if (num_1 < num_2){
            if (num_1 > num_3){
                smallest = num_3;
            }
        }else {
            if (num_2 < num_3){
                smallest = num_2;
            }else {
                smallest = num_3;
            }
        }
        return smallest;
    }

    static String check_number (int num_4){
        String check = "";
        if (num_4 == 0){
            check = "zero";
        }else if (num_4 > 0){
            check = "positive";
        }else {
            check = "negative";
        }
        return check;
    }


    static String is_valid (String password){
        String str = "valid";
        boolean valid = true;
        int digit_count = 0;
        boolean is_there_other_char = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                digit_count++;
            }
            if (Character.isLetterOrDigit(password.charAt(i))==false){
                is_there_other_char = true;
            }
        }
        if (password.length() < 8 || is_there_other_char  || digit_count < 2){
            valid = false;
        }
        if (valid==false){
            str = "not valid";
        }
        return str;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // 1 - Write a Java method to find the smallest number among three numbers.
        System.out.println("Enter first number : ");
        int num_1 = scan.nextInt();
        System.out.println("Enter second number : ");
        int num_2 = scan.nextInt();
        System.out.println("Enter third number : ");
        int num_3 = scan.nextInt();
        System.out.println("the smallest number is : "+find_smallest(num_1,num_2,num_3));


        //2 - Write a Java method that check if the entered number is negative or positive or zero
        System.out.println("Enter a number to check : ");
        int num_4 = scan.nextInt();
        System.out.println("This number is : "+check_number(num_4));


        //3 - Write a Java method to check whether a string is a valid password.
        System.out.println("1. A password must have at least eight characters. ");
        System.out.println("2. A password consists of only letters and digits.  ");
        System.out.println("3. A password must contain at least two digits ");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scan.next();
        System.out.println("The Password "+password+" is : "+is_valid(password));








    }

}
