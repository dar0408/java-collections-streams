package basic;
class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature - not recommended!");
    }

    public void newFeature() {
        System.out.println("New feature - use this instead.");
    }

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}