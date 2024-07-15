package services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private final Logger log = Logger.getLogger(CommentService.class.getName());


    @Around("execution(* services.CommentService.* (..))")
    public Object logAspect(ProceedingJoinPoint pjp) throws Throwable {
        log.info("Method will execute...");
        String methodName = pjp.getSignature().getName();
        Object[] argsMethod = pjp.getArgs();
        log.info("Method name: " + methodName + "\nParameters: " + Arrays.asList(argsMethod));
        Object objectProceed = pjp.proceed();
        log.info("Method done.");
        return objectProceed;
    }
}
