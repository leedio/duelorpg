print('-'*30)
print("Sequencia de Fibonacci")
print('-'*30)

numero=int(input("A quantidade de termos para mostrar \n"))

aux=0
prox=1
print('-'*30)
print(f" {aux} -> {prox} ", end='')
contador=3
while contador<=numero:
    atual=aux+prox
    print(f" -> {atual}", end='')
    aux=prox
    prox=atual
    contador+=1
print(" -> FIM ")