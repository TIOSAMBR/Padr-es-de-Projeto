class FabricaPuma implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaBotafogo();
    }
}