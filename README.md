# Folha de Pagamento — Herança e Polimorfismo em Java

[![CI](https://github.com/Gabrielmachado01gg/Trabalho/actions/workflows/ci.yml/badge.svg)](https://github.com/Gabrielmachado01gg/Trabalho/actions/workflows/ci.yml)
![Java 17](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Licença MIT](https://img.shields.io/badge/licen%C3%A7a-MIT-green)

Projeto em Java que modela os funcionários de uma empresa e calcula o salário de cada cargo. Foi um trabalho acadêmico sobre **herança**, **classes abstratas** e **polimorfismo**, depois refatorado com boas práticas e testes automatizados.

## Modelo

```
Funcionario (abstrata)
├── Gerente      → 2 × salário base
├── Assistente   → salário base
└── Vendedor     → salário base + comissão

FolhaDePagamento → soma o salário de qualquer Funcionario, sem saber o cargo
```

## Exemplo de saída

```
Gerente Marina Alves (matrícula 123)          R$ 10.000,00
Assistente Carlos Pereira (matrícula 456)     R$ 3.000,00
Vendedor Julia Santos (matrícula 789)         R$ 3.000,00
Total da folha                                R$ 16.000,00
```

## Boas práticas aplicadas

- **Polimorfismo de verdade:** `FolhaDePagamento` trabalha com `Funcionario`, e cada cargo implementa a própria regra.
- **`BigDecimal` para dinheiro**, em vez de `double`.
- **Objetos válidos desde a criação:** campos `final`, validação no construtor e lista de funcionários somente leitura.
- **Testes JUnit 5** para cada cargo, para a folha e para os casos inválidos, com CI no GitHub Actions.
- Estrutura Maven padrão, pacote `com.gabrielwiedenhoft.folha`.

## Como executar

Requisitos: JDK 17+ e Maven 3.9+.

```bash
git clone https://github.com/Gabrielmachado01gg/Trabalho.git
cd Trabalho
mvn -B test
mvn -q package -DskipTests
java -jar target/folha-de-pagamento-1.0.0.jar
```

## Autor

Gabriel Wiedenhoft — [LinkedIn](https://www.linkedin.com/in/gabriel-wiedenhoft-8a3256286)

Licença [MIT](LICENSE).
