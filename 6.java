import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class IteratorExample {
 public static void main(String[] args) {
 List<Integer> numbers = new ArrayList<>();
 numbers.add(1);
 numbers.add(2);
 numbers.add(3);
 numbers.add(4);
 // Using Iterator
 System.out.println("Using Iterator:");
 Iterator<Integer> iterator = numbers.iterator();
 while (iterator.hasNext()) {
 System.out.println(iterator.next());
 }
 // Using ListIterator
 System.out.println("\nUsing ListIterator (forward):");
 ListIterator<Integer> listIterator = numbers.listIterator();
 while (listIterator.hasNext()) {
 System.out.println(listIterator.next());
 }
 // Using ListIterator in reverse
 System.out.println("\nUsing ListIterator (backward):");
 while (listIterator.hasPrevious()) {
 System.out.println(listIterator.previous());
 }
 }
}