%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Practica 1 Prolog                                   %
% Autor: Karina Urbina Alvarez                        %
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


%***************************** Ejercicio 1 *****************************
% Defina sumlist(L, S) que es verdadero si S es la suma de los elementos
% de L.

sumlist([],0).
sumlist([N|L],S) :-
    sumlist(L,X), S is X+N.

% Prueba:
% sumlist([1,2,3,4],10).-> true
% sumlist([1,2,3,4],6). -> false


%***************************** Ejercicio 2 *****************************
% Defina la relacion subconj(S, S1), donde S y S1 son listas
% representando conjuntos que es verdadera si S1 es subconjunto de S.

subconj(_, []).
subconj(S, [X|S1]) :-
    member(X, S),
    subconj(S, S1).

% Prueba:
% subconj([1,2,3,4],[1,2]). -> true
% subconj([1,2,3,4],[1,2,5]). -> false

%***************************** Ejercicio 3 *****************************
% Defina la función aplanar(L,L2). Esta función recibe una lista con
% multiples listas anidadas como elementos otra lista que contendría los
% mismos elementos de manera lineal (sin listas).

aplanar([],[]).
aplanar([X|L],L2) :-
    is_list(X),
    aplanar(X,X1),
    aplanar(L,L3),
    append(X1,L3,L2).
aplanar([X|L],[X|L2]) :-
    not(is_list(X)),
    aplanar(L,L2).

% Prueba:
% aplanar([1,2,[3,4,[5,6],7],8],L). -> L = [1, 2, 3, 4, 5, 6, 7, 8].

%***************************** Ejercicio 4 *****************************
% Defina un predicado llamado partir(Lista, Umbral, Menores, Mayores)
% para dividir una lista respecto un umbral dado, dejando los valores
% menores a la izquierda y los mayores a la derecha. Por ejemplo,
% el resultado de partir la lista [2,7,4,8,9,1] respecto al umbral 6
% serían las listas [2,4,1] y [7,8,9].

partir([],_,[],[]).
partir([X|L],U,[X|L1],L2) :-
    X < U,
    partir(L,U,L1,L2).
partir([X|L],U,L1,[X|L2]) :-
    X >= U,
    partir(L,U,L1,L2).

% Prueba:
% partir([2,7,4,8,9,1],6,L1,L2). -> L1 = [2, 4, 1], L2 = [7, 8, 9].

%***************************** Ejercicio 5 *****************************
% Implemente un predicado que, a partir de una lista de cadenas string,
% filtre aquellas que contengan una subcadena que el usuario indique en
% otro argumento.

subcadenas(_,[],[]).
subcadenas(S,[X|L],[X|L1]) :-
    sub_string(X,_,_,_,S),
    subcadenas(S,L,L1).
subcadenas(S,[_|L],L1) :-
    subcadenas(S,L,L1).

% Prueba:
% subcadenas("la",["la casa","el perro","pintando la cerca"],Filtradas).
%          -> Filtradas = ["la casa", "pintando la cerca"]
