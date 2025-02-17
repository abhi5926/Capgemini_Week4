package insurencepolicymanagementsystemusingmapinterface;
import java.util.*;
public class PolicyManager {

        private Map<String, Policy> policyMap = new HashMap<>();
        private LinkedHashMap<String, Policy> insertionOrderMap = new LinkedHashMap<>();
        private TreeMap<Date, List<Policy>> expiryDateMap = new TreeMap<>();

        public void addPolicy(Policy policy) {
            policyMap.put(policy.getPolicyNumber(), policy);
            insertionOrderMap.put(policy.getPolicyNumber(), policy);

            expiryDateMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
        }

        public Policy getPolicyByNumber(String policyNumber) {
            return policyMap.get(policyNumber);
        }

        public List<Policy> getPoliciesExpiringWithinNext30Days() {
            List<Policy> expiringSoon = new ArrayList<>();
            Date now = new Date();
            Date thirtyDaysFromNow = new Date(now.getTime() + (30L * 24 * 60 * 60 * 1000));

            expiryDateMap.subMap(now, thirtyDaysFromNow).values().forEach(expiringSoon::addAll);
            return expiringSoon;
        }

        public List<Policy> getPoliciesForHolder(String policyHolderName) {
            List<Policy> policies = new ArrayList<>();
            for (Policy policy : policyMap.values()) {
                if (policy.getPolicyHolderName().equals(policyHolderName)) {
                    policies.add(policy);
                }
            }
            return policies;
        }

        public void removeExpiredPolicies() {
            Date now = new Date();
            SortedMap<Date, List<Policy>> expiredPolicies = expiryDateMap.headMap(now);
            for (Date expiryDate : expiredPolicies.keySet()) {
                for (Policy policy : expiredPolicies.get(expiryDate)) {
                    policyMap.remove(policy.getPolicyNumber());
                    insertionOrderMap.remove(policy.getPolicyNumber());
                }
            }
            expiredPolicies.clear();
        }

        public void displayAllPolicies() {
            for (Policy policy : insertionOrderMap.values()) {
                System.out.println(policy);
            }
        }
    }

