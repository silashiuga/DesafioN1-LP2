package estadosConsole;

import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;

public class EstadoBemVindo extends MaquinaEstado {
    @Override
    public boolean executar() {
        boolean sair = false;
        DesafioN1LP2.tipoFuncionario = "";

        System.out.println("--- BEM VINDO ---");
        System.out.println("1 - Acessar");
        System.out.println("0 - Partir");

        Scanner leitor = new Scanner(System.in);
        
        switch(leitor.nextLine()) {
            case "1":
                DesafioN1LP2.estadoConsole = EnumEstado.LOGIN.getEstadoMaquina();
                break;

            case "0":
                sair = true;
                break;

            default:
                System.out.println("Opção iválida");
                break;
        }

        return sair;
    }
}