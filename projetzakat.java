package zakat;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class projetzakat {

	public static void main(String[] args) {
		
		JFrame fenetre =new JFrame();
		fenetre.setSize(900, 563);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
				
		ImageIcon img66 = new ImageIcon("arr.jpg");
		JLabel background66 = new JLabel("",img66,JLabel.CENTER);
		fenetre.add(background66);
		
		
/*//////////////////////////////////////////////////////////////////////////////////////////////////////////*/
		JButton bt1 = new JButton("numeriques");
		bt1.setBounds(100, 80, 200, 120);
		ImageIcon img = new ImageIcon("num.jpg");
		JLabel background = new JLabel("",img,JLabel.CENTER);
		bt1.add(background);
		JLabel text1 = new JLabel("numérique");
		text1.setBounds(330, 231, 400, 60);
		text1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 50));
		bt1.setBackground(Color.white);
		bt1.setToolTipText("cliquer pour calculer votre zakat de numrique");
bt1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				background66.remove(text1);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				background66.add(text1);
				background66.validate();
				background66.repaint();
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fenetre1 =new JFrame();
				fenetre1.setSize(900, 563);
				fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fenetre1.setLocationRelativeTo(null);
				fenetre1.setVisible(true);
				fenetre .setVisible(false);
				Container c2 = fenetre1.getContentPane();
				JPanel pan1 = new JPanel();
	
				c2.add(pan1);
				
				JLabel lab1 = new JLabel("Entrez la valeur de votre liquidité\r\n" + "");
				lab1.setBounds(210, 100, 900, 100);
				lab1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
				JLabel labc1 = new JLabel("il faut saisir un chifre >=552500");
				labc1.setBounds(250, 150, 900, 100);
				labc1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 25));
				JLabel labc2 = new JLabel("il faut saisir un chifre >=552500");
				labc2.setBounds(250, 150, 900, 100);
				labc2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 25));
				JLabel labc3 = new JLabel("Resultat : ");
				labc3.setBounds(360, 300, 150, 30);
				labc3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 25));
				JLabel labc4 = new JLabel("");
				labc4.setBounds(470, 300, 150, 30);
				labc4.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 25));
				JLabel labc5 = new JLabel(" DA");
				labc5.setBounds(620, 300, 150, 30);
				labc5.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 25));
				JButton bt6 = new JButton("retour");
				bt6.setBounds(660, 400, 130, 40);
				bt6.setBackground(Color.BLACK);
				JTextField text6 = new JTextField();
				text6.setBounds(330, 230, 220, 30);
				//////////////////////////////////////////////////
				JButton bt11 = new JButton("calculer");
				bt11.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
				bt11.setBounds(360, 265, 150, 30);
				bt11.setBackground(Color.BLACK);
				bt11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						double i=0.0;
						double n = Double.parseDouble(text6.getText());
						if(n>=552500) {
						i= n*2.5/100;
                        }else {
                        text6.setText("il faut saisir un chifre >=552500");
                        }
						labc4.setText(String.valueOf(i));
						
					}
				});
				
////////////////////////////////////////////////
				ImageIcon img66 = new ImageIcon("arr.jpg");
				JLabel background66 = new JLabel("",img66,JLabel.CENTER);
				
				ImageIcon img6 = new ImageIcon("reto.jpg");
				JLabel background6 = new JLabel("",img6,JLabel.CENTER);
				
				fenetre1.add(background66);
				background66.add(bt6);
				background66.add(bt11);
				background66.add(text6);
				background66.add(lab1);
				background66.add(labc1);
				background66.add(labc2);
				background66.add(labc3);
				background66.add(labc4);
				background66.add(labc5);
				bt6.add(background6);
				
				bt6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						fenetre.setVisible(true);
						fenetre1.setVisible(false);
						
					}
				});
				
				
			}
		});
/*//////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        JButton bt2 = new JButton("");
        bt2.setBounds(343, 80, 200, 120);
        ImageIcon img2 = new ImageIcon("agri.jpg");
		JLabel background2 = new JLabel("",img2,JLabel.CENTER);
		bt2.add(background2);
		JLabel text2 = new JLabel("agriculture");
		text2.setBounds(331, 231, 400, 60);
		text2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 50));
		bt2.setBackground(Color.WHITE);
		
		bt2.setToolTipText("cliquer pour calculer votre zakat de l'agriculure");
bt2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				background66.remove(text2);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				background66.add(text2);
				background66.validate();
				background66.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fenetre1 =new JFrame();
				fenetre1.setSize(900, 563);
				fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fenetre1.setLocationRelativeTo(null);
				fenetre1.setVisible(true);
				fenetre .setVisible(false);
				Container c2 = fenetre1.getContentPane();
				JPanel pan1 = new JPanel();
	
				c2.add(pan1);
				
				JLabel lab1 = new JLabel("choiser le type de l'irrigation\r\n" + "");
				lab1.setBounds(210, 65, 900, 100);
				lab1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
				JButton bt6 = new JButton("retour");
				bt6.setBounds(660, 400, 130, 40);
				bt6.setBackground(Color.BLACK);
				JRadioButton rbt1 = new JRadioButton("Naturel");
				JRadioButton rbt2 = new JRadioButton("Artificiel");
				rbt1.setBounds(280, 160, 140,50);
				rbt2.setBounds(440, 160, 150,50);
				rbt1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
				rbt2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
				JRadioButton rbt3 = new JRadioButton("blé");
				JRadioButton rbt4 = new JRadioButton("autre");
				rbt3.setBounds(600, 135, 140,50);
				rbt4.setBounds(600, 185, 140,50);
				rbt3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 15));
				rbt4.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 15));
				ButtonGroup bg = new ButtonGroup();
				bg.add(rbt1);
				bg.add(rbt2);
				ButtonGroup bg1 = new ButtonGroup();
				bg1.add(rbt3);
				bg1.add(rbt4);
				JLabel lab2 = new JLabel("entrer votre quantite en KG\r\n" + "");
				lab2.setBounds(210, 200, 900, 100);
				lab2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
				JLabel lab3 = new JLabel("Resultat :");
				lab3.setBounds(280, 325, 900, 100);
				lab3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JLabel lab4 = new JLabel("");
				lab4.setBounds(440, 325, 900, 100);
				lab4.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JLabel lab5 = new JLabel("KG");
				lab5.setBounds(600, 325, 900, 100);
				lab5.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				rbt1.setBackground(Color.BLACK);
				rbt2.setBackground(Color.BLACK);
				rbt3.setBackground(Color.BLACK);
				rbt4.setBackground(Color.BLACK);
				JTextField text66 = new JTextField();
				text66.setBounds(280, 300, 200, 30); 
				JButton bt11 = new JButton("calculer");
				bt11.setBounds(500, 300, 100, 30);
				bt11.setBackground(Color.BLACK);
				
				
				bt11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						double n1 = Double.parseDouble(text66.getText());
						double i=0.0;
						if (rbt4.isSelected()) {
						if (rbt1.isSelected()) {
							i=n1*10/100;
						}
						if (rbt2.isSelected()) {
							i=n1*5/100;
						}
						}
						if (rbt3.isSelected()) {
							if (rbt1.isSelected()&&n1>=675) {
								i=n1*10/100;
							}
							if(rbt1.isSelected()&&n1<675){
								text66.setText("il faut saisir un chifre >= 675");
							}
							if (rbt2.isSelected()&&n1>=675) {
								i=n1*5/100;
							}if(rbt2.isSelected()&&n1<675){
								text66.setText("il faut saisir un chifre >= 675");
							}
							}
						lab4.setText(String.valueOf(i));
					}
				});
				ImageIcon img66 = new ImageIcon("arr.jpg");
				JLabel background66 = new JLabel("",img66,JLabel.CENTER);
				
				ImageIcon img6 = new ImageIcon("reto.jpg");
				JLabel background6 = new JLabel("",img6,JLabel.CENTER);
				
				fenetre1.add(background66);
				background66.add(bt6);
				background66.add(bt11);
				background66.add(text66);
				background66.add(lab1);
				background66.add(lab2);
				background66.add(lab3);
				background66.add(lab4);
				background66.add(lab5);
				background66.add(rbt1);
				background66.add(rbt2);
				background66.add(rbt3);
				background66.add(rbt4);
				bt6.add(background6);
				
				bt6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						fenetre.setVisible(true);
						fenetre1.setVisible(false);
									
					}
				});
				
				
			}
		});
 /*//////////////////////////////////////////////////////////////////////////////////////////////////*/
		JButton bt3 = new JButton("3");
		bt3.setBounds(100, 320, 200, 120);
		ImageIcon img3 = new ImageIcon("orarg.jpg");
		JLabel background3 = new JLabel("",img3,JLabel.CENTER);
		bt3.add(background3);
		JLabel text3 = new JLabel("  trésor");
		text3.setBounds(350, 231, 400, 50);
		text3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 50));
		bt3.setBackground(Color.WHITE);
		bt3.setToolTipText("cliquer pour calculer votre zakat du trésor ");
bt3.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				background66.remove(text3);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

				background66.add(text3);
				background66.validate();
				background66.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fenetre1 =new JFrame();
				fenetre1.setSize(900, 563);
				fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fenetre1.setLocationRelativeTo(null);
				fenetre1.setVisible(true);
				fenetre .setVisible(false);
				Container c2 = fenetre1.getContentPane();
				JPanel pan1 = new JPanel();
	
				c2.add(pan1);
				
				JLabel lab1 = new JLabel("zakat du trésor est comme la suite : ");
				lab1.setBounds(210, 100, 900, 100);
				lab1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JLabel lab3 = new JLabel("Attendez que le strabisme apparaisse puis ");
				lab3.setBounds(150, 190, 900, 100);
				lab3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JLabel lab4 = new JLabel("fourni le zakat qui est 20% de ");
				lab4.setBounds(220, 250, 900, 100);
				lab4.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JLabel lab2 = new JLabel("quelque chose de précieux a été trouvé");
				lab2.setBounds(150, 310, 900, 100);
				lab2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JButton bt6 = new JButton("retour");
				bt6.setBounds(660, 400, 130, 40);
				bt6.setBackground(Color.BLACK);
				
				ImageIcon img66 = new ImageIcon("arr.jpg");
				JLabel background66 = new JLabel("",img66,JLabel.CENTER);
				
				ImageIcon img6 = new ImageIcon("reto.jpg");
				JLabel background6 = new JLabel("",img6,JLabel.CENTER);
				
				fenetre1.add(background66);
				background66.add(bt6);
				background66.add(lab1);
				background66.add(lab2);
				background66.add(lab3);
				background66.add(lab4);
				bt6.add(background6);
				
				bt6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						fenetre.setVisible(true);
						fenetre1.setVisible(false);
								
					}
				});
				
				
			}
		});
/*//////////////////////////////////////////////////////////////////////////////////////////////////////////*/
		JButton bt4 = new JButton("4");
		bt4.setBounds(585, 80, 200, 120);
		ImageIcon img4 = new ImageIcon("betails.jpg");
		JLabel background4 = new JLabel("",img4,JLabel.CENTER);
		bt4.add(background4);
		JLabel text4 = new JLabel("  bétails");
		text4.setBounds(350, 231, 400, 50);
		text4.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 50));
		bt4.setBackground(Color.white);
		bt4.setToolTipText("cliquer pour calculer votre zakat de bétails");
bt4.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				background66.remove(text4);
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				background66.remove(text4);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				background66.add(text4);
				background66.validate();
				background66.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fenetre1 =new JFrame();
				fenetre1.setSize(900, 563);
				fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fenetre1.setLocationRelativeTo(null);
				fenetre1.setVisible(true);
				fenetre .setVisible(false);
				Container c2 = fenetre1.getContentPane();
				JPanel pan1 = new JPanel();
	
				c2.add(pan1);
				
				JLabel lab1 = new JLabel("pour chaque type de bétails entrer le nombre des :" + "");
				lab1.setBounds(90, 50, 900, 100);
				lab1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				
				JLabel la11 = new JLabel("");
				la11.setBounds(530, 200, 200, 30);
				la11.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JLabel la22 = new JLabel("");
				la22.setBounds(530, 290, 200, 30);
				la22.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				JLabel la33 = new JLabel("");
				la33.setBounds(530, 380, 200, 30);
				la33.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				
				JLabel lab2 = new JLabel("chameaux :");
				lab2.setBounds(160, 120, 900, 100);
				JTextField text6 = new JTextField();
				text6.setBounds(330, 160, 150, 30);
				lab2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				
				JButton b1 = new JButton("calculer");
				b1.setBounds(490, 160, 150, 30);
				b1.setBackground(Color.BLACK);
				b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int i=0;
						double n = Double.parseDouble(text6.getText());
                        if(n>=0&&n<=5) 
                        {
                        	la11.setText("pas de Zakat");
                        }
                        if(n>=5&&n<=24) 
                        {
                        	i=(int)(n/5);
                        	la11.setText(i+"C");
                        }
                        if(n>=25&&n<=35) 
                        {
                        	la11.setText("M");
                        }
                        if(n>=36&&n<=45) 
                        {
                        	la11.setText("L");
                        }
                        if(n>=46&&n<=60) 
                        {
                        	la11.setText("H");
                        }
                        if(n>=61&&n<=75) 
                        {
                        	la11.setText("J");
                        }
                        if(n>=76&&n<=90) 
                        {
                        	la11.setText("2L");
                        }
                        if(n>=91&&n<=120) 
                        {
                        	la11.setText("2H");
                        }
                       
                        if(n>120) 
                        {
                         int m=(int) (n/50);
                         int p=(int) ((n%50)/40);
                         la11.setText(m+"H + "+p+"L");
                         
                           	                 	
                        }
						
					}
				});
				
				JLabel la1 = new JLabel("Resultat :");
				la1.setBounds(330, 200, 200, 30);
				la1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
								
				JLabel lab3 = new JLabel("bovins :");
				lab3.setBounds(160, 210, 900, 100);
				JTextField text7 = new JTextField();
				text7.setBounds(330, 250, 150, 30);
				lab3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				
				JButton b2 = new JButton("calculer");
				b2.setBounds(490, 250, 150, 30);
				b2.setBackground(Color.BLACK);
				b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						double n = Double.parseDouble(text7.getText());
                        if(n>=1&&n<=29) 
                        {
                        	la22.setText("0");
                        }
                        if(n>=30&&n<=39) 
                        {
                        	la22.setText("1T");
                        }
                        if(n>=40&&n<=59) 
                        {
                        	la22.setText("Mo");
                        }
                        if(n>=60&&n<=69) 
                        {
                        	la22.setText("2T");
                        }
                        if(n>=70&&n<=79) 
                        {
                        	la22.setText("Mo + T");
                        }
                        if(n>=80&&n<=89) 
                        {
                        	la22.setText("2 Mo");
                        }
                        if(n>=90&&n<=99) 
                        {
                        	la22.setText("3T");
                        }
                        if(n>=100&&n<=119) 
                        {
                        	la22.setText("Mo + 2T");
                        }
                        if(n>=120&&n<=129) 
                        {
                        	la22.setText("3Mo + 4T");
                        }
                        if(n>=120) 
                        {
                        	int m=(int) (n/40);
                            int p=(int) ((n%40)/30);
                            la22.setText(m+"Mo + "+p+"T");
					}
				}});
				
				JLabel la2 = new JLabel("Resultat :");
				la2.setBounds(330, 290, 200, 30);
				la2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				
				JLabel lab4 = new JLabel("ovins :");
				lab4.setBounds(160, 300, 900, 100);
				JTextField text8 = new JTextField();
				text8.setBounds(330, 330, 150, 30);
				lab4.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				
				JButton b3 = new JButton("calculer");
				b3.setBounds(490, 330, 150, 30);
				b3.setBackground(Color.BLACK);
				b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int i=0;
						double n = Double.parseDouble(text8.getText());
                        if(n>=1&&n<=39) 
                        {
                        	la33.setText("0C");
                        }
                        if(n>=40&&n<=120) 
                        {
                        	la33.setText("1C");
                        }
                        if(n>=121&&n<=200) 
                        {
                        	la33.setText("2C");
                        }
                        if(n>=201&&n<=399) 
                        {
                        	la33.setText("3C");
                        }
                        if(n>=400) 
                        {
                        	i=(int) ((n / 100) );
                        	la33.setText(i+"C");
                        }
                        
					}
				});
				
				JLabel la3 = new JLabel("Resultat :");
				la3.setBounds(330, 380, 200, 30);
				la3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 30));
				
				JButton bt6 = new JButton("retour");
				bt6.setBounds(660, 400, 130, 40);
				bt6.setBackground(Color.BLACK);
				
				ImageIcon img66 = new ImageIcon("arr.jpg");
				JLabel background66 = new JLabel("",img66,JLabel.CENTER);
				
				ImageIcon img6 = new ImageIcon("reto.jpg");
				JLabel background6 = new JLabel("",img6,JLabel.CENTER);
				
				fenetre1.add(background66);
				background66.add(bt6);
				background66.add(lab1);
				background66.add(lab2);
				background66.add(lab3);
				background66.add(lab4);
				background66.add(la1);
				background66.add(la2);
				background66.add(la3);
				background66.add(la11);
				background66.add(la22);
				background66.add(la33);
				background66.add(text6);
				background66.add(text7);
				background66.add(text8);
				background66.add(b1);
				background66.add(b2);
				background66.add(b3);
				bt6.add(background6);
				
				bt6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						fenetre.setVisible(true);
						fenetre1.setVisible(false);
							
					}
				});
				
				
			}
		});
/*/////////////////////////////////////////////////////////////////////////////////////////////////////////*/
		JButton bt5 = new JButton("5");
		bt5.setBounds(585,320,200,120);
		ImageIcon img5 = new ImageIcon("dhab.jpg");
		JLabel background5 = new JLabel("",img5,JLabel.CENTER);
		bt5.add(background5);
		JLabel text5 = new JLabel("or et argent");
		text5.setBounds(320, 231, 400, 60);
		text5.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 50));
		bt5.setBackground(Color.WHITE);
		bt5.setToolTipText("cliquer pour calculer votre zakat de l'or et l'argent");
		bt5.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				background66.remove(text5);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				background66.add(text5);
				background66.validate();
				background66.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
bt5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fenetre1 =new JFrame();
				fenetre1.setSize(900, 563);
				fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fenetre1.setLocationRelativeTo(null);
				fenetre1.setVisible(true);
				fenetre.setVisible(false);
				Container c2 = fenetre1.getContentPane();
				JPanel pan1 = new JPanel();
	
				c2.add(pan1);
				
				JLabel lab1 = new JLabel("Choiser Or ou Argent\r\n" + "");
				lab1.setBounds(260, 70, 900, 100);
				lab1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
				JButton bt6 = new JButton("retour");
				bt6.setBounds(660, 400, 130, 40);
				bt6.setBackground(Color.BLACK); 
				JButton bt11 = new JButton("calculer");
				bt11.setBounds(250, 220, 150, 75);
				bt11.setBackground(Color.BLACK);
				bt11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JFrame fenetre11 =new JFrame();
						fenetre11.setSize(900, 563);
						fenetre11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						fenetre11.setLocationRelativeTo(null);
						fenetre11.setVisible(true);
						fenetre1.setVisible(false);
						Container c2 = fenetre11.getContentPane();
						JPanel pan1 = new JPanel();
			
						c2.add(pan1);
						
						JLabel lab1 = new JLabel("Vous possédez de l'or :");
						lab1.setBounds(260, 70, 900, 100);
						lab1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
						JLabel lab2 = new JLabel("Resultat :");
						lab2.setBounds(260, 320, 220, 30);
						lab2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
						JLabel lab3 = new JLabel("");
						lab3.setBounds(500, 320, 150, 30);
						lab3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
						
						JButton bt6 = new JButton("retour");
						bt6.setBounds(660, 400, 130, 40);
						bt6.setBackground(Color.BLACK);
						JTextField text6 = new JTextField("saisir le quorum");
						text6.setBounds(300, 200, 300, 30); 

						bt11.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
						JRadioButton rbt1 = new JRadioButton("24 carats");
						JRadioButton rbt2 = new JRadioButton("21 carats");
						JRadioButton rbt3 = new JRadioButton("18 carats");
						rbt1.setBounds(215, 150, 150,25);
						rbt2.setBounds(375, 150, 150,25);
						rbt3.setBounds(530, 150, 150,25);
						rbt2.setBackground(Color.BLACK);
						rbt1.setBackground(Color.BLACK);
						rbt3.setBackground(Color.BLACK);
						JButton bt11 = new JButton("calculer");
						bt11.setBounds(360, 260, 150, 30);
						bt11.setBackground(Color.BLACK);
						bt11.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								double i=0.0;
								double n = Double.parseDouble(text6.getText());
								if (rbt1.isSelected()) {
									if(n>=85) {
										i=n*1/40;
									}else {
										text6.setText("il faut saisir un quorum >= 85 g!");
									}
								}
								if (rbt2.isSelected()) {
									if(n>=97) {
										i=n*1/40;
									}else {
										text6.setText("il faut saisir un quorum >= 97 g!");
									}
								}
								if (rbt3.isSelected()) {
									if(n>=113) {
										i=n*1/40;
									}else{
										text6.setText("il faut saisir un quorum >= 113 g!");
									}
								}
								lab3.setText(String.valueOf(i));
							}
						});
						rbt1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
						rbt2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
						rbt3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
						ButtonGroup bg = new ButtonGroup();
						bg.add(rbt1);
						bg.add(rbt2);
						bg.add(rbt3);
						
						ImageIcon img66 = new ImageIcon("arr.jpg");
						JLabel background66 = new JLabel("",img66,JLabel.CENTER);
						
						ImageIcon img6 = new ImageIcon("reto.jpg");
						JLabel background6 = new JLabel("",img6,JLabel.CENTER);
						
						fenetre11.add(background66);
						background66.add(bt6);
						background66.add(bt11);
						background66.add(text6);
						background66.add(lab1);
						background66.add(lab2);
						background66.add(lab3);
						background66.add(rbt1);
						background66.add(rbt2);
						background66.add(rbt3);
						bt6.add(background6);
						
						bt6.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								fenetre1.setVisible(true);
								fenetre11.setVisible(false);
										
							}
						});

						
					}
				});
				JButton bt22 = new JButton("");
				bt22.setBounds(480, 220, 150, 75);
				bt22.setBackground(Color.BLACK);
				bt22.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame fenetre11 =new JFrame();
						fenetre11.setSize(900, 563);
						fenetre11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						fenetre11.setLocationRelativeTo(null);
						fenetre11.setVisible(true);
						fenetre1.setVisible(false);
						Container c2 = fenetre1.getContentPane();
						JPanel pan1 = new JPanel();
			
						c2.add(pan1);
						
						JLabel lab1 = new JLabel("Choiser Or ou Argent\r\n" + "");
						lab1.setBounds(260, 70, 900, 100);
						lab1.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
						JButton bt6 = new JButton("retour");
						bt6.setBounds(660, 400, 130, 40);
						bt6.setBackground(Color.BLACK);
						JTextField text6 = new JTextField("il faut saisir un quorum >= 595 g!");
						text6.setBounds(350, 200, 200, 30); 
						JButton bt11 = new JButton("calculer");
						bt11.setBounds(380, 260, 150, 30);
						JLabel lab2 = new JLabel("Resultat :");
						lab2.setBounds(260, 320, 220, 30);
						lab2.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
						JLabel lab3 = new JLabel("");
						lab3.setBounds(490, 320, 220, 30);
						lab3.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 35));
						bt11.setBackground(Color.BLACK);
						bt11.setFont(new Font("Monaco", Font.ITALIC+Font.BOLD, 20));
						bt11.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								double i=0.0;
								double n = Double.parseDouble(text6.getText());
								
									if(n>=595) {
										i=n*1/40;
									}else {
										text6.setText("il faut saisir un quorum >= 595 g!");
									}
									lab3.setText(String.valueOf(i));
							}
						});
						
						
						ImageIcon img66 = new ImageIcon("arr.jpg");
						JLabel background66 = new JLabel("",img66,JLabel.CENTER);
						
						ImageIcon img6 = new ImageIcon("reto.jpg");
						JLabel background6 = new JLabel("",img6,JLabel.CENTER);
						
						fenetre11.add(background66);
						background66.add(bt6);
						background66.add(bt11);
						background66.add(text6);
						background66.add(lab1);
						background66.add(lab2);
						background66.add(lab3);
						bt6.add(background6);
						
						bt6.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								fenetre1.setVisible(true);
								fenetre11.setVisible(false);
										
							}
						});

						
					}
				});
				ImageIcon img66 = new ImageIcon("arr.jpg");
				JLabel background66 = new JLabel("",img66,JLabel.CENTER);
				
				ImageIcon img6 = new ImageIcon("reto.jpg");
				JLabel background6 = new JLabel("",img6,JLabel.CENTER);

				ImageIcon img7 = new ImageIcon("lor.jpg");
				JLabel background7 = new JLabel("",img7,JLabel.CENTER);

				ImageIcon img77 = new ImageIcon("largent.jpg");
				JLabel background77 = new JLabel("",img77,JLabel.CENTER);
				
				fenetre1.add(background66);
				background66.add(bt6);
				background66.add(bt11);
				background66.add(bt22);
				background66.add(lab1);
				bt6.add(background6);
				bt11.add(background7);
				bt22.add(background77);
				bt6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						fenetre.setVisible(true);
						fenetre1.setVisible(false);
								
					}
				});
				
				
			}
		});
		
        background66.add(bt1);
        background66.add(bt2);
        background66.add(bt3);
        background66.add(bt4);
        background66.add(bt5);
		
		fenetre.setVisible(true);
	}

}
