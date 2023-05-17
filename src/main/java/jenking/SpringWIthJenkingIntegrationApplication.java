package jenking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class SpringWIthJenkingIntegrationApplication {

	public static Logger LOGGER = LoggerFactory.getLogger(SpringWIthJenkingIntegrationApplication.class);
	@PostConstruct
	public void init() {
		LOGGER.info("NIKHILESH MITRA Jenking first project init()");
	}
	@PostConstruct
	public void init1() {
		LOGGER.info("NIKHILESH MITRA Jenking first projectinit()1");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringWIthJenkingIntegrationApplication.class, args);
		LOGGER.info("NIKHILESH MITRA Jenking first project from main()");
	}

}
