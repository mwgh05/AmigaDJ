package reproductor;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class ReproductorSonido{
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reproductor();
        });
    }
	
	public static void Reproductor() {
		JFrame frame=new JFrame("Reproductor de sonidos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(315,235);
		frame.setLocation(0, 0);
		
		JButton boton1=new JButton("");
		JButton boton2=new JButton("");
		JButton boton3=new JButton("");
		JButton boton4=new JButton("");
		JButton boton5=new JButton("");
		JButton boton6=new JButton("");
		
		frame.add(boton1);
		frame.add(boton2);
		frame.add(boton3);
		frame.add(boton4);
		frame.add(boton5);
		frame.add(boton6);
		
		
		boton1.addActionListener(e->ReproducirSonido("C:/Users/Melanie/OneDrive - Estudiantes ITCR/POO/AmigaDJ/DJ/src/sonidos/sonido1.wav"));//new ActionListener() {
		boton2.addActionListener(e->ReproducirSonido("C:/Users/Melanie/OneDrive - Estudiantes ITCR/POO/AmigaDJ/DJ/src/sonidos/sonido2.aiff"));
		boton3.addActionListener(e->ReproducirSonido("C:/Users/Melanie/OneDrive - Estudiantes ITCR/POO/AmigaDJ/DJ/src/sonidos/sonido3.wav"));
		boton4.addActionListener(e->ReproducirSonido("C:/Users/Melanie/OneDrive - Estudiantes ITCR/POO/AmigaDJ/DJ/src/sonidos/sonido4.wav"));
		boton5.addActionListener(e->ReproducirSonido("C:/Users/Melanie/OneDrive - Estudiantes ITCR/POO/AmigaDJ/DJ/src/sonidos/sonido5.wav"));
		boton6.addActionListener(e->ReproducirSonido("C:/Users/Melanie/OneDrive - Estudiantes ITCR/POO/AmigaDJ/DJ/src/sonidos/sonido6.wav"));
		
		boton1.setBounds(0, 0, 100, 100);
		boton2.setBounds(0, 100, 100, 100);
		boton3.setBounds(100, 0, 100, 100);
		boton4.setBounds(100, 100, 100, 100);
		boton5.setBounds(200, 0, 100, 100);
		boton6.setBounds(200, 100, 100, 100);
		
		boton1.setBackground(Color.green);
		boton2.setBackground(Color.magenta);
		boton3.setBackground(Color.orange);
		boton4.setBackground(Color.yellow);
		boton5.setBackground(Color.red);
		boton6.setBackground(Color.blue);
		
		JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        /*
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		panel.add(boton6);
		
		frame.add(panel)
		*/
        frame.setLayout(null);
		frame.setVisible(true);
	}

    public static void ReproducirSonido(String nombreSonido){
        try {
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
         Clip clip = AudioSystem.getClip();
         clip.open(audioInputStream);
         clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
          System.out.println("Error al reproducir el sonido.");
        }
      }
}


