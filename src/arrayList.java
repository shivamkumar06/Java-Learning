import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(1);

        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(2);

//        System.out.println(numbers.toString());
//        System.out.println(numbers.get(3)); //prints 3rd index element
        //numbers.remove(2); removes 2nd index element
        //numbers.remove(Integer.valueOf(4)); //removes 4 from array
       // numbers.clear();
       // numbers.set(2,Integer.valueOf(30));
        //numbers.sort(Comparator.naturalOrder());
        //numbers.sort(Comparator.reverseOrder());
//        String s = "2";
//        System.out.println(numbers.toString());
//        System.out.println(numbers.size());
//        System.out.println(numbers.contains(Integer.valueOf(s)));
//        System.out.println(numbers.contains(6));
       // System.out.println(numbers.isEmpty());
        System.out.println("Before "+ numbers.toString());
        numbers.forEach(number -> {
           numbers.set(numbers.indexOf(number),number*2);
        });
        System.out.println("After "+ numbers.toString());

    }
}
