import java.util.LinkedList;

public class GenericSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println(searchElement(rollNumbers, 102));
        System.out.println(searchElement(rollNumbers, 105));

        LinkedList<String> names = new LinkedList<>();
        names.add("Jenil");
        names.add("Rahul");
        names.add("Amit");

        System.out.println(searchElement(names, "Rahul"));
        System.out.println(searchElement(names, "Neha"));
    }
}
