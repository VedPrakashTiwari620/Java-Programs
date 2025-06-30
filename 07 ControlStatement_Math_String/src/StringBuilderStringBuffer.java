public class StringBuilderStringBuffer {

    public static void main(String[] args) {
        StringBuilder sentence=new StringBuilder("First ");
        sentence.append(12);
        sentence.append(" Second ");
        sentence.append(12.23);
        System.out.println(sentence);


        System.out.println(sentence);
    }
}
