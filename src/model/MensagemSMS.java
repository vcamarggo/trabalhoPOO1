package model;

/**
 *
 * @author F.Carvalho / M. Hirose / V.Camargo
 */
public class MensagemSMS extends GerenciadorMensagem {

    /**
     * Método que imprime a mensagem referente ao SMS
     *
     * @param consulta
     */
    @Override
    public String gerarMensagem(Consulta consulta) {
        System.out.println(" -------------------------");
        System.out.println("|***SMS***");
        System.out.println("|De: " + this.getCelularConsultorio());
        System.out.println("|Para: " + consulta.getPaciente().getCelular());
        System.out.println("|");
        System.out.println("|Ola senhor(a) " + consulta.getPaciente() + ",");
        System.out.println("|A clinica Saude e CIA gostaria de lembra-lo que amanha (" + this.getDateFormat().format(consulta.getDataConsulta())
                + ") o senhor(a) \n|tem uma consulta agendada as " + consulta.getHora() + " com o Doutor(a) " + consulta.getMedico());
        System.out.println("|Qualquer dúvida mande nos um email ou ligue para o telefone " + this.getNumeroConsultorio());
        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------\n");
        return "";
    }

}
