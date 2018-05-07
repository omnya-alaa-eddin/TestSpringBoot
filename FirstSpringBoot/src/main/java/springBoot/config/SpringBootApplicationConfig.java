/**
 * 
 */
package springBoot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author o.alaa
 *
 */
@SpringBootApplication
@ComponentScan({ "springBoot.presentation,springBoot.service"}) 

public class SpringBootApplicationConfig {

	
	public static void main(String[]args)
	{
		  SpringApplication.run(SpringBootApplicationConfig.class, args);
	}
}
