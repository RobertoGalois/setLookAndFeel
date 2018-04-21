private void setLookAndFeel()
	{
		try {
			  //On force à utiliser le « look and feel » du système
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			  //Ici on force tous les composants de notre fenêtre (this) à se redessiner avec le « look and feel » du système
			  SwingUtilities.updateComponentTreeUI(this);
			}
			catch (InstantiationException e) {}
			catch (ClassNotFoundException e) {}
			catch (UnsupportedLookAndFeelException e) {}
			catch (IllegalAccessException e) {}
	}
