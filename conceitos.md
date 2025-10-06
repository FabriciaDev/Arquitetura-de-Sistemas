# 🧠 Conceitos Utilizados no Projeto de Delivery

Este documento reúne os principais conceitos técnicos e arquiteturais aplicados no desenvolvimento do sistema de delivery, com base na disciplina de Arquitetura de Sistemas. Cada item aqui foi escolhido para garantir **organização, escalabilidade, segurança e manutenibilidade** da aplicação.

---

## 🧱 Arquitetura em Camadas

Separação lógica do sistema em três camadas principais:

- **Apresentação**: interface com o usuário via APIs RESTful (Spring MVC)
- **Serviço**: lógica de negócio (rotas, promoções, estoque)
- **Persistência**: acesso a dados com Spring Data JPA e MySQL

🔎 *Facilita a manutenção, testes e evolução do sistema.*

---

## 🎯 Padrão MVC (Model-View-Controller)

Organiza o código em três componentes:

- **Model**: representa os dados e regras de negócio
- **View**: interface visual (Thymeleaf)
- **Controller**: recebe requisições e coordena as respostas

🧩 *Promove separação de responsabilidades e clareza na estrutura.*

---

## 🧼 Princípios SOLID

Conjunto de boas práticas para design de código orientado a objetos:

- **S**: Single Responsibility Principle  
- **O**: Open/Closed Principle  
- **L**: Liskov Substitution Principle  
- **I**: Interface Segregation Principle  
- **D**: Dependency Inversion Principle

🔧 *Garante código limpo, modular e fácil de manter.*

---

## 🧪 Clean Architecture

Organiza o sistema em círculos concêntricos, isolando regras de negócio das dependências externas (frameworks, banco de dados, etc).

🛡️ *Facilita testes, mudanças tecnológicas e evolução do sistema.*

---

## 📐 Documentação Arquitetural

Uso de diagramas UML e registro de decisões técnicas para:

- Visualizar a estrutura do sistema
- Comunicar decisões entre membros da equipe
- Facilitar onboarding de novos desenvolvedores

📘 *Documentar é garantir que o conhecimento não se perca.*

---

## ⚙️ Tecnologias Aplicadas

- **Spring Boot**: framework principal
- **Spring MVC**: camada web
- **Spring Data JPA**: persistência de dados
- **Thymeleaf**: templates HTML
- **Swagger/OpenAPI**: documentação automática
- **Docker**: containerização e consistência entre ambientes
- **Git**: controle de versão com branches organizados

---

Este conjunto de conceitos forma a base sólida sobre a qual o sistema de delivery está sendo construído. Cada escolha técnica foi feita com foco em **qualidade, clareza e escalabilidade**.

