package team2.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculadora calculadora = new Calculadora();
        
        calculadora.setMoneda("Euros");
        calculadora.setValor(10);
        calculadora.conversor();
    }
}
