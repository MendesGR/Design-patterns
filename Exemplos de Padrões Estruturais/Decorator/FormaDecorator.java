public abstract class FormaDecorator implements Forma{
    
    protected Forma formadecorada;

    public FormaDecorator(Forma formadecorada){
        this.formadecorada = formadecorada; 
    }

    public void desenhar(){
        formadecorada.desenhar();
    }
}