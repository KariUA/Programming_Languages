open Shift
open FilterList
open MapList

// EJERCICIOS 1, 2 Y 3 DEL PARADIGMA FUNCIONAL

[<EntryPoint>]
let main argv =

    let list = [1;2;3;4;5]
    
    printfn "--------------Exercice 1------------------------"
    
    let shiftedList = shiftList "left" 3 list
    printfn "Shifted list left 3 : %A" shiftedList
    
    let shiftedList = shiftList "right" 2 list
    printfn "Shifted list right 2 : %A" shiftedList
    
    let shiftedList = shiftList "left" 6 list
    printfn "Shifted list left 6 : %A" shiftedList
    
    printfn "--------------Exercice 2------------------------"
   
    let filteredList = filterSubStrings ["la casa"; "el perro"; "pintando la cerca"] "la"
    printfn "Filtered list: %A" filteredList
    
    printfn "--------------Exercice 3------------------------"
    
    let mappedList = getNthElementT 2 list
    match mappedList with
    | Some valor -> printfn "Mapped list 2: %d" valor
    | None -> printfn "Mapped list 2: %A" false
    
    let mappedList = getNthElementT 3 list
    match mappedList with
    | Some valor -> printfn "Mapped list 3: %d" valor
    | None -> printfn "Mapped list 3: %A" false
    
    let mappedList = getNthElementT 6 list
    match mappedList with
    | Some valor -> printfn "Mapped list 6: %d" valor
    | None -> printfn "Mapped list 6: %A" false
    
   
    0 // return an integer exit code
    
