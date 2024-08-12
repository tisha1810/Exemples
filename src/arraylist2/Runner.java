package arraylist2;

public class Runner {
    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();
        stringCollection.add("Hello");
        stringCollection.add("i am");
        stringCollection.add("Boris");

        System.out.print("[ ");
        for (String s : stringCollection) {
            System.out.print(s + " ");
        }
        System.out.println("]");

        stringCollection.remove("Boris");

        System.out.print("[ ");
        for (String s : stringCollection) {
            System.out.print(s + " ");
        }
        System.out.println("]");
    }
}