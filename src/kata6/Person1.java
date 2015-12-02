package kata6;

public class Person1 {

    private final Integer id;
    private final String name;
    private final String genero;
    private final String fechaNacimiento;
    private final Float peso;
    private final String Mail;

    public Person1(Integer ID, String name, String genero, String fechaNacimiento, Float peso, String Mail) {
        this.id = ID;
        this.name = name;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.Mail = Mail;
    }

    public Integer getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Float getPeso() {
        return peso;
    }

    public String getMail() {
        return Mail;
    }
    
    
    
}
