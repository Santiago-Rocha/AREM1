# Laboratorio 1
Este proyecto ofrece cálculos estadísticos básicos como la media y la desviación estándar de un conjunto de números

## Prerrequisitos
Es necesario tener instalado Java 1.8 y Apache Maven 3.6.0
## Descripción
### Lista Encadenada 
El proyecto contiene una lista encadenada que contiene nodos y una cabeza. La cabeza da la lista tiene referencias al primer y último nodo.

![image](https://user-images.githubusercontent.com/13685178/63139762-0a9bc300-bfa5-11e9-8d54-96cef4462b79.png)

Cada nodo de la lista tiene el valor que le corresponde y una referencia al siguiente nodo, en caso de que la referencia sea nula este es el último elemento de la lista

![image](https://user-images.githubusercontent.com/13685178/63139832-5484a900-bfa5-11e9-92b6-af3128de431d.png)

### Operaciones
La media fue calculada utilizando la siguiente formula

![image](https://user-images.githubusercontent.com/13685178/63140069-29e72000-bfa6-11e9-8478-7d15f11e9547.png)

la desviación estándar fue calcualada utilizando la sigueinte formula

![image](https://user-images.githubusercontent.com/13685178/63140033-0f14ab80-bfa6-11e9-83cf-7c807f1acb7a.png)


## Diseño
![image](https://user-images.githubusercontent.com/13685178/63140936-46388c00-bfa9-11e9-8b80-a537c5c835b9.png)

## Ejecutar
### Descagar dependencias y compilar
```
mvn package
```
### Ejecutar test de unidad
```
mvn test
```
### Documentación
```
mvn javadoc:jar
```
La documentación generada por el comando anterior se encuentra en la ruta **target\apidocs**
### Ejecutar
```
java -cp target\psp0-1.0-SNAPSHOT.jar edu.escuelaing.arem.App
```
## Autor 
Santiago Rocha Durán - Escuela Colombiana de Ingenieria Julio Garavito
## Licencia
Este proyecto está licenciado bajo GNU General Public License - ver [LICENSE](https://github.com/Santiago-Rocha/AREM1/blob/master/LICENSE.txt) para más detalles 


