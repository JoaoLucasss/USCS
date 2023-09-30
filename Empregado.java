package uscs;

public class Empregado {
    
    protected String nome, endereco;
    protected double valor_hora;
    protected int horas_trabalhadas;
    
    public Empregado() {}
    
    public Empregado(String nome, String endereco, double valor_hora, int horas_trabalhadas) {
    
        this.nome = nome;
        this.endereco = endereco;
        this.valor_hora = valor_hora;
        this.horas_trabalhadas = horas_trabalhadas;
        
    }
    
    public void imprimeEmpregado() {
        
        System.out.println("\nNOME: " + getNome());
        System.out.println("ENDEREÇO: " + getEndereco());
        System.out.println("VALOR DA HORA: R$" + getValorHora());
        System.out.println("HORAS TRABALHADAS: " + getHorasTrab());
        
    }
    
    public double calculaSalario() {
        
       double valor = getValorHora();
       int horas = getHorasTrab();
       double sal = valor * horas;
       
       return sal;
    }
    
    public void imprimeSalario() {
    
        System.out.println("SALÁRIO: R$" + calculaSalario());
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double getValorHora() {
        return valor_hora;
    }
    
    public void setValorHora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
    
    public int getHorasTrab() {
        return horas_trabalhadas;
    }
    
    public void setHorasTrab(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }
    
}
