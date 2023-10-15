/*
    Multi tasking : listening to music and browsing web
        Multiple tasks(process) at same time
    
    Multi threading : multiple things within a task/process
        download and browsing simultaneously in different threads
    
    Real Word Examples:
    1. Word Processors: typing, saving, formatting
    2. Web Server: Apache HTTP servers uses thread pools
    3. IDE's

    Even with single processors we can achieve multi threading

    ADVANTAGES:

    1. Parallelism - Improved performance
    2. Responsiveness
        If one thread is doing an action
        Other thread can handle user action
    3. Better resource utilization
        When create multiple threads they all share the same addresses
        Therefore it takes less memory, resource to create threads
        Reduces server cost
        threads - lightweight processes

    DISADVANTAGES:

    1. Difficult to debugging
    2. Can lead to deadlock and race conditions

    RACE CONDITION - due to multiple threads accessing same memory

    Works fine:
    thread 1            thread 2
    read x
    x++
    write x             
                        read x
                        x++
                        write x

    Race condition
    thread 1            thread 2
    read x
    x++
                        read x
                        x++
    write x
                        write x

    CREATE THREADS:

    2 ways to create threads

    1. Extending thread class
    2. Implementing runnable interface
*/

class Test extends Thread {
    public void run () {
        System.out.println("Inside test thread");
    }
}

/*
    before t.start - only one thread
    after t.start - one more thread for test is created

    These threads can run on same or different processors
    These threads run simultaneously
*/
class Main {
    public static void main(String []args) {
        Test t = new Test();
        // new thread is started
        t.start();
        System.out.println("Inside main thread");
    }
}