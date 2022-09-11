//package tree;
//
//public class K {
//
////    public static int query(int[] a, int[][] k) {
////        int sum = 0;
////
////        for (int[] query: k) {
////            for (int i = query[0]; i =< query[1]; i++) {
////                sum += a[i];
////            }
////        }
////
////        return sum;
////    }
//
//    public static int query(int[] a, int[][] queries) {
//        int k = queries.length;
//        int[] b = new int(a.length + 1);
//        int[] result = new int(k);
//
//        int tempSum = 0;
//        b[0] = tempSum;
//        for(int x = 0; x < a.length; x++) {
//            tempSum += a[x];
//            b[x+1] = tempSum;
//        }
//
//        for(int x = 0; x < k; x++) {
//            int i = queries[x][0];
//            int j = queries[x][1];
//
//            result[x] = b[j+1] - b[i];
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
