import java.util.Scanner;

public class Test {
    //55,100,121,40,1,2,13,11,79
    public static void main(String[] args) {
//        sortArray();
//        validatePrimeNumber();
//        isPalindromeNum(445544);
        Test("weiruwieoru");
    }

    public static void sortArray(){
        int numbers[] = {55,100,121,40,1,2,13,11,79};
        int size = numbers.length;

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                int temp=0;
                if(numbers[i]>numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(numbers[i]);
        }

    }
    public static void validatePrimeNumber(){
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int denominator = a/2;
        boolean isPrime = true;
        for (int i = 2; i <= denominator; i++) {
            if(a%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(a +" is a Prime number");
        }else {
            System.out.println(a +" is not a Prime number");
        }

    }
    public static void isPalindromeNum(int num){
        int temp,r,sum=0;

        temp = num;
        while (num>0){
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }

        if(temp==num){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }

    }

    public static void Test(String abc) {
        char arr[] = abc.toCharArray();
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }else{

                }
            }
        }
    }
}

