package queueinterface.hospitaltriagesystem;


import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitaTriageSystem {
    // Main method
    public static void main(String[] args)
    {
        // Creating object of HospitalTriageSystem class
        PriorityQueue<Patient> patientsPriorityQueue = new PriorityQueue<>(new Comparator<Patient>()
        {
            public int compare(Patient p1, Patient p2)
            {
                return p2.severity - p1.severity;
            }
        });

        // Adding patients into priority queue
        patientsPriorityQueue.add(new Patient("Neeraj", 3));
        patientsPriorityQueue.add(new Patient("Abhishek", 5));
        patientsPriorityQueue.add(new Patient("Rajan", 2));

        // Displaying result
        while (!patientsPriorityQueue.isEmpty())
        {
            Patient temp = patientsPriorityQueue.poll();
            System.out.print(temp.name + ", ");
        }
    }
}
