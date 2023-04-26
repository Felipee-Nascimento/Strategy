public class Disciplina {

    private ICalcMedia CalcMedia;
    public double media;
    private String nome;
    private double P1;
    private double P2;
    public String Situacao;

    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public String getSituacao() {

        this.Situacao = this.CalcMedia.Situacao(this.media);
        return Situacao;
    }

    public Disciplina(ICalcMedia CalcMedia){

        this.CalcMedia = CalcMedia;
    }

    public Disciplina(){

    }

    public void CalcularMedia(){

        this.media=this.CalcMedia.CalculaMedia(this.P1,this.P2);
    }



}
