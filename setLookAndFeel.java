private void setLookAndFeel()
	{
		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			  SwingUtilities.updateComponentTreeUI(this);
			}
			catch (InstantiationException e) {}
			catch (ClassNotFoundException e) {}
			catch (UnsupportedLookAndFeelException e) {}
			catch (IllegalAccessException e) {}
	}
