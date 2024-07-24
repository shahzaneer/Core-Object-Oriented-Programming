#include <bits/stdc++.h>

using namespace std;

/**
 * friend keyword is used to make a function or class is friend of another class.
 * A friend function and class able to use another class's public,private and protected member of which class make this class and function friend 
 * if a class make any funciton or class friend then these function and class use members but main class can't use
 * friendship is not inherited
*/

class Base{
    private:
    int x;
    public:
    Base(){}
    Base(int x):x{x}{}
    friend int getX(Base &); // this is friend function
    friend class GetSet; // this is friend class
};

int getX(Base &obj)
{
    return obj.x; // can access private member x
}

class GetSet{
    public:
    void setX(Base &obj, int x)
    {
        obj.x=x; // can access private member x
    }
    int getX(Base &obj)
    {
        return obj.x; 
    }
};

int main()
{
    Base b(5);
    cout << "The number is " << getX(b) << endl;

    GetSet gts;
    gts.setX(b,9);
    cout << "Updated number is " << gts.getX(b) << endl;
    return 0;
}
