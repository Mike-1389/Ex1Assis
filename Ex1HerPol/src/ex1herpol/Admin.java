
package ex1herpol;

public class Admin extends Assis {
    private String turno;
    private double adicional;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
      public double metadicional(){
        if ("noite".equals(turno)) {
            this.salario = this.salario + this.adicional;            
        }else{
            this.salario = this.salario;
        }   
            return this.salario;
    }
    
  @Override
    public void detalhes(){
        System.out.println("Assistente Administrativo:\n"                  
                + "Codigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nTurno: " + getTurno()
                + "\nSalário: R$" + getSalario());
    }
    
    
    
}
