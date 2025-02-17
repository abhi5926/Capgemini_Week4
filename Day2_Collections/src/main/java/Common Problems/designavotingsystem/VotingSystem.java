package designavotingsystem;
import java.util.*;
public class VotingSystem {

        // HashMap to store votes for each candidate (Candidate -> Votes)
        private static HashMap<String, Integer> votesMap = new HashMap<>();

        // LinkedHashMap to maintain the order of voting as it happens
        private static LinkedHashMap<String, Integer> votingOrder = new LinkedHashMap<>();

        // TreeMap to display the candidates in sorted order based on votes
        private static TreeMap<Integer, List<String>> sortedVotes = new TreeMap<>(Collections.reverseOrder());

        public static void main(String[] args) {
            // Simulating votes being cast
            castVote("Alice");
            castVote("Bob");
            castVote("Alice");
            castVote("Charlie");
            castVote("Bob");
            castVote("Alice");
            castVote("Charlie");
            castVote("Alice");

            // Displaying votes in the order they were cast
            System.out.println("Voting order (preserving cast order):");
            displayVotingOrder();

            // Displaying candidates sorted by votes
            System.out.println("\nVoting results (sorted by votes):");
            displaySortedVotes();
        }

        // Method to cast a vote for a candidate
        public static void castVote(String candidate) {
            // Increment votes in HashMap
            votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);

            // Maintain the order of votes in LinkedHashMap
            votingOrder.put(candidate, votingOrder.getOrDefault(candidate, 0) + 1);

            // Add to TreeMap to group by number of votes
            sortedVotes.putIfAbsent(votesMap.get(candidate), new ArrayList<>());
            sortedVotes.get(votesMap.get(candidate)).add(candidate);
        }

        // Method to display the order of voting as it was cast
        public static void displayVotingOrder() {
            for (Map.Entry<String, Integer> entry : votingOrder.entrySet()) {
                System.out.println(entry.getKey() + " - Votes: " + entry.getValue());
            }
        }

        // Method to display the results sorted by the number of votes
        public static void displaySortedVotes() {
            for (Map.Entry<Integer, List<String>> entry : sortedVotes.entrySet()) {
                System.out.println("Votes: " + entry.getKey());
                for (String candidate : entry.getValue()) {
                    System.out.println("    " + candidate);
                }
            }
        }
    }

