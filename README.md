# poo_calculadora

Ejemplo mínimo de una ventana JavaFX con FXML: una vista, un controlador y operaciones básicas. Es una **demostración** para ver cómo se conectan `fxml`, controlador y `Application`; no incluye capas de modelo, repositorio ni persistencia (para eso, ver [poo_examples](https://github.com/donkiwicl/poo_examples)).

| | |
|---|---|
| **JDK** | 21 |
| **JavaFX** | 21.0.6 (la versión mayor de JavaFX debe coincidir con la del JDK) |
| **Maven** | Incluye el *wrapper*: `./mvnw` (o `mvnw.cmd` en Windows) |

```bash
./mvnw javafx:run     # ejecuta la aplicación
./mvnw verify         # compila y empaqueta
```

Cada *push* y *pull request* se valida con GitHub Actions (`.github/workflows/build.yml`).
