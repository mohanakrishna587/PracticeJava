public class RunnerClass {
    public static void main(String[] args) {
      /*  LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(15);
        list.insert(25);
        list.show();*/

      Stack stack = new Stack();
       stack.push(10);
        stack.peek();
        stack.push(20);stack.peek();
        stack.push(30);stack.peek();
        stack.push(40);stack.peek();
        stack.push(50);stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.pop();

    }
}
