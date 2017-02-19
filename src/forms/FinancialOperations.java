/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author Keith
 */
public class FinancialOperations extends javax.swing.JPanel {

    /**
     * Creates new form FinancialOperations
     */
    public FinancialOperations() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_financialOperation = new javax.swing.ButtonGroup();
        mnu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lbl_financialOperation = new javax.swing.JLabel();
        rdo_loan = new javax.swing.JRadioButton();
        rdo_annuity = new javax.swing.JRadioButton();
        lbl_amountDescription = new javax.swing.JLabel();
        lbl_interestRate = new javax.swing.JLabel();
        lbl_term = new javax.swing.JLabel();
        lbl_resultDescription = new javax.swing.JLabel();
        txt_monthlyDeposit = new javax.swing.JTextField();
        txt_interestRate = new javax.swing.JTextField();
        txt_term = new javax.swing.JTextField();
        txt_valueAtEnd = new javax.swing.JTextField();
        btn_calculate = new javax.swing.JButton();
        btn_fullSchedule = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        jMenu1.setText("File");
        mnu_bar.add(jMenu1);

        jMenu2.setText("Edit");
        mnu_bar.add(jMenu2);

        lbl_financialOperation.setText("Financial Operation:");

        grp_financialOperation.add(rdo_loan);
        rdo_loan.setText("Loan");

        grp_financialOperation.add(rdo_annuity);
        rdo_annuity.setText("Annuity");

        lbl_amountDescription.setText("Monthly Deposit:");

        lbl_interestRate.setText("Annual Interest Rate (6% = 0.06)");

        lbl_term.setText("Term (months)");

        lbl_resultDescription.setText("Value at end of annuity");

        txt_monthlyDeposit.setMinimumSize(new java.awt.Dimension(6, 40));
        txt_monthlyDeposit.setPreferredSize(new java.awt.Dimension(60, 20));

        txt_interestRate.setPreferredSize(new java.awt.Dimension(60, 20));

        txt_term.setPreferredSize(new java.awt.Dimension(60, 20));

        txt_valueAtEnd.setPreferredSize(new java.awt.Dimension(60, 20));

        btn_calculate.setText("Calculate");

        btn_fullSchedule.setText("Full Schedule");

        btn_clear.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_clear)
                    .addComponent(btn_fullSchedule)
                    .addComponent(btn_calculate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_resultDescription)
                        .addComponent(lbl_term)
                        .addComponent(lbl_interestRate)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_financialOperation)
                            .addGap(46, 46, 46)
                            .addComponent(rdo_annuity)
                            .addGap(63, 63, 63)
                            .addComponent(rdo_loan)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_amountDescription)
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_interestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_monthlyDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_term, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_valueAtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_financialOperation)
                    .addComponent(rdo_loan)
                    .addComponent(rdo_annuity))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_amountDescription)
                    .addComponent(txt_monthlyDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_interestRate)
                    .addComponent(txt_interestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_term)
                    .addComponent(txt_term, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_calculate)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultDescription)
                    .addComponent(txt_valueAtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_fullSchedule)
                .addGap(18, 18, 18)
                .addComponent(btn_clear)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_fullSchedule;
    private javax.swing.ButtonGroup grp_financialOperation;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lbl_amountDescription;
    private javax.swing.JLabel lbl_financialOperation;
    private javax.swing.JLabel lbl_interestRate;
    private javax.swing.JLabel lbl_resultDescription;
    private javax.swing.JLabel lbl_term;
    private javax.swing.JMenuBar mnu_bar;
    private javax.swing.JRadioButton rdo_annuity;
    private javax.swing.JRadioButton rdo_loan;
    private javax.swing.JTextField txt_interestRate;
    private javax.swing.JTextField txt_monthlyDeposit;
    private javax.swing.JTextField txt_term;
    private javax.swing.JTextField txt_valueAtEnd;
    // End of variables declaration//GEN-END:variables
}
