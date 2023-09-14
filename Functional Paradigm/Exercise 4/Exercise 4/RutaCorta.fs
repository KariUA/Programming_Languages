module RutaCorta

// Grafo de prueba con pesos en lugar de listas de adyacencia
let grafo = [
    ("i", [("a", 1); ("b", 2)]);
    ("a", [("i", 1); ("c", 2); ("d", 3)]);
    ("b", [("i", 2); ("c", 1); ("d", 4)]);
    ("c", [("a", 2); ("b", 1); ("x", 3)]);
    ("d", [("a", 3); ("b", 4); ("f", 5)]);
    ("f", [("d", 5)]);
    ("x", [("c", 3)])
]

// Función para verificar si un elemento está en una lista
let miembro elem lista =
    List.exists (fun x -> x = elem) lista

// Función para generar vecinos
let rec vecinos nodo grafo =
    match grafo with
    | [] -> []
    | (head, neighbors) :: rest ->
        if head = nodo then neighbors
        else vecinos nodo rest

// Función para extender una ruta
let extender ruta grafo = 
    List.filter
        (fun x -> x <> [])
        (List.map (fun (x, peso) -> if (miembro x ruta) then [] else (x, peso)::ruta) (vecinos (List.head ruta) grafo))

// Función principal de búsqueda en profundidad
let rec prof2 ini fin grafo =
    let rec prof_aux fin ruta grafo =
        if List.isEmpty ruta then []
        elif (List.head (List.head ruta)) = fin then
            List.rev (List.head ruta) //:: prof_aux fin ((extender (List.head ruta) grafo) @ (List.tail ruta)) grafo
        else
            prof_aux fin (List.sortBy (fun peso -> peso) ((List.tail ruta) @ (extender (List.head ruta) grafo))) grafo
    prof_aux fin [[ini, 0]] grafo

//---------------------Ejecución---------------------
let ruta = prof2 "i" "f" grafo
printfn "%A" ruta