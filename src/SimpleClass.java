public class SimpleClass extends AbstractClass {
    @Override
    public void implementMe() {
        System.out.println("Simple class could implement me");
    }

    public static void main(String[] args) {
/*        AbstractClass abs = new SimpleClass() ;

        abs.implementMe();
        abs.IamImplemented();*/

        String actualString = "Mohan is awesome";
        char[] array = actualString.toCharArray();
        int len = actualString.length();

        char[] result = new char[array.length];

        for (int i = 0; i < len-1; i++) {
            if(array[i] == ' '){
                result[i]=' ';
            }
        }

        int j = len -1;
        for (int i = 0; i < len; i++) {
            if(array[i] !=' '){
                if(result[j] == ' '){
                    j--;
                }

                result[j] = array[i];
                j--;
            }
        }

        System.out.println(String.valueOf(result));

    }


}
