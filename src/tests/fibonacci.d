var fib := func(n) 
    if n = 1 or n = 2 then return n;
    else return fib(n-1) + fib(n-2);
    end
end
  
print fib(10)

