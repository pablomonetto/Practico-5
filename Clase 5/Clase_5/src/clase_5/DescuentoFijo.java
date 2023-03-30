package clase_5;

public class DescuentoFijo extends Descuento {
    @Override 
    public float valorFinal (float valorInicial) {
            return valorInicial - this.getDesc();
    }
    
}
