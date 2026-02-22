public class App {
    public App() {
   }
   public static void main(String[] args){
      Paciente maria = new Paciente();
        maria.nome = "Maria da Silva";
        maria.cpf = "12345678912";
        maria.telefone = "11 912342356";
        maria.genero = "F";
        maria.idade = 35;
        maria.mostrar();

      Agenda agenda = new Agenda();
        agenda.data = "22/02/2026";
        agenda.hora = "19:11";
        agenda.medico = "Dr. Fabio";
        agenda.paciente = "Maria da Silva";
        agenda.mostrar();

      Consulta consulta1 = new Consulta();
        consulta1.data = "22/02/2026";
        consulta1.hora = "19:11";
        consulta1.medico = "Dr. Fabio";
        consulta1.paciente = "Maria da Silva";
        consulta1.motivo = "Dor de cabeça";
        consulta1.historico = "Sem problemas recorrentes";
        consulta1.mostrar();

      Exame exame1 = new Exame();
        exame1.data = "22/02/2026";
        exame1.consulta = "Primeira consulta";
        exame1.descritivo = "Foi receitado remédio para o paciente";
        exame1.mostrar();

      Medico fabio = new Medico();
        fabio.nome = "Fabio Arruda";
        fabio.crm = "12321312";
        fabio.telefone = "11 28127381283";
        fabio.especialidade = "Cliníco Geral";
        fabio.senha = "rootm";
        fabio.mostrar();

      Receita receita1 = new Receita();
        receita1.data = "22/02/2026";
        receita1.consulta = "Primeira consulta";
        receita1.descritivo = "Foi receitado remédio para o paciente";
        receita1.mostrar();

      Recepcionista ana = new Recepcionista();
        ana.nome = "Ana Maria da Silva";
        ana.cpf = "2873827363849237";
        ana.telefone = "11 1293213123";
        ana.senha = "absned23";
        ana.mostrar();
   }
}
