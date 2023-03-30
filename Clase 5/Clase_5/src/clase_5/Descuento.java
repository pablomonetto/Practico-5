package clase_5;

public abstract class Descuento {

    private float valor;

    public abstract float valorFinal (float valorInicial);
    
    public float getDesc() {
        return valor;
    }

    public void setDesc(float valor) {
        this.valor = valor;
    }    
}


