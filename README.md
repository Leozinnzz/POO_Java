# Programação Orientada a Objetos (POO) em Java ☕

Este repositório contém anotações, exemplos práticos e exercícios desenvolvidos durante a disciplina de **Programação Orientada a Objetos com Java**. O objetivo é consolidar a base teórica e prática do paradigma orientado a objetos utilizando a linguagem Java.

---

## 📌 Conteúdo Programático e Exemplos Práticos

---

### 1. Fundamentos da Linguagem Java

Antes de aplicar a Orientação a Objetos, vimos a sintaxe base da linguagem, como declaração de variáveis, estruturas de decisão (`if`/`else`), laços de repetição (`for`/`while`) e manipulação de entradas/saídas com a classe `Scanner`.

```java
import java.util.Scanner;

public class Fundamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        System.out.println("\nContagem até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
```

---

### 2. Classes, Objetos e Construtores

Aprendemos que uma **Classe** funciona como um molde (*blueprint*) que especifica as características e ações que os objetos daquele tipo possuem. O **Objeto** é a instância concreta dessa classe na memória. O **Construtor** é o método especial responsável por inicializar esses objetos, usando a palavra-chave `this` para se referir aos atributos da própria instância.

```java
public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
    }
}
```

---

### 3. Encapsulamento

O **Encapsulamento** consiste em esconder os detalhes internos do funcionamento de um objeto e proteger seus dados contra modificações indevidas. Utilizamos modificadores de acesso como `private` para os atributos e fornecemos o acesso controlado através dos métodos leitores (*getters*) e modificadores (*setters*).

```java
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
```

---

### 4. Herança e Polimorfismo

* **Herança:** Permite que uma classe filha herde atributos e métodos de uma classe pai (utilizando `extends`), promovendo o reuso de código e estabelecendo uma relação do tipo "é um".
* **Polimorfismo:** Capacidade de um mesmo método se comportar de formas diferentes dependendo do objeto que o invoca. Usamos a anotação `@Override` para sobrescrever o comportamento herdado.

```java
class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som genérico.");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " late: Au Au!");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " mia: Miau!");
    }
}
```

---

### 5. Classes Abstratas e Interfaces

* **Classes Abstratas:** Servem como modelos que não podem ser instanciados diretamente. Podem conter métodos abstratos (sem corpo), obrigando as subclasses a implementá-los.
* **Interfaces:** Definem contratos estritos de comportamento. Uma classe pode implementar múltiplas interfaces usando `implements`.

```java
interface Autenticavel {
    boolean autenticar(String senha);
}

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double getBonificacao();
}

class Gerente extends Funcionario implements Autenticavel {
    private String senha;

    public Gerente(String nome, double salario, String senha) {
        super(nome, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

    @Override
    public boolean autenticar(String senhaEntrada) {
        return this.senha.equals(senhaEntrada);
    }
}
```

---

### 6. Membros Estáticos e Enumerações

* **Atributos/Métodos Estáticos (`static`):** Pertencem à classe em si, e não a instâncias específicas. São compartilhados por todos os objetos.
* **Enumerações (`enum`):** Tipos especiais usados para definir um conjunto fixo e estruturado de constantes.

```java
enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}

public class Pedido {
    private static int contadorPedidos = 0;
    private int id;
    private StatusPedido status;

    public Pedido() {
        contadorPedidos++;
        this.id = contadorPedidos;
        this.status = StatusPedido.PENDENTE;
    }

    public static int getTotalPedidos() {
        return contadorPedidos;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
```

---

### 7. Tratamento de Exceções

Estudamos como lidar com erros em tempo de execução de forma graciosa sem interromper abruptamente a aplicação. Utilizamos blocos `try`, `catch` e `finally`, além de lançar exceções quando regras de negócio são violadas.

```java
public class ExemploExcecao {
    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            double resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada.");
        }
    }
}
```

---

### 8. Coleções e Generics (`java.util`)

Vimos como manipular coleções dinâmicas de dados utilizando a *Java Collections Framework*, cobrindo listas (`ArrayList`), conjuntos (`HashSet`) e mapas (`HashMap`), além do uso de **Generics** (`<T>`) para garantir a segurança de tipos em tempo de compilação.

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploColecoes {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Carlos");
        alunos.add("Mariana");

        System.out.println("Lista de Alunos:");
        for (String aluno : alunos) {
            System.out.println("- " + aluno);
        }

        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 9.5);
        notas.put("Carlos", 8.0);
        notas.put("Mariana", 10.0);

        System.out.println("\nNotas dos Alunos:");
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Paradigma:** Orientado a Objetos
* **Ambiente de Desenvolvimento:** VS Code / IntelliJ IDEA / Eclipse

---

## 🚀 Como Executar os Exemplos

1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/poo-java.git](https://github.com/seu-usuario/poo-java.git)
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd poo-java
   ```
3. Compile e execute qualquer arquivo `.java`:
   ```bash
   javac NomeDoArquivo.java
   java NomeDoArquivo
   ```
