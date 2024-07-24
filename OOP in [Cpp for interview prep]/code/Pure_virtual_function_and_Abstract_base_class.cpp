#include <iostream>
using namespace std;
class Base
{
public:
    int baseData;
    virtual void get() = 0;
    /*Here, we know that we will never this 'get()' function again so, we assign it to 0 thus, making it
    'do-nothing function.*/
    /*And hence, this complete class is called 'abstract class' as it can not be used to make objects as its
    object's function on function call will always be thrown to corresponding derived class function names of
    same type.*/
};
class Derived : public Base
{
public:
    int derivedData;
    void get()
    {
        cout << "Data in base is " << baseData << endl;
        cout << "Data in derived is " << derivedData << endl;
    }
};
int main()
{
    Derived d;
    // Base b;  //object of abstract class B is not allowed.
    Base *Bpointer = NULL;
    Bpointer = &d;
    d.baseData = 1;
    d.derivedData = 2;
    Bpointer->get();
}