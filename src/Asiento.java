public class Asiento {
    private String codigo;
    private boolean ocupado;

    public Asiento (String codigo){
        this.codigo = codigo;
        this.ocupado = false;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }
    public void ocupar() {
        if (ocupado){
            System.out.println("El asiento: " + codigo + "esta ocupado");
        }
        else {
            ocupado =true;
            System.out.println("El asiento: " + codigo + "acaba de ocuparse");
    
        }
    }
     public void liberar() {
        ocupado =false;
        System.out.println("El asiento:" + codigo + "ya esta libre");
    }
    public void mostrarEstado(){
        System.out.println("Asiento" + codigo + (ocupado? "ocupado" : "libre"));
    }
}

