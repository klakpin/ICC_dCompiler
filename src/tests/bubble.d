var a := [34, 203, 3, 746, 200, 984, 198, 764, 9];
 
var bubbleSort := func(a)

    var swapped := true;

    while swapped
    loop
        swapped := false;
        for i in 0 .. a.length-1
        loop
            if a[i] > a[i+1] then 
                var temp := a[i];
                a[i] := a[i+1];
                a[i+1] := temp;
                swapped := true;
            end
        end
    end

    return a;
end
 
print(bubbleSort(a))