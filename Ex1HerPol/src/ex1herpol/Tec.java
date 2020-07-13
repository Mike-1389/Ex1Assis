
package ex1herpol;

public class Tec extends Assis{
      private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double bonus) {
        this.adicional = adicional;
    }
       public double metadicional(){
        this.salario = this.salario + this.adicional;
        return this.salario;
    }
       @Override
    public void detalhes(){
        System.out.println("\nAssistente Técnico:\n"                  
                + "Código: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nSalário: R$" + getSalario());
    }
}
