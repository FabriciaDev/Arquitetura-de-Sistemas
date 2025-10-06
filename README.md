# Delivery Tech API

Sistema de delivery desenvolvido com Spring Boot e Java 21.

## 🧩 Arquitetura do Sistemas
Inicialmente em Camadas com Spring Boot
Evolução para Microserviçios em ciclos posteriores
Comunicação REST entre clente e servidor
Uso de eventos para operações assícronas

## 🚀 Tecnologias
- Java 21 LTS
- Spring Boot 3.2.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## ⚡ Recursos Modernos Utilizados
- Records (Java 14+)
- Text Blocks (Java 15+)
- Pattern Matching (Java 17+)
- Virtual Threads (Java 21)

## 🏃‍♂️ Como executar
1. Pré-requisitos: JDK 21 instalado
2. Clone o repositório
3. Execute: `mvn spring-boot:run`
4. Acesse: `http://localhost:8080/health`

## 📋 Endpoints
- GET `/health` → Status da aplicação (inclui versão Java)
- GET `/info` → Informações da aplicação
- GET `/h2-console` → Console do banco H2

## 🔧 Configuração
- Porta: 8080
- Banco: H2 em memória
- Profile: development

## 👩‍💻 Desenvolvedora
Fabricia — Turma Qualifica TI
