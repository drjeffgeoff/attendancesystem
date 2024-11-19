import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.ArrayList;
import utils.List;

public class AttendanceForm extends JFrame {
    private JTextField txtStudentName;
    private JButton btnMarkAttendance;
    private JTable attendanceTable;
    private DefaultTableModel tableModel;
    private List<String> attendanceList;

}
