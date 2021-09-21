public class Stack {
    int stack[] =  new int[5];
    int top = 0;

    public void push(int data)
    {
        if(top == 5){
            System.out.println("Stack is full");
        }else
        {
            stack[top] = data;
            top++;
        }

    }

    public int pop(){
        int popped =0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else
        {
            top--;
            popped = stack[top];
            stack[top]=0;

        }
        return popped;

    }

    public void peek() {
        for(int n : stack){
            System.out.print(n+ " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return top==0? true:false;
    }
}
