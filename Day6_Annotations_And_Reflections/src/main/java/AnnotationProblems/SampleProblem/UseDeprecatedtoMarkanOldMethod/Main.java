package AnnotationProblems.SampleProblem.UseDeprecatedtoMarkanOldMethod;

public class Main {
    public static void main(String[] args) {
        LegacyAPI legacyAPI = new LegacyAPI();

        // Call the deprecated oldFeature method
        legacyAPI.oldFeature();

        // Call the newFeature method
        legacyAPI.newFeature();
    }
}
