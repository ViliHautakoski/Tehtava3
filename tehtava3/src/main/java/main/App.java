package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Safe safe = new Safe("0000");
        
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while(!exit){
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");
            if(sc.hasNext()){
                int i = 0;
                String stirngInput = sc.nextLine();
                i = Integer.parseInt(stirngInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna uusi PIN-koodi:");
                        String pin = sc.nextLine();
                        safe.changePin(pin);
                        break;
                    case 2:
                        System.out.println("Anna kansioon lisättävä tieto:");
                        String syote = sc.nextLine();
                        safe.addsafeFolder(syote);
                        break;
                    case 3:
                        System.out.println("Anna PIN-koodi:");
                        String code = sc.nextLine();
                        safe.printlist(code);
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Väärä syöte.");
                        break;
                }
            }
        }
            sc.close();
            System.out.println("Kiitos ohjelman käytöstä.");
    }
}
