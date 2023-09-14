module FilterList

//Usando la función "Filter" , filtra una subcadena específica de una lista de cadenas que contengan el parámetro de búsqueda.
let filterSubStrings (list: string list) (search: string) =
    list |> List.filter (fun x -> x.Contains(search))
