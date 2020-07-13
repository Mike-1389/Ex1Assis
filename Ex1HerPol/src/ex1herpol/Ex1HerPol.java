
package ex1herpol;


public class Ex1HerPol {

    
    public static void main(String[] args) {
       Admin adm = new Admin();
        Tec info = new Tec();
        adm.setCodigo(1);
        adm.setNome("Jailson Mendes");
        adm.setIdade(35);
        adm.setSalario(1500);
        adm.setAdicional(500);
        adm.setTurno("noite");
        adm.metadicional();
        adm.detalhes();
        
         info.setCodigo(2);
        info.setNome("Roberto Firme");
        info.setIdade(28);
        info.setSalario(3000);
        info.setAdicional(500);
        info.metadicional();
        info.detalhes();
        
        
    }
    
}
