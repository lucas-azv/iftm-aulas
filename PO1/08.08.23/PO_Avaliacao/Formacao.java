import java.text.SimpleDateFormat;
import java.util.Date;

public class Formacao {
    private String nivel;
    private boolean concluido;
    private String instituicao;
    private Date data;

    public Formacao(String nivel, boolean concluido, String instituicao, Date data) {
        this.nivel = nivel;
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.data = data;
    }

    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String exibe() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String status = concluido ? "Concluído" : "Em andamento";
        String dataFormatada = dateFormat.format(data);

        return "Nível: " + nivel + "\nStatus: " + status + "\nInstituição: " + instituicao + "\nData de Conclusão: " + dataFormatada;
    }
}
