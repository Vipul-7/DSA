package Stack;

import java.util.*;

public class Decode_String {
    public static void main(String[] args) {
        System.out.println(decode("3[b2[ca]]"));
    }

    public static String decode(String str) {
        Stack<Integer> sint = new Stack<>();
        Stack<Character> sstr = new Stack<>();

        // StringBuilder result = new StringBuilder("");

        String temp = "", result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }

                i--;

                sint.push(count);
            }

            else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                if (!sint.isEmpty()) {
                    count = sint.peek();
                    sint.pop();
                }

                while (!sstr.isEmpty() && sstr.peek() != '[') {
                    temp += sstr.peek();
                    sstr.pop();
                }

                if (!sstr.empty() && sstr.peek() == '[')
                    sstr.pop();

                for (int j = 0; j < count; j++)
                    result += temp;

                for (int j = 0; j < result.length(); j++)
                    sstr.push(result.charAt(j));

                result = "";
            }

            else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1)))
                    sstr.push(str.charAt(i));

                else {
                    sstr.push(str.charAt(i));
                    sint.push(1);
                }
            }

            else
                sstr.push(str.charAt(i));

        }

        while (!sstr.isEmpty()) {
            result = sstr.peek() + result;
            sstr.pop();
        }
        return result;
    }
}
