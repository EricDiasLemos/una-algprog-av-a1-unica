import java.util.Scanner;

public class ProvaA1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        

        System.out.println("=========================");
        System.out.println("Sistema de acesso");
        System.out.println("=========================");

        System.out.println("Informe seu nome: ");    
        String nome = sc.nextLine();

        System.out.println("");
        int cargo = 0;
        int acesso = 0;
        int area = 0;


        while (cargo < 1 || cargo > 4) {    
            System.out.println("Informe seu cargo:");
            System.out.println("1 - Cientista");
            System.out.println("2 - Engenheiro");
            System.out.println("3 - Zelador");
            System.out.println("4 - Administrador");
            cargo = sc.nextInt();

            if (cargo < 1 || cargo > 10) {
            System.out.println("Cargo inexistente, insira um cargo valido");
            }
        } 

        while (acesso < 1 || acesso > 10) {  
            System.out.println("Informe seu nivel de Acesso(1 a 10): ");
            acesso = sc.nextInt();

                    if (acesso < 1 || acesso > 10) {
            System.out.println("Nivel invalido, insira um nivel valido");
            }
        } 

        while (area < 1 || area > 10) {
            System.out.println("Informe o nivel de sigilo da área(1 a 10): ");
            area = sc.nextInt();

            if (area < 1 || area > 10) {
                System.out.println("Nivel invalido, insira um nivel valido");
            }
        } 

        if (cargo == 1) { String cargos = "Cientista";}

        if (acesso >= area){
            System.out.println("ACESSO PERMITIDO!");
            

            if (cargo == 1){
                String profissao = "Cientista";
                System.out.println("Seja bem-vindo "+ nome + " o " + profissao);
            }

            else if (cargo == 2){
                String profissao = "Engenheiro";
                System.out.println("Seja bem-vindo "+ nome + " o " + profissao);
            }

            else if (cargo == 3){
                String profissao = "Zelador";
                System.out.println("Seja bem-vindo "+ nome + " o " + profissao);
            }

            else if (cargo == 4){
                String profissao = "Administrador";
                System.out.println("Seja bem-vindo "+ nome + " o " + profissao);
            }

        }   
        
        else {
            System.out.println("ALERTA DE SEGURANÇA!");
            

                        if (cargo == 1){
                String profissao = "Cientista";
                System.out.println("ACESSO NEGADO - "+ nome + " o " + profissao);
            }

            else if (cargo == 2){
                String profissao = "Engenheiro";
                System.out.println("ACESSO NEGADO - "+ nome + " o " + profissao);
            }

            else if (cargo == 3){
                String profissao = "Zelador";
                System.out.println("ACESSO NEGADO - "+ nome + " o " + profissao);
            }

            else if (cargo == 4){
                String profissao = "Administrador";
                System.out.println("ACESSO NEGADO - "+ nome + " o " + profissao);
            }
        }













    }

}
