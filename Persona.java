public class Persona{
  private String nombre;
  private String apellido;
  private Fecha fNacimiento;

  public Persona(){

  }

  public Persona(String nombre, String apellido, Fecha fNacimiento){
    this.nombre = nombre;
    this.apellido = apellido;
    this.fNacimiento = fNacimiento;
  }

  public Persona(String nombre, String apellido, int dia, int mes, int anio){
    
    this.nombre = nombre;
    this.apellido = apellido;
    /*//Opcion1
    fNacimiento = new Fecha();
    this.fNacimiento.setDia(dia);
    this.fNacimiento.setMes(mes);
    this.fNacimiento.setAnio(anio);*/
    //Opcion2
    fNacimiento = new Fecha(dia,mes,anio);
  }

  public String getNombre(){
    return nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getApellido(){
    return apellido;
  }

  public void setApellido(String apellido){
    this.apellido = apellido;
  } 

  public Fecha getFNacimiento(){
    return fNacimiento;
  }

  public void setFNacimiento(Fecha fNacimiento){
    this.fNacimiento = fNacimiento;
  }

  @Override
  public String toString(){
    return "Persona{nombre="+nombre+" apellido="+apellido+" fNacimiento=" +fNacimiento+"}";
  }

}
