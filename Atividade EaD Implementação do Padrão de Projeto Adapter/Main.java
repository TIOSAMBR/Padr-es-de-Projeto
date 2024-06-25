public class Main {
    public static void main(String[] args) {
        // Criando um objeto Vehicle
        Vehicle vehicle = new Vehicle("1", "Toyota Camry", 2020);

        // Criando uma instância da biblioteca legada
        OldVehicleStorage oldStorage = new OldVehicleStorage();

        // Criando o adapter
        IVehicleStorage adapter = new VehicleStorageAdapter(oldStorage);

        // Utilizando o adapter para salvar os dados do veículo
        adapter.saveVehicleData(vehicle);
    }
}
