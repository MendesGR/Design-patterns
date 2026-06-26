public class AzulFormaDecorada extends FormaDecorator{

    public AzulFormaDecorada(Forma formadecorada){
        super(formadecorada);
    }

    private void setAzulBorda(Forma formadecorada){
        System.out.println("Cor da borda: Azul");
    }
    
    @Override
    public void desenhar(){
        formadecorada.desenhar();
        setAzulBorda(formadecorada);
    }
}