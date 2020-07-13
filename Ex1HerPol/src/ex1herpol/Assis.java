
package ex1herpol;


public class Assis extends Funcionario {
    public void detalhes(){
            System.out.println("Assistente:\n"                  
                    + "\nCódigo: " + getCodigo()
                    + "\nNome: " + getNome()
                    + "\nIdade: " + getIdade()
                    + "\nSalário: R$" + getSalario());
        }
}
