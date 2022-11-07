## BrasilAPI-Java
Biblioteca criada para facilitar o acesso à API BrasilAPI na linguagem de programação Java.

https://github.com/BrasilAPI/BrasilAPI

## Dependência
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10</version>
</dependency>
```

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
Bank[] bank = BrasilAPI.banks();
Bank bank = BrasilAPI.bank("1");
CEP cep = new CEP();
CNPJ cnpj = BrasilAPI.cnpj("06.990.590/0001-23");
DDD ddd = BrasilAPI.ddd("79");
Feriados[] feriados = BrasilAPI.feriados("2023");
FipeMarca[] fipeMarcas = BrasilAPI.fipeMarcas("carros");
FipePreco[] fipePrecos = BrasilAPI.fipePrecos("031049-2");
FipeTabela[] fipeTabelas = BrasilAPI.fipeTabelas();
IBGEMunicipio[] ibgeMunicipios = BrasilAPI.ibgeMunicipios("SE");
IBGEUF[] ibgeUfs = BrasilAPI.ibgeUf();
IBGEUF ibgeUf = BrasilAPI.ibgeUf("SE");
ISBN isbn = BrasilAPI.isbn("9788567097688");
NCM[] ncms = BrasilAPI.ncm();
NCM ncm = BrasilAPI.ncm("01");
NCM[] ncmSearch = BrasilAPI.ncmSearch("Animais vivos.");
RegistroBR registroBR = BrasilAPI.registroBR("savio.pw");
Taxa[] taxas = BrasilAPI.taxas();
Taxa taxa = BrasilAPI.taxa("SELIC");

```
