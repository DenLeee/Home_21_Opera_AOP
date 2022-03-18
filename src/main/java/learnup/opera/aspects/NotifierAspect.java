package learnup.opera.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NotifierAspect {

    @Pointcut("execution(* learnup.opera.service.TickedService.buyTicked(..))")
    public void notifier(){}

    @After("notifier()")
    public void notifierAfterBuyTicked (JoinPoint joinPoint) {
        sendMailMessenger(joinPoint.getSignature().getName() + " Покупка прошла успешно, полная информация на почтовом ящике ");
    }

    private void sendMailMessenger(Object o) {
        System.out.print(o);
    }
}
