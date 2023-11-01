package retry;

public class Backoff {

    public static void main(String[] args) throws Exception {
        long initInterval = 50L;
        long mutiplier = 2;
        long retryTimeout = 10000L;
        int retries = 0;
        long wait, totalWait = 0;


        do {
            System.out.println("Retry: " + retries);
            wait = initInterval *  (long) Math.pow(mutiplier, retries);
            Thread.sleep(wait);
            retries++;
            totalWait += wait;
            System.out.println("wait = " + wait + ", totalWait = " + totalWait);
        } while (totalWait <= retryTimeout);
    }
}
