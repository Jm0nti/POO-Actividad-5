import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Figuras Geométricas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        
        JLabel lblRadio = new JLabel("Radio de la esfera y el cilindro: ");
        lblRadio.setBounds(50, 50, 200, 20);
        frame.add(lblRadio);

        JTextField tfRadio = new JTextField("");
        tfRadio.setBounds(300, 50, 200, 30);
        frame.add(tfRadio);

        JLabel lblAltura = new JLabel("Altura del cilindro y la piramide: ");
        lblAltura.setBounds(50, 100, 200, 20);
        frame.add(lblAltura);
        
        JTextField tfAltura = new JTextField("");
        tfAltura.setBounds(300, 100, 200, 30);
        frame.add(tfAltura);

        JLabel lblBase = new JLabel("Base de la piramide: ");
        lblBase.setBounds(50, 150, 200, 20);
        frame.add(lblBase);
        
        JTextField tfBase = new JTextField("");
        tfBase.setBounds(300, 150, 200, 30);
        frame.add(tfBase);

        JLabel lblApotema = new JLabel("Apotema de la piramide: ");
        lblApotema.setBounds(50, 200, 200, 20);
        frame.add(lblApotema);
        
        JTextField tfApotema = new JTextField("");
        tfApotema.setBounds(300, 200, 200, 30);
        frame.add(tfApotema);

        JTextArea lblResult = new JTextArea();
        lblResult.setBounds(50, 350, 500, 200);
        lblResult.setEditable(false);
        frame.add(lblResult);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(250, 300, 100, 40);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radio = Double.parseDouble(tfRadio.getText());
                double altura = Double.parseDouble(tfAltura.getText());
                double base = Double.parseDouble(tfBase.getText());
                double apotema = Double.parseDouble(tfApotema.getText());
                
                Cilindro cilindro = new Cilindro(radio, altura);
                Esfera esfera = new Esfera(radio);
                Piramide piramide = new Piramide(base, altura, apotema);
                
                double volumenCilindro = cilindro.calcularVolumen();
                double superficieCilindro = cilindro.calcularSuperficie();
                double volumenEsfera = esfera.calcularVolumen();
                double superficieEsfera = esfera.calcularSuperficie();
                double volumenPiramide = piramide.calcularVolumen();
                double superficiePiramide = piramide.calcularSuperficie();
                
                String resultText = "Volumen Cilindro: " + volumenCilindro + "\n" +
                                    "Superficie Cilindro: " + superficieCilindro + "\n" +
                                    "Volumen Esfera: " + volumenEsfera + "\n" +
                                    "Superficie Esfera: " + superficieEsfera + "\n" +
                                    "Volumen Piramide: " + volumenPiramide + "\n" +
                                    "Superficie Piramide: " + superficiePiramide;
                lblResult.setText(resultText);
            }
        });
        
        frame.add(btnCalcular);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
