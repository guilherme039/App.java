public class App{

  public static void main(String[] args) throws Exception{
// Iphone 12, tela de 6.1", 256gb
// Galaxy Note 20 Ultra, tela de 6.9", 256gb
// Xiaomi mi 11 pro, tela de 6.81", 128gb
// <tipoVariavel> nomeVariavel = valor;

// Declarando um objeto do tipo Celular = Instalacao    
Celular celularA = new Celular();
    celularA.nome = "Iphone 12";
    celularA.tamanhoTela = 6.1f;
    celularA.espacoArmazenamento = 256;
    celularA.sistemaOperacional= "IOS";

Celular celularB = new Celular(); // objerto celularB
    celularB.nome = "Galaxy Note 20 Ultra"; // com o estado de nome definido para "Galax neta 20 ULtra"
    celularB.tamanhoTela 6.9 = 6.1f;
    celularB.espacoArmazenamento = 256;
    celularB.sistemaOperacional = "Adroid";   

    Celular celular; // Declarando um objeto chamado celularC
    celularC = new Celular();
    celularB.nome = "Xiaomi mi 11 pro"; // com o estado de nome definido para "Galax neta 20 ULtra"
    celularB.tamanhoTela 6.81 = 6.1f;
    celularB.espacoArmazenamento = 128;
    celularB.sistemaOperacional = "Adroid"; 


    
    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional");
    
    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional");

      System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional");
    
    
  }
}