/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona_maximo;

/**
 *
 * @author zazi1
 */
public abstract class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String DNI = "";
    private Character sexo = 'M';
    private float peso;
    private float altura;
 
    
    //Constructor
    public Persona(String nombre, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.edad = 0;
        this.DNI = "000000000";
        this.peso = 0f;
        this.altura = 0f;
    }
    
    public Persona(String name, int edad, String DNI, Character sexo, float peso, float altura) {
	this.setNombre(nombre);
	this.setEdad(edad);
	this.setDNI(DNI);
	this.setSexo(sexo);
	this.setPeso(peso);
	this.setAltura(altura);
	}
    //Getters y Setters
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String DNI(){
        return DNI;
    }
    
    public void setDNI( String DNI){
        this.DNI = DNI;
    }
    
    
    public Character getSexo(){
        return sexo;
    }
    
    public void setSexo(Character sexo){
        this.sexo = sexo;
    }
    
    
    public Float getPeso(){
        return peso;
    }
    
    public void setPeso(Float peso){
        this.peso = peso;
    }
    
    public Float getAltura(){
        return altura;
    }
    
    public void setAltura(Float altura){
        this.altura = altura;
    }
    
    
    //metodos
    
    public void CalcularIMC(){
        double IMC = peso / Math.pow(this.getAltura(), 2);
        if (IMC< 18.5d){
            System.out.println("Estas por debajo de tu peso ideal");
        } else if(18.5d <= IMC && IMC >= 14.9d){
            System.out.println("Estas en tu peso ideal");
        } else if (25d <= IMC && IMC <= 29.9d){
            System.out.println("Estas en valores de sobrepeso");
        } else {
            System.out.println("Estas en valroes de obesidad");
        }      
    }
    
    
    public boolean MayordeEdad() {
		return this.getEdad() >= 18;
	}
    
    public abstract boolean comprobarSexo(Character sexo);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    //ToString
   @Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
   
}
