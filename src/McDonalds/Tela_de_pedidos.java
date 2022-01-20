package McDonalds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Tela_de_pedidos extends JPanel{
	
	
	
	private JLabel lbpag, lblanches, lbacompanhamentos,lbbebidas,sizeBIgmac,sizebigtasty,
	sizemcduplo,sizecheddar,sizemcfritas,sizemcmolho,sizecoca,sizeGuarana,sizefanta;
	private JButton btfinalizar;
	private JRadioButton rbcartao, rbdinheiro, rbvr;
	private ButtonGroup btGroup;
	private JCheckBox CBBigMac, CBBigtasty, CBMcduplo, CBcheddar, CBMcFritas, CBMcMolho, CBcoca, CBguarana, CBFanta;
	
	private ImageIcon bigmacimg, Bigtastyimg, Mcduploimg, cheddarimg, McFritasimg, mcmolhoimg , cocaimg, guaranaimg,
	fantaimg;
	
	
	private JSpinner qtdL1, qtdL2, qtdL3, qtdA1, qtdA2, qtdA3, qtdB1, qtdB2, qtdB3;
	
	private SpinnerModel n1 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n2 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n3 = new SpinnerNumberModel(1, 0, 10, 1);
	
	private SpinnerModel n4 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n5 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n6 = new SpinnerNumberModel(1, 0, 10, 1);
	
	private SpinnerModel n7 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n8 = new SpinnerNumberModel(1, 0, 10, 1);
	private SpinnerModel n9 = new SpinnerNumberModel(1, 0, 10, 1);
	
	
	public Tela_de_pedidos(){
		inicializarComponentes();
		definirEventos(); 
	}
	
	private void inicializarComponentes() {
		
		
		bigmacimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\download.jfif");
		sizeBIgmac = new JLabel(bigmacimg);
		
		Bigtastyimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\bigtasty.jfif");
		sizebigtasty = new JLabel(Bigtastyimg);
		
		Mcduploimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\mcduplo.jfif");
		sizemcduplo = new JLabel(Mcduploimg);
		
		cheddarimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\cheddar.jfif");
		sizecheddar = new JLabel(cheddarimg);
		
		McFritasimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\mcfritas.jfif");
		sizemcfritas = new JLabel(McFritasimg);	
		
		mcmolhoimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\mcmolho.jfif");
		sizemcmolho = new JLabel(mcmolhoimg);
		
		cocaimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\coca.jfif");
		sizecoca = new JLabel(cocaimg);
		
		guaranaimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\guarana.jfif");
		sizeGuarana = new JLabel( guaranaimg);
		
		fantaimg = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\fanta.jfif");
		sizefanta = new JLabel(fantaimg);
		
		lbpag = new JLabel("Formas de Pagamento:");
		lblanches = new JLabel("LANCHES:");
		lbacompanhamentos = new JLabel("ACOMPANHAMENTOS:");
		lbbebidas = new JLabel("BEBIDAS:");
		btfinalizar = new JButton("Finalizar Pedido");
		
		CBBigMac = new JCheckBox("Big Mac (R$21,90)");
		CBBigtasty = new JCheckBox("Big Tasty (R$28,90)");
		CBMcduplo = new JCheckBox("McDuplo (R$6,90)");
		CBcheddar = new JCheckBox("Cheddar (R$08,50)");
		CBMcFritas = new JCheckBox("Mc Fritas (R$05,99)");
		CBMcMolho = new JCheckBox("McMolho (R$12,50)");
		CBcoca = new JCheckBox("Coca (R$05,00)");
		CBguarana = new JCheckBox("Guaraná (R$04,50)");
		CBFanta = new JCheckBox("Fanta (R$04,00)");
		
	    qtdL1 = new JSpinner(n1);
	    qtdL2 = new JSpinner(n2);
	    qtdL3 = new JSpinner(n3);
	    
	    qtdA1 = new JSpinner(n4);
	    qtdA2 = new JSpinner(n5);
	    qtdA3 = new JSpinner(n6);
	    
	    qtdB1 = new JSpinner(n7);
	    qtdB2 = new JSpinner(n8);
	    qtdB3 = new JSpinner(n9);
		
		rbcartao = new JRadioButton("Cartão de Crédito/Débito");
		rbdinheiro = new JRadioButton("Dinheiro");
		rbvr = new JRadioButton("Vale-Refeição");
		btGroup = new ButtonGroup();
		
		btGroup.add(rbcartao);
		btGroup.add(rbdinheiro);
		btGroup.add(rbvr);

		setLayout(null);
		
		btfinalizar.setBounds(280,560,150,30);
		
		
		sizeBIgmac.setBounds(60,145,95,85);
		sizebigtasty.setBounds(60,250,95,85);
		sizemcduplo.setBounds(60,350,95,85);
		sizecheddar.setBounds(290,145,95,85);
		sizemcfritas.setBounds(290,250,95,85);
		sizemcmolho.setBounds(290,350,95,85);
		sizecoca.setBounds(530,145,95,85);
		sizeGuarana.setBounds(530,250,95,85);
		sizefanta.setBounds(530,350,95,85);
		
		lblanches.setBounds(80,90,100,40);
		lbacompanhamentos.setBounds(280,90,160,40);
		lbbebidas.setBounds(550,90,100,40);
		
		CBBigMac.setBounds(30,130,150,20);
		CBBigtasty.setBounds(30,230,150,20);
		CBMcduplo.setBounds(30,330,140,20);
		
		qtdL1.setBounds(180,130,30,20);
		qtdL2.setBounds(180,230,30,20);
		qtdL3.setBounds(180,330,30,20);
		
		CBcheddar.setBounds(260,130,150,20);
		CBMcFritas.setBounds(260,230,150,20);
		CBMcMolho.setBounds(260,330,150,20);
		
		qtdA1.setBounds(415,130,30,20);
		qtdA2.setBounds(415,230,30,20);
		qtdA3.setBounds(415,330,30,20);
		
		CBcoca.setBounds(500,130,125,20);
		CBguarana.setBounds(500,230,140,20);
		CBFanta.setBounds(500,330,140,20);
		
		qtdB1.setBounds(640,130,30,20);
		qtdB2.setBounds(640,230,30,20);
		qtdB3.setBounds(640,330,30,20);
		
		lbpag.setBounds(280,502,200,20);
		rbcartao.setBounds(130,530,180,20);
		rbdinheiro.setBounds(320,530,100,20);
		rbvr.setBounds(420,530,120,20);
		
		setBackground(Color.red);
		rbdinheiro.setBackground(Color.red);
		rbcartao.setBackground(Color.red);
		
		rbvr.setBackground(Color.red);
		
		CBBigMac.setBackground(Color.red);
		CBBigtasty.setBackground(Color.red);
		CBMcduplo.setBackground(Color.red);
		CBcheddar.setBackground(Color.red);
		CBMcFritas.setBackground(Color.red);
		CBMcMolho.setBackground(Color.red);
		CBcoca.setBackground(Color.red);
		CBguarana.setBackground(Color.red);		
		CBFanta.setBackground(Color.red);
		
		btfinalizar.setBackground(Color.black);
		btfinalizar.setForeground(Color.blue);
		btfinalizar.setToolTipText("Definir pedido e calcular valor.");
		btfinalizar.setFont(new Font("AlNile", Font.BOLD, 14));

		lbpag.setFont(new Font("Cooper Black", Font.BOLD, 14));
		lbpag.setForeground(Color.white);
		lblanches.setForeground(Color.white);
		lblanches.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lbacompanhamentos.setForeground(Color.white); 
		lbacompanhamentos.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lbbebidas.setForeground(Color.white); 
		lbbebidas.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		
		add(btfinalizar);
		add(CBBigMac);
		add(CBBigtasty);
		add(CBMcduplo);
		add(CBcheddar);
		add(CBMcFritas);
		add(CBMcMolho);
		add(CBcoca);
		add(CBguarana);
		add(CBFanta);
		
		add(qtdL1);
		add(qtdL2);
		add(qtdL3);
		
		add(qtdA1);
		add(qtdA2);
		add(qtdA3);
		
		add(qtdB1);
		add(qtdB2);
		add(qtdB3);
		
		add(rbcartao);
		add(rbdinheiro);
		add(rbvr);
		
		add(lbpag);
		
		add(lblanches);
		add(lbacompanhamentos);
		add(lbbebidas);
		
		add(sizeBIgmac);
		add(sizebigtasty);
		add(sizemcduplo);
		add(sizecheddar);
		add(sizemcfritas);
		add(sizemcmolho);
		add(sizecoca);
		add(sizeGuarana);
		add(sizefanta);
		
		
		qtdL1.setEnabled(false);
		qtdL2.setEnabled(false);
		qtdL3.setEnabled(false);
		
		qtdA1.setEnabled(false);
		qtdA2.setEnabled(false);
		qtdA3.setEnabled(false);
		
		qtdB1.setEnabled(false);
		qtdB2.setEnabled(false);
		qtdB3.setEnabled(false);
		
			
	}

	private void definirEventos(){
		CBBigMac.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				if(CBBigMac.isSelected()) {
					qtdL1.setEnabled(true);
				}else {
					qtdL1.setEnabled(false);
					qtdL1.setValue(0);
				}
				}});
		CBBigtasty.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent b){
				if(CBBigtasty.isSelected()) {
					qtdL2.setEnabled(true);
				}else {
					qtdL2.setEnabled(false);
					qtdL2.setValue(0);
				}
				}});
		
		CBMcduplo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent c){
				if(CBMcduplo.isSelected()) {
					qtdL3.setEnabled(true);
				}else {
					qtdL3.setEnabled(false);
					qtdL3.setValue(0);
				}
				}});
		
		CBcheddar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent d){
				if(CBcheddar.isSelected()) {
					qtdA1.setEnabled(true);
				}else {
					qtdA1.setEnabled(false);
					qtdA1.setValue(0);
				}
				}});
		
		CBMcFritas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(CBMcFritas.isSelected()) {
					qtdA2.setEnabled(true);
				}else {
					qtdA2.setEnabled(false);
					qtdA2.setValue(0);
				}
				}});
		
		CBMcMolho.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent f){
				if(CBMcMolho.isSelected()) {
					qtdA3.setEnabled(true);
				}else {
					qtdA3.setEnabled(false);
					qtdA3.setValue(0);
				}
				}});
		
		CBcoca.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent g){
				if(CBcoca.isSelected()) {
					qtdB1.setEnabled(true);
				}else {
					qtdB1.setEnabled(false);
					qtdB1.setValue(0);
				}
				}});
		
		CBguarana.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent h){
				if(CBguarana.isSelected()) {
					qtdB2.setEnabled(true);
				}else {
					qtdB2.setEnabled(false);
					qtdB2.setValue(0);
				}
				}});
		
		CBFanta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent i){
				if(CBFanta.isSelected()) {
					qtdB3.setEnabled(true);
				}else {
					qtdB3.setEnabled(false);
					qtdB3.setValue(0);
				}
				}});
		
		btfinalizar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent j){
				
				DecimalFormat formatador = new DecimalFormat("0.00");
				String selecao = "Pedido: \n";
				
				double vtotalL = 0;
				double vtotalA = 0;
				double vtotalB = 0;
				double valortotal = 0;
				
				int ap1 = 0;
				int ap2 = 0;
				int ap3 = 0;
				int ap4 = 0;
				int ap5 = 0;
				int ap6 = 0;
				int ap7 = 0;
				int ap8 = 0;
				int ap9 = 0;
				
				if(CBBigMac.isSelected()) {
					ap1 = Integer.parseInt(qtdL1.getValue().toString());
					selecao += ap1 = Integer.parseInt(qtdL1.getValue().toString());
					selecao += " Big Mac\n";
					vtotalL = ap1 * 21.99;
				}
				if(CBBigtasty.isSelected()) {
					ap2 = Integer.parseInt(qtdL2.getValue().toString());
					selecao += ap2 = Integer.parseInt(qtdL2.getValue().toString());
					selecao += " Big Tasty\n";
					vtotalL = ap2 * 28.90;
				}

				if(CBMcduplo.isSelected()) {
					ap3 = Integer.parseInt(qtdL3.getValue().toString());
					selecao += ap3 = Integer.parseInt(qtdL3.getValue().toString());
					selecao += " McDuplo";
					vtotalL = ap3 * 6.90;
				}

				if(CBcheddar.isSelected()) {
					ap4 = Integer.parseInt(qtdA1.getValue().toString());
					selecao += ap4 = Integer.parseInt(qtdA1.getValue().toString());
					selecao += "Cheddar\n";
					vtotalA = ap4 * 8.50;
				}

				if(CBMcFritas.isSelected()) {
					ap5 = Integer.parseInt(qtdA2.getValue().toString());
					selecao += ap5 = Integer.parseInt(qtdA2.getValue().toString());
					selecao += " Mc-Fritas\n";
					vtotalA = ap5 * 5.99;
				}

				if(CBMcMolho.isSelected()) {
					ap6 = Integer.parseInt(qtdA3.getValue().toString());
					selecao += ap6 = Integer.parseInt(qtdA3.getValue().toString());
					selecao += " McMolho\n";
					vtotalA = ap6 * 12.50;
				}

				if(CBcoca.isSelected()) {
					ap7 = Integer.parseInt(qtdB1.getValue().toString());
					selecao += ap7 = Integer.parseInt(qtdB1.getValue().toString());
					selecao += " coca\n";
					vtotalB = ap7 * 5.00;
				}

				if(CBguarana.isSelected()) {
					ap8 = Integer.parseInt(qtdB2.getValue().toString());
					selecao += ap8 = Integer.parseInt(qtdB2.getValue().toString());
					selecao += " Guaraná\n";
					vtotalB = ap8 * 4.50;
				}

				if(CBFanta.isSelected()) {
					ap9 = Integer.parseInt(qtdB3.getValue().toString());
					selecao += ap9 = Integer.parseInt(qtdB3.getValue().toString());
					selecao += " Fanta\n";
					vtotalB = ap9 * 4.50;
				}
				 
				valortotal = vtotalL + vtotalA + vtotalB;
				if(btGroup.isSelected(null)||valortotal==0) {
					UIManager.getDefaults().put("OptionPane.background",new Color(255,215,0));
					UIManager.put ("Panel.background", new Color(255,215,0));
					UIManager.put("OptionPane.okButtonText", "Fechar");
					JOptionPane.showMessageDialog(null, "Pedido incompleto. Por favor, tente novamente.", "Erro",2);
				}else {
					if(rbdinheiro.isSelected()) {
						UIManager.getDefaults().put("OptionPane.background",new Color(255,0,0));
						UIManager.put ("Panel.background", new Color(255,0,0));
						UIManager.put("OptionPane.okButtonText", "Finalizar");
						ImageIcon icon = new ImageIcon("");
						
						JOptionPane.showMessageDialog(null, selecao+ "\nValor total do Pedido: R$" + formatador.format(valortotal),"Pagamento em Dinheiro.",0,icon);
					}
					if(rbcartao.isSelected()) {
						UIManager.getDefaults().put("OptionPane.background",new Color(255,0,0));
						UIManager.put ("Panel.background", new Color(255,0,0));
						UIManager.put("OptionPane.okButtonText", "Finalizar");
						ImageIcon icon = new ImageIcon("");
						
						JOptionPane.showMessageDialog(null, selecao+ "\nValor total do Pedido: R$" + formatador.format(valortotal),"Pagamento com Cartão",0,icon);
						}
					if(rbvr.isSelected()) {
						
						UIManager.put ("Panel.background", new Color(255,0,0));
						UIManager.put("OptionPane.okButtonText", "Finalizar");
						ImageIcon icon = new ImageIcon("");
						
						JOptionPane.showMessageDialog(null, selecao+ "\nValor total do Pedido: R$" + formatador.format(valortotal),"Pagamento com Vale Refeição",0,icon);
				}
					}
			
			
			}});
		}
	
	public static void main(String args[]){
	 		JFrame frame = new JFrame("McDonalds - Cardápio");
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 frame.setResizable(false);
			 frame.getContentPane().add(new Tela_de_pedidos());
			 frame.setBounds(350,0,710,710);
			 frame.setVisible(true);
			
            
		 }
	}
