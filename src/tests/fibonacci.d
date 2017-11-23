var fib := func(n)
    if n = 1 or n = 2 then return 1;
    else return fib(n-1) + fib(n-2);
    end
end

// Should be 55
print fib(10)