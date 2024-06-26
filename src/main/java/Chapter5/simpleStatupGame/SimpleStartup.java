package Chapter5.simpleStatupGame;

import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;
    private int numofHits = 0;

    public void setLocationCells(ArrayList<String>locs){
        locationCells = locs;
    }

    public String checkYourselfIf(int userInput){//Metodo que chequea si una parte de la startup fue golpeada, recibe por parametro un numero
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index>=0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }
        return result;
    }
}
