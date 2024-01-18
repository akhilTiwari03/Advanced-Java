class CakeClass {
    private int sugar;
    private int milk;
    private int butter;
    private int eggs;
    private int vanilla;
    private int flour;
    private int bakingPowder;
    private int cherry;

    private CakeClass(CakeBuilder b) {
        this.sugar = b.sugar;
        this.milk = b.milk;
        this.butter = b.butter;
        this.eggs = b.eggs;
        this.vanilla = b.vanilla;
        this.flour = b.flour;
        this.bakingPowder = b.bakingPowder;
        this.cherry = b.cherry;
    }

    public int getSugar() {
        return this.sugar;
    }
    public int getMilk() {
        return this.milk;
    }
    public int getButter() {
        return butter;
    }
    public int getEggs() {
        return eggs;
    }
    public int getVanilla() {
        return vanilla;
    }
    public int getFlour() {
        return flour;
    }
    public int getBakingPowder() {
        return bakingPowder;
    }
    public int getCherry() {
        return cherry;
    }
    @Override
    public String toString()
    {
        return "Sugar "+ this.getSugar()+" : Milk "+this.getMilk()+" : Butter "+this.getButter()+" : Eggs "+this.getEggs()+" : Vanilla "+this.getVanilla()+" : Flour "+this.getFlour()+" : BakingPowder "+this.getBakingPowder()+" : Cherry "+this.getCherry();
    }
    static class CakeBuilder {
        private int sugar;
        private int milk;
        private int butter;
        private int eggs;
        private int vanilla;
        private int flour;
        private int bakingPowder;
        private int cherry;

        public CakeBuilder(int Eggs) {// This constructor is used for mandatory feilds
            this.eggs = Eggs;
        } 

        public CakeBuilder setSugar(int sugar) {
            this.sugar = sugar;
            return this;
        }
        public CakeBuilder setMilk(int milk) {
            this.milk = milk;
            return this;
        }
        public CakeBuilder setButter(int butter) {
            this.butter = butter;
            return this;
        }
        public CakeBuilder setEggs(int eggs) {
            this.eggs = eggs;
            return this;
        }
        public CakeBuilder setVanilla(int vanilla) {
            this.vanilla = vanilla;
            return this;
        }
        public CakeBuilder setFlour(int flour) {
            this.flour = flour;
            return this;
        }
        public CakeBuilder setBakingPowder(int bakingPowder) {
            this.bakingPowder = bakingPowder;
            return this;
        }
        public CakeBuilder setCherry(int cherry) {
            this.cherry = cherry;
            return this;
        }
        
        public CakeClass build() {
            CakeClass obj = new CakeClass(this);
            return obj;
        }
    }
}

public class Cake {
    public static void main(String[] args) {
        CakeClass u1 = new CakeClass.CakeBuilder(3)
                        .setSugar(1).setMilk(3)
                        .setButter(1)
                        .setVanilla(2)
                        .setFlour(3)
                        .setBakingPowder(1)
                        .setCherry(2)
                        .build();

        System.out.println(u1);
    }
}
