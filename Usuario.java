package Tarea;
public class Usuario{

    private String nombre;
    private int cedula;
    private String contrasena;
    private int edad;
    private int cantHijos;
    private int saldo;

    public Usuario(){
        nombre = "John Doe";
        cedula = 123;
        contrasena = "johnnie123";
        edad = 0;
        cantHijos = 0;
        saldo = 0;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getCedula(){
        return cedula;
    }
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contra){
        contrasena = contra;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getCantHijos(){
        return cantHijos;
    }
    public void setCantHijos(int n){
        cantHijos = n;
    }
    
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    @Override
    public boolean equals(Object o){
    
    if(o == this){
        return true;
    }
    if(!(o instanceof Usuario)){
        return false;
    }
    Usuario u = (Usuario) o;
    return this.cedula == u.cedula;

    }

}