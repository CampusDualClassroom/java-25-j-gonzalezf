package com.campusdual.classroom;

import java.util.Collections;
import java.util.Stack;

public class Exercise25 {

    private static final String[] ELEMENTS = {
            "Smith", "Montessori", "Peralta", "House"
    };

    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();

        Collections.addAll(stack, ELEMENTS);

        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            // peek obtiene el último elemento sin quitarlo
            System.out.println(stack.peek());
            // pop elimina el último elemento de la pila
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = createStack();
        printAndEmptyStack(stack);
    }

}
