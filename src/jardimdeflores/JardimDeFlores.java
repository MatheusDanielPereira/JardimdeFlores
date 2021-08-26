package jardimdeflores;


public class JardimDeFlores {

   
    public static void main(String[] args) {
        
        Petala p1=new Petala();
        p1.setCorPetala("Amarelo");
        
        Petala p2=new Petala();
        p2.setCorPetala("Laranja");
        
        Flor margarida=new Flor();
        margarida.setPetala1(p1);
        margarida.setPetala2(p2);
        
        Petala p3=new Petala();
        p3.setCorPetala("Roxo");
        Petala p4=new Petala();
        p4.setCorPetala("Azul");
        
        Flor girassol=new Flor();
        girassol.setPetala1(p3);
        girassol.setPetala2(p4);
        
        Jardim j1=new Jardim();
        j1.setFlor1(margarida);
        j1.setFlor2(girassol);
     
        Petala p5=new Petala();
        p5.setCorPetala("Vermelho");
        Petala p6=new Petala();
        p6.setCorPetala("Verde");
        
        Flor lotus=new Flor();
        lotus.setPetala1(p5);
        lotus.setPetala2(p6);
        
        Petala p7=new Petala();
        p7.setCorPetala("Rosa");
        Petala p8=new Petala();
        p8.setCorPetala("Preto");
        
        Flor tulipa=new Flor();
        tulipa.setPetala1(p7);
        tulipa.setPetala2(p8);
        
        Jardim j2=new Jardim();
        j2.setFlor1(lotus);
        j2.setFlor2(tulipa);
         
        Pracinha pracinha=new Pracinha();
        pracinha.setJ1(j1);
        pracinha.setJ2(j2);
         
         System.out.println("Petalas via Flor");
         System.out.println("Cor:"+margarida.getPetala1().getCorPetala());
         System.out.println("Cor:"+margarida.getPetala2().getCorPetala());
         System.out.println("Cor:"+girassol.getPetala1().getCorPetala());
         System.out.println("Cor:"+girassol.getPetala2().getCorPetala());
         System.out.println("Cor:"+lotus.getPetala1().getCorPetala());
         System.out.println("Cor:"+lotus.getPetala2().getCorPetala());
         System.out.println("Cor:"+tulipa.getPetala1().getCorPetala());
         System.out.println("Cor:"+tulipa.getPetala2().getCorPetala());
         
         System.out.println("\nPetalas via Jardim");
         System.out.println("Cor:"+j1.getFlor1().getPetala1().getCorPetala());
         System.out.println("Cor:"+j1.getFlor1().getPetala2().getCorPetala());
         System.out.println("Cor:"+j1.getFlor2().getPetala1().getCorPetala());
         System.out.println("Cor:"+j1.getFlor2().getPetala2().getCorPetala());
         System.out.println("Cor:"+j2.getFlor1().getPetala1().getCorPetala());
         System.out.println("Cor:"+j2.getFlor1().getPetala2().getCorPetala());
         System.out.println("Cor:"+j2.getFlor2().getPetala1().getCorPetala());
         System.out.println("Cor:"+j2.getFlor2().getPetala2().getCorPetala());
         
          
         System.out.println("\nPetalas via Pracinha:");
         
         System.out.println("Cor:"+pracinha.getJ1().getFlor1().getPetala1().getCorPetala());
         System.out.println("Cor:"+pracinha.getJ1().getFlor1().getPetala2().getCorPetala());
         System.out.println("Cor:"+pracinha.getJ1().getFlor2().getPetala1().getCorPetala());
         System.out.println("Cor:"+pracinha.getJ1().getFlor2().getPetala2().getCorPetala()); 
         System.out.println("Cor:"+pracinha.getJ2().getFlor1().getPetala1().getCorPetala());
         System.out.println("Cor:"+pracinha.getJ2().getFlor1().getPetala2().getCorPetala());
         System.out.println("Cor:"+pracinha.getJ2().getFlor2().getPetala1().getCorPetala());
         System.out.println("Cor:"+pracinha.getJ2().getFlor2().getPetala2().getCorPetala());
    }
    
}
