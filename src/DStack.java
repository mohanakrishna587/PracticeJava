public class DStack {

    int top =0;
    int capacity;
    int stack[] = new int[capacity];

    public void push(int data)
    {
            if(top==capacity)
                expand();
            stack[top] = data;
            top++;

    }

    private void expand() {
        int length = top;
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity*=2;

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

    public @interface myAnnotations{
        String name() ;
        int age() default 18;
    }
    
    @myAnnotations(name = "Mohan")
    public void myName(){

    }
}


