# Insertion Sort
## ex: [8,4,23,42,16,15]

- we start with calculate the mid point from the array  
    - mid = first+last /2
- [8,4,23] [42,16,15]
- and we back and calculate the mid point for each of new sub arrey 
- [8] [4,23] [42] [16,15]
- [8] [4] [23] [42] [16] [15]
- new we back from bottom to top and  start to store value and merge it to get the sub array merge and sorted
- [4,8,23]  [15,16,42]
- new we use the merge function to start sorted the value 
- we create three variable i,j,k
    - i =  0
    - j = mid +1
    - k will use it to loop over the array

- after that we start to compaier the value from i and j then store it in the new array 
- we will do this operation until i is bigger than mid+1 or j bigger than last+1 value 
- we stop the compaier and store all value derictly in the new array 

- the final result after the merge is 
- [4,8,15,16,23,42]



