%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Practica 2 Prolog                                   %
% Autor: Karina Urbina Alvarez                        %
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%********************************** Ejercicio 1 **********************************
% Implemente una funcion que calcule la distancia mas corta de un punto a otro en un grafo.

conectado(i,a,50).
conectado(i,b,20).
conectado(a,b,15).
conectado(a,c,25).
conectado(b,f,35).
conectado(b,c,40).
conectado(c,f,5).

ruta(X,Y,Distancia,Ruta):-  %Caso base (X e Y estan conectados)
    conectado(X,Y,Distancia),  
    Ruta = [X, Y].  

ruta(X,Y,Distancia,Ruta):-      %Caso recursivo (X e Y no estan conectados).
    conectado(X,Z,Distancia1),  %Se busca un nodo Z que este conectado con X.
    ruta(Z,Y,Distancia2, RutaRestante),  %Se busca la ruta mas corta entre Z e Y.
    Distancia is Distancia1 + Distancia2,  %Se calcula la distancia total. 
    Ruta = [X | RutaRestante].  %Se concatena la ruta.            

rutaCorta(X,Y,Distancia,Ruta):-  %Se busca la ruta mas corta entre X e Y.
    findall([D, R],              %Se obtienen todas las rutas posibles.    
    ruta(X,Y,D,R), Lista),     %Se guardan en una lista. 
    min_member([Distancia, Ruta], Lista).  %Se obtiene la ruta mas corta de la lista.

%Prueba -> rutaCorta(i,f,D,R).
%D = 55,
%R = [i, b, f].

