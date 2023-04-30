import java.util.Scanner;

class ListaQuatroRevisao {
  public static void main(String[] args) {
    String nome = "", cartaoVacina = "", sintomasRecentes = "", contatoComPessoasSintomaticas = "",
        retornoViagem = "", orientacaoFinal = "";
    int idade, contador = 0, porcentagemInfeccao = 0;
    boolean erroTentativas = false;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\tCadastro para controle de infecção");

    System.out.println("\nInforme o seu nome: ");
    nome = scanner.nextLine();

    System.out.println("\nInforme a sua idade: ");
    idade = scanner.nextInt();

   
    do {
      System.out.println("\nSeu cartão de vacina está em dia? Digite SIM ou NAO ?");
      cartaoVacina = scanner.next().toUpperCase();
      if (cartaoVacina.equals("SIM") || cartaoVacina.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito inválido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    
    if (erroTentativas == false) {
      do {
        System.out
            .println("\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)" +
                "Digite SIM ou NAO");
        sintomasRecentes = scanner.next().toUpperCase();
        if (sintomasRecentes.equals("SIM") || sintomasRecentes.equals("NAO")) {
          break;
        } else {
          contador++;
          System.out.println("\nDigito inválido! Digite SIM ou NAO.");
          if (contador == 3) {
            erroTentativas = true;
            break;
          }
        }
      } while (true);
    }

    if (erroTentativas == false) {

      do {
        System.out
            .println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?" +
                "Digite SIM ou NAO");
        contatoComPessoasSintomaticas = scanner.next().toUpperCase();
        if (contatoComPessoasSintomaticas.equals("SIM") || contatoComPessoasSintomaticas.equals("NAO")) {
          break;
        } else {
          contador++;
          System.out.println("\nDigito inválido! Digite SIM ou NAO.");
          if (contador == 3) {
            erroTentativas = true;
            break;
          }
        }
      } while (true);
    }

    if (erroTentativas == false) {
      do {
        System.out
            .println("\nEstá retornando de viagem realizada no exterior?" +
                "Digite SIM ou NAO");
                retornoViagem = scanner.next().toUpperCase();
        if (retornoViagem.equals("SIM") || retornoViagem.equals("NAO")) {
          break;
        } else {
          contador++;
          System.out.println("\nDigito inválido! Digite SIM ou NAO.");
          if (contador == 3) {
            erroTentativas = true;
            break;
          }
        }
      } while (true);
    }

    scanner.close();

    if (erroTentativas == true) {
      System.out.println("Não foi possível realizar o diagnóstico." +
          "Gentileza procurar ajuda médica caso apareça algum sintoma.");
    } else {

      
      if (retornoViagem.equals("SIM")) {
        porcentagemInfeccao += 30;
        orientacaoFinal = "Você ficará sob observação por 05 dias.";
      }

      if (cartaoVacina.equals("NAO")) {
        porcentagemInfeccao += 10;
      }

      if (sintomasRecentes.equals("SIM")) {
        porcentagemInfeccao += 30;
      }

      if (contatoComPessoasSintomaticas.equals("SIM")) {
        porcentagemInfeccao += 30;
      }

      
      if (retornoViagem.equals("SIM")) {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cartão de vacina em Dia: " + cartaoVacina);
        System.out.println("Teve sintomas recentemente: " + sintomasRecentes);
        System.out.println("Teve contato com pessoas infectadas: " + contatoComPessoasSintomaticas);
        System.out.println("Esta retornando de viagem: " + retornoViagem);
        System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
        System.out.println("Orientação Final: " + orientacaoFinal);
      } else {

        
        if (porcentagemInfeccao >= 90) {
          orientacaoFinal = "Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.";
          System.out.println("\nNome: " + nome);
          System.out.println("Idade: " + idade + " anos");
          System.out.println("Cartão de vacina em Dia: " + cartaoVacina);
          System.out.println("Teve sintomas recentemente: " + sintomasRecentes);
          System.out.println("Teve contato com pessoas infectadas: " + contatoComPessoasSintomaticas);
          System.out.println("Esta retornando de viagem: " + retornoViagem);
          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
          System.out.println("Orientação Final: " + orientacaoFinal);
        } else if (porcentagemInfeccao <= 30) {
          orientacaoFinal = "Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.";
          System.out.println("\nNome: " + nome);
          System.out.println("Idade: " + idade + " anos");
          System.out.println("Cartão de vacina em Dia: " + cartaoVacina);
          System.out.println("Teve sintomas recentemente: " + sintomasRecentes);
          System.out.println("Teve contato com pessoas infectadas: " + contatoComPessoasSintomaticas);
          System.out.println("Esta retornando de viagem: " + retornoViagem);
          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
          System.out.println("Orientação Final: " + orientacaoFinal);
        } else if (porcentagemInfeccao <= 60) {
          orientacaoFinal = "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
          System.out.println("\nNome: " + nome);
          System.out.println("Idade: " + idade + " anos");
          System.out.println("Cartão de vacina em Dia: " + cartaoVacina);
          System.out.println("Teve sintomas recentemente: " + sintomasRecentes);
          System.out.println("Teve contato com pessoas infectadas: " + contatoComPessoasSintomaticas);
          System.out.println("Esta retornando de viagem: " + retornoViagem);
          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
          System.out.println("Orientação Final: " + orientacaoFinal);
        } else {
          orientacaoFinal = "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
          System.out.println("\nNome: " + nome);
          System.out.println("Idade: " + idade + " anos");
          System.out.println("Cartão de vacina em Dia: " + cartaoVacina);
          System.out.println("Teve sintomas recentemente: " + sintomasRecentes);
          System.out.println("Teve contato com pessoas infectadas: " + contatoComPessoasSintomaticas);
          System.out.println("Esta retornando de viagem: " + retornoViagem);
          System.out.println("Porcentagem infecção: " + porcentagemInfeccao);
          System.out.println("Orientação Final: " + orientacaoFinal);
        }
      }
    }
  }
}