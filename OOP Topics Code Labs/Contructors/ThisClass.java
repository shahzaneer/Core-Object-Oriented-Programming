public class ThisClass {
    int i;
    // void setValues(int x){
    //     i = x;
    // jb tk variable names change hon tb tk koi masla nhi hoga!
    // }

    void setValues(int i){
        this.i = i;
        // i = i; 
        // the compiler is saying it has no effect yani yeh dono hi local scope walay i consider kr rha hai .

    }

    // ! Variable names same hon to this keyword likha zaruri hoga wagirna yeh setValues main localVar = localVar tasawwur karega.


    void display(){
        System.out.println(i);
    }
    
}
