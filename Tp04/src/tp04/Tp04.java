package tp04;


import java.util.Scanner;

class Tp04{

  static int home(Data d){
    Scanner scan = new Scanner(System.in);
    System.out.println("--------------------------------------------");
    System.out.println("                 Resultados                 ");
    System.out.println("Data formato dd/mm/aa: " + d.mostra1());
    System.out.println("Data formato dd/Mês/aa: " + d.mostra2());
    System.out.println("Ano bissexto: " + d.bissexto());
    System.out.println("Dias transcorridos no ano: " + d.diasTranscorridos());
    d.apresentaDataAtual();
    System.out.println("--------------------------------------------");
    System.out.println("                 Alterar Data               ");
    System.out.println("Alterar Data completa                    - 1");
    System.out.println("Alterar apenas o dia                     - 2");
    System.out.println("Alterar apenas o mês                     - 3");
    System.out.println("Alterar apenas o ano                     - 4");
    System.out.println("Zerar data                               - 5");
    System.out.println("--------------------------------------------");
    System.out.println("                 Ver Detalhes               ");
    System.out.println("Ver apenas dia                           - 6");
    System.out.println("Ver apenas mês                           - 7");
    System.out.println("Ver apenas ano                           - 8");
    System.out.println("--------------------------------------------");
    System.out.println("Sair                                     - 0");
    System.out.println("--------------------------------------------");

    System.out.print("\nEscolha uma opção: ");
    int key = scan.nextInt();
    System.out.println("\n");
    
    return key;    
  }
  
  public static void main(String[] args) {
    Data d = new Data();
    int key = home(d);

    while(key !=0){
      switch(key){
        case 1:
          //d.finaliza();
          d = new Data();
          key = home(d);
          break;
        case 2:
          d.entraDia();
          key = home(d);
          break;
        case 3:
          d.entraMes();
          key = home(d);
          break;
        case 4:
          d.entraAno();
          key = home(d);
          break;
        case 5:
          //d.finaliza();
          d = new Data(1,1,1);
          key = home(d);
          break;
        case 6:
          System.out.println("A dia é: " + d.retDia());
          key = home(d);
          break;
        case 7:
          System.out.println("A mês é: " + d.retMes());
          key = home(d);
          break;
        case 8:
          System.out.println("A ano é: " + d.retAno());
          key = home(d);
          break;
      }
    }
  }
}