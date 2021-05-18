# Insertion Sort
## ex: [8,4,23,42,16,15]

- first we need to declear two pointer (low and high) and we need also to variable called pivot 
- high value will be the last index in array
- low value will be the second index of array
- pivot value will be the first value of array
- after that we will start to check from the arr[high] with pivot if the value of arr[high] less than pivot or not if it less than pivot we will move the value of arr[high] to the pivot position and if not less than we will move the high pointer to the previous position.
- after that we will start to check from the arr[low] with pivot if the value of arr[low] bigger than pivot or not if it bigger than pivot we will move the value of arr[low] to the high position and if not less than we will move the low pointer to the next position.
- we will repeat all this step to make sure that all array are sorted correctully 

## ex: [8,4,23,42,16,15]
- pivot will take the 8 value
- low will pointer to position of 4 
- high will pointer to pposition of 15 

- to start we will check the high value and the pivot 
    - arr[high] <= pivot if true will move if not will step high back 
    - high -- in this step high will pointer to 16 position
    - do this step to find value less than pivot
- after that we set the pivot in currect postion.
- we will correct this operation to all array value and each time we will do it we will put the pivot in correct position


- [4,8,23,42,16,15]
- pivot = 23
- low pointer to 42
- high pointer to 15

- [4,8,15,23,42,16]
- pivot = 23
- low pointer to 42
- high pointer to 16


- [4,8,15,16,23,42]
- pivot = 23
- low pointer to 42
- high pointer to 42





