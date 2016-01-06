/*
***********************************************************************
 *�i��������~�O 6HW10.java
 ***********************************************************************
 *�㦳�\����G
 *�ܤ֤T�ص����C�� (�ҡG������)�B�������������s
 *�㦳�k����G
 *�i�]�w�I���C��ܤ֨�� (�ҡG�¥�)�B�i�M���ثe���e������
 *���U�������s�ɷ|�T�{�O�_�n�����{��
 **/

// �ݭn���M��Gswing�BAWT�Bawt ���l�M�� event (�ƥ�B�z)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// �D���O�����~�� JFrame ���ۤv�����@�ӵ������O
// ��@ ActionListener ���� actionPerformed() ��k�B�z JButton �� trigger
// ��@ MouseMotionListener ���� mouseMoved() �P mouseDragged ��k�ӳB�z��~�\��
public class HW10 extends JFrame implements ActionListener, MouseMotionListener
{
	// ��һݭn����Ƶ��c�ǳƦn
	private Container c;								// ��ӵ����e��
	private JPopupMenu pm;								// �k��X�{���u�X���
	private JMenuItem mi1, mi2, mi3;					// �k���椤�i�I�諸����
	private JToolBar jtb;								// �W��u��C���
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, exit;	// �W��u��C��椤�������m���s
	//private JButton[] bt = new JButton[7];

	private int px, py, px2, py2;						// px,py ø�ϰ_�l�I�y�СFpx2,py2 ø�ϵ����I�y��
	private int cr, cg, cb;								// �� RGB �����ܼƤ�K�󴫵����m
	private Graphics g;									// ø�����O Graphics

	// �D���O�غc�l
	public HW10()
	{
		// �ѩ��~�� JFrame ���O�A�I�s�����O�غc�l���P���� JFrame() �غc�l�A�Y�]�w�������D
		super("HW10");
		// ���o JFrame �e������
		c = getContentPane();
		// �N�I���e���]�w���զ�
		c.setBackground(Color.white);
		// �N�D���O (��ӵ���) �[�J addMouseMotionListener �����i�H�Q��ť�ƹ����ʡB�즲�ƥ�
		addMouseMotionListener(this);

		// �}�l�s�@�W��u��C���
		jtb = new JToolBar();
		// �[�J���ⵧ��B�ñN���[�J�ƥ��ť���A��ϥΪ��I�U�ɥiĲ�o actionPerformed() �ƥ�A������[��W��u��C��椤
		bt1 = new JButton("����");
		bt1.addActionListener(this);
		jtb.add(bt1);

		// �[�J��ⵧ��B�ñN���[�J�ƥ��ť���A��ϥΪ��I�U�ɥiĲ�o actionPerformed() �ƥ�A������[��W��u��C��椤
		bt2 = new JButton("��");
		bt2.addActionListener(this);
		jtb.add(bt2);

		// �[�J���ⵧ��B�ñN���[�J�ƥ��ť���A��ϥΪ��I�U�ɥiĲ�o actionPerformed() �ƥ�A������[��W��u��C��椤
		bt3 = new JButton("����");
		bt3.addActionListener(this);
		jtb.add(bt3);

		// �[�J�Ŧⵧ��B�ñN���[�J�ƥ��ť���A��ϥΪ��I�U�ɥiĲ�o actionPerformed() �ƥ�A������[��W��u��C��椤
		bt4 = new JButton("�ŵ�");
		bt4.addActionListener(this);
		jtb.add(bt4);

		// �[�J�¦ⵧ��B�ñN���[�J�ƥ��ť���A��ϥΪ��I�U�ɥiĲ�o actionPerformed() �ƥ�A������[��W��u��C��椤
		bt5 = new JButton("�µ�");
		bt5.addActionListener(this);
		jtb.add(bt5);

		// �[�J�զⵧ��B�ñN���[�J�ƥ��ť���A��ϥΪ��I�U�ɥiĲ�o actionPerformed() �ƥ�A������[��W��u��C��椤
		bt6 = new JButton("�յ�");
		bt6.addActionListener(this);
		jtb.add(bt6);

		// �[�J�����������s�A��ϥΪ��I�U�ɥiĲ�o actionPerformed() �ƥ�A������[��W��u��C��椤
		exit = new JButton("����");
		exit.addActionListener(this);
		jtb.add(exit);

		// �N��ӤW��u��C���[��e����
		c.setLayout(new BorderLayout());
		c.add(jtb, BorderLayout.NORTH);

		// �}�l�s�@�k��u�X��� ================================================
		pm = new JPopupMenu();

		// �[�J�Ĥ@�ӿﶵ (���D����A�ҥH�L�k�[�J��ť�ƥ�)
		pm.add("��ܭI���C��G");
		// �[�J�@�Ӥ��j�u
		pm.addSeparator();

		// �}�l�[�J�i�Q��ť������A�����O�N�I���ܥզ⪺�ﶵ�A�[����⪫��[�J�ƥ��ť��
		mi1 = new JMenuItem("�զ�");
		mi1.addActionListener(this);
		pm.add(mi1);

		// �A�[�J�i�Q��ť������A�N�I���ܶ¦⪺�ﶵ�A�[����⪫��[�J�ƥ��ť��
		pm.add(mi2 = new JMenuItem("�¦�"));
		mi2.addActionListener(this);

		// �A�[�J�@�Ӥ��j�u
		pm.addSeparator();

		// �[�J�̫�i�Q��ť������A�N�e���M�����e���ﶵ�A�[����⪫��[�J�ƥ��ť��
		pm.add(mi3 = new JMenuItem("�M�����e"));
		mi3.addActionListener(this);

		// ==============================================================================================
		// �k���檺��ť�ƥ�O��ƹ����U�k�䪺�ɭ�
		// ����@ MouseListener �������ܻݹ�@���Ӥ�k�A�b���u�ݭn�䤤�@�ӡA�]���ϥ� MouseAdapter
		// ���B�O�����إߤ@�ӰΦW���O�A�����~�� MouseAdapter�A�A��g�ΦW���O���� mouseClicked() ��k
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				// �b mouseClicked() �ƥ󤤧P�_�A�Y�ϥΪ̫��U���O�k�� (isMetaDown())
				if (e.isMetaDown())
				{
					// �Y�O�k��h�ϥ� JPopupMenu ���� show ��k������ܥX��
					// e.getComponent() �����X�{�b�I�s��������
					// �H���Ҩӻ��O�X�{�b Container ���A�X�{����m�O�ƹ����y�ЮǡA�]���� getX() �P getY() ���o�y��
					pm.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
	}

	// ��@ actionPerformed ��k
	public void actionPerformed(ActionEvent e)
	{
		// �Y�ϥΪ̫��U���O bt1 (����) �h�N RGB �]������
		if (e.getSource() == bt1)
		{
			cr = 255;
			cg = 255;
			cb = 0;
		}

		// �Y�ϥΪ̫��U���O bt2 (��) �h�N RGB �]�����
		else if(e.getSource() == bt2)
		{
			cr = 0;
			cg = 255;
			cb = 0;
		}

		// �Y�ϥΪ̫��U���O bt3 (����) �h�N RGB �]������
		else if(e.getSource() == bt3)
		{
			cr = 255;
			cg = 0;
			cb = 0;
		}

		// �Y�ϥΪ̫��U���O bt4 (�ŵ�) �h�N RGB �]���Ŧ�
		else if (e.getSource() == bt4)
		{
			cr = 0;
			cg = 0;
			cb = 255;
		}

		// �Y�ϥΪ̫��U���O bt5 (�µ�) �h�N RGB �]���¦�
		else if(e.getSource() == bt5)
		{
			cr = 0;
			cg = 0;
			cb = 0;
		}

		// �Y�ϥΪ̫��U���O bt6 (�յ�) �h�N RGB �]���զ�
		else if(e.getSource() == bt6)
		{
			cr = 255;
			cg = 255;
			cb = 255;
		}

		// �Y�ϥΪ̫��U���O���������s
		else if(e.getSource() == exit)
		{
			// ���X�u�O�_�T�w���}�{���H�v����ܮ�
			if (JOptionPane.showConfirmDialog(c, "�O�_�T�w���}�{���H", "�T�{���}", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			{
				// �Y�ϥΪ��I��T�w���}�A�h��ܡu���§A���ϥΡI�v����ܮءA�õ��� JVM ����
				JOptionPane.showMessageDialog(c, "���§A���ϥΡI", "�T�{���}", JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
		}

		// �Y�ϥΪ̫��U���O�k���椤���զ�I���A�h�N Container �I���ܥզ�
		else if(e.getSource() == mi1)
		{
			c.setBackground(Color.white);
		}

		// �Y�ϥΪ̫��U���O�k���椤���¦�I���A�h�N Container �I���ܶ¦�
		else if(e.getSource() == mi2)
		{
			c.setBackground(Color.black);
		}

		// �Y�ϥΪ̫��U���O�k���椤���M�����e�A�h�N Container repaint()
		else if(e.getSource() == mi3)
		{
			repaint();
		}

	}

	//���ʷƹ�����
	public void mouseMoved(MouseEvent e)
	{
		//���o�ƹ����_�I�y�Ц�m
		px = e.getX();
		py = e.getY();
	}

	//�첾�ƹ�����
	public void mouseDragged(MouseEvent e)
	{
		// ���o�ƹ��������y�Ц�m
		px2 = e.getX();
		py2 = e.getY();

		// �Y�ϥΪ̨ëD���U�k�� (�]�k��ƥ�w���t���k����)
		if (!e.isMetaDown())
		{
			// ���o Graphics �����ø��
			g = getGraphics();

			//�]�w�u���C��A�ݬ� RGB �T���ܼƤ����C����O���h��
			g.setColor(new Color(cr, cg, cb));

			//�e�u���A�q px,py �e�� px2,py2
			g.drawLine(px, py, px2, py2);

			// �e�����ƹ����_�I�y�Ц�m�]���{�b���d����m
			px = px2;
			py = py2;
		}
	}

	// �D���O�����D�{��
	public static void main(String[] args)
	{
		// �N�D���O����ƥX��
		HW10 win = new HW10();

		// �]�w�����j�p
		win.setSize(400, 300);

		// �������X�{�b�e����
		win.setVisible(true);

		// ��w�]�����������s�\����� (JFrame.DO_NOTHING_ON_CLOSE)
		win.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}