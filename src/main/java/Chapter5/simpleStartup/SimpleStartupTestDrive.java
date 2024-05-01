package Chapter5.simpleStartup;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();//Se crea una instancia de la clase SimpleStartUp
        int[]locations = {2,3,4};//Se crea el array location que va a servir para setear la ubicacion de la startup
        dot.setLocationCells(locations);//Se envia por argumento al metodo setLocationCell el array location para setear la ubicacion de la startup
        int userGuess = 2;//Este es el valor que el usuario va a enviar para golpear la startup
        String result = dot.checkYourselfIf(userGuess);//Esto devuelve(despues de ejecutar el metodo con el parametro, un String con el resultado del metodo
        String testResult = "failed";//La variable testResult va a tener el valor failed por defecto
        if(result.equals("hit")){//Si la variable result es igual a hit(que este es el ejemplo)
            testResult = "passed";//Entonces testResult va a ser igual a passed.
        }
        System.out.println(testResult);//Se imprime el testResult, en este caso passed.
    }
}
