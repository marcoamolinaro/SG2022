# SG2022

Criação do Backend

- Usando Spring Initializer
	
	Entrar em https://start.spring.io/
	
	- Criar projeto Spring Boot no `Spring Initializr` com as seguintes dependências:
	  - Web
	  - JPA
	  - H2
	  - Postgres
	  - Security
	
	- Ajustar arquivo pom.xml adicionando o pluging
		
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-resources-plugin</artifactId>
			<version>3.1.0</version>
		</plugin>
	
	- Botão direito no projeto -> Maven -> Update project (force update)
