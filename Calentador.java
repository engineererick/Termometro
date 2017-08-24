public class Calentador
{
    private int temperatura;
    private int i;
    private int min;
    private int max;
    
    public Calentador(int max, int min)
    {
        min=min;
        max=max;
        temperatura = 15;
        i = 3;
    }
    
    public void Calentar()
    {
        int cambio;
        cambio = temperatura + i;
        
        if(cambio < max)
        {
            temperatura = cambio;
        }
    }
    
    public void Enfriar()
    {
        int cambio;
        cambio = temperatura - i;
        if(cambio > min)
        {
            temperatura = cambio;
        }
    }
    
    public int Termometro()
    {
        return temperatura;
    }
    
    public void Aumenta(int aumento)
    {
        if(aumento>0)
        {
            i=aumento;
        }
    }
}
  