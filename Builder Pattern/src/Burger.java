public class Burger extends Food {
    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public String size() {
        return "Large";
    }

    @Override
    public int price() {
        return 25;
    }
}

