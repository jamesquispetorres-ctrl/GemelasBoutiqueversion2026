# 💎 GESTIONA TU BOUTIQUE - Sistema de Gestión & Retail de Moda

[![Java 21](https://img.shields.io/badge/Java-21-orange.svg?style=flat-square&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-brightgreen.svg?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-Ready-blue.svg?style=flat-square&logo=docker)](https://www.docker.com/)
[![Render](https://img.shields.io/badge/Deployed%20on-Render-46E3B7.svg?style=flat-square&logo=render)](https://gemelasboutiqueversion2026.onrender.com/)
[![Responsive](https://img.shields.io/badge/Responsive-Mobile--First-ff69b4.svg?style=flat-square&logo=css3)](https://gemelasboutiqueversion2026.onrender.com/)

Plataforma Web integral diseñada para la gestión comercial, inventario de prendas exclusivas, cartera de clientas VIP, punto de venta express (POS) y administración de personal para boutiques de moda y casas de alta costura.

🌐 **Demo en Vivo en la Nube**: [https://gemelasboutiqueversion2026.onrender.com/](https://gemelasboutiqueversion2026.onrender.com/)

---

## 🌟 Características Principales

- 🛍️ **Punto de Venta Express (POS)**: Búsqueda rápida por categoría/color, carrito dinámico, cálculo instantáneo de IGV, método de pago (Efectivo, Yape/Plin, Tarjeta VIP) y emisión de comprobantes.
- 👗 **Catálogo Comercial con Filtros**: Gestión de colecciones en tonos pasteles, precios, stock en tiempo real y modal interactivo para agregar prendas.
- 👑 **Cartera de Clientas VIP**: Registro completo de clientas, preferencia de tallas, nivel de membresía (Silver, Gold, Platinum) e historial de compras.
- 💼 **Gestión de Personal & Equipo**: Administración de Asesoras de Imagen, Supervisoras de Tienda y Administradoras con asignación de roles.
- 🔑 **Cuentas de Acceso & Roles**: Seguridad con control de permisos según el perfil (Admin, Supervisora, Asesora POS).
- 📊 **Dashboard Ejecutivo en Tiempo Real**: Métricas comerciales principales, recaudación diaria, ticket promedio y ranking de prendas más vendidas.
- 📱 **Diseño 100% Adaptativo & Responsive**: Optimizado para Smartphones, Tabletas, iPads y Computadoras de Escritorio con Menú Hamburguesa interactivo y navegación móvil táctil.

---

## 🛠️ Tecnologías Utilizadas

### **Backend**
- **Lenguaje**: Java 21 LTS
- **Framework**: Spring Boot 3.4.1
- **Persistencia / Base de Datos**: Spring Data JPA / H2 In-Memory Database (desarrollo y demo)
- **Documentación API**: OpenAPI 3 / Swagger (`/swagger-ui/index.html`)

### **Frontend**
- **Arquitectura**: HTML5 Semántico + Vanilla CSS3 (Variables HSL/Hex, Glassmorphism, Micro-animaciones Ken-Burns).
- **Iconografía & Tipografía**: FontAwesome 6, Google Fonts (*Cormorant Garamond* & *Plus Jakarta Sans*).
- **Lógica**: JavaScript ES6+ asíncrono con `fetch` API y reactividad nativa.

### **Despliegue & DevOps**
- **Contenedorización**: Multi-stage Dockerfile con Maven Alpine.
- **Hosting en la Nube**: Render Cloud Web Service con autoscaling y SSL automático.

---

## 🚀 Guía de Instalación y Ejecución Local

### **Requisitos Previos**
- JDK 21 o superior instalado.
- Git.
- (Opcional) Docker Desktop.

### **1. Clonar el repositorio**
```bash
git clone https://github.com/jamesquispetorres-ctrl/GemelasBoutiqueversion2026.git
cd GemelasBoutiqueversion2026/ProyectoGemelasBoutique
```

### **2. Ejecutar con Maven Wrapper (Windows)**
```cmd
.\mvnw.cmd spring-boot:run
```

En **Linux / macOS**:
```bash
./mvnw spring-boot:run
```

Abre tu navegador en: `http://localhost:8080/`

---

## 🐳 Ejecución con Docker

### **1. Construir la imagen Docker**
```bash
docker build -t gestiona-tu-boutique .
```

### **2. Iniciar el contenedor**
```bash
docker run -d -p 8080:8080 --name boutique-app gestiona-tu-boutique
```
Accede en: `http://localhost:8080/`

---

## 🔌 Endpoints de la API REST

| Módulo | Método | Endpoint | Descripción |
| :--- | :--- | :--- | :--- |
| **Ventas** | `GET` | `/api/ventas` | Obtener todas las ventas registradas |
| | `POST` | `/api/ventas` | Registrar una nueva venta (Ticket POS) |
| **Clientes** | `GET` | `/api/clientes` | Lista de clientas VIP |
| | `POST` | `/api/clientes` | Registrar nueva clienta |
| **Empleados** | `GET` | `/api/empleados` | Lista de personal del atelier |
| | `POST` | `/api/empleados` | Registrar nueva colaboradora |
| **Usuarios** | `GET` | `/api/usuarios` | Perfiles de acceso al sistema |
| | `POST` | `/api/usuarios` | Crear usuario con rol asignado |

---

## 📱 Experiencia Móvil & Adaptabilidad

- **Menú Hamburguesa Animado**: Desplegable lateral fluido para pantallas móviles y tablets (`<= 992px`).
- **Navegación Táctil**: Tablas con desplazamiento horizontal suave y botones optimizados para interacción táctil.
- **Fondo Cinematográfico en Login**: Redimensionamiento inteligente con animación Ken-Burns para cualquier resolución.

---

## ✒️ Autor y Créditos

Proyecto desarrollado para el **Sistema de Gestión Gemelas Boutique 2026**.
- **Repositorio GitHub**: [jamesquispetorres-ctrl/GemelasBoutiqueversion2026](https://github.com/jamesquispetorres-ctrl/GemelasBoutiqueversion2026)
