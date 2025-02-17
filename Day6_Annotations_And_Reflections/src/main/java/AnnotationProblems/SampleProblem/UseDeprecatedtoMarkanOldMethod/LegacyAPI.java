package AnnotationProblems.SampleProblem.UseDeprecatedtoMarkanOldMethod;

public class LegacyAPI {
    // Mark this method as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature.");
    }

    // New feature to replace the old one
    public void newFeature() {
        System.out.println("This is the new feature.");
    }
}
