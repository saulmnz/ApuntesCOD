## <span style="color: pink;">MERGE NORMAL PASO POR PASO</span>

### AÑADIR CONTENIDO EN LA RAMA MAIN
```bash

echo A > README.md
git add README.md
git commit -m "A" 

echo B >> README.md
git add README.md
git commit -m "B" 
```

### CREAR LA RAMA SECUNDARIA 
```bash
git checkout -b exp 
```
### AÑADIR CONTENIDO A LA RAMA SECUNDARIA
```bash
echo C > readme1.md
git add readme1.md
git commit -m "C" 

echo D >> readme1.md
git add readme1.md
git commit -m "D" 
```

### VOLVER A LA RAMA MAIN/MASTER
```bash
git checkout master 
echo E >> README.md
git add README.md
git commit -m "E" 

git merge --no-commit --no-ff exp 

echo F >> README.md
git add README.md
git commit -m "F" 
```

<BR><BR>


## <span style="color: pink;">MERGE REBASE PASO POR PASO</span>


### EL MERGE REBASE ES LO CONTRARIO AL MERGE NORMAL
En este merge cargaremos la rama principal en la feature.

### Reorganizamos la RAMA :

```bash
# ANTES DEL MERGE 

main: A --- B --- C
                  \
feature/login:     D --- E


# DESPUES DEL MERGE NORMAL

main: A --- B --- C ------- M (merge commit)
                  \       /
feature/login:     D --- E


# SI HUBIESEMOS HECHO UN MERGE REBASE!!!
main: A --- B --- C
                      \
feature/login:         D' --- E' (commits reorganizados sobre C)

```
```bash 
# 1. Creamos y cambiamos a la nueva rama feature

git checkout -b feature 

# 2. Actualiza main con los últimos cambios del remoto ( En caso de que lo necesitemos )

git checkout main
git pull origin main

# 3. Vuelve a feature y haz rebase sobre main

git checkout feature # EL REBASE SE REALIZA DESDE LA RAMA CREADA
git rebase main

# 4. Resuelve conflictos si los hay (se pausa el rebase por cada commit conflictivo)

# - Edita los archivos marcados por Git.

# - Añade los cambios resueltos:
git add nombre-archivo-conflicto

# - Continúa el rebase:
git rebase --continue



# 5. Después del rebase, sube los cambios a GitHub 
git push origin feature --force

```


<BR><BR>


## <span style="color: pink;">MERGE SQUASH PASO POR PASO</span>


### COMMITS Y COMANDOS EN LA "MASTER/MAIN"

### 1ER commit main/master
```bash
"LE AÑADIMOS CONTENIDO AL README"
git add README.md
git commit -m "Primer Commit"
```

### 2dO commit main/master
```bash
"LE AÑADIMOS CONTENIDO AL README"
git add README.md
git commit -m "Segundo Commit"
```




### COMANDOS COLABORADOR

```bash
# Crea la rama de colaborador
git checkout -b colaborador

# commit a 
"LE AÑADIMOS CONTENIDO AL README"
git add README.md
git commit -m "A"

# commit B
"LE AÑADIMOS CONTENIDO AL README"
git add README.md
git commit -m "B"

# commit C
"LE AÑADIMOS CONTENIDO AL README"
git add README.md
git commit -m "C"
git push
```


### UNIR LAS RAMAS CON MERGE

```bash
# Hacer checkout a la rama master
git checkout master

# Merge con la rama colaborador
git merge colaborador

# Hacer el commit del merge
git commit  -m "merge con colaborador"
```



<br><br>

### PARTE DE LIDER

### Creamos la rama en la que vamos a trabajar
```bash 
git checkout -b lider

# hacer un commit
git add .\README.md
git commit -m "L1"


# hacer un commit
```bash 
git add .\README.md
git commit -m "B"


# ultimo commit
git add .\README.md
git commit -m "C"
```

<br><br>

### MERGE DE LA RAMA LIDER

### VAMOS A LA RAMA MAIN
```bash 
git checkout main

# cargamos los cambios del colaborador
git pull

# hacemos el merge squash con la rama lider
git merge --squash líder

# solo faltará corregir los conflictos y ya
git commit -m "squash listo líder"
git push 
```

<BR>


## <span style="color: pink;">.GITIGNORE</span>

### CREAR Y CONFIGURAR ARCHIVO .GITIGNORE

```bash 
touch .gitignore #PARA CREAR EL ARCHIVO EN LA RAIZ DEL PROYECTO
```

<BR>

### ESTO ES LO QUE HABRIA DENTRO DEL FICHERO :
```bash 

# Excluir archivos de compilación de Java ( Aquí añadir los ."extension" que queremos excluir )
*.class
*.jar

# Excluir carpetas de dependencias
node_modules/
bin/

# Excluir archivos de entorno
.env
```

<BR>

### SI YA HEMOS SUBIDO ARCHIVOS NO DESEADOS : 

```bash 
git rm --cached nombre-del-archivo  # Elimina el archivo del repositorio, pero lo mantiene en local

git add .gitignore
                  
git commit -m "Añade .gitignore y elimina archivos no deseados"

git push origin main
```

<BR>

## <span style="color: pink;">TAGS</span>

### CREAR UN TAG EN LOCAL

```bash
git tag -a v1.0 -m "Versión 1.0 estable"  # Crea un tag anotado

#PUEDE TENER CUALQUIER NOMBRE
git tag -a DAM -m "PEPE"   
```

### SUBIRLO AL REPOSITORIO 
```bash
git push origin v1.0  # Sube el tag específico
git push --tags (TAMBIEN SE PUEDE PONER NOMBRE DEL TAG) # Sube todos los tags locales
```

<BR>

## <span style="color: pink;">REVERT</span>

### ELIMINAR EL COMMIT EN ESPECÍFICO SUBIDO AL REMOTO
```bash
# PRIMERO TENDREMOS QUE TENER IDENTIFICAR EL HASH
git log --oneline         # Nos saldrá el registro de commits con sus hash
git revert "commit-hash"    # Crea un nuevo commit que deshace los cambios del commit especificado
git push origin main      # Sube el revert al remoto
```

