package azuredataapi.apiforweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
// @ComponentScan({"azuredataapi.apiforweb.service"})
public class ApiforwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiforwebApplication.class, args);
	}

}
