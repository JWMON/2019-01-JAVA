package edu.handong.csee.java.string;

class FamilyNamePrinter{

    private String[] stringNames;
    private String[] familyNames;

    FamilyNamePrinter(String sng){

    }
    public static void main(String args[]){
        String stringNames = args;
        String[] names = stringNames.split(", ");
        String[] familyNames = new String[names.length];
        System.out.println(names.length);

        for(int i=0; i<names.length; i++){
            familyNames[i] = names[i].split(" ")[1];
        }

        for(String familyName : familyNames){
            System.out.println(familyName);
        }
    }

}