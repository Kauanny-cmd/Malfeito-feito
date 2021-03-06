package exec;

import java.util.Scanner;
import clas.Tarefas;

public class Main {
  public static void main(String[] args) {
    // Variantes de desenvolvimento
    final Scanner leitor = new Scanner(System.in);

    boolean verTarefas = true;

    // Boas vindas
    System.out.println("Seja bem vindo ao Malfeito, feito!");
    System.out.println("\n Por favor, digite o seu nome: ");
    String usuario = leitor.nextLine();
    Tarefas.BoasVindas(usuario);

    // Add tarefas
    Tarefas t1 = new Tarefas();

    while(verTarefas){
      
      System.out.print("\n|-----------------  MENU  ------------------|\n");
      System.out.print("| Opção 1 - Criar                           |\n");
      System.out.print("| Opção 2 - Vizualizar                      |\n");
      System.out.print("| Opção 3 - Editar a lista de tarefas       |\n");
      System.out.print("| Opção 4 - Excluir tarefa                  |\n");
      System.out.print("| Opção 5 - Sair                            |\n");
      System.out.print("|-------------------------------------------|\n");
      int opcao = leitor.nextInt();
      if(opcao == 1){
        t1.AdicionaTarefas();
      }else if(opcao == 2){
        t1.MostrarTarefas(usuario);
      }else if(opcao == 3){
        t1.EditarTarefas();
      }else if(opcao == 4){
        t1.ExcluirTarefas(usuario);
      }else if(opcao == 5){
        verTarefas = false;
        System.out.println("\nPrograma finalizado! \n");
      }
      else{
        System.out.println("Opção inválida!");
      }
    }
  }
}
