package lp.vidring.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories
@EnableWebMvc
@EnableSpringDataWebSupport
public class VidringLandingPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(VidringLandingPageApplication.class, args);
	}

}
