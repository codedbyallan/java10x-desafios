#  Desafio Java10x — Sistema Ninja (Interfaces & Polimorfismo)

Projeto desenvolvido como parte do curso **Java10x**, com foco no uso de **interfaces, polimorfismo e enums** em Java.  
O desafio consiste em criar diferentes tipos de ninjas, cada um com suas informações e habilidades, demonstrando os princípios da **Programação Orientada a Objetos (POO)**.  

---

## 🎯 Objetivos do Desafio
- Criar uma **interface** (`Ninja`) com métodos obrigatórios.  
- Implementar diferentes tipos de ninjas (`NinjaBasico` e `NinjaAvancado`).  
- Trabalhar com **atributos comuns** (nome, idade, habilidade).  
- Adicionar atributo extra na classe avançada (`especialidade`).  
- Demonstrar **polimorfismo** chamando os métodos através da interface.  
- (Extra) Criar um **enum `TipoHabilidade`** para padronizar as habilidades dos ninjas.  

---

## 🚀 Funcionalidades
- Criação de ninjas básicos e avançados com atributos definidos no construtor.  
- Exibição das informações de cada ninja através do método `mostrarInformacoes()`.  
- Execução das habilidades de cada ninja via `executarHabilidade()`.  
- Uso de `enum` para organizar habilidades (TAIJUTSU, NINJUTSU, GENJUTSU, KATON, RINNEGAN).  
- Demonstração de **polimorfismo**: mesmo tipo (`Ninja`), comportamentos diferentes.  

---

## 🧩 Estrutura do Projeto
```
Java10x - Desafios.desafio06-sistema-ninja-interface-enum
│
├── Ninja.java # Interface com os métodos obrigatórios
├── TipoHabilidade.java # Enum com tipos de habilidades
├── NinjaBasico.java # Implementa a interface Ninja
├── NinjaAvancado.java # Implementa a interface Ninja com atributo especialidade
└── Main.java # Classe principal para rodar os testes

```

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**  
- IDE: **IntelliJ IDEA** (ou qualquer outra compatível)  
- Execução via **linha de comando (CLI)**  

---

## 📚 Conceitos Reforçados
- **Interfaces** → Definição de contratos para classes.  
- **Polimorfismo** → Mesmo tipo de referência (`Ninja`), comportamentos diferentes.  
- **Encapsulamento** → Uso de atributos privados inicializados via construtores.  
- **Enum** → Organização de constantes relacionadas (habilidades).  

---

## ✅ Status do Desafio
✔️ Concluído com sucesso!  