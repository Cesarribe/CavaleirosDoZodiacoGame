public class ImprimirComPausa implements Runnable {
    private String mensagem;
    private int pausa;

    public ImprimirComPausa(String mensagem, int pausa) {
        this.mensagem = mensagem;
        this.pausa = pausa;
    }

    @Override
    public void run() {
        try {
            // Pausa antes de imprimir
            Thread.sleep(pausa);
            System.out.println(mensagem);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
