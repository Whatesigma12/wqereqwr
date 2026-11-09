package cloning;

import java.util.Scanner;

public class CloningTasks {
    public static void main(String[] args) {
        MyStack inherited = new MyStack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("3.1 Enter five strings (separated by whitespace):");
        for (int i = 0; i < 5; i++) {
            if (!scanner.hasNext()) {
                System.out.println("Not enough input; stopping.");
                return;
            }
            inherited.push(scanner.next());
        }
        System.out.print("3.1 Reverse order: ");
        while (!inherited.isEmpty()) {
            System.out.print(inherited.pop());
            if (!inherited.isEmpty()) System.out.print(" ");
        }
        System.out.println();

        MyStackComposition original = new MyStackComposition();
        original.push("Alpha");
        original.push("Beta");
        MyStackComposition copy = original.clone();
        copy.pop();
        copy.push("Gamma");
        System.out.println("3.2 Original after editing copy: " + original);
        System.out.println("3.2 Copy after editing:          " + copy);
        System.out.println("3.2 Independent stacks: "
                + (original.getSize() == 2 && "Beta".equals(original.peek())));
    }
}
