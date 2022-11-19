## BrasilAPI-Java
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/SavioAndres/BrasilAPI-Java/blob/main/LICENSE)
[![Java CI with Maven](https://github.com/SavioAndres/BrasilAPI-Java/actions/workflows/maven.yml/badge.svg)](https://github.com/SavioAndres/BrasilAPI-Java/actions/workflows/maven.yml)
[![CodeQL](https://github.com/SavioAndres/BrasilAPI-Java/actions/workflows/codeql.yml/badge.svg)](https://github.com/SavioAndres/BrasilAPI-Java/actions/workflows/codeql.yml)
[![JitPack](https://jitpack.io/v/SavioAndres/BrasilAPI-Java.svg)](https://jitpack.io/#SavioAndres/BrasilAPI-Java/v1.0.5)

Biblioteca criada para facilitar o acesso à API [BrasilAPI](https://github.com/BrasilAPI/BrasilAPI) na linguagem de programação Java.

```
  ____                _ _    _    ____ ___          _                  
 | __ ) _ __ __ _ ___(_) |  / \  |  _ \_ _|        | | __ ___   ____ _ 
 |  _ \| '__/ _` / __| | | / _ \ | |_) | |_____ _  | |/ _` \ \ / / _` |
 | |_) | | | (_| \__ \ | |/ ___ \|  __/| |_____| |_| | (_| |\ V / (_| |
 |____/|_|  \__,_|___/_|_/_/   \_\_|  |___|     \___/ \__,_| \_/ \__,_|
```

## Informações
- Suporte à Java 8 ou superior.

## Instalação
### Maven
```xml
  <dependencies>
  	<dependency>
	    <groupId>com.github.SavioAndres</groupId>
	    <artifactId>BrasilAPI-Java</artifactId>
	    <version>v1.0.5</version>
  	</dependency>
  </dependencies>
  <repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
  </repositories>
```
### Demais gerenciadores:
Gradle, SBT e Leiningen disponíveis em: [JitPack BrasilAPI-Java](https://jitpack.io/#SavioAndres/BrasilAPI-Java/v1.0.5)

## Exemplo de utilização
```java
// Obter informações do CEP
CEP2 cep2 = BrasilAPI.cep2("04538133");
System.out.println(cep2.getStreet());

// Para ativar o log no console
BrasilAPI.setEnableLog(true);

// Para ativar cache e agilizar consultas repetidas
BrasilAPI.setEnableCache(true);

// Para definir o tempo de vida do cache
BrasilAPI.setCacheTimeMinutes(10L);

// Alguns outros métodos implementados de exemplo:
Bank[] banks                    = BrasilAPI.banks();
Bank bank                       = BrasilAPI.bank("1");
CEP cep                         = BrasilAPI.cep("04538133");
CNPJ cnpj                       = BrasilAPI.cnpj("06.990.590/0001-23");
DDD ddd                         = BrasilAPI.ddd("79");
Feriados[] feriados             = BrasilAPI.feriados("2023");
FipeMarca[] fipeMarcas          = BrasilAPI.fipeMarcas("carros");
FipePreco[] fipePrecos          = BrasilAPI.fipePrecos("031049-2");
FipeTabela[] fipeTabelas        = BrasilAPI.fipeTabelas();
IBGEMunicipio[] ibgeMunicipios  = BrasilAPI.ibgeMunicipios("SE");
IBGEUF[] ibgeUfs                = BrasilAPI.ibgeUf();
IBGEUF ibgeUf                   = BrasilAPI.ibgeUf("SE");
ISBN isbn                       = BrasilAPI.isbn("9788567097688");
NCM[] ncms                      = BrasilAPI.ncm();
NCM ncm                         = BrasilAPI.ncm("01");
NCM[] ncmSearch                 = BrasilAPI.ncmSearch("Animais vivos.");
RegistroBR registroBR           = BrasilAPI.registroBR("savio.pw");
Taxa[] taxas                    = BrasilAPI.taxas();
Taxa taxa                       = BrasilAPI.taxa("SELIC");

```
