package ZohoQuestions.ZohoQuestions;

import java.util.Scanner;

public class UnbalancedParanthesis {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();
        int temp[] = new int[10];
        int count = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                temp[count] = i;
                count++;
            } else if (expression.charAt(i) == ')') {
                if (count!=0) count--;
                else {
                    temp[count] = i;
                    count++;
                }
            }
        }

        for (int i = 0; i < expression.length(); i++) {
            int flag = 0;
            for (int ii = 0; ii < count; ii++)
                if (i == temp[ii])
                    flag = 1;
            if (flag == 0) {
                System.out.print(expression.charAt(i));
            }
        }
    }
}
