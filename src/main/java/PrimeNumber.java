public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("0 is Prime " + isPrime(0));
        System.out.println("3 is Prime " + isPrime(3));
        System.out.println("4 is Prime " + isPrime(4));
        System.out.println("5 is Prime " + isPrime(5));
        System.out.println("7 is Prime " + isPrime(7));
        System.out.println("9 is Prime " + isPrime(9));
        System.out.println("13 is Prime " + isPrime(13));
        System.out.println("20 is Prime " + isPrime(20));
        System.out.println("31 is Prime " + isPrime(31));
        System.out.println("400 is Prime " + isPrime(400));
    }

    public static boolean isPrime(int n){

        if(n == 0 || n ==1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
