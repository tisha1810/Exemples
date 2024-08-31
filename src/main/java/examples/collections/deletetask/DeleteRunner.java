package examples.collections.deletetask;

public class DeleteRunner {
    public static void main(String[] args) {
        DeleteExample delete = new DeleteExample();
        System.out.println("--- Random list ---");
        System.out.println(delete.integerArrayListCreate(delete.getIntegers()));
        System.out.println("--- Remove number ---");
        System.out.println(delete.numberRemover(delete.getIntegerArrayList()));

    }
}
