var a := [34, 203, 3, 746, 200, 984, 198, 764, 9];

var bubbleSort := func

    var swapped := true;

    while swapped
    loop
        swapped := false;
        for i in 1 .. 8
        loop
            if a[i] > a[i+1] then
                var temp := a[i];
                a[i] := a[i+1];
                a[i+1] := temp;
                swapped := true;
            end
        end
    end
end

bubbleSort()

print "Final array is: "
for i in 1..9 loop
    print a[i], " "
end