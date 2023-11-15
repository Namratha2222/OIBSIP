import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationSystemGUI extends JFrame {

    public ReservationSystemGUI() {
        setTitle("Online Reservation System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components for login form
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        // Components for reservation form
        JTextField trainNumberField = new JTextField();
        JTextField trainNameField = new JTextField();
        JTextField classTypeField = new JTextField();
        JTextField dateField = new JTextField();
        JTextField fromField = new JTextField();
        JTextField toField = new JTextField();
        JButton insertButton = new JButton("Insert Reservation");

        // Components for cancellation form
        JTextField pnrField = new JTextField();
        JButton cancelButton = new JButton("Cancel Reservation");

        // Layout setup (you might need to adjust layout based on your preferences)
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Login Form
        add(new JLabel("Login"));
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);

        // Reservation Form
        add(new JLabel("Reservation"));
        add(new JLabel("Train Number:"));
        add(trainNumberField);
        // Add other fields for reservation form
        add(insertButton);

        // Cancellation Form
        add(new JLabel("Cancellation"));
        add(new JLabel("PNR Number:"));
        add(pnrField);
        add(cancelButton);

        // ActionListeners for buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for login authentication logic
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Perform authentication with provided username and password
                // Check credentials against stored data or database
                // Example: if(username.equals("admin") && password.equals("password")) { // Successful login }
            }
        });

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for reservation insertion logic
                String trainNumber = trainNumberField.getText();
                String trainName = trainNameField.getText();
                String classType = classTypeField.getText();
                String date = dateField.getText();
                String from = fromField.getText();
                String to = toField.getText();
                // Perform reservation insertion into the database
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for cancellation logic
                String pnr = pnrField.getText();
                // Retrieve reservation details based on PNR number from the database
                // Display information or perform cancellation
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ReservationSystemGUI();
            }
        });
    }
}