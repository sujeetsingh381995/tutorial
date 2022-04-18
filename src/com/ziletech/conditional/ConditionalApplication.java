package com.ziletech.conditional;

public class ConditionalApplication {

    public static void main(String[] args) {
        
        boolean train = false;
        boolean bus = false;

        if(train){
            System.out.println("Train");
        }else if(bus){
            System.out.println("Bus");
        }else{
            System.out.println("Plan is cancelled");
        }
       
        if(train || bus){
            System.out.println("I am coming.");
        }else {
            System.out.println("I am not coming");
        }


        //AND -> All should be true => true otherwise false
        //OR  -> All should be false =>  

//        (true && true && true)    => true
//        (true && true && false)   => false
//        (true || true || false)   => true
//        (false || true || false)  => true
//        (false || false || false) => false
//        (true && false || false)  => false
//        (true && true || false)   => true
//        (false && true || true)   => true
//        (false && true || false)  => false
        
        
//        (true && (true || false))  => true
        
//        (true && (false && false && (false || true && false)))
        

        boolean paneer = true;
        boolean refineOil = false;
        boolean ghee = true;
        boolean salt = true;
        boolean spices = true;
        
        if(paneer && salt && spices && (refineOil || ghee)){
            System.out.println("Paneer can e cooked");
        }else{
            System.out.println("Cannot be cooked");
        }
        
    }
    
}
