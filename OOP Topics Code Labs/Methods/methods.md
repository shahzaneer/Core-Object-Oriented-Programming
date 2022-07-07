# Methods Rule
> `Methods` of the class do some operations on the data of the class.
- jo cheez hamaray pas data main nhi hai aur hamay chahiay tou usse as a parameter pass krna hai.
- har `object unique` houta hai dusray objects se value `share` nhi krta wo!
- `Class data` ko (class level variables) ko `argument` main nhi lete wo wese hi object access krleta hai.
> The methods of a Class will only have arguments if it requires something other than the class data.
> Avoid using `Scanner` in the Methods of the class. It is legal but its not a professional practice.
- class variables jo hain unhe class main declare krna hai aur phir bad main use krna hai dubara declare nhi krna kisi function main 
- ager kisi function main declare kia dubara tou wo local variable bana dega aur phir OOP approach nahi rahegi yani object ka data change nhi hoga bs us function main kaam hoga.
> Never Re-declare class data members in any method of the class. 
> Most of the functions do return the values in the case of computation. 
- If we have any function which is performing some computation we should reuse it again and should not re-write it again.
- Checking functions ki return type `boolean` rakhi jaati hai we are also supposed to use this practice.
>  Create Fruitful functions in your class that is return values from the functions. avoid use of void functions.
- yeh isliay k void functions (printing statements) professional practice main use srff debugging ya frontend design k liay hotay hain, development (backend engineering) main return functions use kiay jatay hain.

> display is the special function that shows the current state of the calling object.

>setValues is the special function that resets the state of the calling function.
> We will call the Runner class to be the Client Class.
- Client wo user hai jo us class ko use krta hai. jese Scanner class ko hum use krte hain tou hm client hain aur hamari class client class.

***
## Object State
> State is the current value of all data members of an object at the moment.
``` java
public class ABC{
int m1,m2,m3;
// abhi state hai m1=0,m2=0,m3=0;
    public void setValues(int a,int b,int c){
        m1 = a;
        m2 = b; 
        m3 = c;
        // ab state hai --> m1=a,m2=b,m3=c;
    }
}
        
```

