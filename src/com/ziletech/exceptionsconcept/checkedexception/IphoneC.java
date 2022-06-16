package com.ziletech.exceptionsconcept.checkedexception;

public class IphoneC implements Mobile{

    @Override
    public String modal() {
        return "45891";
    }

    public String storage() {
        return null;
    }

    public void print() throws ModalNullException, StorageEmptyException {
        System.out.println(modal());
        System.out.println(storage());
        if(storage()==null){
         throw new ModalNullException();
        }
        if (modal().isEmpty()){
            throw new StorageEmptyException();
        }

    }
}

