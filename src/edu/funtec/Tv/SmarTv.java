/**
 * A classe SmarTv representa uma televisão inteligente que possui
 * informações sobre seu estado (ligada/desligada), canal atual e volume.
 */
package edu.funtec.Tv;

public class SmarTv {
    private boolean ligada;
    private int canal;
    private int volume;
    
    /**
     * Construtor da classe SmarTv.
     *
     * @param ligada indica se a televisão está ligada (true) ou desligada (false)
     * @param canal o canal atual da televisão
     * @param volume o volume atual da televisão
     */
    public SmarTv(boolean ligada, int canal, int volume) {
        super();
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }
    
    // Getters and Setters
    
    /**
     * Verifica se a televisão está ligada.
     *
     * @return true se a televisão está ligada, false caso contrário
     */
    public boolean isLigada() {
        return ligada;
    }
    
    /**
     * Define o estado da televisão (ligada/desligada).
     *
     * @param ligada true para ligar a televisão, false para desligar
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    /**
     * Obtém o canal atual da televisão.
     *
     * @return o canal atual da televisão
     */
    public int getCanal() {
        return canal;
    }
    
    /**
     * Define o canal atual da televisão.
     *
     * @param canal o novo canal da televisão
     */
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    /**
     * Obtém o volume atual da televisão.
     *
     * @return o volume atual da televisão
     */
    public int getVolume() {
        return volume;
    }
    
    /**
     * Define o volume atual da televisão.
     *
     * @param volume o novo volume da televisão
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    // toString
    
    /**
     * Retorna uma representação em string da televisão.
     *
     * @return uma string contendo as informações sobre a televisão
     */
    @Override
    public String toString() {
        return "SmarTv [ligada=" + ligada + ", canal=" + canal + ", volume=" + volume + "]";
    }
    
    // Métodos
    
    /**
     * Liga a televisão.
     * Define o estado da televisão como ligada (true) e imprime na tela.
     */
    public void Ligar() {
        setLigada(true);
        System.out.println(isLigada());
    }
    
    /**
     * Desliga a televisão.
     * Define o estado da televisão como desligada (false), imprime na tela e encerra o programa.
     */
    public void desligar() {
        setLigada(false);
        System.out.println(isLigada());
        System.exit(0);
    }
    
    /**
     * Aumenta o volume da televisão em 1.
     * Incrementa o valor do volume em 1 e imprime na tela o novo valor.
     */
    public void aumentarVolume() {
        setVolume(this.volume += 1);
        System.out.println(getVolume());
    }
    
    /**
     * Diminui o volume da televisão em 1.
     * Decrementa o valor do volume em 1 e imprime na tela o novo valor.
     */
    public void diminuirVolume() {
        setVolume(this.volume -= 1);
        System.out.println(getVolume());
    }
    
    /**
     * Aumenta o canal da televisão em 1.
     * Incrementa o valor do canal em 1 e imprime na tela o novo valor.
     */
    public void aumentarCanal(){
        setCanal(this.canal +=1);
        System.out.println(getCanal());
    }
    
    /**
     * Diminui o canal da televisão em 1.
     * Decrementa o valor do canal em 1 e imprime na tela o novo valor.
     */
    public void diminuirCanal() {
        setCanal(this.canal -= 1);
        System.out.println(getCanal());
    }
    
    /**
     * Muda o canal da televisão para o valor especificado.
     * Define o canal atual da televisão como o valor especificado e imprime na tela o novo valor.
     *
     * @param canal o novo canal da televisão
     */
    public void mudarCanal(int canal) {
        setCanal(canal);
        System.out.println(getCanal());
    }
}
