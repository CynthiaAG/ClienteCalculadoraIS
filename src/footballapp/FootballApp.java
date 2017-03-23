/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballapp;

/**
 *
 * @author entrar
 */
public class FootballApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Numero de tarjetas amarillas totales:");
        System.out.println(FootballApp.yellowCardsTotal());
        System.out.println("Games Played:");
        System.out.println(FootballApp.gamesPlayed());
        
    }

    private static int yellowCardsTotal() {
        footballapp.Info service = new footballapp.Info();
        footballapp.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }

    private static int gamesPlayed() {
        footballapp.Info service = new footballapp.Info();
        footballapp.InfoSoapType port = service.getInfoSoap();
        return port.gamesPlayed();
    }

    
    
}
