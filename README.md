# concurrencia
Uso de hilos y sincronización en Java 

Dentro del proyecto Maven hay varios ejemplos, uno por cada paquete, donde se explican diversos mecanismos de uso de los hilos y la sincronización:

## hilos
Manipulación básica de hilos mediante los objetos `Thread` y `Runnable` [(video explicativo)](https://youtu.be/UyYv6OfCEKo)

## candado
Sincronización mediante candados de uso exclusivo con `ReentrantLock` [(video explicativo)](https://youtu.be/BzryUZQQHHY)

## candado_rw
Sincronización eficiente con candados de lectura-escritura (múltiples lectores, escritor único) usando `ReentrantReadWriteLock` [(video explicativo)](https://youtu.be/U78PUTafrOI)

## barrera
Coordinación de esperas entre hilos utilizando `CountDownLatch` [(video explicativo)](https://youtu.be/8No0A6T3PKg)

## cola
Productores-consumidores múltiples, coordinados mediante el uso de colas con `LinkedBlockingQueue` [(video explicativo)](https://youtu.be/cK5xK-_sZPM)

## deadlock
Ejemplificación y solución de base para el problema del Deadlock al existir múltiples recursos compartidos y múltiples hilos adquiriéndolos [(video explicativo)](https://youtu.be/_cio2dG1-_Q)
