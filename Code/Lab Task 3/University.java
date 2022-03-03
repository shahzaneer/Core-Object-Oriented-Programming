public class University {
    String uniName;
    String location;
    String rectorName;
    String departments [] = new  String [20];
    boolean lengthOfArray = false;

    University(){

    }

    University(String UniName, String RectorName){
        uniName = UniName;
        rectorName = RectorName;
    }

    University(String UniName, String RectorName,String Location,String [] depart){
        uniName = UniName;
        location = Location;
        rectorName = RectorName;

        if(depart.length==departments.length){
            lengthOfArray = true;
            for(int i=0;i<departments.length;i++){
                departments[i] = depart[i];

            }
        }
        else{
            lengthOfArray = false;
            for(int i=0; i<depart.length;i++){
                departments[i] = depart[i];
            }
            
        }
        
    }

//     void display(){
//         System.out.println("The name is "+uniName);
//         System.out.println("The location is "+location);
//         System.out.println("The Rector Name is "+rectorName);

//         if(lengthOfArray){
//             for(int i=0;i<departments.length;i++){
//                 System.out.println(departments[i]);
//                     }
//                 }
//         else{
//         //     for(int i=0;i<;i++){
//         //         System.out.println(departments[i]);
//         //             }
//         // }        

// }
