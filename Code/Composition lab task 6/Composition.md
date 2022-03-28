# Composition
> supports `HAS-A-RELATIONSHIP`
***
> Using one class type as a data member in some other class type
- It should not be confused with `Inheritance Concepts`
- Both the classes are independent in nature.


***
# Benefits
1. Reusability
2. Better Code Structure
3. Easy Debugging
4. Simplification of tasks
***

# IMP Points for Implementations
- Reference use ho tou default constructor main reference ko initialize krna hai cause Object ki default type NULL hoti hai
- ager class type main kuch primitive data members huay tou unki alag alag default type nhi jayegi 
- Sub-parts pehlay bnte hain then whole part bnta hai.
- jo jis class ka data member hoga uske `setter/getter` same class main hongay.
- Object k contents ko view krne k liay object ko print nhi krna yun tou mehiz address return hoga Display ya getValue call krna hai . 
- aik reference type ager dusre reference type per depend kr rhi hai tou pehle reference main changes kerne se dusre reference main changings `(state reset/set)` numaya hongi
