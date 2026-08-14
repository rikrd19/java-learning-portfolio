# Java Learning Portfolio — Udemy Zero to Expert

Portfolio of Java projects and exercises from the Udemy course **Java: From Zero to Expert**, organized as a monorepo with submodules for featured applications.

> **Status:** In progress — currently finishing JavaServer Faces, Jakarta EE, EJBs, and Hibernate modules.

## About This Repository

This monorepo groups coursework and practice projects developed while learning Java from fundamentals to enterprise development. Featured projects with independent Git history are linked as **Git submodules**; smaller exercises are included directly in this repository.

| | |
|---|---|
| **Study period** | February 2025 – present |
| **IDE** | IntelliJ IDEA / NetBeans |
| **JDK** | 21 |
| **Course** | [Java: De Cero a Experto](https://www.udemy.com/) (Udemy) |

## Featured Projects

| Project | Technologies | Repository |
|---------|-------------|------------|
| Supermarket API | Spring Boot, REST, JPA, MySQL | [supermarket-api-spring-boot](https://github.com/rikrd19/supermarket-api-spring-boot) |
| ZonaFit Spring | Spring Boot, JSF, PrimeFaces, JPA, MySQL | [zona-fit-springboot-jsf-primefaces-jpa-mysql](https://github.com/rikrd19/zona-fit-springboot-jsf-primefaces-jpa-mysql) |
| Desktop Calculator | Java Swing, Maven, GUI | [java-swing-desktop-calculator](https://github.com/rikrd19/java-swing-desktop-calculator) |
| Client Management (MVC) | JSP, Servlets, MVC, JDBC, MySQL | [Gestion-Clientes-Java-JSP-Servlets-MVC-CRUD](https://github.com/rikrd19/Gestion-Clientes-Java-JSP-Servlets-MVC-CRUD) |
| Inventory App | Spring Boot + Angular | _Included in monorepo_ |
| HR Management App | Spring Boot + React | _Included in monorepo_ |

## Course Progress

### Completed

#### Java Fundamentals
- Console I/O, variables, operators
- Control flow: `if/else`, `switch`, loops (`for`, `while`, `do-while`)
- Arrays and matrices
- Methods and variable arguments
- Flowcharts and pseudocode review

#### Object-Oriented Programming (OOP)
- Classes and objects
- Inheritance, polymorphism, interfaces
- `Object` class, `static` members
- Advanced topics: generics, enums, annotations

#### Java Collections & File I/O
- Collections framework (`List`, `Set`, `Map`)
- File handling and text I/O
- Movie catalog lab (file-based CRUD)

#### Java Desktop (Swing)
- GUI components and event handling
- Desktop calculator application
- Vending machine project (advanced topics)

#### Java Web — JSP & Servlets
- Introduction to Java Web and GlassFish
- JSP syntax: scriptlets, directives, EL, JSTL
- Servlets: parameters, headers, cookies, sessions
- HTTP status codes and response headers
- JavaBeans with JSP
- Shopping cart with HTTP sessions
- MVC design pattern
- Full CRUD client management application

#### JDBC & Data Layer
- JDBC fundamentals and connection pooling
- Transactions and data access layer
- MySQL integration

#### Spring Boot & Full-Stack
- REST APIs with Spring Boot
- JPA / Hibernate basics with Spring Data
- Angular frontend (inventory management)
- React frontend (human resources management)
- Supermarket API technical test

#### Legacy Java EE (JSF)
- ZonaFit desktop app (JDBC)
- ZonaFit Spring Boot + JSF + PrimeFaces CRUD

### In Progress

- JavaServer Faces (JSF)
- Introduction to Jakarta EE
- Enterprise JavaBeans (EJBs)
- Jakarta EE platform
- Hibernate Framework (advanced)

## Repository Structure

```
.
├── Curso-Java-Udemy-Cero-a-Experto/     # Main course directory
│   ├── Arreglos-en-Java/                # Arrays exercises
│   ├── Ciclos-Java/                     # Loops exercises
│   ├── Clase - Herencia/                # Inheritance
│   ├── Clases-Polimorfismo/               # Polymorphism
│   ├── Swing-Java/                        # Swing GUI basics
│   ├── Calculadora-GUI-.../             # Submodule → desktop calculator
│   ├── ZonaFitSpring/                   # Submodule → JSF + Spring Boot CRUD
│   ├── SpringBoot+Angular-.../          # Inventory full-stack app
│   ├── SpringBoot+REACT-.../            # HR full-stack app
│   └── curso-Java-con-IDE-Netbeans/     # JSP, Servlets, JDBC, MVC projects
│       └── Gestion-Clientes-.../        # Submodule → MVC CRUD app
└── PruebaTecSupermecado/                # Submodule → supermarket API
```

## How to Clone

Clone with submodules to get all featured projects:

```bash
git clone --recurse-submodules https://github.com/rikrd19/java-learning-portfolio.git
```

If you already cloned without submodules:

```bash
git submodule update --init --recursive
```

## Tech Stack Summary

| Layer | Technologies |
|-------|-------------|
| Language | Java 21 |
| Build | Maven, Gradle |
| Web (legacy) | JSP, Servlets, JSF, PrimeFaces |
| Enterprise | Spring Boot, Jakarta EE (in progress) |
| Persistence | JDBC, JPA, Hibernate |
| Frontend | HTML/CSS, Angular, React |
| Database | MySQL |
| App Server | GlassFish 8 (local) |
| Desktop | Java Swing |

## Contact

- GitHub: [@rikrd19](https://github.com/rikrd19)

---

_This README will be updated as new course modules are completed._
