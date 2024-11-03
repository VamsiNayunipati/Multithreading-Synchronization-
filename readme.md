Write a multithreaded java program where a person gains 1000 calories throughout the day. But, the person burns it off too. So, the balance is zero. That means no gain or loss in calories. Synchronization will enable you to achieve zero balance every time the program is run.

Note: First, do not think about synchronization. Write the program with two threads, one java file can handle the task – I named it Zerosum. There are two functions here, gainCalories() and burnCalories(). Each thread handles one of those functions. The run() method of each thread will have the method details. You can also call those methods if you decide to develop it outside the thread block. You are keeping a count of 0 to 1000 calories for both gain and loss. You need to keep track of the balance, so that is your instance variable which you print at end of the program. At the beginning of the program balance is zero. 

When you run this multithreaded program without synchronization, each run will show a result - a single integer. It can be positive integer, negative integer and occasionally 0. It’s the value of ‘balance’. It’s interleaved. That means both the threads are running but not in an orderly fashion.   

Then you synchronize and run the program. Each time the balance will be 0. That is the output you want to have.

This will be incorrect solution: gain all the way to 1000 calories and lose all the way to 1000 calories. Subtract and get a zero balance.
