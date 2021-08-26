package jardimdeflores;


public class Petala {
    
        private String cor="";
        
        //push
        public void setCorPetala(String cor){
            this.cor=cor;
        }
        
        //pull
        public String getCorPetala(){
            return cor;
        }
        
        //tipos primitivos passam uma copia
        //objetos passam ponteiros
        public void setComprimento(Petala x){
            
        }
}
