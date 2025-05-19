public class ControleRemoto {
    //PARAMETROS
    public boolean ligado;
    public int volume;
    public boolean tocando;
    //METODOS PUBLICOS
    public void status(){
        System.out.println("ligado: " + this.ligado);
        System.out.println("volume: " + this.volume);
        System.out.println("tocando: " + this.tocando);
    }
    //LIGAR CONTROLE
    public void ligarControle() {
        if (this.ligado == false) {
            this.ligado = true;
            this.volume = 10;
            this.tocando = false;
            System.out.println("Ligando dispositivode som!\nVolume:10...");
        }else{
            System.out.println("O dispositivo de som ja esta ligado!");
        }
    }
    public void desligarControle(){
        if (this.ligado == true){
            this.setVolume(0);
            this.setLigado(false);
            this.setTocando(false);
            System.out.println("Desligando dispositivo de som!...");

        }else{
            System.out.println("Desligando dispositivo de som!...");
        }
    }
    public void aumentarVolume(){
        if (this.ligado == true){
            if (this.volume <= 100) {
                System.out.println("Aumentando volume (+5)...");
                this.volume += 5;
            }else{
                System.out.println("Volume ja esta no maximo!");
            }
        }else{
            System.out.println("Dispositivo de som desligado!Ligue o primeiro para aumentar volume...");
        }
    }
    public void diminuirVolume(){
        if (this.ligado == true){
            if (this.volume >= 5){
                System.out.println("Diminuindo volume (-5)...");
                this.volume-=5;
            }else{
                System.out.println("Impossivel diminuir volume pois o volume ja esta em (0)...");
            }
        }else{
            System.out.println("Dispositivo de som desligado!Ligue o primeiro para diminuir volume...");
        }
    }
    public void playControle(){
        if (this.ligado == true){
            if (this.volume ==0){
                tocando = true;
                System.out.println("Recomendo que voce aumente o volume que esta em (0)");
            }else{
                this.tocando = true;
                System.out.println("Ligando dispositivo de som!Volume (0)!...");
            }
        }else{
            System.out.println("Desligando dispositivo de som!...");
        }
    }
    public void pauseControle(){
        if (this.ligado == true){
            if (this.tocando == true){
                this.tocando = false;
                System.out.println("Pausando musica...");
            }else{
                System.out.println("Musica ja pausada!");
            }
        }else{
            System.out.println("Som desligado!Ligue o primeiro para realizar a acao!");
        }
    }
    public void muteControle(){
        if (this.ligado == true){
            if (this.tocando == true){
                if (this.volume >0){
                    this.setVolume(0);
                }else{
                    System.out.println("Volume ja esta em (0)...");
                }
            }else{
                System.out.println("Atencao o dispositivo de som esta pausado!\nPausa realizada com sucesso!");
            }
        }else{
            System.out.println("O dispositivo de som esta desligado!Ligue o primeiro para realizar a acao!");
        }
    }
    public void desmuteControle(){
        if (this.ligado == true){
            if (this.tocando == true && this.volume >0){
                this.volume = 10;
                System.out.println("Desmutando dispositivo de som!Volume (10)!...");
            }else{
                System.out.println("O dispositivo de som esta pausado!Desmutando o dispositivo de som!Volume(10)");
                this.setVolume(10);
            }
        }else{
            System.out.println("Impossivel realizar essa acao pois o dispositivo de som esta desligado!");
        }
    }
    //METODO CONSTRUTOR
    public ControleRemoto(){
        this.ligado = false;
        this.volume = 0;
        this.tocando = false;
    }
    //SETTER`S
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //GETTER`S
    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public int getVolume() {
        return volume;
    }
}