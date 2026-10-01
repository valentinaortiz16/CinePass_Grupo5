# CinePass – Sistema de venta de boletos de cine

## Integrantes
- Sandra Aululema
- Anthony Armas
- Joselyn Guaman
- Andres Vayas

## Ejercicio asignado
**Grupo 5 – CinePass: Cine.**

Programa en Java que simula la venta de boletos de un cine. Por cada venta
solicita el **id del boleto**, la **edad**, el **tipo de sala** y el **día**.
Usa un `switch` para determinar el precio según la sala, aplica descuentos por
edad y por día miércoles, y valida que la edad esté entre 1 y 110. Las ventas se
repiten con un `while` hasta que se ingrese el centinela **id = 0**. Al finalizar
muestra:
- El recaudo total.
- La cantidad de boletos vendidos en sala IMAX.
- El boleto de menor valor.

### Reglas usadas ⚠️ (ajustar a su código)
| Sala | Precio base |
|------|-------------|
| 1 – Normal | $5.00 |
| 2 – 3D | $7.00 |
| 3 – IMAX | $10.00 |

- Descuento por edad: 30 % para menores de 12 años y para mayores de 60 años.
- Descuento de miércoles: 20 % adicional sobre el precio ya calculado.
- Edad válida: de 1 a 110 años.

## Instrucciones para ejecutar

### Requisitos
- Java JDK 17 o superior (o la versión que usen).

### Compilar

javac CinePass.java


### Ejecutar

java CinePass


### Uso
1. Ingresar el id del boleto (un número entero; **0 para terminar**).
2. Ingresar la edad (1 a 110).
3. Elegir el tipo de sala (1 = Normal, 2 = 3D, 3 = IMAX).
4. Ingresar el día de la semana.
5. Al ingresar id = 0 se muestra el resumen final.

## Casos de prueba

### Caso 1: venta normal, sin descuentos
- **Entrada:** id = 101, edad = 30, sala = 3 (IMAX), día = jueves, luego id = 0
- **Salida esperada:**
  - Valor del boleto 101: $10.00
  - Recaudo total: $10.00
  - Boletos IMAX: 1
  - Boleto de menor valor: 101 ($10.00)

### Caso 2: descuento por edad y miércoles
- **Entrada:** id = 102, edad = 8, sala = 2 (3D), día = miércoles, luego id = 0
- **Salida esperada:**
  - Valor del boleto 102: $3.92 ($7.00 – 30 % = $4.90; – 20 % = $3.92)
  - Recaudo total: $3.92
  - Boletos IMAX: 0
  - Boleto de menor valor: 102 ($3.92)

### Caso 3: edad inválida
- **Entrada:** id = 103, edad = 150
- **Salida esperada:** mensaje de error indicando que la edad debe estar entre
  1 y 110, y el programa vuelve a pedir la edad sin registrar la venta.
  Si luego se ingresa edad = 65, sala = 1 (Normal), día = sábado, el valor es
  $3.50 ($5.00 – 30 %).
