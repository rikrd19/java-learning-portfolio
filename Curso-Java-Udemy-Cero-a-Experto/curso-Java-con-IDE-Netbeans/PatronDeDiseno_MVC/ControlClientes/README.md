# Control de Clientes

Aplicación web Java para la **gestión de clientes** (CRUD) implementada con el patrón de diseño **MVC** (*Model-View-Controller*). El proyecto forma parte del curso **Java de Cero a Experto** (Udemy), módulo de **Patrones de Diseño MVC** con **NetBeans**, **GlassFish** y **MySQL**.

## Descripción

Sistema web que permite administrar un catálogo de clientes: listarlos, agregar nuevos registros, editar información existente y eliminar clientes. La interfaz usa **Bootstrap 5** con tema oscuro y la lógica de negocio se separa en capas siguiendo MVC.

## Tecnologías

| Tecnología | Versión / detalle |
|---|---|
| Java | 21 |
| Jakarta EE | 9.1 (Servlets, JSP) |
| JSTL + EL | 3.0 |
| Bootstrap | 5.3 |
| MySQL | 8.x |
| Apache Commons DBCP2 | 2.12 (pool de conexiones) |
| GlassFish | 8.0 |
| Maven | WAR packaging |

## Arquitectura MVC

```
┌─────────────┐     ┌──────────────────────┐     ┌─────────────┐
│    VISTA    │ ◄── │     CONTROLADOR      │ ──► │    MODELO   │
│  JSP + CSS  │     │  ServletControlador  │     │ ClienteDAO  │
└─────────────┘     └──────────────────────┘     └──────┬──────┘
                                                          │
                                                          ▼
                                                   ┌─────────────┐
                                                   │   MySQL     │
                                                   │ control_    │
                                                   │ clientes    │
                                                   └─────────────┘
```

| Capa | Responsabilidad | Ubicación |
|---|---|---|
| **Modelo** | Entidad `Cliente` y acceso a datos (`ClienteDAO`, `Conexion`) | `src/main/java/avilawebservice/modelo/` y `.../datos/` |
| **Vista** | Páginas JSP con Bootstrap y fragmentos reutilizables | `src/main/webapp/` |
| **Controlador** | Servlets que procesan peticiones HTTP y coordinan flujo | `src/main/java/avilawebservice/web/` |

## Estructura del proyecto

```
ControlClientes/
├── pom.xml
├── nb-configuration.xml
├── src/main/
│   ├── java/avilawebservice/
│   │   ├── modelo/
│   │   │   └── Cliente.java
│   │   ├── datos/
│   │   │   ├── Conexion.java
│   │   │   └── ClienteDAO.java
│   │   └── web/
│   │       ├── RootServlet.java
│   │       └── ServletControlador.java
│   ├── resources/META-INF/
│   │   └── persistence.xml
│   └── webapp/
│       ├── clientes.jsp
│       └── WEB-INF/
│           ├── web.xml
│           ├── glassfish-web.xml
│           └── paginas/
│               ├── cliente/
│               │   ├── listadoClientes.jsp
│               │   ├── agregarCliente.jsp
│               │   └── editarCliente.jsp
│               └── comunes/
│                   ├── cabecero.jsp
│                   ├── piePagina.jsp
│                   ├── botonesNavegacion.jsp
│                   └── botonesNavegacionEdicion.jsp
└── README.md
```

## Funcionalidades

- Listar clientes en tabla con nombre, apellido y saldo
- Mostrar totales: cantidad de clientes y saldo acumulado
- Agregar cliente mediante modal (formulario POST)
- Editar cliente con datos precargados desde la base de datos
- Eliminar cliente con confirmación implícita por enlace
- Redirección automática desde `/` hacia el listado principal

## Base de datos

### Crear esquema

```sql
CREATE DATABASE IF NOT EXISTS control_clientes;
USE control_clientes;

CREATE TABLE IF NOT EXISTS clientes (
    id_clientes INT AUTO_INCREMENT PRIMARY KEY,
    nombre      VARCHAR(100) NOT NULL,
    apellido    VARCHAR(100) NOT NULL,
    email       VARCHAR(100) NOT NULL,
    telefono    VARCHAR(20)  NOT NULL,
    saldo       DOUBLE       NOT NULL
);
```

> **Importante:** la columna de identificador en MySQL se llama `id_clientes` (con **s** al final). El modelo Java usa `idCliente`, pero las consultas SQL del DAO deben coincidir con el nombre real de la columna en la base de datos.

### Configuración de conexión

Editar `src/main/java/avilawebservice/datos/Conexion.java`:

```java
private static final String JDBC_URL = "jdbc:mysql://localhost:3306/control_clientes?...";
private static final String JDBC_USER = "root";
private static final String JDBC_PASSWORD = "tu_password";
```

## Requisitos previos

- JDK 21
- Maven 3.8+
- MySQL 8 en ejecución
- GlassFish 8 configurado en NetBeans o IntelliJ
- Base de datos `control_clientes` creada con la tabla `clientes`

## Instalación y ejecución

### 1. Clonar o abrir el proyecto

```bash
cd PatronDeDiseno_MVC/ControlClientes
```

### 2. Configurar MySQL

Crear la base de datos y la tabla con el script de la sección anterior. Ajustar usuario y contraseña en `Conexion.java`.

### 3. Compilar con Maven

```bash
mvn clean package
```

El artefacto generado queda en `target/ControlClientes-1.0.war`.

### 4. Desplegar en GlassFish

**NetBeans:** clic derecho en el proyecto → *Clean and Build* → *Run*.

**Manual:** desplegar el WAR en GlassFish Admin Console o copiarlo a `glassfish/domains/domain1/autodeploy/`.

### 5. Acceder a la aplicación

| URL | Descripción |
|---|---|
| `http://localhost:8080/ControlClientes/` | Redirige al listado |
| `http://localhost:8080/ControlClientes/ServletControlador` | Listado de clientes |
| `http://localhost:8080/ControlClientes/ServletControlador?accion=editar&idCliente=1` | Editar cliente |

> El puerto y el context path pueden variar según la configuración del servidor.

## Flujo de peticiones

| Acción | Método | Parámetro `accion` | Resultado |
|---|---|---|---|
| Listar | GET | `listar` (por defecto) | Muestra `clientes.jsp` |
| Editar | GET | `editar` + `idCliente` | Formulario de edición |
| Eliminar | GET | `eliminar` + `idCliente` | Borra y vuelve al listado |
| Insertar | POST | `insertar` | Crea cliente y lista |
| Modificar | POST | `modificar` | Actualiza y lista |

## Dependencias principales (Maven)

- `mysql-connector-j` — driver JDBC para MySQL
- `jakarta.jakartaee-api` — API de Servlets/JSP (scope `provided` en GlassFish)
- `commons-dbcp2` — pool de conexiones
- `jakarta.servlet.jsp.jstl-api` + implementación GlassFish — etiquetas JSTL en JSP

## Notas de desarrollo

- El listado envía datos a la vista mediante atributos de **sesión HTTP** (`HttpSession`).
- `RootServlet` mapeado a `/` redirige a `ServletControlador`.
- Los JSP de contenido están protegidos bajo `WEB-INF/paginas/` y se incluyen desde `clientes.jsp`.
- El proyecto usa anotaciones `@WebServlet`; `web.xml` solo define timeout de sesión (30 min).

## Autor

**Ricardo Ávila** — Proyecto de aprendizaje Java (Udemy / Patrón MVC).

## Licencia

Proyecto educativo de uso personal y formativo.
