
//Program to implement Stack in Java
import java.util.*;

class Stack {
    int top;
    int maxsize = 10;
    int arr[] = new int[maxsize];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(Scanner sc) {
        if (top == maxsize - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            System.out.println("Enter Value");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Pushed!");
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return false;
        } else {
            top--;
            System.out.println("Item Popped");
            return true;
        }
    }

    void peep() {
        System.out.println(top);
    }

    void display() {
        System.out.println("Stack Elements : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int option = 0;
        while (option != 5) {
            System.out.println("Select an operation");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peep");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            option = sc.nextInt();
            switch (option) {
            case 1: {
                s.push(sc);
                break;
            }
            case 2: {
                s.pop();
                break;
            }
            case 3: {
                s.peep();
                break;
            }
            case 4: {
                s.display();
                break;
            }
            case 5: {
                System.out.println("Exiting");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Enter a valid choice!");
            }
            }
            ;
        }
    }
}
