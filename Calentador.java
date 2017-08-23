public class Calentador
{
    private int temperatura;
    private int i;
    
    public Calentador()
    {
        temperatura = 15;
        i = 3;
    }
    
    public int Calentar()
    {
        if(temperatura < 30)
            temperatura = temperatura + i;
        return temperatura;
    }
    
    public int Enfriar()
    {
        if(temperatura > -10)
            temperatura = temperatura - i;
        return temperatura;
    }
    
    public void Termometro()
    {
        System.out.println("La temperatura actual es: "+temperatura);
    }
}