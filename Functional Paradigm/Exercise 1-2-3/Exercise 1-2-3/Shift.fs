module Shift 

//Desplaza los elementos de la lista n posiciones a la derecha o a la izquierda
let rec shiftList direction n list =
    match direction with
    | "left" when n > 0 ->
        let _,rest = List.head list, List.tail list
        if n = 1 then
            shiftList direction 0 (rest @ [0])
        else
            shiftList direction (n - 1) (rest @ [0])
    | "right" when n > 0 ->
        let _ ,rest = List.last list, List.rev (List.tail (List.rev list))
        if n = 1 then
            shiftList direction 0 ([0] @ rest)
        else
            shiftList direction (n - 1) ([0] @ rest)
    | _ -> list
