package com.intospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({MagicAutoConfigurationImportSelector.class, MagicImportRegister.class})
class IntoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntoSpringApplication.class, args);
		/* Alternative version of starting the application

		new SpringApplicationBuilder(IntoSpringApplication.class)
				.listeners(new CustomListener())
				.initializers(
						(GenericApplicationContext context) -> context.registerBean(FooBean.class),
						(GenericApplicationContext context) -> context.registerBean(BarBean.class,
									() -> new BarBean(context.getBean(FooBean.class)
								)
						)
				).run(args);
		 */

	}

}
