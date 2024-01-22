package waarest.waarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class WaarestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaarestApplication.class, args);
	}

}
