class FabricaNike implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }
}