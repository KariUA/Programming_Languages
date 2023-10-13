%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Practica 2 Prolog                                   %
% Autor: Karina Urbina Alvarez                        %
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Practica 2 Prolog                                   %
% Autor: Karina Urbina Alvarez                        %
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%********************************** Ejercicio 1 **********************************

% Implemente una funcion que calcula el porcentaje de exactitud entre el
% cromosoma sujeto y el cromosoma candidato. Un cromosoma es una lista de
% 10 elementos cuales quiera. Por ejemplo, si el cromosoma sujeto tiene 4
% elementos iguales en la misma posicion con respecto al cromosoma
% candidato, entonces el porcentaje de exactitud es de un 40%. Implemente
% otra funcion utilizando la funcion creada, para identificar el sujeto
% mas parecido a una muestra a partir de una lista de personas, donde
% cada persona tiene un cromosoma.

% Al argumento de la funcion se le pasa el cromosoma de la muestra, el
% nombre y apellido que son variables

personas("Karina","Urbina",[1,0,1,0,1,0,1,0,1,0]).
personas("Luis","Perez",[1,1,1,0,0,0,0,1,1,1]).
personas("Maria","Gonzalez",[1,1,1,1,1,1,1,1,1,0]).
personas("Jose","Garcia",[0,1,1,0,1,1,1,0,1,1]).
personas("Juan","Hernandez",[1,1,1,0,0,0,0,0,1,1]).
personas("Ana","Lopez",[0,0,1,0,1,0,0,1,0,0]).
personas("Pedro","Martinez",[1,0,0,0,0,0,0,0,0,0]).
personas("Rosa","Sanchez",[0,0,0,0,1,1,1,1,0,0]).
personas("Carlos","Gomez",[1,0,1,0,1,0,1,0,1,1]).


% Predicado que calcula el porcentaje de exactitud entre dos cromosomas
porcentaje_exactitud([], [], 0).
porcentaje_exactitud([X|Xs], [Y|Ys], Porcentaje) :-
    porcentaje_exactitud(Xs, Ys, PorcentajeRestante),
    (X =:= Y -> Porcentaje is PorcentajeRestante + 10 ; Porcentaje is PorcentajeRestante).

% Predicado que encuentra la persona mÃ¡s parecida a una muestra
encontrar_mas_parecido(Muestra, Nombre, Apellido) :-
    personas(Nombre, Apellido, Cromosoma),
    porcentaje_exactitud(Muestra, Cromosoma, Porcentaje),
    not((personas(_, _, OtroCromosoma), porcentaje_exactitud(Muestra, OtroCromosoma, OtroPorcentaje), OtroPorcentaje > Porcentaje)).

% Ejemplo de uso: encontrar_mas_parecido([1,0,1,0,1,0,1,0,1,0], Nombre,
% Apellido). -> "Karina","Urbina"
