package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes;

    // Creating Constructor
    public Resume(){
        resumes = new ArrayList<>();
    }
    // Method to add Resume
    public void addResume(T resume){
        resumes.add(resume);
    }
    // Method to get Resumes
    public List<T> getResume(){
        return resumes;
    }
}
