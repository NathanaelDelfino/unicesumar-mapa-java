package bancowzt.Entidades;

public class Cliente {
    private int Score;
    private double Renda = 0;
    private int Idade;

    public Cliente(int score, double renda, int idade) throws Exception  {        
        Validar(score,renda,idade);
        this.Score = score;
        this.Renda = renda;
        this.Idade = idade;
        
    }

    private  void Validar(int score, double renda, int idade) throws Exception{
        //Utilizei o conceito de FAIL FAST VALIDATION
        if (score < 0 || score > 1000) {
            throw new Exception("Só é aceito SCORE de 0 a 1000");
        }
        if (renda <= 0) {
            throw new Exception("A renda não pode ser menor ou igual 0");
        }
        if (idade <= 0) {
            throw new Exception("A idade não pode ser menor ou igual a 0");
        }
    } 
    
    public int getScore() {
        return this.Score;
    }

    public double getRenda() {
        return this.Renda;
    }

    public int getIdade() {
        return this.Idade;
    }
}
