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

    public void printlist(String code){
        if(pinCode.equals(code)){
            int i = 0;
            while(i < safeFolder.size()){
                System.out.println(safeFolder.get(i));
                i++;
            }
        }
        else {
            System.out.println("Väärä PIN-koodi!");
        }
    }

}
