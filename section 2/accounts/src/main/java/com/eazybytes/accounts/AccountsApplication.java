package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication //this annotation indicates This is the main of the spring boot microservice
//Do the below if your packages are not inside the same parent package
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") }) //this indicates to spring boot where our beans are, They are also in the Service folder
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") //tells spring boot, activate JPA Auditing and leverage bean named "auditAwareImpl" to get current auditor
// current auditor is inside auditAwareImpl.java with the @component("auditAwareImpl")
@OpenAPIDefinition(info = @Info(
		title = "Accounts microservice REST API Documentation", license = @License(name = "Apache 2.0"),
		contact = @Contact(name = "Sam Gupta",email = "email@email.com"), description = "EazyBank Accounts microservice REST API Documentation", version = "v1")
		,externalDocs = @ExternalDocumentation(description = "EazyBank Accounts microservice REST API Documentation")
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
