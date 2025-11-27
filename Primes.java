public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count=0, percentage, prime_times;

        boolean[] arr_prime = new boolean[num+1];

        for (int c=0;c<num+1;c++){
             arr_prime[c] = true;
        }

        for (int i=2;i<num+1;i++){
            for (int j=2; j<num+1;j++ ){
             prime_times = i*j;
             if ((i*j) > num){
                break;
             }
            arr_prime[i*j] = false;

            }
        }

        System.out.println("Prime numbers up to " + num + ":");
        for (int p=2;p<=num;p++){
            if (arr_prime[p]){
                System.out.println(p);
                count ++;
            }
        }

        percentage = (int) (((double) count/num) *100);

        System.out.println("There are " + count + " primes between 2 and " + num+" (" + percentage + "% are primes)");
        }
}