import javax.swing.SwingUtilities;

import MainView.MainViewTemplate;

public class App {
    public static void main(String[] args) throws Exception {

        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
                MainViewTemplate Plantilla = new MainViewTemplate();
            }
        };
        SwingUtilities.invokeLater(runApplication);

    }
}
