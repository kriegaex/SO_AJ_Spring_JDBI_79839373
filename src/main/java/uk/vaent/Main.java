package uk.vaent;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import uk.vaent.controller.MyController;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        try (
            ConfigurableApplicationContext appContext = new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .logStartupInfo(true)
                .sources(Main.class)
                .run(args)) {
            // Call controller to trigger aspect for demonstration
            appContext.getBean(MyController.class).getCount();
        }
    }

}
