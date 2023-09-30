package uscs;

public class Gerente extends Empregado {
    
    private String nome_secretaria;
    private double bonus_salario_secretaria;
    
    public Gerente() {}
    
    public Gerente(String nome, String endereco, double valor_hora, int horas_trabalhadas, String nome_secretaria, double bonus_salario_secretaria) {
    
        setNome(nome);
        setEndereco(endereco);
        setValorHora(valor_hora);
        setHorasTrab(horas_trabalhadas);
        
        this.nome_secretaria = nome_secretaria;
        this.bonus_salario_secretaria = bonus_salario_secretaria;
        
    }
    
    public void imprimeGerente() {
    
        imprimeEmpregado();
        
        System.out.println("NOME (SECRETÁRIA): " + nome_secretaria);
        
    }
    
    @Override
    public double calculaSalario() {
        
       double valor = getValorHora();
       int horas = getHorasTrab();
       double sal = valor * horas + bonus_salario_secretaria;
       
       return sal;
    }
       
}
