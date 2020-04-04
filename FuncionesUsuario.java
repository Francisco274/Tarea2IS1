package Tarea;

public class FuncionesUsuario {
    
    public double impuestos(Usuario usuario){
        double retorno = 0;
        
        if(usuario.getEdad() < 18){
            retorno = 0;
        }else if((usuario.getEdad() >= 18) && (usuario.getEdad() < 30)){
            retorno = 2000;
        }else if((usuario.getEdad() >= 30) && (usuario.getEdad() <= 65)){
            retorno = 7000;
        }else if(usuario.getEdad() > 65){
            retorno = 2000;
        }

        double descuento = 0;
        descuento = 1 - usuario.getCantHijos()*0.03;
        
        if(descuento < 0.5) descuento = 0.5;
        
        return retorno * descuento;
    }

}