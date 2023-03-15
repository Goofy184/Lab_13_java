import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;
public class Main extends JFrame {
    public Main() {
        setUpWindow();
        setUpMenuBar();
        revalidate();
    }
    private void setUpWindow() {
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Window with menu");
    }
    private void setUpMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        setUpInsertMenuItem(menuBar);
        setUpFormatMenuItem(menuBar);
        setUpServiceMenuItem(menuBar);
        setJMenuBar(menuBar);
    }
    private void setUpInsertMenuItem(JMenuBar menuBar) {
        JMenu insertMenu = new JMenu("Вставка");
        JMenu nameSubMenu = new JMenu("Ім'я");
        JMenuItem assignName = new JMenuItem("Присвоїти");
        JMenuItem createName = new JMenuItem("Створити");
        nameSubMenu.add(assignName);
        nameSubMenu.add(createName);
        insertMenu.add(nameSubMenu);
        JMenuItem function = new JMenuItem("Функція");
        insertMenu.add(function);
        menuBar.add(insertMenu);
    }
    private void setUpFormatMenuItem(JMenuBar menuBar) {
        JMenu formatMenu = new JMenu("Формат");
        JMenuItem row = new JMenuItem("Рядок");
        formatMenu.add(row);
        formatMenu.add(new JSeparator());
        JMenuItem column = new JMenuItem("Стовпець");
        formatMenu.add(column);
        menuBar.add(formatMenu);
    }
    private void setUpServiceMenuItem(JMenuBar menuBar) {
        JMenu service = new JMenu("Сервіс");
        JMenuItem protection = new JMenuItem("Захист");
        JMenuItem settingsTable = new JMenuItem("Таблиця налаштувань");
        service.add(protection);
        service.add(settingsTable);
        menuBar.add(service);
    }
}