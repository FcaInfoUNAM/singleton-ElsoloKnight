public class Main {
    public static void main(String[] args) {
        // Antes: AppConfig config = new AppConfig();
        AppConfig config = AppConfig.getInstance();

        config.setTheme("Dark");
        config.setLanguage("ES");
        config.printConfig();
    }
}