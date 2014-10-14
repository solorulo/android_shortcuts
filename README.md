#_Shortcuts_ en Android

Las aplicaciones de Android pueden crear diferentes **_shortcuts_** en el **_launcher_** del dispositivo en el que se ejecutan. Estos _shortcuts_ pueden estar enlazados a diferentes tareas que puede realizar el sistema operativo como por ejemplo lanzar o ejecutar aplicaciones. 

Cabe señalar que esos _shortcuts_ solo pueden ser removidos por la misma aplicación que las creó o en su defecto por acción del sistema operativo, pero no pueden ser removidos por otra aplicación que no los creo. 

##_Shortcuts_ rotos
Por diferentes razones, los _shortcuts_ que lanzan aplicaciones podrían estar rotos, es decir, que no encuentran la actividad y/o el paquete para el que fueron creados.

Para solucionar posibles _shortcuts_ rotos en el launcher de Android existen 3 posibles soluciones:
* Desinstalar la aplicación destino. Esto removerá todos los _shortcuts_ direccionados a el paquete de la apicación.
* Hacer que la actividad destino de la aplicación (a la que apunta el _shortcut_)  vuelva a existir. Esto significa que si un _shortcut_ apunta al paquete _com.ejemplo.app1_ con la actividad _MainActivity_, debemos crear la actividad en cuestión. Una vez que creamos _com.ejemplo.app1.MainActivity_ podemos hacer con esta misma lo que queramos, por ejemplo, redireccionar a otra actividad nueva.
* La peor solución es solamente crear un nuevo _shortcut_ a la aplicación deseada, pero esto implica dejar el _shortcut_ roto en el _launcher_.

