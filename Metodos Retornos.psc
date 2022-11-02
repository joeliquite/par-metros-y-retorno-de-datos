
//--------------------------------Suma-------------------------------

Funcion Suma(operandoUno, operandoDos)
	
	Definir  resultado Como Real
	Escribir "Ingrese el primer valor"
	Leer operandoUno
	Escribir  "Ingrese el segundo valor"
	Leer operandoDos
	
	resultado <- operandoUno + operandoDos
	
	Escribir  " La suma es: " ,resultado
	
FinFuncion
//--------------------------------Resta------------------------------

Funcion Resta(operandoUno, operandoDos)
	
	Definir  resultado Como Real
	Escribir "Ingrese el primer valor"
	Leer operandoUno
	Escribir  "Ingrese el segundo valor"
	Leer operandoDos
	
	resultado <- operandoUno - operandoDos
	
	Escribir  " La Resta es: " ,resultado
	
FinFuncion
//--------------------------------Multipliación ------------------------------
Funcion Multi(operandoUno, operandoDos)
	
	Definir  resultado Como Real
	Escribir "Ingrese el primer valor"
	Leer operandoUno
	Escribir  "Ingrese el segundo valor"
	Leer operandoDos
	
	resultado <- operandoUno * operandoDos
	
	Escribir  " La Multiplicacion  es: " ,resultado
	
FinFuncion
//-----------------------------division-----------------------------------------
Funcion Division(operandoUno, operandoDos)
	
	Definir  resultado Como Real
	Escribir "Ingrese el primer valor"
	Leer operandoUno
	Escribir  "Ingrese el segundo valor"
	Leer operandoDos
	
	resultado <- operandoUno / operandoDos
	
	Escribir  " La Division es: " ,resultado
	

FinFuncion

Algoritmo calculadora
	definir num1, num2 como real
	
	Definir operacion Como Entero
	Escribir "Calculadora"
	escribir "1. Suma"
	escribir "2. Resta"
	Escribir "3. Multiplicación"
	escribir "4. Division"
	Escribir "Seleccione una Opcion "
	
	
	Leer operacion
	
	Segun operacion Hacer
		1: Suma(num1,num2)
		2: Resta(num1,num2)
		3: Multi(num1,num2)
		4: Division(num1,num2)
	FinSegun
	
FinAlgoritmo