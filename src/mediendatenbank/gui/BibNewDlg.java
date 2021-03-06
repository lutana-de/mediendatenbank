package mediendatenbank.gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import mediendatenbank.BibDatabase;

public class BibNewDlg extends javax.swing.JDialog {

	public BibNewDlg(java.awt.Frame parent) {
		super(parent, true);
		this.newDlgRequested = false;
		if (parent instanceof BibGUI2) {
			this.gui = (BibGUI2) parent;
		}
		else {
			JOptionPane.showMessageDialog(parent, "Konnte Dialog nicht öffnen. Möglicherweise hilft ein Programmneustart.");
			this.dispose();
			return;
		}
		initComponents();
		setLocationRelativeTo(parent);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        titleLbl = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        mediumTxt = new javax.swing.JComboBox();
        mediumLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();
        yearTxt = new javax.swing.JTextField();
        detailsLbl = new javax.swing.JLabel();
        detailsTxt = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        saveNewBtn = new javax.swing.JButton();
        saveCloseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Neuer Eintrag");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        titleLbl.setFont(BibFont.getRegular());
        titleLbl.setText("Interpret / Titel:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(titleLbl, gridBagConstraints);

        titleTxt.setFont(BibFont.getRegular());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 600;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(titleTxt, gridBagConstraints);

        mediumTxt.setEditable(true);
        mediumTxt.setFont(BibFont.getRegular());
        mediumTxt.setModel(new DefaultComboBoxModel(BibDatabase.get().readMediumValues(this.gui.getMediaType()).toArray()));
        mediumTxt.setSelectedItem(new String());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(mediumTxt, gridBagConstraints);

        mediumLbl.setFont(BibFont.getRegular());
        mediumLbl.setText("Medium:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(mediumLbl, gridBagConstraints);

        yearLbl.setFont(BibFont.getRegular());
        yearLbl.setText("Jahr (vierstellig):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(yearLbl, gridBagConstraints);

        yearTxt.setFont(BibFont.getRegular());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(yearTxt, gridBagConstraints);

        detailsLbl.setFont(BibFont.getRegular());
        detailsLbl.setText("Anmerkungen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(detailsLbl, gridBagConstraints);

        detailsTxt.setFont(BibFont.getRegular());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 600;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(detailsTxt, gridBagConstraints);

        btnPanel.setLayout(new java.awt.GridLayout(1, 0, 6, 0));

        saveNewBtn.setFont(BibFont.getRegular());
        saveNewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mediendatenbank/resources/save.png"))); // NOI18N
        saveNewBtn.setText("Speichern und weiterer Eintrag");
        saveNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewBtnActionPerformed(evt);
            }
        });
        btnPanel.add(saveNewBtn);

        saveCloseBtn.setFont(BibFont.getRegular());
        saveCloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mediendatenbank/resources/save.png"))); // NOI18N
        saveCloseBtn.setText("Speichern und schließen");
        saveCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCloseBtnActionPerformed(evt);
            }
        });
        btnPanel.add(saveCloseBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(btnPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewBtnActionPerformed
		this.saveEntry(true);
    }//GEN-LAST:event_saveNewBtnActionPerformed

    private void saveCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCloseBtnActionPerformed
		this.saveEntry(false);
    }//GEN-LAST:event_saveCloseBtnActionPerformed

	
	public boolean isNewDlgRequested() {
		return this.newDlgRequested;
	}
	
	private void saveEntry(boolean newDlg) {
		String title = this.titleTxt.getText();
		String medium = (String) this.mediumTxt.getSelectedItem();
		String year = this.yearTxt.getText();
		String details = this.detailsTxt.getText();
		if (title.length() <= 2) {
			JOptionPane.showMessageDialog(this, "Der Titel ist zu kurz.", "Es ist ein Fehler aufgetreten...", JOptionPane.ERROR_MESSAGE);
		} else if (!year.isEmpty() && year.length() != 4) {
			JOptionPane.showMessageDialog(this, "Die Jahreszahl ist nicht korrekt.", "Es ist ein Fehler aufgetreten...", JOptionPane.ERROR_MESSAGE);
		} else {
			Integer id = BibDatabase.get().insertData(title, medium, year, details, this.gui.getMediaType());
			if (id == 0) {
				JOptionPane.showMessageDialog(this, "Der Eintrag wurde nicht gespeichert. Es ist ein Interner Fehler aufgetreten.", "Es ist ein Fehler aufgetreten...", JOptionPane.ERROR_MESSAGE);
			} else {
				this.gui.reloadData(id);
				this.newDlgRequested = newDlg;
				this.setVisible(false);
			}
		}
	}
	
	private boolean newDlgRequested;
	private BibGUI2 gui;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPanel;
    private javax.swing.JLabel detailsLbl;
    private javax.swing.JTextField detailsTxt;
    private javax.swing.JLabel mediumLbl;
    private javax.swing.JComboBox mediumTxt;
    private javax.swing.JButton saveCloseBtn;
    private javax.swing.JButton saveNewBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JLabel yearLbl;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
