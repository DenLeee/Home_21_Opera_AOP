package learnup.opera;

import learnup.opera.model.Premiere;
import learnup.opera.model.Ticked;
import learnup.opera.service.PremiereService;
import learnup.opera.service.TickedService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HomeOpera20Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(HomeOpera20Application.class, args);

        context.getBean(TickedService.class).buyTicked(new Ticked(5, new Premiere(5, "TEST", "SDFEWEE", 18,200), 1000));

    }

}
