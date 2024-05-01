package Chapter5.simpleStartup;

public class SimpleStartup {
    private int[] locationCells; //Array que sirve para indicar las ubicaciones de la startup
    private int numofHits = 0;//Variable que indica la cantidad de golpes a la startup

    public void setLocationCells(int[]locs){
        locationCells = locs;//Se setea el locationCells con el array enviado desde el main.
    }

    public String checkYourselfIf(int guess){//Metodo que chequea si una parte de la startup fue golpeada, recibe por parametro un numero
        String result = "miss";//El resultado se pone por defecto como miss
        for(int cell : locationCells){//La variable cell va a tomar un valor distinto del array cada vez que se repita el bucle for
            if(guess == cell){//Este if valida si el guess enviado por parametro coincide con un valor de cell
                result = "hit";//Si coincide el resultado va a ser hit, osea que golpeó una de las startup
                numofHits++;//Este contador aumenta el numero de hits en 1 cada vez que se golpee una startup
                break;//Este break se utiliza para cortar el if
            }
        }
        if(numofHits == locationCells.length){//Si el numero de hits coincide con el tamaño del array locationCells
            result = "kill";//Entonces el resultado a retornar va a ser kill(que no es este el caso)
        }
        System.out.println(result);//Se imprime el resultado de la acción
        return result;//Se retorna el resultado a la instancia que llama al metodo checkYourselfIf
    }
}
