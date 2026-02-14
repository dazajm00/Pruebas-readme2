# Taller de nivelación.

## Parte teórica.

### 1. ¿Qué es markdown?

Markdown es un lenguaje de marcado ligero creado por Jhon Gruber en 2004.
Su proposito es permitir escribir texto plano fácil de leer y luego convertirlo en HTML válido para mostrarlo en páginas web.

### 2. GIT.

1. ¿Qué es un repositorio y como se diferencia de un proyecto normal?.
- Un repositorio es un espacio digital donde se guarda y organiza todo el código, archivos y documentación de un proyecto. Funciona como una “base de datos” que además registra cada cambio que se hace, quién lo hizo y cuándo, gracias al sistema de control de versiones.

2. ¿Cuales son las 3 áreas principales de git (working directory,staging area/index y repository) y que papel cumple cada una?.

- Working directory: Es la copia de los archivos del proyecto que tienes en tu computadora, aqui editas, creas o eliminas archivos. Los cambios aún no forman parte del historial oficial de Git, solo son modificaciones locales visibles.
- Staging area: Es una zona intermedia donde seleccionas qué cambios quieres incluir en el próximo commit, permite preparar y organizar los cambios antes de confirmarlos.
-  Repository: Es donde Git guarda de manera definitiva los cambios confirmados (commits).
Contiene el historial completo del proyecto: qué se cambió, cuándo y quién lo hizo y
Se almacena en la carpeta oculta .git dentro de tu proyecto.

3. ¿Cómo representa git los cambios internamente? (objetos blobb, tree, commit y tag).
- Objetos blobb: Contiene el contenido de un archivo (texto, código, etc.).
No guarda el nombre del archivo, solo los datos.
   - Ejemplo: si tienes un archivo hola.txt con la frase “Hola mundo”, Git lo guarda como un blob con ese contenido.
- Tree: representa la estructura de directorios.
Contiene referencias a blobs (archivos) y a otros trees (subcarpetas).
Guarda los nombres de los archivos y carpetas, además de los permisos.

   - Ejemplo: un tree puede decir “hola.txt → blob123” y “imagenes/ → tree456”.
- Commit: Es un snapshot del proyecto en un momento específico.
Contiene:
    - Referencia al tree que representa el estado del proyecto.
    - Metadatos como autor, fecha y mensaje.
    - Referencias a commits anteriores (padres).

4. ¿Cómo se crea un commit y qué información almacena un objeto commit?.
- Se crea con el comando:
```
# git commit -m "Mensaje descriptivo"

```

- Un objeto commit guarda:

  - Referencia al tree (estado de archivos y carpetas).

  - Autor y fecha.

  - Mensaje del commit.

  - Puntero(s) al commit anterior (historial).

5. ¿Cual es la diferencia entre git fetch y git pull?

- git fetch: descarga los cambios del repositorio remoto, pero no los mezcla con tu rama local. Solo actualiza las referencias.

- git pull: hace lo mismo que fetch, pero además fusiona automáticamente esos cambios en tu rama actual.

6. ¿Qué es un branch (rama) en Git y cómo gestiona los punteros a commits?.
- Una rama es un puntero móvil a un commit específico.

- Al crear una rama, Git genera un nuevo puntero que puede avanzar conforme haces nuevos commits.

  - Ejemplo: la rama main apunta al último commit de la línea principal; si creas feature-x, apunta a otro commit y avanza con tus cambios.

7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
- Se hace con:
```
# git merge nombre-rama
```
- Git intenta combinar los cambios de ambas ramas.
- Conflictos: ocurren cuando dos ramas modifican la misma parte de un archivo de forma diferente.
- Resolución: editar manualmente el archivo, decidir qué versión conservar, y luego hacer un commit que cierre el merge.

8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
- El staging area es una zona intermedia donde seleccionas qué cambios quieres incluir en el próximo commit.
```
# Con: git add archivo.txt pasas ese archivo al área de preparación.
```
- Si omites este paso, los cambios no se guardan en el commit, aunque sí existen en tu directorio de trabajo.
9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
- El archivo .gitignore es un archivo de texto que se coloca en la raíz de tu repositorio Git y sirve para indicar qué archivos o carpetas no deben ser rastreados por Git.
- Es un archivo de texto donde indicas qué archivos o carpetas quieres que Git ignore.
  - Ejemplo: *.log o node_modules/.
- Así evitas que archivos temporales, binarios o dependencias innecesarias entren al historial del proyecto.
10. Diferencia entre un “commit amend” (--amend) y un nuevo commit.
- git commit --amend: modifica el último commit (puedes cambiar el mensaje o añadir archivos olvidados) 
```
Usar --amend es útil para corregir errores pequeños sin ensuciar el historial
```
- Nuevo commit: crea un registro adicional en el historial.
11. ¿Cómo se utiliza git stash y en qué escenarios es útil?. 
- git stash guarda temporalmente tus cambios sin hacer commit y limpia tu directorio de trabajo.
- Luego puedes recuperarlos con git stash pop.
  - Escenario típico: estás trabajando en algo, pero necesitas cambiar de rama sin perder tus avances.
12. Mecanismos para deshacer cambios.
- git reset: mueve el puntero de la rama a un commit anterior (puede borrar cambios).

- git revert: crea un nuevo commit que deshace los cambios de uno anterior (más seguro en repositorios compartidos).

- git checkout: restaura archivos individuales a su estado anterior.
13. Configuración de remotos (origin, upstream) y gestión de forks
- origin: nombre por defecto del repositorio remoto principal.

- upstream: se usa en proyectos forkeados para referirse al repositorio original.
- Comandos útiles: 
```
 # git remote add origin URL

 # git remote add upstream URL

 # git fetch upstream

 # git merge upstream/main
  ```
14. ¿Cómo inspeccionar el historial de commits?.
- git log: muestra la lista de commits con autor, fecha y mensaje.

- git diff: compara cambios entre commits o ramas.

- git show commitID: muestra detalles de un commit específico.
