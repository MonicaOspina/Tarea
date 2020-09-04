Ejercicios

1. La parte teórica se encuentra en el archivo MONICAPATRICIAOSPINACEBALLOS.PUNTO1

2. Es la parte de los programas:
Para correr los programas se clonan desde mi repositorio con git clone https://github.com/MonicaOspina/Tarea.git
y ya teniendo el archivo remotamente en su computador puede probar los programas,los cuales fueorn hechos en java.
Puede usar eclipse, intellij, correrlo por consola o con cualquie programa que corra JAVA 

Punto1 del ejercicio

INICIO
  leer distancia a recorrer en km
  leer numero de días de estancia
  si distancia >100 y estancia >7
    costo = (distancia*35)-0.3*(distncia*35))
  sino
    costo = (distancia*35)
FIN

Punto2 del ejercicio

INICIO
  minimopeso=18000
  maximopeso=0
  totalcosto=0
  totalpeso=0
  mientras(opcion!=3)
    lee peso
	si (peso>0){
	 error}
        si (peso>1800){
	  error}
	suma peso
	suma bultos
	si(peso<minimopeso){
	 minimopeso=peso}
	si(peso>maximopeso){
	 maximopeso=peso}
	si (0<=peso<=25){
	  costo=0}
        si (26<=peso<=300){
	  costo=peso*1500
	   totalcosto=toatlcosto+costo}
	si (301<=peso<=500){
	  costo=peso*2500
           totalcosto=toatlcosto+costo}
	caso 2: muestra calculos
	  totalpeso,
	  numero de bultos
	  totalcosto en peso y dolares,
	  minimopeso,
	  maximobulto,
	  promedio de bulto
	caso 3 exit
FIN

y su respectiva tabla para hacerle la prueba de escritorio es la siguiente:

Peso     Costo
1         0
Peso     Costo
26        3900
Peso     Costo
500       1250000
Peso     Costo
300       750000
Peso     Costo
25        0
Peso     Costo
100       150000
Peso     Costo
345       862500
Peso     Costo
301       752500
Peso     Costo
0         0
Peso     Costo
450       1125000
Peso     Costo
120       180000
Peso     Costo
200       300000
Peso     Costo
69        103500
80        120000
43        64500
33        49500
24        0
32        48000
11        0
