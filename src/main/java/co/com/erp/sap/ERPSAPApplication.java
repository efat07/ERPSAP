package co.com.erp.sap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="co.com.erp.sap.listener")
@SpringBootApplication
public class ERPSAPApplication {

	public static void main(String[] args) {
		SpringApplication.run(ERPSAPApplication.class, args);
	}
}
