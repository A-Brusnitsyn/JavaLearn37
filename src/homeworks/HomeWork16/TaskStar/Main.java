package homeworks.HomeWork16.TaskStar;

//Задана строка, которая можем иметь внутри себя скобки. Скобкой считается любой из следующих символов: (,),{,},[,].
//Проверить сбалансированность расстановки скобок в этой строке. Набор скобок считается сбалансированной парой если
//открывающаяся скобка стоит слева от соответствующей закрывающей скобки. Строка содержащая пары скобок, не сбалансирована,
//если набор заключенных в нее скобок не совпадает.
//Например, если ввод "{[(])}" пара квадратных скобок заключает в себя одну несбалансированную открывающуюся скобку.
//Аналогично, пара круглых скобок содержат в себе закрывающую квадратную скобку. Таким образом строка несбалансирована.

import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String testCases ="({[]})";

        isBalanced(testCases);
    }
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> pairs = new java.util.HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        for (char c : str.toCharArray()) {
            if (pairs.containsValue(c)) {
                // Открывающая скобка
                stack.push(c);
            } else if (pairs.containsKey(c)) {
                // Закрывающая скобка
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    System.out.println("Строка не сбалансирована");
                    return false;
                }
            }
        }
        System.out.println("Строка сбалансирована");
        return stack.isEmpty();
    }
}
