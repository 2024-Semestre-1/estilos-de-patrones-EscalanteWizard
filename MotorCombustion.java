public class MotorCombustion extends Motor{
    public MotorCombustion(){
        super();
        System.out.println("Creando motor de combustion...");
    }
    @Override
    public void encender(){
        System.out.println("Encendiendo el motor de combustion...");
    }
    @Override
    public void acelerar(){
        System.out.println("Acelerando el motor de combustion...");
    }
    @Override
    public void apagar(){
        System.out.println("Apagando el motor de combustion...");
    }
    
}
