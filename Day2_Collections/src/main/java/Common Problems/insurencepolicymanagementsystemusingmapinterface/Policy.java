package insurencepolicymanagementsystemusingmapinterface;
import java.util.Date;
public class Policy {
        private String policyNumber;
        private String policyHolderName;
        private Date expiryDate;

        public Policy(String policyNumber, String policyHolderName, Date expiryDate) {
            this.policyNumber = policyNumber;
            this.policyHolderName = policyHolderName;
            this.expiryDate = expiryDate;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public String getPolicyHolderName() {
            return policyHolderName;
        }

        public Date getExpiryDate() {
            return expiryDate;
        }

        @Override
        public String toString() {
            return "Policy{" +
                    "policyNumber='" + policyNumber + '\'' +
                    ", policyHolderName='" + policyHolderName + '\'' +
                    ", expiryDate=" + expiryDate +
                    '}';
        }
    }