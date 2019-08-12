package games_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.math.*;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
public class Bingo {
	static boolean A_win=false;
	static boolean B_win=false;
	static int A=0;
	static int B=0;
	private JFrame frame;
	private JTextField textField;
	static int rolls=71;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField txtPlayerA;
	private JTextField txtPlayerB;
	private JTextField txtScore;
	private JTextField textField_28;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bingo window = new Bingo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bingo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label_0 = new JLabel("");
		label_0.setBounds(22, 13, 37, 33);
		frame.getContentPane().add(label_0);

		JSeparator separator = new JSeparator();
		separator.setBounds(22, 51, 223, 7);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 92, 223, 7);
		frame.getContentPane().add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 135, 223, 7);
		frame.getContentPane().add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(22, 176, 223, 7);
		frame.getContentPane().add(separator_3);

		JLabel label = new JLabel("");
		label.setBounds(22, 51, 37, 33);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(22, 92, 37, 33);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(22, 135, 37, 33);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(22, 176, 37, 33);
		frame.getContentPane().add(label_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(63, 13, 20, 213);
		frame.getContentPane().add(separator_4);

		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(105, 13, 20, 213);
		frame.getContentPane().add(separator_5);

		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(149, 13, 20, 213);
		frame.getContentPane().add(separator_6);

		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(192, 13, 20, 213);
		frame.getContentPane().add(separator_7);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(66, 13, 37, 33);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("");
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(63, 51, 37, 33);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("");
		label_6.setBounds(63, 92, 37, 33);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel("");
		label_7.setBounds(66, 135, 37, 33);
		frame.getContentPane().add(label_7);

		JLabel label_8 = new JLabel("");
		label_8.setBounds(63, 176, 37, 33);
		frame.getContentPane().add(label_8);

		JLabel label_9 = new JLabel("");
		label_9.setBounds(110, 13, 37, 33);
		frame.getContentPane().add(label_9);

		JLabel label_10 = new JLabel("");
		label_10.setBounds(105, 51, 37, 33);
		frame.getContentPane().add(label_10);

		JLabel label_11 = new JLabel("");
		label_11.setBounds(105, 92, 37, 33);
		frame.getContentPane().add(label_11);

		JLabel label_12 = new JLabel("");
		label_12.setBounds(110, 135, 37, 33);
		frame.getContentPane().add(label_12);

		JLabel label_13 = new JLabel("");
		label_13.setBounds(105, 176, 37, 33);
		frame.getContentPane().add(label_13);

		JLabel label_14 = new JLabel("");
		label_14.setBounds(149, 21, 37, 33);
		frame.getContentPane().add(label_14);

		JLabel label_15 = new JLabel("");
		label_15.setBounds(149, 51, 37, 33);
		frame.getContentPane().add(label_15);

		JLabel label_16 = new JLabel("");
		label_16.setBounds(149, 92, 37, 33);
		frame.getContentPane().add(label_16);

		JLabel label_17 = new JLabel("");
		label_17.setBounds(149, 135, 37, 33);
		frame.getContentPane().add(label_17);

		JLabel label_18 = new JLabel("");
		label_18.setBounds(149, 176, 37, 33);
		frame.getContentPane().add(label_18);

		JLabel label_19 = new JLabel("");
		label_19.setBounds(192, 21, 37, 33);
		frame.getContentPane().add(label_19);

		JLabel label_20 = new JLabel("");
		label_20.setBounds(192, 51, 37, 33);
		frame.getContentPane().add(label_20);

		JLabel label_21 = new JLabel("");
		label_21.setBounds(192, 92, 37, 33);
		frame.getContentPane().add(label_21);

		JLabel label_22 = new JLabel("");
		label_22.setBounds(192, 135, 37, 33);
		frame.getContentPane().add(label_22);

		JLabel label_23 = new JLabel("");
		label_23.setBounds(192, 176, 37, 33);
		frame.getContentPane().add(label_23);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rolls=71;
				textField.setText(""+rolls);
				textField_28.setText("");
				String[] bingo=new String[50];
				int start=0;
				A=0;
				B=0;
				
				Color[] bingo1=new Color[50];
				int start1=0;
				while(start1<50) {
					bingo1[start1]=Color.BLACK;
					start1++;
				}
				while(start<50) {
					bingo[start]="";
					start++;
				}
				label_0.setText(" "+bingo[0]);label_1.setText(" "+bingo[1]);label_2.setText(" "+bingo[2]);
				label_3.setText(" "+bingo[3]);label_4.setText(" "+bingo[4]);label_5.setText(" "+bingo[5]);
				label_6.setText(" "+bingo[6]);label_7.setText(" "+bingo[7]);label_8.setText(" "+bingo[8]);
				label_9.setText(" "+bingo[9]);label_10.setText(" "+bingo[10]);label_11.setText(" "+bingo[11]);
				label_12.setText(" "+bingo[12]);label_13.setText(" "+bingo[13]);label_14.setText(" "+bingo[14]);
				label_15.setText(" "+bingo[15]);label_16.setText(" "+bingo[16]);label_17.setText(" "+bingo[17]);
				label_18.setText(" "+bingo[18]);label_19.setText(" "+bingo[19]);label_20.setText(" "+bingo[20]);
				label_21.setText(" "+bingo[21]);label_22.setText(" "+bingo[22]);label_23.setText(" "+bingo[23]);
				label.setText(" "+bingo[24]);
				textField_1.setText(" "+bingo[25]); textField_2.setText(" "+bingo[26]); textField_3.setText(" "+bingo[27]);
				textField_6.setText(" "+bingo[30]); textField_5.setText(" "+bingo[29]); textField_4.setText(" "+bingo[28]);			
				textField_7.setText(" "+bingo[31]); textField_8.setText(" "+bingo[32]); textField_9.setText(" "+bingo[45]);
				textField_10.setText(" "+bingo[33]); textField_11.setText(" "+bingo[34]); textField_12.setText(" "+bingo[35]);	
				textField_13.setText(" "+bingo[36]); textField_14.setText(" "+bingo[37]); textField_15.setText(" "+bingo[38]);
				textField_16.setText(" "+bingo[39]); textField_17.setText(" "+bingo[40]); textField_18.setText(" "+bingo[41]);			
				textField_19.setText(" "+bingo[42]); textField_20.setText(" "+bingo[43]); textField_21.setText(" "+bingo[44]);
				textField_22.setText(" "+bingo[46]); textField_23.setText(" "+bingo[47]); textField_24.setText(" "+bingo[48]);	
				textField_25.setText(" "+bingo[49]);
				{
					label_0.setForeground(Color.BLACK);label_1.setForeground(Color.BLACK);label_2.setForeground(Color.BLACK);
					label_3.setForeground(Color.BLACK);label_4.setForeground(Color.BLACK);label_5.setForeground(Color.BLACK);
					label_6.setForeground(Color.BLACK);label_7.setForeground(Color.BLACK);label_8.setForeground(Color.BLACK);
					label_9.setForeground(Color.BLACK);label_10.setForeground(Color.BLACK);label_11.setForeground(Color.BLACK);
					label_12.setForeground(Color.BLACK);label_13.setForeground(Color.BLACK);label_14.setForeground(Color.BLACK);
					label_15.setForeground(Color.BLACK);label_16.setForeground(Color.BLACK);label_17.setForeground(Color.BLACK);
					label_18.setForeground(Color.BLACK);label_19.setForeground(Color.BLACK);label_20.setForeground(Color.BLACK);
					label_21.setForeground(Color.BLACK);label_22.setForeground(Color.BLACK);label_23.setForeground(Color.BLACK);
					label.setForeground(Color.BLACK);
					textField_1.setForeground(Color.BLACK); textField_2.setForeground(Color.BLACK); textField_3.setForeground(Color.BLACK);
					textField_6.setForeground(Color.BLACK); textField_5.setForeground(Color.BLACK); textField_4.setForeground(Color.BLACK);			
					textField_7.setForeground(Color.BLACK); textField_8.setForeground(Color.BLACK); textField_9.setForeground(Color.BLACK);
					textField_10.setForeground(Color.BLACK); textField_11.setForeground(Color.BLACK); textField_12.setForeground(Color.BLACK);	
					textField_13.setForeground(Color.BLACK); textField_14.setForeground(Color.BLACK); textField_15.setForeground(Color.BLACK);
					textField_16.setForeground(Color.BLACK); textField_17.setForeground(Color.BLACK); textField_18.setForeground(Color.BLACK);			
					textField_19.setForeground(Color.BLACK); textField_20.setForeground(Color.BLACK); textField_21.setForeground(Color.BLACK);
					textField_22.setForeground(Color.BLACK); textField_23.setForeground(Color.BLACK); textField_24.setForeground(Color.BLACK);	
					textField_25.setForeground(Color.BLACK);
				}
			}
		});
		btnReset.setBounds(305, 55, 97, 25);
		frame.getContentPane().add(btnReset);

		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rolls--;{
					textField.setText(""+rolls);
					int rn=(int) (Math.random() *100);
					textField_28.setText(""+rn);
					if((label.getText()).equals(""+rn)) {
						label.setForeground(Color.RED);
						//UIManager.put("label.foreground",Color.RED );
					}

					else if((label_0.getText()).equals(" "+rn)) {

						label_0.setForeground(Color.RED);
					} else if((label_1.getText()).equals(" "+rn)) {
						label_1.setForeground(Color.RED);
					} else if((label_2.getText()).equals(" "+rn)) {
						label_2.setForeground(Color.RED);
					} 
					else if((label_3.getText()).equals(" "+rn)) {
						label_3.setForeground(Color.RED);
					} 
					else if((label_4.getText()).equals(" "+rn)) {
						label_4.setForeground(Color.RED);
					} 
					else if((label_5.getText()).equals(" "+rn)) {
						label_5.setForeground(Color.RED);
					} 
					else if((label_6.getText()).equals(" "+rn)) {
						label_6.setForeground(Color.RED);
					} 
					else if((label_7.getText()).equals(" "+rn)) {
						label_7.setForeground(Color.RED);
					} 
					else if((label_8.getText()).equals(" "+rn)) {
						label_8.setForeground(Color.RED);
					} 
					else if((label_9.getText()).equals(" "+rn)) {
						label_9.setForeground(Color.RED);
					} 
					else if((label_10.getText()).equals(" "+rn)) {
						label_10.setForeground(Color.RED);
					} 
					else if((label_11.getText()).equals(" "+rn)) {
						label_11.setForeground(Color.RED);
					} 
					else if((label_12.getText()).equals(" "+rn)) {
						label_12.setForeground(Color.RED);
					} 
					else if((label_13.getText()).equals(" "+rn)) {
						label_13.setForeground(Color.RED);
					} 
					else if((label_14.getText()).equals(" "+rn)) {
						label_14.setForeground(Color.RED);
					} 
					else if((label_15.getText()).equals(" "+rn)) {
						label_15.setForeground(Color.RED);
					} 
					else if((label_16.getText()).equals(" "+rn)) {
						label_16.setForeground(Color.RED);
					} 
					else if((label_17.getText()).equals(" "+rn)) {
						label_17.setForeground(Color.RED);
					} 
					else if((label_18.getText()).equals(" "+rn)) {
						label_18.setForeground(Color.RED);
					} 
					else if((label_19.getText()).equals(" "+rn)) {
						label_19.setForeground(Color.RED);
					} 
					else if((label_20.getText()).equals(" "+rn)) {
						label_20.setForeground(Color.RED);
					} 
					else if((label_21.getText()).equals(" "+rn)) {
						label_21.setForeground(Color.RED);
					} 
					else if((label_22.getText()).equals(" "+rn)) {
						label_22.setForeground(Color.RED);
					} 
					else if((label_23.getText()).equals(" "+rn)) {
						label_23.setForeground(Color.RED);
					} 
					if((textField_1.getText()).equals(" "+rn)) {
						textField_1.setForeground(Color.RED);
					}
					else if((textField_2.getText()).equals(" "+rn)) {
						textField_2.setForeground(Color.RED);
					}
					else if((textField_3.getText()).equals(" "+rn)) {
						textField_3.setForeground(Color.RED);
					}
					else if((textField_4.getText()).equals(" "+rn)) {
						textField_4.setForeground(Color.RED);
					}
					else if((textField_5.getText()).equals(" "+rn)) {
						textField_5.setForeground(Color.RED);
					}
					else if((textField_6.getText()).equals(" "+rn)) {
						textField_6.setForeground(Color.RED);
					}
					else if((textField_7.getText()).equals(" "+rn)) {
						textField_7.setForeground(Color.RED);
					}
					else if((textField_8.getText()).equals(" "+rn)) {
						textField_8.setForeground(Color.RED);
					}
					else if((textField_9.getText()).equals(" "+rn)) {
						textField_9.setForeground(Color.RED);
					}
					else if((textField_10.getText()).equals(" "+rn)) {
						textField_10.setForeground(Color.RED);
					}
					else if((textField_11.getText()).equals(" "+rn)) {
						textField_11.setForeground(Color.RED);
					}
					else if((textField_12.getText()).equals(" "+rn)) {
						textField_12.setForeground(Color.RED);
					}
					else if((textField_13.getText()).equals(" "+rn)) {
						textField_13.setForeground(Color.RED);
					}
					else if((textField_14.getText()).equals(" "+rn)) {
						textField_14.setForeground(Color.RED);
					}
					else if((textField_15.getText()).equals(" "+rn)) {
						textField_15.setForeground(Color.RED);
					}
					else if((textField_16.getText()).equals(" "+rn)) {
						textField_16.setForeground(Color.RED);
					}
					else if((textField_17.getText()).equals(" "+rn)) {
						textField_17.setForeground(Color.RED);
					}
					else if((textField_18.getText()).equals(" "+rn)) {
						textField_18.setForeground(Color.RED);
					}
					else if((textField_19.getText()).equals(" "+rn)) {
						textField_19.setForeground(Color.RED);
					}
					else if((textField_20.getText()).equals(" "+rn)) {
						textField_20.setForeground(Color.RED);
					}
					else if((textField_21.getText()).equals(" "+rn)) {
						textField_21.setForeground(Color.RED);
					}
					else if((textField_22.getText()).equals(" "+rn)) {
						textField_22.setForeground(Color.RED);
					}
					else if((textField_23.getText()).equals(" "+rn)) {
						textField_23.setForeground(Color.RED);
					}
					else if((textField_24.getText()).equals(" "+rn)) {
						textField_24.setForeground(Color.RED);
					}
					else if((textField_25.getText()).equals(" "+rn)) {
						textField_25.setForeground(Color.RED);
					}
					{
						/* Row schematic for player A
						 * 0    4 9 14 19
						 * NULL 5 10 15 20
						 * 1    6 11 16 21
						 * 2    7 12 17 22
						 * 3    8  13 18 23    
						 *                          */
						int dA2=0;{if((label_19.getForeground()).equals(Color.RED)) {
							dA2++;
						}
						 if((label_15.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 if((label_11.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 if((label_7.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 if((label_3.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 
						 
						 }
						int dA1=0;{if((label_0.getForeground()).equals(Color.RED)) {
							dA1++;
						}
						 if((label_5.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 if((label_11.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 if((label_17.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 if((label_23.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 
						 
						 }
						
						 int cA1=0;{if((label_0.getForeground()).equals(Color.RED)) {
								cA1++;
							}
							 if((label.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 if((label_1.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 if((label_2.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 if((label_3.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 
							 
							 }
						 int cA2=0;{if((label_4.getForeground()).equals(Color.RED)) {
								cA2++;
							}
							 if((label_5.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 if((label_6.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 if((label_7.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 if((label_8.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 
							 
							 }
						 int cA3=0;{if((label_9.getForeground()).equals(Color.RED)) {
								cA3++;
							}
							 if((label_10.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 if((label_11.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 if((label_12.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 if((label_13.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 
							 
							 }
						 int cA4=0;{if((label_14.getForeground()).equals(Color.RED)) {
								cA4++;
							}
							 if((label_15.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 if((label_16.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 if((label_17.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 if((label_18.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 
							 
							 }
						 int cA5=0;{if((label_19.getForeground()).equals(Color.RED)) {
								cA5++;
							}
							 if((label_20.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 if((label_21.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 if((label_22.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 if((label_23.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 
							 
							 }

															
 int rA1=0;{if((label_0.getForeground()).equals(Color.RED)) {
	rA1++;
}
 if((label_4.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 if((label_9.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 if((label_14.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 if((label_19.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 
 
 }
 int rA2=0;{if((label.getForeground()).equals(Color.RED)) {
	rA2++;
}
 if((label_5.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 if((label_10.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 if((label_15.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 if((label_20.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 
 
 }
 int rA3=0;{if((label_1.getForeground()).equals(Color.RED)) {
	rA3++;
}
 if((label_6.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 if((label_11.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 if((label_16.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 if((label_21.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 
 
 }
 int rA4=0;{if((label_2.getForeground()).equals(Color.RED)) {
	rA4++;
}
 if((label_7.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 if((label_12.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 if((label_17.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 if((label_22.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 
 
 }
 int rA5=0;{if((label_3.getForeground()).equals(Color.RED)) {
	rA5++;
}
 if((label_8.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 if((label_13.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 if((label_18.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 if((label_23.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 
 
 }

		
		
 int[] stat=new int[12];
	stat[0]=rA1;stat[1]=rA2;stat[2]=rA3;stat[3]=rA4;stat[4]=rA5;stat[5]=cA1;stat[6]=cA2;stat[7]=cA3;
	stat[8]=cA4;stat[9]=cA5;stat[10]=dA1;stat[11]=dA2;
	int st=0;
	while(st<12) {
		if(stat[st]==5) {
			JOptionPane.showMessageDialog(null, "Player A wins");
			A++;
			
			textField_26.setText(""+A);
			
			rolls=71;
			textField.setText(""+rolls);
			String[] bingo=new String[50];
			int start=0;
			
			
			Color[] bingo1=new Color[50];
			int start1=0;
			while(start1<50) {
				bingo1[start1]=Color.BLACK;
				start1++;
			}
			while(start<50) {
				bingo[start]="";
				start++;
			}
			label_0.setText(" "+bingo[0]);label_1.setText(" "+bingo[1]);label_2.setText(" "+bingo[2]);
			label_3.setText(" "+bingo[3]);label_4.setText(" "+bingo[4]);label_5.setText(" "+bingo[5]);
			label_6.setText(" "+bingo[6]);label_7.setText(" "+bingo[7]);label_8.setText(" "+bingo[8]);
			label_9.setText(" "+bingo[9]);label_10.setText(" "+bingo[10]);label_11.setText(" "+bingo[11]);
			label_12.setText(" "+bingo[12]);label_13.setText(" "+bingo[13]);label_14.setText(" "+bingo[14]);
			label_15.setText(" "+bingo[15]);label_16.setText(" "+bingo[16]);label_17.setText(" "+bingo[17]);
			label_18.setText(" "+bingo[18]);label_19.setText(" "+bingo[19]);label_20.setText(" "+bingo[20]);
			label_21.setText(" "+bingo[21]);label_22.setText(" "+bingo[22]);label_23.setText(" "+bingo[23]);
			label.setText(" "+bingo[24]);
			textField_1.setText(" "+bingo[25]); textField_2.setText(" "+bingo[26]); textField_3.setText(" "+bingo[27]);
			textField_6.setText(" "+bingo[30]); textField_5.setText(" "+bingo[29]); textField_4.setText(" "+bingo[28]);			
			textField_7.setText(" "+bingo[31]); textField_8.setText(" "+bingo[32]); textField_9.setText(" "+bingo[45]);
			textField_10.setText(" "+bingo[33]); textField_11.setText(" "+bingo[34]); textField_12.setText(" "+bingo[35]);	
			textField_13.setText(" "+bingo[36]); textField_14.setText(" "+bingo[37]); textField_15.setText(" "+bingo[38]);
			textField_16.setText(" "+bingo[39]); textField_17.setText(" "+bingo[40]); textField_18.setText(" "+bingo[41]);			
			textField_19.setText(" "+bingo[42]); textField_20.setText(" "+bingo[43]); textField_21.setText(" "+bingo[44]);
			textField_22.setText(" "+bingo[46]); textField_23.setText(" "+bingo[47]); textField_24.setText(" "+bingo[48]);	
			textField_25.setText(" "+bingo[49]);
			{
				label_0.setForeground(Color.BLACK);label_1.setForeground(Color.BLACK);label_2.setForeground(Color.BLACK);
				label_3.setForeground(Color.BLACK);label_4.setForeground(Color.BLACK);label_5.setForeground(Color.BLACK);
				label_6.setForeground(Color.BLACK);label_7.setForeground(Color.BLACK);label_8.setForeground(Color.BLACK);
				label_9.setForeground(Color.BLACK);label_10.setForeground(Color.BLACK);label_11.setForeground(Color.BLACK);
				label_12.setForeground(Color.BLACK);label_13.setForeground(Color.BLACK);label_14.setForeground(Color.BLACK);
				label_15.setForeground(Color.BLACK);label_16.setForeground(Color.BLACK);label_17.setForeground(Color.BLACK);
				label_18.setForeground(Color.BLACK);label_19.setForeground(Color.BLACK);label_20.setForeground(Color.BLACK);
				label_21.setForeground(Color.BLACK);label_22.setForeground(Color.BLACK);label_23.setForeground(Color.BLACK);
				label.setForeground(Color.BLACK);
				textField_1.setForeground(Color.BLACK); textField_2.setForeground(Color.BLACK); textField_3.setForeground(Color.BLACK);
				textField_6.setForeground(Color.BLACK); textField_5.setForeground(Color.BLACK); textField_4.setForeground(Color.BLACK);			
				textField_7.setForeground(Color.BLACK); textField_8.setForeground(Color.BLACK); textField_9.setForeground(Color.BLACK);
				textField_10.setForeground(Color.BLACK); textField_11.setForeground(Color.BLACK); textField_12.setForeground(Color.BLACK);	
				textField_13.setForeground(Color.BLACK); textField_14.setForeground(Color.BLACK); textField_15.setForeground(Color.BLACK);
				textField_16.setForeground(Color.BLACK); textField_17.setForeground(Color.BLACK); textField_18.setForeground(Color.BLACK);			
				textField_19.setForeground(Color.BLACK); textField_20.setForeground(Color.BLACK); textField_21.setForeground(Color.BLACK);
				textField_22.setForeground(Color.BLACK); textField_23.setForeground(Color.BLACK); textField_24.setForeground(Color.BLACK);	
				textField_25.setForeground(Color.BLACK);
			}st=1000;
			break;
			
		}
		st++;
	}
		

		
					}
					{
						/* Row schematic for player B
						 * 1    2 3 5 4
						 * 6    7 8 9 10
						 * 11   12 13 14 15
						 * 16    17 18 19 20
						 * 21    22  23 24 25    
						 *                          */
						int dA2=0;{if((textField_4.getForeground()).equals(Color.RED)) {
							dA2++;
						}
						 if((textField_9.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 if((textField_13.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 if((textField_17.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 if((textField_21.getForeground()).equals(Color.RED)) {
								dA2++;
							}
						 
						 
						 }
						int dA1=0;{if((textField_1.getForeground()).equals(Color.RED)) {
							dA1++;
						}
						 if((textField_7.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 if((textField_13.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 if((textField_19.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 if((textField_25.getForeground()).equals(Color.RED)) {
								dA1++;
							}
						 
						 
						 }
						
						 int cA1=0;{if((textField_1.getForeground()).equals(Color.RED)) {
								cA1++;
							}
							 if((textField_6.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 if((textField_11.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 if((textField_16.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 if((textField_21.getForeground()).equals(Color.RED)) {
									cA1++;
								}
							 
							 
							 }
						 int cA2=0;{if((textField_2.getForeground()).equals(Color.RED)) {
								cA2++;
							}
							 if((textField_7.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 if((textField_12.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 if((textField_17.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 if((textField_22.getForeground()).equals(Color.RED)) {
									cA2++;
								}
							 
							 
							 }
						 int cA3=0;{if((textField_3.getForeground()).equals(Color.RED)) {
								cA3++;
							}
							 if((textField_8.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 if((textField_13.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 if((textField_18.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 if((textField_23.getForeground()).equals(Color.RED)) {
									cA3++;
								}
							 
							 
							 }
						 int cA4=0;{if((textField_5.getForeground()).equals(Color.RED)) {
								cA4++;
							}
							 if((textField_9.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 if((textField_14.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 if((textField_19.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 if((textField_24.getForeground()).equals(Color.RED)) {
									cA4++;
								}
							 
							 
							 }
						 int cA5=0;{if((textField_4.getForeground()).equals(Color.RED)) {
								cA5++;
							}
							 if((textField_10.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 if((textField_15.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 if((textField_20.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 if((textField_25.getForeground()).equals(Color.RED)) {
									cA5++;
								}
							 
							 
							 }

															
 int rA1=0;{if((textField_1.getForeground()).equals(Color.RED)) {
	rA1++;
}
 if((textField_2.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 if((textField_3.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 if((textField_4.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 if((textField_5.getForeground()).equals(Color.RED)) {
		rA1++;
	}
 
 
 }
 int rA2=0;{if((textField_6.getForeground()).equals(Color.RED)) {
	rA2++;
}
 if((textField_7.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 if((textField_8.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 if((textField_9.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 if((textField_10.getForeground()).equals(Color.RED)) {
		rA2++;
	}
 
 
 }
 int rA3=0;{if((textField_11.getForeground()).equals(Color.RED)) {
	rA3++;
}
 if((textField_12.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 if((textField_13.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 if((textField_14.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 if((textField_15.getForeground()).equals(Color.RED)) {
		rA3++;
	}
 
 
 }
 int rA4=0;{if((textField_16.getForeground()).equals(Color.RED)) {
	rA4++;
}
 if((textField_17.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 if((textField_18.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 if((textField_19.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 if((textField_20.getForeground()).equals(Color.RED)) {
		rA4++;
	}
 
 
 }
 int rA5=0;{if((textField_21.getForeground()).equals(Color.RED)) {
	rA5++;
}
 if((textField_22.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 if((textField_23.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 if((textField_24.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 if((textField_25.getForeground()).equals(Color.RED)) {
		rA5++;
	}
 
 
 }

		
		
 int[] stat=new int[12];
	stat[0]=rA1;stat[1]=rA2;stat[2]=rA3;stat[3]=rA4;stat[4]=rA5;stat[5]=cA1;stat[6]=cA2;stat[7]=cA3;
	stat[8]=cA4;stat[9]=cA5;stat[10]=dA1;stat[11]=dA2;
	int st=0;
	while(st<12) {
		if(stat[st]==5) {
			JOptionPane.showMessageDialog(null, "Player B wins");
			B++;
			
			textField_27.setText(""+B);
			rolls=71;
			textField.setText(""+rolls);
			String[] bingo=new String[50];
			int start=0;
		
			Color[] bingo1=new Color[50];
			int start1=0;
			while(start1<50) {
				bingo1[start1]=Color.BLACK;
				start1++;
			}
			while(start<50) {
				bingo[start]="";
				start++;
			}
			label_0.setText(" "+bingo[0]);label_1.setText(" "+bingo[1]);label_2.setText(" "+bingo[2]);
			label_3.setText(" "+bingo[3]);label_4.setText(" "+bingo[4]);label_5.setText(" "+bingo[5]);
			label_6.setText(" "+bingo[6]);label_7.setText(" "+bingo[7]);label_8.setText(" "+bingo[8]);
			label_9.setText(" "+bingo[9]);label_10.setText(" "+bingo[10]);label_11.setText(" "+bingo[11]);
			label_12.setText(" "+bingo[12]);label_13.setText(" "+bingo[13]);label_14.setText(" "+bingo[14]);
			label_15.setText(" "+bingo[15]);label_16.setText(" "+bingo[16]);label_17.setText(" "+bingo[17]);
			label_18.setText(" "+bingo[18]);label_19.setText(" "+bingo[19]);label_20.setText(" "+bingo[20]);
			label_21.setText(" "+bingo[21]);label_22.setText(" "+bingo[22]);label_23.setText(" "+bingo[23]);
			label.setText(" "+bingo[24]);
			textField_1.setText(" "+bingo[25]); textField_2.setText(" "+bingo[26]); textField_3.setText(" "+bingo[27]);
			textField_6.setText(" "+bingo[30]); textField_5.setText(" "+bingo[29]); textField_4.setText(" "+bingo[28]);			
			textField_7.setText(" "+bingo[31]); textField_8.setText(" "+bingo[32]); textField_9.setText(" "+bingo[45]);
			textField_10.setText(" "+bingo[33]); textField_11.setText(" "+bingo[34]); textField_12.setText(" "+bingo[35]);	
			textField_13.setText(" "+bingo[36]); textField_14.setText(" "+bingo[37]); textField_15.setText(" "+bingo[38]);
			textField_16.setText(" "+bingo[39]); textField_17.setText(" "+bingo[40]); textField_18.setText(" "+bingo[41]);			
			textField_19.setText(" "+bingo[42]); textField_20.setText(" "+bingo[43]); textField_21.setText(" "+bingo[44]);
			textField_22.setText(" "+bingo[46]); textField_23.setText(" "+bingo[47]); textField_24.setText(" "+bingo[48]);	
			textField_25.setText(" "+bingo[49]);
			{
				label_0.setForeground(Color.BLACK);label_1.setForeground(Color.BLACK);label_2.setForeground(Color.BLACK);
				label_3.setForeground(Color.BLACK);label_4.setForeground(Color.BLACK);label_5.setForeground(Color.BLACK);
				label_6.setForeground(Color.BLACK);label_7.setForeground(Color.BLACK);label_8.setForeground(Color.BLACK);
				label_9.setForeground(Color.BLACK);label_10.setForeground(Color.BLACK);label_11.setForeground(Color.BLACK);
				label_12.setForeground(Color.BLACK);label_13.setForeground(Color.BLACK);label_14.setForeground(Color.BLACK);
				label_15.setForeground(Color.BLACK);label_16.setForeground(Color.BLACK);label_17.setForeground(Color.BLACK);
				label_18.setForeground(Color.BLACK);label_19.setForeground(Color.BLACK);label_20.setForeground(Color.BLACK);
				label_21.setForeground(Color.BLACK);label_22.setForeground(Color.BLACK);label_23.setForeground(Color.BLACK);
				label.setForeground(Color.BLACK);
				textField_1.setForeground(Color.BLACK); textField_2.setForeground(Color.BLACK); textField_3.setForeground(Color.BLACK);
				textField_6.setForeground(Color.BLACK); textField_5.setForeground(Color.BLACK); textField_4.setForeground(Color.BLACK);			
				textField_7.setForeground(Color.BLACK); textField_8.setForeground(Color.BLACK); textField_9.setForeground(Color.BLACK);
				textField_10.setForeground(Color.BLACK); textField_11.setForeground(Color.BLACK); textField_12.setForeground(Color.BLACK);	
				textField_13.setForeground(Color.BLACK); textField_14.setForeground(Color.BLACK); textField_15.setForeground(Color.BLACK);
				textField_16.setForeground(Color.BLACK); textField_17.setForeground(Color.BLACK); textField_18.setForeground(Color.BLACK);			
				textField_19.setForeground(Color.BLACK); textField_20.setForeground(Color.BLACK); textField_21.setForeground(Color.BLACK);
				textField_22.setForeground(Color.BLACK); textField_23.setForeground(Color.BLACK); textField_24.setForeground(Color.BLACK);	
				textField_25.setForeground(Color.BLACK);
			}
			st=10000;
			break;
			
		}
		st++;
	}
		

		
					}
					
					//SwingUtilities.updateComponentTreeUI(frame);

				}
				if(rolls==0&&!A_win&&!B_win) {
					JOptionPane.showMessageDialog(null, "Game Over");
					rolls=71;
					textField.setText(""+rolls);
					textField_28.setText("");
					String[] bingo=new String[50];
					int start=0;
					while(start<50) {
						bingo[start]="";
						start++;
					}
					label_0.setText(" "+bingo[0]);label_1.setText(" "+bingo[1]);label_2.setText(" "+bingo[2]);
					label_3.setText(" "+bingo[3]);label_4.setText(" "+bingo[4]);label_5.setText(" "+bingo[5]);
					label_6.setText(" "+bingo[6]);label_7.setText(" "+bingo[7]);label_8.setText(" "+bingo[8]);
					label_9.setText(" "+bingo[9]);label_10.setText(" "+bingo[10]);label_11.setText(" "+bingo[11]);
					label_12.setText(" "+bingo[12]);label_13.setText(" "+bingo[13]);label_14.setText(" "+bingo[14]);
					label_15.setText(" "+bingo[15]);label_16.setText(" "+bingo[16]);label_17.setText(" "+bingo[17]);
					label_18.setText(" "+bingo[18]);label_19.setText(" "+bingo[19]);label_20.setText(" "+bingo[20]);
					label_21.setText(" "+bingo[21]);label_22.setText(" "+bingo[22]);label_23.setText(" "+bingo[23]);
					label.setText(" "+bingo[24]);
					textField_1.setText(" "+bingo[25]); textField_2.setText(" "+bingo[26]); textField_3.setText(" "+bingo[27]);
					textField_6.setText(" "+bingo[30]); textField_5.setText(" "+bingo[29]); textField_4.setText(" "+bingo[28]);			
					textField_7.setText(" "+bingo[31]); textField_8.setText(" "+bingo[32]); textField_9.setText(" "+bingo[45]);
					textField_10.setText(" "+bingo[33]); textField_11.setText(" "+bingo[34]); textField_12.setText(" "+bingo[35]);	
					textField_13.setText(" "+bingo[36]); textField_14.setText(" "+bingo[37]); textField_15.setText(" "+bingo[38]);
					textField_16.setText(" "+bingo[39]); textField_17.setText(" "+bingo[40]); textField_18.setText(" "+bingo[41]);			
					textField_19.setText(" "+bingo[42]); textField_20.setText(" "+bingo[43]); textField_21.setText(" "+bingo[44]);
					textField_22.setText(" "+bingo[46]); textField_23.setText(" "+bingo[47]); textField_24.setText(" "+bingo[48]);	
					textField_25.setText(" "+bingo[49]);
					{
						label_0.setForeground(Color.BLACK);label_1.setForeground(Color.BLACK);label_2.setForeground(Color.BLACK);
						label_3.setForeground(Color.BLACK);label_4.setForeground(Color.BLACK);label_5.setForeground(Color.BLACK);
						label_6.setForeground(Color.BLACK);label_7.setForeground(Color.BLACK);label_8.setForeground(Color.BLACK);
						label_9.setForeground(Color.BLACK);label_10.setForeground(Color.BLACK);label_11.setForeground(Color.BLACK);
						label_12.setForeground(Color.BLACK);label_13.setForeground(Color.BLACK);label_14.setForeground(Color.BLACK);
						label_15.setForeground(Color.BLACK);label_16.setForeground(Color.BLACK);label_17.setForeground(Color.BLACK);
						label_18.setForeground(Color.BLACK);label_19.setForeground(Color.BLACK);label_20.setForeground(Color.BLACK);
						label_21.setForeground(Color.BLACK);label_22.setForeground(Color.BLACK);label_23.setForeground(Color.BLACK);
						label.setForeground(Color.BLACK);
						textField_1.setForeground(Color.BLACK); textField_2.setForeground(Color.BLACK); textField_3.setForeground(Color.BLACK);
						textField_6.setForeground(Color.BLACK); textField_5.setForeground(Color.BLACK); textField_4.setForeground(Color.BLACK);			
						textField_7.setForeground(Color.BLACK); textField_8.setForeground(Color.BLACK); textField_9.setForeground(Color.BLACK);
						textField_10.setForeground(Color.BLACK); textField_11.setForeground(Color.BLACK); textField_12.setForeground(Color.BLACK);	
						textField_13.setForeground(Color.BLACK); textField_14.setForeground(Color.BLACK); textField_15.setForeground(Color.BLACK);
						textField_16.setForeground(Color.BLACK); textField_17.setForeground(Color.BLACK); textField_18.setForeground(Color.BLACK);			
						textField_19.setForeground(Color.BLACK); textField_20.setForeground(Color.BLACK); textField_21.setForeground(Color.BLACK);
						textField_22.setForeground(Color.BLACK); textField_23.setForeground(Color.BLACK); textField_24.setForeground(Color.BLACK);	
						textField_25.setForeground(Color.BLACK);
					}
				}

			}
		});
		btnPlay.setBounds(305, 117, 97, 25);
		frame.getContentPane().add(btnPlay);

		JLabel lblRollsLeft = new JLabel("Rolls left");
		lblRollsLeft.setBounds(305, 167, 56, 16);
		frame.getContentPane().add(lblRollsLeft);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(286, 187, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int s=0;
				int s1=25;
				int[] bingo=new int[50];
				//boolean run=true;
				String containsSt="";
				String containsT="";
				while(s<25) {

					int p=(int) (Math.random() *100);

					if(p!=0&&!containsSt.contains(""+p)) {
						bingo[s]=p;
						s++;
						containsSt+="|||"+p+"|||";
					}


				}
				while(s1<50) {

					int p=(int) (Math.random() *100);

					if(p!=0&&!containsT.contains(""+p)) {
						bingo[s1]=p;
						s1++;
						containsT+="|||"+p+"|||";
					}


				}
				textField.setText(""+rolls);
				label_0.setText(" "+bingo[0]);label_1.setText(" "+bingo[1]);label_2.setText(" "+bingo[2]);
				label_3.setText(" "+bingo[3]);label_4.setText(" "+bingo[4]);label_5.setText(" "+bingo[5]);
				label_6.setText(" "+bingo[6]);label_7.setText(" "+bingo[7]);label_8.setText(" "+bingo[8]);
				label_9.setText(" "+bingo[9]);label_10.setText(" "+bingo[10]);label_11.setText(" "+bingo[11]);
				label_12.setText(" "+bingo[12]);label_13.setText(" "+bingo[13]);label_14.setText(" "+bingo[14]);
				label_15.setText(" "+bingo[15]);label_16.setText(" "+bingo[16]);label_17.setText(" "+bingo[17]);
				label_18.setText(" "+bingo[18]);label_19.setText(" "+bingo[19]);label_20.setText(" "+bingo[20]);
				label_21.setText(" "+bingo[21]);label_22.setText(" "+bingo[22]);label_23.setText(" "+bingo[23]);
				label.setText(" "+bingo[24]);
				textField_1.setText(" "+bingo[25]); textField_2.setText(" "+bingo[26]); textField_3.setText(" "+bingo[27]);
				textField_6.setText(" "+bingo[30]); textField_5.setText(" "+bingo[29]); textField_4.setText(" "+bingo[28]);			
				textField_7.setText(" "+bingo[31]); textField_8.setText(" "+bingo[32]); textField_9.setText(" "+bingo[45]);
				textField_10.setText(" "+bingo[33]); textField_11.setText(" "+bingo[34]); textField_12.setText(" "+bingo[35]);	
				textField_13.setText(" "+bingo[36]); textField_14.setText(" "+bingo[37]); textField_15.setText(" "+bingo[38]);
				textField_16.setText(" "+bingo[39]); textField_17.setText(" "+bingo[40]); textField_18.setText(" "+bingo[41]);			
				textField_19.setText(" "+bingo[42]); textField_20.setText(" "+bingo[43]); textField_21.setText(" "+bingo[44]);
				textField_22.setText(" "+bingo[46]); textField_23.setText(" "+bingo[47]); textField_24.setText(" "+bingo[48]);	
				textField_25.setText(" "+bingo[49]);
			}
		});
		btnStart.setBounds(305, 17, 97, 25);
		frame.getContentPane().add(btnStart);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(12, 265, 47, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(56, 265, 47, 39);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(105, 265, 47, 39);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(198, 265, 47, 39);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(149, 265, 47, 39);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(12, 304, 47, 39);
		frame.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(56, 304, 47, 39);
		frame.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(105, 304, 47, 39);
		frame.getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(149, 304, 47, 39);
		frame.getContentPane().add(textField_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(198, 304, 47, 39);
		frame.getContentPane().add(textField_10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(12, 341, 47, 39);
		frame.getContentPane().add(textField_11);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(56, 341, 47, 39);
		frame.getContentPane().add(textField_12);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(105, 341, 47, 39);
		frame.getContentPane().add(textField_13);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(149, 341, 47, 39);
		frame.getContentPane().add(textField_14);

		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(198, 341, 47, 39);
		frame.getContentPane().add(textField_15);

		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(12, 379, 47, 39);
		frame.getContentPane().add(textField_16);

		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(56, 379, 47, 39);
		frame.getContentPane().add(textField_17);

		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(105, 379, 47, 39);
		frame.getContentPane().add(textField_18);

		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(149, 379, 47, 39);
		frame.getContentPane().add(textField_19);

		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(198, 379, 47, 39);
		frame.getContentPane().add(textField_20);

		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(12, 416, 47, 39);
		frame.getContentPane().add(textField_21);

		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(56, 416, 47, 39);
		frame.getContentPane().add(textField_22);

		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(105, 416, 47, 39);
		frame.getContentPane().add(textField_23);

		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(149, 416, 47, 39);
		frame.getContentPane().add(textField_24);

		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(198, 416, 47, 39);
		frame.getContentPane().add(textField_25);

		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setBounds(286, 265, 116, 203);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);

		JSeparator separator_8 = new JSeparator();
		separator_8.setBackground(Color.RED);
		separator_8.setForeground(Color.RED);
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(408, 269, 20, 203);
		frame.getContentPane().add(separator_8);

		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(414, 265, 116, 203);
		frame.getContentPane().add(textField_27);

		txtPlayerA = new JTextField();
		txtPlayerA.setEditable(false);
		txtPlayerA.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPlayerA.setText("Player A");
		txtPlayerA.setBounds(286, 242, 116, 22);
		frame.getContentPane().add(txtPlayerA);
		txtPlayerA.setColumns(10);

		txtPlayerB = new JTextField();
		txtPlayerB.setText("Player B");
		txtPlayerB.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPlayerB.setEditable(false);
		txtPlayerB.setColumns(10);
		txtPlayerB.setBounds(414, 242, 116, 22);
		frame.getContentPane().add(txtPlayerB);

		txtScore = new JTextField();
		txtScore.setText("Score");
		txtScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtScore.setEditable(false);
		txtScore.setColumns(10);
		txtScore.setBounds(352, 222, 116, 22);
		frame.getContentPane().add(txtScore);

		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(414, 118, 116, 22);
		frame.getContentPane().add(textField_28);
	}
}
