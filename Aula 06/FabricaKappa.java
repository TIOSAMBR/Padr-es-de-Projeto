class FabricaKappa implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaVasco();
    }
}