package AnnotationProblems.PracticeProblemsForCustomAnnotation.Advancelevel.ImplementaCustomCachingSystemWithCacheResult;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheResult {
    // No additional parameters required for this simple caching system
}