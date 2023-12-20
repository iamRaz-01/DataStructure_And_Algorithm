import java.util.ArrayList;

public class FibonacciSeries {
    static ArrayList<Numbers> memory = new ArrayList<>();

    public static long fibonacciSeries(int n){
       long value =  Numbers.findKey(memory,n);
       if(value != Integer.MIN_VALUE) return value;
       else {
       if(n <= 2 ) return 1 ;
       long fib = fibonacciSeries(n-1) + fibonacciSeries(n-2);
       memory.add(new Numbers(n,fib));
       return fib;
       }
    }
}
class Numbers {
    public  Numbers(int key , long value)
    {
        this.value = value;
        this.key = key ;
    }
    int key ;
    long value ;
    public static  long findKey(ArrayList<Numbers> arrayList, int key){
        for (Numbers numbers : arrayList){
            if(key == numbers.key) return numbers.value;
        }
        return Integer.MIN_VALUE;
    }
}
