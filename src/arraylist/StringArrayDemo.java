package arraylist;

public class StringArrayDemo {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.add("Hi");
        stringArray.add("Boris");
        stringArray.add("WWW");
        stringArray.add("Doris");
        for (int i = 0; i < stringArray.size(); i++) {
            System.out.println(stringArray.get(i));
        }
    }
}
