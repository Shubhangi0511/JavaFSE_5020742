public class ComputerBuilderTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel Core i3")
                .setRAM(8)
                .setStorage("500GB HDD")
                .build();
        System.out.println("Basic Computer: " + basicComputer.getCpu() + ", " + basicComputer.getRam() + "GB, " + basicComputer.getStorage());

        Computer gamingComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM(16)
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer.getCpu() + ", " + gamingComputer.getRam() + "GB, " + gamingComputer.getStorage() + ", Graphics Card: " + gamingComputer.hasGraphicsCard());
        Computer serverComputer = new Computer.Builder()
                .setCPU("Intel Xeon")
                .setRAM(32)
                .setStorage("2TB HDD")
                .setSSD(true)
                .build();
        System.out.println("Server Computer: " + serverComputer.getCpu() + ", " + serverComputer.getRam() + "GB, " + serverComputer.getStorage() + ", SSD: " + serverComputer.hasSSD());
    }
}