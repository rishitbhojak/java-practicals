import java.util.*;

interface s1 {
    public int push();

    public int pop();

    public void display();

    public void peep();

    public void change(int row, int new_element);
}

class Stack implements s1 {
    int size = 5;
    int[] a = new int[size];
    int[] temp = new int[size];
    int top = -1;
    int tos, capacity = size;
    Scanner sc2 = new Scanner(System.in);

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public int push() {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            return 0;
        }
        System.out.println("\nEnter item to be Pushed: ");
        int item = sc2.nextInt();

        a[++top] = item;
        return item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("\n..Stack Underflow..\n");
            return 0;
        }
        return a[top--];

    }

    public void display() {
        int i = 0;
        System.out.println("\nContent of Stack:");
        for (i = top; i > -1; i--) {
            System.out.println("\n\t" + a[i]);
        }
    }

    public void peep() {
        System.out.println("\n\tTop:" + (top + 1));
        System.out.println("\n\tValue:" + a[top]);
    }

    public void change(int row, int new_element) {
        int i;
        int j = -1;
        System.out.println("\n\tTop:" + (top + 1));
        for (i = top; i > row - 1; i--) {
            temp[++j] = a[top--];
        }
        a[top] = new_element;
        for (i = j; i > -1; i--)

        {
            a[++top] = temp[j--];
        }
    }

    public static void main(String[] args) {
        int item, choice, row, new_element;
        Stack sc1 = new Stack();
        Scanner s1 = new Scanner(System.in);
        int f = sc1.top, d = sc1.size;
        do {
            System.out.println("\n-----------------------------");
            System.out.println("\nPROGRAM TO IMPLEMENT STACK\n");

            System.out.println("-----------------------------");
            System.out.println("\n 1.Push\n 2.Pop\n 3.Display\n 4.Peep\n 5.Change\n 6.Exit\n");

            System.out.println("-----------------------------\n");
            System.out.println("\n Enter your choice:");
            choice = s1.nextInt();
            switch (choice) {
                case 1:
                    sc1.push();
                    sc1.display();
                    break;
                case 2:
                    sc1.pop();
                    sc1.display();
                    break;
                case 3:
                    sc1.display();
                    break;
                case 4:
                    sc1.peep();

                    sc1.display();
                    break;
                case 5:
                    System.out.println("\n\tEnter row no:");
                    row = s1.nextInt();
                    System.out.println("\n\tEnter new element:");
                    new_element = s1.nextInt();
                    sc1.change(row, new_element);
                    sc1.display();
                    break;
                case 6:
                    break;

            }
        } while (choice != 6);
    }
}