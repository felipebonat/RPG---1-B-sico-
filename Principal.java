import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro();
        Mago m = new Mago();
        Arqueiro a = new Arqueiro();

        //objeto guerreiro
        g.nome = "Vladimir";
        g.forca = 80;
        g.agilidade = 30;
        g.carisma = 0;
        g.destreza = 50;
        g.inteligencia = -3;
        g.estamina = 90;
        g.resistencia = 80;
        g.sorte = 10;
        g.vida = 100;
        g.mana = 63;

        //objeto mago
        m.nome = "Agostinho Carrara";
        m.mana = 100;
        m.vida = 40;
        m.destreza = 90;
        m.resistencia = 50;
        m.sorte = 85;
        m.inteligencia = 95;

        //objeto arqueiro
        m.nome = "Jhoson";
        m.destreza = 90;
        m.resistencia = 30;
        g.estamina = 45;
        m.sorte = 5;
        m.vida = 75;
        a.inteligencia = 60;
        a.mana = 60;

        //int valorAtaque = g.atacar(6);
        Random dado = new Random();

        int round = 1;
        while(g.vida > 0 && m.vida > 0){
            System.out.println("Round: " + round);
            System.out.println("Oponente1 1: " + g.nome);
            System.out.println("Oponente 2: " + m.nome);

            //turno do mago(m)
            int valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            int valorAtaque = m.atacar(valorDado);
            g.defender(valorAtaque);

            //turno do guerreiro(g)

            valorDado = dado.nextInt(6);
            System.out.println("Valor do dano: " + valorDado);
            valorAtaque = g.atacar(valorDado);
            m.defender(valorAtaque);
            //round = round + 1
            round++;
        }
        if(m.vida <= 0){
            System.out.println("Guerreiro " + g.nome + " foi campeão!!!");
        }else if(g.vida <= 0){
            System.out.println("Mago " + m.nome + " foi campeão!!!");
        }else{
            System.out.println("Empate!!!");
        }
    }
}
