class FabricaAdidas implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}
