public class Computer {
    private String cpu;
    private int ram;
    private String storage;
    private boolean hasGraphicsCard;
    private boolean hasSSD;
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasSSD = builder.hasSSD;
    }
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public boolean hasGraphicsCard() {
        return hasGraphicsCard;
    }

    public boolean hasSSD() {
        return hasSSD;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private int ram;
        private String storage;
        private boolean hasGraphicsCard;
        private boolean hasSSD;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}