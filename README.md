# MiParqueo App: snapshot Java, HTML y CSS

## Identificacion

- Repositorio: https://github.com/probandoel44/app-mi-parqueo-javaScript-y-css-master
- Rama revisada: `main`
- Commit base revisado: `0f3666c057af7e7c78a07613d17238f37dc93230`
- Los archivos estan dentro de `app-mi-parqueo-javaScript-y-css-master/`.
- Es un snapshot anterior; no sustituye al candidato integrado: https://github.com/probandoel44/Desarrollar-software-a-partir-de-la-integraci-n-de-sus-m-dulos-componentes

## Arquitectura observada

El codigo usa Java 17, Spring Boot 2.5.14, Spring Web, Spring Data JPA, Validation, Thymeleaf, Lombok y MySQL Connector/J en `pom.xml`. La configuracion apunta a `appmiparqueo_db`, puerto `8081` y `ddl-auto=update`.

Capas encontradas:

- Controladores: usuario, ocupacion, movimientos, alertas, pagos, ubicacion, fidelizacion y login.
- Modelo: entidad `Usuarios`.
- Repositorio: `UsuariosRepository`.
- Vistas: HTML y Thymeleaf bajo `src/main/resources/templates` y `static`.
- Pruebas: una clase `AppmiparqueoApplicationTests` que solo carga el contexto.

## Entradas y salidas

| Componente | Entrada observada | Resultado/estado real |
| --- | --- | --- |
| Usuarios REST | JSON de usuario; `id` para consultas y cambios. | CRUD en `/api/usuarios`; DELETE usa `deleteById` y devuelve una operacion sin cuerpo. |
| Login | Datos enviados por el formulario segun la vista encontrada. | Debe contrastarse con `LoginController`; no declarar autenticacion aprobada sin prueba. |
| Ocupacion | No requiere datos funcionales en el controlador revisado. | Devuelve la vista y contiene un TODO para cargar datos reales. |
| Movimientos | No requiere datos funcionales en el controlador revisado. | Devuelve la vista y contiene un TODO para cargar movimientos. |
| Alertas, pagos y fidelizacion | Rutas segun controladores, sin persistencia completa revisada en el modelo/repositorio. | Resultados pendientes de integracion y prueba. |

En este snapshot no se encontraron entidades ni repositorios de reservas, puestos, movimientos, pagos o ubicacion. La implementacion completa de R01-R10 no debe atribuirse a esta copia sin cambiar su codigo o integrar otro componente.

## Evidencia SENA

| Elemento | Estado |
| --- | --- |
| Requerimientos oficiales | Pendiente: no se localizo el informe ni `requerimientos.pdf` dentro de esta copia. |
| Acta de aprobacion | Pendiente: no se encontro acta firmada. |
| Control de versiones | Repositorio Git publico, rama `main`, snapshot indicado arriba. |
| Ejecutable | No hay JAR verificado para este commit. |
| URL desplegada | No se encontro URL publica. |
| Pruebas | Solo existe `contextLoads()`; no prueba reservas, usuarios, movimientos ni ocupacion. |
| Servidor/base de datos | Java 17, Spring Boot 2.5.14, MySQL, puerto 8081 y `ddl-auto=update`, segun archivos locales. |
| Ambientes | No hay perfil separado de pruebas ni base de datos de prueba demostrada. |
| Manual tecnico | Esta guia cubre componentes observados; requiere documentar ambiente real y resultados de prueba. |

## Ejecucion local

Desde la subcarpeta `app-mi-parqueo-javaScript-y-css-master/`:

```powershell
.\mvnw.cmd spring-boot:run
```

La configuracion usa el puerto `8081`. Antes de iniciar, prepara una base aislada y configura `spring.datasource.*` sin credenciales reales en el repositorio.

Para construir:

```powershell
.\mvnw.cmd package
```

No afirmar que el JAR existe hasta confirmar `target/*.jar` y asociarlo al commit publicado.

## Pendientes

1. Completar o retirar los TODO de ocupacion y movimientos.
2. Agregar pruebas para el CRUD de usuarios y cada vista operativa.
3. Anadir modelos/repositorios para reservas, puestos, movimientos, pagos y ubicacion si deben entregarse desde esta copia.
4. Adjuntar informes y actas de aprobacion.
5. Definir si esta copia queda como antecedente o se reemplaza por el repositorio canónico.
