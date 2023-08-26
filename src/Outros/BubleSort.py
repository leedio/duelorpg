
def sort(array):
    tamanho=len(array)-1
    sorted=False
    while not sorted:
        sorted=True
        for i in range(0,tamanho):
            if array[i] > array[i+1]:
                sorted=False
                array[i],array[i+1] = array[i+1],array[i]
    return array

    
array=[8,7,5,6,2,1,4,8,6,2,3,9,7,5]
#sort(array)
print(array)
