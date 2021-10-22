class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f);
    System.out.println(cir);
    cir.setRadio((float) 7.33);
    System.out.println(cir);
    float var = -8.66f;
    cir.setRadio(var);
    System.out.println(cir);
    System.out.println("#########################Composicion############################");
    Persona persona1 = new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha = new Fecha(2,1,2021);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getFNacimiento().getAnio());

    System.out.println("#########################Composicion############################");
    Persona persona2 = new Persona("Rafael","Zavala",8,4,1998);
    System.out.println(persona2);
    
    System.out.println("##############Extra##############");
    Persona persona3=new Persona("Pamela","Sánchez",14,11,2002);
    Persona persona4=new Persona("Gustavo","Villa",8,11,2001);
    Persona persona5=new Persona("Roberto","Palazuelos",3,5,1875);
    Persona persona6=new Persona("Carlos","Slim",12,11,4512);

    Coche coche1=new Coche("Audi",2016,"Negro",4,true,400,persona5,persona6,persona3,persona4);
    System.out.println(coche1);
  }
}
