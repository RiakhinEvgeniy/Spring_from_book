package services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class SecurityAspect {
    private final Logger log = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object loggerSecurity(ProceedingJoinPoint pjp) throws Throwable {
        log.info("Security Aspect Started");
        Object returnValue = pjp.proceed();
        log.info("Security Aspect Finished-> " + returnValue);
        return returnValue;
    }
}
