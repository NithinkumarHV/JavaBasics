/*
    Exception Handling

    Ex:
    1. Divide by zero
    2. Invalid array index
    3. Remove from an empty container
    4. Add to a full container
    5. File not present

    ADVANTAGES:

    1. Separation of exception conditions from regular code/business logic
    2. Propagating the error up in the function call stack
        fun1 -> fun2 -> .....
    3. Grouping and differentiating Error conditions

    EXCEPTION HIERARCHY:

                          Object Class

                        Throwable Class
            Error SubClass                Exception SubClass
    Ex: VirtualMachine Error          Unchecked Exception
        I/O Error                     Checked Exception
    
    Error Class -> exceptions not in programmers hand
    EX: Thrown by system

    Unchecked Exceptions/Runtime Exception - not checked at compile time
    Ex: Arithmetic Exception
        Null pointer Exception
        Indexoutofbound Exception

    Checked Exceptions - checked at compile time
    Ex: FileNotPresent
        Input handling


    OVERVIEW OF EXCEPTION HANDLING IN JAVA

    try {
        Write code that might throw exceptions
    }
    catch (Type 1) {
        Code to handle type 1 exception
    }
    catch (Type 2) {

    }
    finally {
        Code that is always executed
        Common code
    }

    catch types - are subclasses of Exception class
    try, catch, finally - represents block of code

    to throw an exception - we use "throw" keyword

    throws - used with function definitions
             Says this function may throw some exception
             If you are using this function - might need to handle the exception

    Ex:
    void fun() throws IndexoutofBoundException {

    }
*/

//program to print the exception information using getMessage() method 

import java.io.*; 

class ExceptionHandling { 
	public static void main (String[] args) { 
	    int a=5; 
	    int b=0; 
		try{ 
		    System.out.println(a/b); 
		} 
	    catch(ArithmeticException e){ 
            System.out.println(e.getMessage()); 
	    }
        finally {
            System.out.println("Program is run successfully");
        } 
	} 
} 
