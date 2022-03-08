# Encapsulation (Data Hiding)

## Acess Modifiers
- Used to define the Access.
- why? 
>data ki nature k hisaab se krna hai for instance apne password safe krwaya hai aur ap nhi   chahtay k client isse change krsakay tou ap isse private banayengay.
1. Public
>It is accessible from anywhere
2. Private
3. Protected 
4. Default 
> Package friendly yani aik pkg k ander mojud tamaam classes access krsktin hain bahir nhi hoga.

***
- Class should be declared public.
- Instance Variables are declared private.
> it is done to avoid the invalid state.
> Class Data hamesha private hoga takay koi change na karsakay aur program invalid state main na jaye.
- Isko handle krne k liay public setters banatay hain jo controlled access deta hai for the initializing the data.
- har `Data Member` ka alag `Setter` (Set functions) banana hai.
- Setters main pehle validate krna hai aur then set krna hai.
- Private members ko check krne k liay `Getters`(Get Functions) Banatay hain jo mehiz data member ko return krte hain. takay hum inhe view krskain aur inki values k liay queries chala sakain.
- Getters ko return krna hai.
- Different Names for Getters and Setters are:
    - Getter | Accessors | Query Methods | Get Functions.
    - Setters | Mutators | Setting Methods | Set Function.
>Class Methods private aur public dono hoskte hain depending upon use.
- Functions/Methods helping the internal working of class are private.
>helper methods keh skte hain, inki access se 
- Baki tamaam methods normally public hongay.
- Constructors have to be public. ager na huay tou object hi nahi banega. aur class ka concept hojayega khtm.

### Behtareen Code Plugins ki trh houta hai and Encapsulation helps in it.
    - It is called maintaining locality.
