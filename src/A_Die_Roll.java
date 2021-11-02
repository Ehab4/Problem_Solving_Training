import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Die_Roll {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int y = scan.nextInt();
        int w = scan.nextInt();
        int numberOfProbability = 6;
        Main m = new Main();
        int max = Math.max(y,w);
        HashMap<Integer, Integer> primeNumbers = m.primeFraction(numberOfProbability - max + 1);
//        for (Map.Entry<Integer, Integer> entry : primeNumbers.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }
//        System.out.println("///////////////////////////////");
//

        HashMap<Integer, Integer> primeNumbers1 = m.primeFraction(numberOfProbability);
//        for (Map.Entry<Integer, Integer> entry : primeNumbers1.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }
//
        System.out.print(m.fraction(primeNumbers,primeNumbers1));
    }

    public HashMap<Integer,Integer> primeFraction(int n) {
        HashMap<Integer, Integer> primes = new HashMap<Integer, Integer>();
        int i = 2;
        while (n > Math.sqrt(n)) {
            if (n % i == 0) {
                n = n / i;
                if (primes.containsKey(i)) {
                    primes.put(i, primes.get(i) + 1);
                } else {
                    primes.put(i, 1);
                }
            } else {
                i++;
            }
        }

        return primes;
    }

    public int multiply(HashMap<Integer, Integer> n){
        double sum = 1;
        for(Map.Entry<Integer,Integer> enrty : n.entrySet()){
            if(enrty.getValue() != 0) {
                sum = sum * Math.pow(enrty.getKey(), enrty.getValue());
            }
        }

        return (int)sum;

    }
    public String fraction(HashMap<Integer, Integer> n1, HashMap<Integer, Integer> n2){
        for(Map.Entry<Integer,Integer> enrty : n1.entrySet()){
            if(n2.containsKey(enrty.getKey())){
                int a = Math.min(n2.get(enrty.getKey()), enrty.getValue());

                simplestForm(n1,a,enrty.getKey(),n1.get(enrty.getKey()));
                simplestForm(n2,a,enrty.getKey(),n2.get(enrty.getKey()));
            }
        }

        return multiply(n1) + "/" + multiply(n2);
    }

    public void simplestForm(HashMap<Integer, Integer> n, int min, int key, int value){
        if( key - min == 0){
            n.put(key,0);
        }
        else{
            n.put(key, value - min);
        }
    }
}
