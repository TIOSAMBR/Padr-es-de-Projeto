public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldVehicleStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldVehicleStorage) {
        this.oldVehicleStorage = oldVehicleStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        // Convertendo os dados do objeto Vehicle para o formato esperado pela biblioteca legada
        String data = vehicle.getId() + ";" + vehicle.getModel() + ";" + vehicle.getYear();

        // Chamando o método da biblioteca legada
        oldVehicleStorage.storeVehicleData(data);
    }
}
