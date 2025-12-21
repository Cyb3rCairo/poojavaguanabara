public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos
    public void estadoAtual()
    {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public void abrirConta(String t) 
    {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") 
        {
            this.setSaldo(50);
        }
        else if (t == "CP") 
        {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta()
    {
        if (this.getSaldo() > 0) 
        {
            System.out.println("Conta com dinheiro");
        }
        else if (this.getSaldo() < 0)
        {
            System.out.println("Conta em débito");
        }
        else
        {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v)
    {
        if (this.getStatus() == true) 
        {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Déposito realizado com sucesso na conta de " + this.getDono());
        }
        else 
        {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float v)
    {
        if (this.getStatus() == true)
        {
            if (this.getSaldo() >= v) 
            {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo realizado na conta de " + this.getDono());
            }
            else 
            {
                System.out.println("Saldo insuficiente");
            } 
        }
        else 
        {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal()
    {
        int v = 0;
        if (this.getTipo() == "CC")
        {
            v = 12;
        }
        else if (this.getTipo() == "CP")
        {
            v = 20;
        }
        if (this.getStatus() == true)
        {
            if (this.getSaldo() >= v)
            {
                this.setSaldo(this.getSaldo() - v);
            }
            else 
            {
                System.out.println("Saldo insuficiente");
            }
        }
        else 
            {
                System.out.println("Impossível");
            } 
    }

    //Métodos Especiais
    public ContaBanco() 
    {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) 
    {
        this.numConta = n;
    }

    public int getNumConta() 
    {
        return this.numConta;
    }

    public void setTipo(String t)
    {
        this.tipo = t;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public void setDono(String d)
    {
        this.dono = d;
    }

    public String getDono()
    {
        return this.dono;
    }

    public void setSaldo(float s)
    {
        this.saldo = s;
    }

    public float getSaldo()
    {
        return this.saldo;
    }

    public void setStatus(boolean s)
    {
        this.status = s;
    }

    public boolean getStatus()
    {
        return this.status;
    }
}

 