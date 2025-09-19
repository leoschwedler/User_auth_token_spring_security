# Auth Token 🔑

![Java](https://img.shields.io/badge/Java-21-informational)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.6-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-Docker-blue)
![JWT](https://img.shields.io/badge/JWT-Token-orange)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 📝 Descrição do Projeto

O **Auth Token** é uma aplicação backend desenvolvida em **Spring Boot** para registro e autenticação de usuários, utilizando **JWT** para segurança, **MySQL** como banco de dados e **Flyway** para gerenciamento de migrations. A aplicação também possui integração com **Swagger** para documentação de APIs.

---

## ✨ Funcionalidades

-   Registro de usuários com DTOs de requisição e resposta.
-   Login de usuários com JWT.
-   Configuração de segurança personalizada com filtros e serviços JWT.
-   Endpoints documentados via Swagger.
-   Versionamento de banco de dados com Flyway.

---

## 🛠️ Tecnologias Utilizadas
Spring Boot 3

Spring Data JPA

Spring Security + JWT

MySQL (Docker)

Flyway

Swagger

Java 21

Lombok

##🔚 Endpoints Principais
Método	Endpoint	Descrição
POST	/users/register	Registrar novo usuário
POST	/users/login	Login e geração de JWT
Teste todos os endpoints via Swagger: http://localhost:8080/swagger-ui.html

## 🚀 Como Rodar o Projeto
Subir o MySQL via Docker Compose:

Bash
docker-compose up -d
Configurar application.yml com usuário e senha corretos.

Rodar a aplicação Spring Boot:

Bash
mvn spring-boot:run
