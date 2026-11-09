package stacks;

import java.util.Scanner;

public class StackTasks {
    public static void main(String[] args) {
        GenericStackArray<Integer> arrayStack = new GenericStackArray<>();
        for (int i = 1; i <= 10; i++) arrayStack.push(i); // triggers array growth
        System.out.println("2.1 Stack with array: " + arrayStack);
        System.out.println("2.1 peek=" + arrayStack.peek() + ", pop=" + arrayStack.pop()
                + ", size=" + arrayStack.getSize());

        GenericStackInheritance<String> stack = new GenericStackInheritance<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("2.2 Enter five strings (separated by whitespace):");
        for (int i = 0; i < 5; i++) {
            if (!scanner.hasNext()) {
                System.out.println("Not enough input; stopping.");
                return;
            }
            stack.push(scanner.next());
        }
        System.out.print("2.2 Reverse order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) System.out.print(" ");
        }
        System.out.println();
    }
}
