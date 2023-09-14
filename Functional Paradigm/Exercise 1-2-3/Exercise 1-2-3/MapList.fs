module MapList

//función que obtenga el n-esimo elemento de una lista pero utilizando solamente map (sin recursión). 
let getNthElementT (n:int) (l:'a list) : 'a option =
    if n >= List.length l then
        None
    else
        let indices = List.init (List.length l) id
        let mappedList = List.map (fun x -> if x = n then x else -1) indices
        let index = List.find (fun x -> x <> -1) mappedList
        match index with
        | i -> Some (List.nth l i)
        | -1 -> failwith "No se encontro el elemento"
