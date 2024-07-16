package services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private final Logger log = Logger.getLogger(CommentService.class.getName());


    @Around(value = "@annotation(ToLog)")
    public Object logAspect(ProceedingJoinPoint pjp) throws Throwable {
        log.info("LoggerAspect started...");
        Object returnedValue = pjp.proceed();
        log.info("LoggerAspect completed..." + returnedValue);
        return returnedValue;
    }

}
