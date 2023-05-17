package jenking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringWIthJenkingIntegrationApplicationTests {

	public static Logger LOGGER = LoggerFactory.getLogger(SpringWIthJenkingIntegrationApplication.class);
	@Test
	void contextLoads() {
		LOGGER.info("NIKHILESH MITRA Jenking first project test case executed");
		assertEquals(true , true);
	}

}
