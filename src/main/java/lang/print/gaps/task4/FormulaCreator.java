package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       int a= 10;
       int b=12;
       int answer=((9*(a*a)-(5*b)+2+a-7)*((a+b-(4*a*b))/2));
        System.out.println(answer);
    }
}
