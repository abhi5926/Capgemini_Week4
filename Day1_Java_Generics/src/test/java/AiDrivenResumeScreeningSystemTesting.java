import aidrivenresumescreeningsystem.DataScientist;
import aidrivenresumescreeningsystem.ProductManager;
import aidrivenresumescreeningsystem.Resume;
import aidrivenresumescreeningsystem.SoftwareEngineer;
import org.junit.jupiter.api.Test;

public class AiDrivenResumeScreeningSystemTesting {
    @Test
    void resumeScreeningSystemTesting(){
        // Creating Objects of different classes
        SoftwareEngineer ob = new SoftwareEngineer("Abhishek Sen Software Engineer",30000,"Java");
        DataScientist ob1 = new DataScientist("Neeraj Data Scientist Engineer" ,120000,"Google");
        ProductManager ob2 = new ProductManager("Rajan Product Manager",55000,7 );

        // Creating Resume Manager
        Resume<SoftwareEngineer> soft= new Resume<>();
        Resume<DataScientist> data = new Resume<>();
        Resume<ProductManager> product= new Resume<>();

        // Adding resumes
        soft.addResume(ob);
        data.addResume(ob1);
        product.addResume(ob2);

    }
}
