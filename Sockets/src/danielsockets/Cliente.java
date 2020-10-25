package danielsockets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;
public class Cliente {
	public static void main(String[] args) {
		MarcoCliente mimarco=new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoCliente extends JFrame{
	public MarcoCliente(){
		setBounds(600,300,280,350);
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		add(milamina);
		setVisible(true);
		addWindowListener(new EnvioOnline());
		}	
}

class EnvioOnline extends WindowAdapter{
	public void windowOpened(WindowEvent e){
		try{
			Socket socket2 = new Socket("192.168.0.6",9999);
			PaqueteEnvio datos = new PaqueteEnvio();
			datos.setMensaje("Online");
			ObjectOutputStream salidaflujo = new ObjectOutputStream(socket2.getOutputStream());
			salidaflujo.writeObject(datos);
			socket2.close();
		}catch(Exception e2){
			e2.getMessage();
		}
	}
}
class LaminaMarcoCliente extends JPanel implements Runnable{
	public LaminaMarcoCliente(){
		String nick_usuario=JOptionPane.showInputDialog("Nick: ");
		JLabel n_nick=new JLabel("Nick: ");
		add(n_nick);
		nick=new JLabel();
		nick.setText(nick_usuario);
		add(nick);
		JLabel texto=new JLabel("Online: ");
		add(texto);
		ip=new JComboBox();
		
		add(ip);
		campochat = new JTextArea(12,20);
		add(campochat);
		campo1=new JTextField(20);
		add(campo1);		
		miboton=new JButton("Enviar");
		miboton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				capturaTexto=campo1.getText();
				try {
					Socket misocket = new Socket("192.168.0.6",9999);
					PaqueteEnvio datos=new PaqueteEnvio();
					datos.setNick(nick.getText());
					datos.setIp(ip.getSelectedItem().toString());
					System.out.println(datos.getIp());
					datos.setMensaje(campo1.getText());
					ObjectOutputStream paqueteDatos=new ObjectOutputStream(misocket.getOutputStream());
					paqueteDatos.writeObject(datos);
					misocket.close();
					/*DataOutputStream flujo_salida=new DataOutputStream(misocket.getOutputStream());
					flujo_salida.writeUTF(capturaTexto);
					flujo_salida.close();*/
					
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				campochat.append("\n"+campo1.getText());
			}
		});
		add(miboton);
		Thread hilo2 = new Thread(this);
		hilo2.start();
	}
	private String capturaTexto;
	private JTextArea campochat;	
	private JTextField campo1;
	private JComboBox ip;
	private JLabel nick;
	private JButton miboton;
	@Override
	public void run() {
		try {
			ServerSocket servidor_cliente = new ServerSocket(9090);
			Socket cliente;
			PaqueteEnvio paqueteRecibido;
			while(true){
			cliente = servidor_cliente.accept();
			ObjectInputStream flujoentrada=new ObjectInputStream(cliente.getInputStream());
			paqueteRecibido=(PaqueteEnvio)flujoentrada.readObject();
			if(!paqueteRecibido.getMensaje().equals("Online")){
				campochat.append("\n"+paqueteRecibido.getNick()+" : "+paqueteRecibido.getMensaje());
			}else{
			ip.removeAllItems();
			for (String tmp : paqueteRecibido.getIps()) {
				ip.addItem(tmp);
			}
			
			}
			}
		} catch (IOException | ClassNotFoundException e) {
			
			System.out.println(e.getMessage()); 
		}
	}
}
class PaqueteEnvio implements Serializable{
	
	
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	public ArrayList<String> getIps() {
		return Ips;
	}

	public void setIps(ArrayList<String> ips) {
		Ips = ips;
	}
	private String nick,ip,mensaje;
	private ArrayList<String> Ips;
}


