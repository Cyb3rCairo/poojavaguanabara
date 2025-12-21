package primeirosExemplos;
public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    public boolean tampada;
    
    public void status() 
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Ponta " + this.ponta);
    }

    public void rabiscar()
    {
        if (this.tampada == true) 
        {
            System.out.println("ERRO! Não posso rabiscar");
        } else
        {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() 
    {
        this.tampada = true;
    }

    public void destampar() 
    {
        this.tampada = false;
    }
}
