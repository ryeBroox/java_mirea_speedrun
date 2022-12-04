package practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame extends javax.swing.JFrame {
    private int scMadrid = 0;
    private int scMilan = 0;
    private JLabel score = new JLabel("Result: 0 X 0");
    private JLabel winner = new JLabel("Winner: DRAW");
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JButton madrid = new JButton("Real Madrid");
    private JButton milan = new JButton("AC Milan");

    public JFrame() {
        super("new game");
        setSize(600, 600);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refresher(0,1);
            }
        });
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refresher(1,0);
            }
        });
        setLayout(new BorderLayout());
        add(score, BorderLayout.CENTER);
        add(winner, BorderLayout.NORTH);
        add(lastScorer, BorderLayout.SOUTH);
        add(madrid, BorderLayout.WEST);
        add(milan, BorderLayout.EAST);
    }

    private void refresher(int milan, int madrid) {
        scMadrid +=madrid;
        scMilan += milan;
        score.setText("Result:" + scMadrid + "X" +  scMilan);
        if (scMilan > scMadrid) {
            winner.setText("Winner: AC Milan");
        } else if (scMilan < scMadrid) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
        if (milan == 1) {
            lastScorer.setText("Last Scorer: AC Milan");
        } else {
            lastScorer.setText("Last Scorer: Real Madrid");
        }
    }




}
