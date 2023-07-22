import java.util.ArrayList;
import java.util.List;
public class PrimeNumber {
    public static void main(String[] args) {
        //getPrimes(165  );
        for(int a: getPrimes(165))
        System.out.println(a);
    }
    public static List<Integer> getPrimes(int count){
        List<Integer> primes = new ArrayList<>();
        if(count > 0){
            primes.add(2);
            for(int i = 3; primes.size() < count;i += 2){
                if(isPrime(i, primes)){
                    primes.add(i);
                }
            }
        }
        return  primes;
    }
    private static boolean isPrime(int number, List<Integer> primes){
        double sqr = Math.sqrt(number);
        for(int n: primes){
            if(n > sqr){
                return true; //простое
            }
            if (number % n == 0){
                return  false;
            }
        }
        return  true;
    }
}
