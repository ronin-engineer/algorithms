package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {
    // https://leetcode.com/problems/subdomain-visit-count/

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> countMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String pair: cpdomains) {
            countDomainPairVisits(countMap, pair);
        }


        for (String domain: countMap.keySet()) {
            result.add(countMap.get(domain) + " " + domain.substring(0, domain.length() - 1));
        }

        return result;
    }

    public static void countDomainPairVisits(HashMap<String, Integer> countMap, String pair) {
        String[] pairParts = pair.split(" ");
        Integer visits = Integer.valueOf(pairParts[0]);

        String[] domains = pairParts[1].split("\\.");
        String domain = "";
        for (int i = domains.length - 1; i >= 0; i--) {
            domain = domains[i] + "." + domain;
            if (countMap.get(domain) == null) {
                countMap.put(domain, visits);
            }
            else {
                countMap.put(domain, countMap.get(domain) + visits);
            }
        }
    }

    public static void main(String[] args) {
        String[] cpDomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        for (String pairCount: subdomainVisits(cpDomains)) {
            System.out.println(pairCount);
        }
    }
}
