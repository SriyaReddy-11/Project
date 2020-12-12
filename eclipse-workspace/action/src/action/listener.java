b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				f2.dispose();
					
				}
			});
			bk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				f2.dispose();
				new Ds();
				}
			});
			break;
			}
        	t.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode()==KeyEvent.VK_ENTER)
						{
							y=3001;
							if(l.getText().equals(t.getText()))
							{
								if(score<18)
							{
								score++;
							}
							t.setText("");
							}else
								{t.setText("");}}}});
				try{
					if(y<=2500){
						lk1.setBounds(500, 520, 2500/7, 20);
			         lk1.setBackground(Color.ORANGE);
			       f.add(lk1);
					while(y<=2500){
						Thread.currentThread().sleep(1);	
						y++;
						lk.setBounds(500, 520, y/7, 20);
						lk.setBackground(Color.GREEN);
						}
					i++;
					}
				else{
					continue;
					} 
				}catch (Exception e) {}
				
					 }
         }}
	
