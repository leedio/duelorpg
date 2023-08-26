def fib(n):
    if n<=1:
        return n
    else:
        return fib(n-1)+ fib(n-2)

n=15
print(f"Sequencia de Fibonacci com {n} Termos ")
for i in range(n):
    print(fib(i), end=" ")