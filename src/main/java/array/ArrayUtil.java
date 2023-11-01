package array;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayUtil {
    public static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length - 1; i++ ){
            System.out.print(a[i] + ",");
        }
        System.out.println(a[a.length-1] + "]");
    }

    public static void print2DList(List<List<Object>> list) {

    }

//    public static void printList(List<T> list) {
//        System.out.print("[");
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i) instanceof String) {
//                System.out.println("'" + list.get(i) + "'");
//            }
//            else {
//                System.out.println(list.get(i));
//            }
//            System.out.print(", ");
//        }
//        System.out.println(list.get(list.size() - 1) + "]");
//    }
//
//    public static void main(String[] args) {
//        List<String> strings = Arrays.asList(new String[]{"23", "23"});
//        printList(strings);
//    }
}
