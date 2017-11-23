package View;

import javax.swing.JOptionPane;

public class ViewExibeMusica {

	@SuppressWarnings("unused")
	public ViewExibeMusica(String musicas) {

		JOptionPane.showMessageDialog(null, musicas);
		ViewPrincipal vp = new ViewPrincipal();
	}

}
