package net.dausech.RestClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			Empresa empresa = restTemplate.getForObject(
					"http://www.receitaws.com.br/v1/cnpj/13311080000148", Empresa.class);
			//log.info(empresa.toString());
			System.out.println("Nome:"+empresa.getNome()+"\n cnpj:"+empresa.getCnpj()
					+"\n municipio:"+empresa.getMunicipio()
					+"\n atividade pr:"+empresa.getAtividade_principal()[0].getText());
		};
	}
}