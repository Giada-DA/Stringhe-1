public class Start {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";
        char[] charArray = string1.toCharArray();
        for (int i = 0; i < 2; i++) {
            System.out.println(charArray[i] + " ");
        }
        char[] charArray2 = string2.toCharArray();
        for (int i = 10; i < string2.length(); i++){
            System.out.println(charArray2[i] + " ");
        }
    }
}
