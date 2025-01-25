package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder = new ArrayList<>();
    
    public Safe(String pinCode){
        this.pinCode = pinCode;
    }

    public void changePin(String code){
        pinCode = code;
    }

    public void addsafeFolder(String syote){
            safeFolder.add(syote);
    }

    public ArrayList<String> printList(String code){
        if(pinCode.equals(code)){
           return safeFolder;
            }
        
        else {
            System.out.println("Väärä PIN-koodi!");
            return null;
        }
    }
}
