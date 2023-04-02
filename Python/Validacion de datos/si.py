#Librerias
import os #se utiliza para llamar el comando correspondiente en el sistema operativo que se ejecuta el programa

#Variables
entrada1="a";entrada2="a"
adm_usuario="Admin"
adm_contrasenia="123456"
user_usuario=""
user_contrasenia=""
opcion=""
usuario_session=""
valida=0

#Procedimientos
def limpiar_consola():
    os.system("cls")

#Funciones
#Cifra una cadena a ascii
def cifrar(entrada):
    salida="";longitud=len(entrada)
    for i in range(1,longitud+1):
        digito=entrada[i-1:i]
        aux=ord(digito)
        salida+=str(aux)+" "
    return salida

#decifra una cadena ascii
def decifrar(entrada):
    salida="";caracter="";longitud=len(entrada)
    for i in range(1,longitud+1):
        digito=entrada[i-1:i]
        caracter+=digito
        if(digito==" "):
            longitud_caracter=len(caracter)
            caracter=caracter[0:longitud_caracter-1]
            salida+=chr(int(caracter))
            caracter=""
    return salida

#validacion del usuario
def valida_usuario(w):
    l=len(w)
    if l>=1:
        for i in range (1, l):
            a=w[i-1:i]
            if a==" ":
                s=False
                return s
            else:
                s=True
    else:
            s=False
    return s
#Validacion de contraseña
def valida_contra(w):
    # Comprobar que la entrada tiene al menos 6 caracteres
    if len(w) < 6:
        return False
    # Comprobar que la entrada contiene al menos una letra y un número
    l = False
    num = False
    for i in w:
        if i.isalpha():
            l = True
        elif i.isnumeric():
            num = True
    return l and num
    
    
    



#valida el usuario y contraña para que introduzca un dato no vacio saber cual de los dos esta iniciando sesion 
while opcion !="4":
    while usuario_session=="":
        entrada1=input("Introduzca el usuario: ")
        entrada2=input("Introduzca la contrasenia: ")
        limpiar_consola()
        if entrada1==adm_usuario and entrada2==adm_contrasenia:
            usuario_session=adm_usuario
            opcion="0"
        elif entrada1==user_usuario and entrada2==decifrar(user_contrasenia):
            usuario_session=user_usuario
            opcion="0"
        else:
            print("El usuario o contraseña es incorrecto")

    #Selecciona la opcion a proceder        
    while opcion !="3":
        print("Bienvenido al sistema: ",usuario_session,"\n1. Crear usuario\n2. Ver usuarios\n3. Cerrar sesion\n4. Terminar Programa")
        opcion=input("Opción: ")
        if opcion=="1":
            valida=0
            while valida==0:
                aux1=input("Introduzca el nombre del usuario: ")
                aux2=input("Introduzca la contraseña: ")
                if valida_usuario(aux1) and valida_contra(aux2):
                    user_usuario=aux1
                    user_contrasenia=cifrar(aux2)
                    valida=1
                else:
                    print("El usuario no debe estar vacio\n La contraseña debe tener 6 o mas caracteres y al menos una letra y un número ")
        elif opcion=="2":
            print("Administrador: ",adm_usuario,"\nContraseña: ",adm_contrasenia)
            print("Usuario: ",user_usuario,"\nContraseña: ",user_contrasenia)
            input()
        elif opcion=="3":
            entrada1="";entrada2="";usuario_session=""
        elif opcion=="4":
            break
        limpiar_consola()