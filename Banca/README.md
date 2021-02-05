## CLASES

### NUM ESTADOCUENTA

### CUENTA

- Titular titular, double saldo, Fecha fecha, String nCuenta
- Constructor(todo), Constructor(titulos y saldo), ArrayList movimiento que registre todos los datos
- reintegro(valor:double), ingreso(valor:double) (registra el movimiento), getter, setter, transferencia(cuenta emisor, cuenta receptor, cantidad), imprimirTitularySaldo, metodo ComparaCuentas, metodo enviarTransferencia(destino, importe) y recibirTransferencia(origen, saldo)

### Titular

- nombre (String), apellidos (String), numero de identificación (String), edad (int)
- Constructor, getter, setter, toString
- imprimirTitular = Nombre Apellidos Edad

### Fecha

- dia, mes y año (integer). (date, calendar)
- Constructores, getter , setter, tostring, comprobarfechaCorrecta

### Movimiento

- Fecha fecha, char Movimiento(R o I), importe real y saldo
- Constructor, fechaCorrecta().

### PruebaCuentas (TEST)

### CuentaAhorro

#### Comparacion con compareTo(String)
