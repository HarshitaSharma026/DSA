package StringsStringBuilder;

public class StringBuilderClassExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();       // can't add string by passing it as a paramter here, because this parameter here is capacity
        sb.append(78);          // have to use append() method to add content to sb
        sb.append("hello");
        System.out.println(sb);
        String str = "HARSHITA SHARMA";
        String newstr = str.toLowerCase();
        System.out.println(newstr);
    }
}
