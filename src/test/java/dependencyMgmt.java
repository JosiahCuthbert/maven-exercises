import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class dependencyMgmt {

    public static void main(String[] args) {

        String userInput = input("please enter a String");

        Boolean isNumber = StringUtils.isNumeric(userInput);
        if(isNumber == true){
            System.out.println("this is a number");
        }   else{
            System.out.println("this is not a number");
        }

        System.out.println(StringUtils.reverse(userInput));
        System.out.println(StringUtils.swapCase(userInput));

    }

    public static String input(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        return sc.nextLine();
    }



}
