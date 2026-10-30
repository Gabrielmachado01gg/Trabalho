# Trabalho — Herança e Polimorfismo em Java

Trabalho acadêmico em Java que modela os funcionários de uma empresa e calcula o salário de cada cargo, praticando **herança**, **classe abstrata** e **polimorfismo**.

## Modelo

| Classe | Papel | Cálculo do salário |
|---|---|---|
| `Funcionario` | Classe abstrata com nome, matrícula e salário base | método abstrato `calculaSalario()` |
| `Gerente` | Herda de `Funcionario` | 2 × salário base |
| `Assistente` | Herda de `Funcionario` | salário base |
| `Vendedor` | Herda de `Funcionario` | salário base + comissão |

## Saída do `Main`

```
Salário do Gerente: 10000.0
Salário do Assistente: 3000.0
Salário do Vendedor: 3000.0
```

## Como executar

Requisito: JDK 17 ou superior.

```bash
git clone https://github.com/Gabrielmachado01gg/Trabalho.git
cd Trabalho/TRABALHO_INTERFACE
javac -d out src/main/java/com/mycompany/trabalho_interface/*.java
java -cp out com.mycompany.trabalho_interface.Main
```

Também é possível abrir a pasta `TRABALHO_INTERFACE` no NetBeans (projeto Maven).

## Autor

Gabriel Wiedenhoft — [LinkedIn](https://www.linkedin.com/in/gabriel-wiedenhoft-machado)
