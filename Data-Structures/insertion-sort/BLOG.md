# Insertion Sort
## ex: [8,4,23,42,16,15]

- Here we start from the second element in the array we take it and store it in new varabile let it be temp and we create variable and we store the index in it (value of i)
- then we check if the previous value is bigger than the current value we do the switch if not we pass to the next value 
- we repeat this operation to  sort all value in array and then return the sorted array

## Solution
- [8,4,23,42,16,15]
- combair between 8 and 4 if 4 < 8 switch places
    - iteration-1  [4,8,23,42,16,15]

- combair between 8 and 23 if 23 < 8 switch places
    - iteration-2  [4,8,23,42,16,15]

- combair between 42 and 23 if 42 < 23 switch places
    - iteration-3  [4,8,23,42,16,15]

- combair between 16 and 42 if 16 < 42 switch places
    - iteration-4  [4,8,23,16,42,15]

- combair between 16 and 23 if 16 < 23 switch places
    - iteration-5  [4,8,16,23,42,15]

- combair between 15 and 42 if 15 < 42 switch places
    - iteration-6  [4,8,16,23,15,42]

- combair between 15 and 23 if 15 < 23 switch places
    - iteration-7  [4,8,16,15,23,42]

- combair between 15 and 16 if 15 < 16 switch places
    - iteration-8  [4,8,15,16,23,42]


