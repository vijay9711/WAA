package waarest.waarest.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExecutionTime {

    @Around("(@annotation(org.springframework.web.bind.annotation.GetMapping) || @annotation(org.springframework.web.bind.annotation.PostMapping) || " +
            "@annotation(org.springframework.web.bind.annotation.PatchMapping) || @annotation(org.springframework.web.bind.annotation.DeleteMapping)) " +
            "&& @annotation(waarest.waarest.Aspects.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        long start = System.nanoTime();
        log.info("Method started {}", System.nanoTime());
        log.info("Starting execution method {}", methodName);

        Object result = joinPoint.proceed();
        log.info("Finished execution method {}", methodName);
        log.info("Method ended {}", System.nanoTime());
        long end = System.nanoTime();
        log.info("Total time {}", end - start);

        return result;
    }
}
