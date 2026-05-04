Automatización de pruebas con Selenium y JUnit 5 - SauceDemo

En esta práctica he desarrollado la automatización de pruebas funcionales sobre la web de SauceDemo utilizando Selenium WebDriver, JUnit 5 y el patrón de diseño Page Object Model. El objetivo ha sido simular el comportamiento de un usuario real dentro de una tienda online, automatizando tanto el inicio de sesión como la interacción con los productos y el carrito de la compra, validando en todo momento el correcto funcionamiento de la aplicación mediante aserciones.

El proyecto se ha realizado en Java 17 utilizando Maven como gestor de dependencias, lo que ha permitido integrar Selenium, JUnit 5 y WebDriverManager de forma sencilla. Gracias a WebDriverManager no ha sido necesario configurar manualmente el driver del navegador, lo que ha simplificado la ejecución de los tests en diferentes entornos.

---

FASE 1: AUTOMATIZACIÓN DE LOGIN

En la primera fase se ha trabajado la parte del inicio de sesión. Para ello se ha creado la clase `LoginPage`, donde se encapsulan los elementos y acciones relacionados con el login. Esta clase permite introducir el usuario, la contraseña y realizar el acceso de forma completa mediante un único método.

Posteriormente, en la clase de pruebas `LoginTest`, se han implementado dos escenarios principales. El primero valida un login correcto utilizando las credenciales proporcionadas (standard_user / secret_sauce) y comprueba que la navegación redirige correctamente a la página de inventario. El segundo caso valida un login incorrecto, verificando que aparece un mensaje de error cuando las credenciales no son válidas.

---

FASE 2: AUTOMATIZACIÓN DE PRODUCTOS

En la segunda fase se ha trabajado con la pantalla de inventario, creando la clase `InventoryPage`. En esta clase se han definido los métodos necesarios para interactuar con los productos, como añadir artículos al carrito o comprobar el estado de los botones.

Se han utilizado productos como “Sauce Labs Backpack” y “Sauce Labs Bike Light” para realizar las pruebas. También se ha implementado la obtención del número de productos en el carrito, lo que permite validar visualmente que las acciones del usuario se reflejan correctamente en la interfaz.

---

FASE 3: PRUEBAS DEL CARRITO

En la clase `InventoryTest` se han desarrollado varios casos de prueba enfocados en la funcionalidad del carrito de compra. Para ello, en todos los casos se realiza primero el login correctamente y después se ejecutan las acciones sobre los productos.

Los escenarios implementados han sido los siguientes:

- Añadir un producto al carrito y comprobar que el contador muestra 1.
- Añadir dos productos al carrito y verificar que el contador muestra 2.
- Comprobar que al añadir un producto el botón cambia de “Add to cart” a “Remove”, validando así el cambio de estado del elemento.

---

ORGANIZACIÓN Y EJECUCIÓN DE LOS TEST

Para la gestión del ciclo de vida de los tests se han utilizado las anotaciones `@BeforeEach` y `@AfterEach`, que permiten abrir el navegador antes de cada prueba y cerrarlo correctamente al finalizar. Esto garantiza que cada test se ejecuta de forma independiente.

Además, se han utilizado aserciones como `assertEquals` y `assertTrue` para validar los resultados esperados en cada caso. La estructura basada en Page Object Model ha permitido separar claramente la lógica de las páginas de la lógica de los tests, haciendo el código más limpio, reutilizable y fácil de mantener.

---

CONCLUSIÓN

Gracias a esta práctica he podido comprender mejor cómo funciona la automatización de pruebas en aplicaciones web reales. He aprendido a estructurar un proyecto de testing de forma profesional utilizando Page Object Model, así como a interactuar con elementos web mediante Selenium y validar comportamientos con JUnit 5.

También he entendido la importancia de organizar correctamente el código para que sea escalable y mantenible, separando responsabilidades entre páginas y tests, lo que facilita futuras ampliaciones o modificaciones del proyecto.

---

IMÁGENES

- Dependencias
<img width="616" height="888" alt="Dependencias" src="https://github.com/user-attachments/assets/503a7645-68d1-43cc-8280-04359122fb33" />

- LoginPage
<img width="630" height="874" alt="LoginPage" src="https://github.com/user-attachments/assets/217ef51e-07fd-41ad-81ff-67d55556ab19" />

- LoginTest
<img width="577" height="913" alt="LoginTest" src="https://github.com/user-attachments/assets/04a5babd-9cd4-402b-9cab-200364759b22" />

- InventoryPage
<img width="656" height="752" alt="InventoryPage" src="https://github.com/user-attachments/assets/5c38f898-38af-4382-8e5d-5c7c03a3fd8e" />

- InventoryTest
<img width="625" height="881" alt="InventoryTest" src="https://github.com/user-attachments/assets/bc800df3-68b3-4cae-a5c9-9df4347cb066" />





