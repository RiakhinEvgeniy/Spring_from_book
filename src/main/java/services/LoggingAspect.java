package services;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private final Logger log = Logger.getLogger(CommentService.class.getName());


//    @Around("execution(* services.CommentService.* (..))")
//    public String logAspect(ProceedingJoinPoint pjp) throws Throwable {
//        log.info("Method will execute...");
//        String methodName = pjp.getSignature().getName();
//        Object[] argsMethod = pjp.getArgs();
//        log.info("Method name: " + methodName + "\nParameters: " + Arrays.asList(argsMethod));
//        Comment comment = new Comment();
//        comment.setText("New text.");
//        Object[] args = {comment};
//        Object objectProceed = pjp.proceed(args);
//        log.info("Method done.");
//        return "FAILED";
//    }

    @AfterReturning(value = "@annotation(ToLog)", returning = "object")
    public void logger(Object object) {
        log.info("Start method logger. " + object );
    }
}
