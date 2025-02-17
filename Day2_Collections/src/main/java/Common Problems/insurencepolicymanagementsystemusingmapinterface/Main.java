package insurencepolicymanagementsystemusingmapinterface;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

        public static void main(String[] args) throws Exception {
            PolicyManager policyManager = new PolicyManager();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            // Add some policies
            policyManager.addPolicy(new Policy("P001", "John Doe", sdf.parse("2025-02-28")));
            policyManager.addPolicy(new Policy("P002", "Jane Smith", sdf.parse("2025-03-15")));
            policyManager.addPolicy(new Policy("P003", "Alice Brown", sdf.parse("2025-01-30")));
            policyManager.addPolicy(new Policy("P004", "Bob White", sdf.parse("2025-02-12")));

            // Retrieve and display a policy by its number
            System.out.println("Policy P002: " + policyManager.getPolicyByNumber("P002"));

            // List all policies expiring within the next 30 days
            System.out.println("Policies expiring within the next 30 days:");
            for (Policy policy : policyManager.getPoliciesExpiringWithinNext30Days()) {
                System.out.println(policy);
            }

            // List all policies for a specific policyholder
            System.out.println("Policies for John Doe:");
            for (Policy policy : policyManager.getPoliciesForHolder("John Doe")) {
                System.out.println(policy);
            }

            // Remove expired policies
            policyManager.removeExpiredPolicies();
            System.out.println("Policies after removing expired ones:");
            policyManager.displayAllPolicies();
        }
    }

