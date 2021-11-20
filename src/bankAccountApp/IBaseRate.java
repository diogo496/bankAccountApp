package bankAccountApp;


//Like a class, an interface can have methods and variables,
// but the methods declared in interface are by default abstract (only method signature, no body).
public interface IBaseRate  {

    // write method that returns the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
