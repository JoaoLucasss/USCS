package uscs;


public class TesteGerente {

   
    public static void main(String[] args) {
       
        Empregado e1 = new Empregado("Antonio", "Rua Brasil, 130", 50.00, 230);
        e1.imprimeEmpregado();
        e1.imprimeSalario();
        
        Gerente g1 = new Gerente("Carlos","Rua Silvio Torres, 36",50.00,230,"Ana",2000.00);
        g1.imprimeGerente();
        g1.imprimeSalario();
        
    }
    
}
