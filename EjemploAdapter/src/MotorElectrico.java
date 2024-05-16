

public class MotorElectrico {
    private boolean conectado = false;

    public MotorElectrico(){
        System.out.println("Creando motor electrico...");
    }
    public void conectar(){
        System.out.println("Conectando motor electrico...");
        this.conectado = true;
    }
    public void desconectar(){
        System.out.println("Desconectando el motor electrico...");
        this.conectado = false;
    }
    public void activar(){
        if(this.conectado){
            System.out.println("Está conectado, activando motor electrico...");
        }else{
            System.out.println("No se puede activar el motor electrico porque no está conectado...");
        }
    }
    public void moverMasRapido(){
        if(this.conectado){
            System.out.println("Moviendo mas rapido, aumentndo voltaje del motor...");
        }else{
            System.out.println("No se puede mover el motor electrico porque no está conectado...");
        }
    }
    public void detener(){
        if(this.conectado){
            System.out.println("Deteniendo el motor electrico...");
        }else{
            System.out.println("No se puede detener el motor electrico porque no está conectado...");
        }
    }
    
    
}
