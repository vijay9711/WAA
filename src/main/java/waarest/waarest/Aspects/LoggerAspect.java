package waarest.waarest.Aspects;

import lombok.Data;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import waarest.waarest.Aspects.annotation.LogExecutionTime;
import waarest.waarest.entity.Logger;
import waarest.waarest.repo.LoggerRepo;

import java.util.Date;

@Aspect
@Component
public class LoggerAspect {
    @Autowired
    LoggerRepo loggerRepo;

    @Pointcut("@annotation(waarest.waarest.Aspects.annotation.LogMe)")
    public void logMeAnnotation(){
        System.out.println("logMeAnnotation is executed");
    }

    @Pointcut("execution( * waarest.waarest.controller.UserController.*(..)) || execution( * waarest.waarest.controller.PostController.*(..)) || execution( * waarest.waarest.controller.CommentController.*(..))")
    public void logMe() {
        System.out.println("log here");
    }



    @After("logMe()")
    public void logData(JoinPoint joinPoint) {
        loggerRepo.save(getLog(joinPoint.getSignature().getName(), "fake user"));
    }
    public Logger getLog(String operation, String principle){
        Logger log = new Logger();
        Date date = new Date();
        log.setCreatedAt(date);
        log.setOperation(operation);
        log.setPrinciple(principle);
        return log;
    }

     
}
