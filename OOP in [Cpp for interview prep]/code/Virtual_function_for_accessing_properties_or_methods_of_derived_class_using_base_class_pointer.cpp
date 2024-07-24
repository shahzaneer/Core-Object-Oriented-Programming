#include <iostream>
using namespace std;
class Base
{
public:
    int baseData;
    virtual void get()
    {
        cout << "Base data is " << baseData << endl;
    }
};
class Derived : public Base
{
public:
    int derivedData;
    void get()
    {
        cout << "Base data is " << baseData << endl;
        cout << "Derived data is " << derivedData << endl;
    }
};
int main()
{
    Base b;
    Derived d;
    d.derivedData = 2;
    Base *Bpointer = NULL;
    Bpointer = &d;
    (*(Bpointer)).baseData = 1;
    (*(Bpointer)).get();
}
/*A base class pointer points on derived class object so, in that case it will only be able to access only those
properties of derived class which have been inherited from base class.
But it will be able to access derived class objects only if virtual keyword is used. Above due to use of
'virtual' keyword, we will be thrown to use get() of derived class.*/
/*Function and operator overloading is compile time polymorphism but virtual function is a 'run time polymorphism'.
 */