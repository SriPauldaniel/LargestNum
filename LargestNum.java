import java.util.*;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        System.out.println(largestNumber(arr));
        sc.close();
    }

    static String largestNumber(String[] arr) {
        String result = "";
        Arrays.sort(arr,new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                String ab = o1+o2;
                String ba = o2+o1;
                return ba.compareTo(ab);
            }  
        });
        for(int i=0;i<arr.length;i++) {
            result += arr[i];
        }
        return result;
    }
}