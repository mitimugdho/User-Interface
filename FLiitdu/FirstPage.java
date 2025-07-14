import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FirstPage{
    public static void main(String[] args){
        JFrame frame = new JFrame("IIT DU football league");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //name
        JLabel name = new JLabel("Student's name:");
        name.setBounds(20,15,100,25);
        frame.add(name);

        JTextField nameField = new JTextField();
        nameField.setBounds(170,15,250,25);
        frame.add(nameField);

        //phone number
        JLabel phone = new JLabel("Phone number:");
        phone.setBounds(20,50,100,25);
        frame.add(phone);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(170,50,250,25);
        frame.add(phoneField);

        //email
        JLabel email = new JLabel("Email:");
        email.setBounds(20,85,100,25);
        frame.add(email);

        JTextField emailField = new JTextField();
        emailField.setBounds(170,85,250,25);
        frame.add(emailField);

        //address
        JLabel address = new JLabel("Address:");
        address.setBounds(20,120,100,25);
        frame.add(address);

        JLabel village = new JLabel("village/road:");
        village.setBounds(170,120,80,20);
        frame.add(village);

        JTextField villageField = new JTextField();
        villageField.setBounds(250,120,120,18);
        frame.add(villageField);

        JLabel upzilla = new JLabel("upzilla:");
        upzilla.setBounds(170,145,80,20);
        frame.add(upzilla);

        JTextField upzillaField = new JTextField();
        upzillaField.setBounds(250,145,120,18);
        frame.add(upzillaField);

        JLabel district = new JLabel("district:");
        district.setBounds(170,170,80,20);
        frame.add(district);

        JTextField districtField = new JTextField();
        districtField.setBounds(250,170,120,18);
        frame.add(districtField);

        JLabel country = new JLabel("country:");
        country.setBounds(170,195,80,20);
        frame.add(country);

        JTextField countryField = new JTextField();
        countryField.setBounds(250,195,120,18);
        frame.add(countryField);

        //gender
        JLabel gender = new JLabel("Gender:");
        gender.setBounds(20,230,100,25);
        frame.add(gender);

        JRadioButton male = new JRadioButton("male");
        male.setBounds(170,230,100,25);
        frame.add(male);

        JRadioButton female = new JRadioButton("female");
        female.setBounds(270,230,100,25);
        frame.add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        //degree
        JLabel degree = new JLabel("Degree:");
        degree.setBounds(20,265,100,25);
        frame.add(degree);

        JRadioButton bsc = new JRadioButton("bachelor's");
        bsc.setBounds(170,265,100,25);
        frame.add(bsc);

        JRadioButton msc = new JRadioButton("master's");
        msc.setBounds(270,265,100,25);
        frame.add(msc);

        ButtonGroup degreeGroup = new ButtonGroup();
        degreeGroup.add(bsc);
        degreeGroup.add(msc);

        //date of birth
        JLabel birth = new JLabel("Date of birth:");
        birth.setBounds(20,300,100,25);
        frame.add(birth);

        String[] days = new String[32];
        days[0]="select";
        for(int i = 1; i<=31;i++)days[i]=String.valueOf(i);
        JComboBox<String> dayBox = new JComboBox<>(days);
        dayBox.setBounds(170,300,90,25);
        frame.add(dayBox);

        String[] months = {"select","JAN", "FEB", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUG", "SEPT", "OCT", "NOV", "DEC"};
        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(250,300,90,25);
        frame.add(monthBox);

        String[] years = new String[36];
        years[0]="select";
        for(int i = 1; i<36;i++)years[i]=String.valueOf(2025-i);
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(330,300,90,25);
        frame.add(yearBox);

        //picture
        JLabel pic = new JLabel("Picture:");
        pic.setBounds(20,335,100,25);
        frame.add(pic);

        JButton picButton = new JButton("choose file");
        picButton.setBounds(170,335,100,25);
        frame.add(picButton);

        final String[] selectedFilePath = {""};
        picButton.addActionListener(e->{
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                selectedFilePath[0] = file.getAbsolutePath();
                picButton.setText(file.getName());
            }
        });

        //position
        JLabel position = new JLabel("Preferred positon:");
        position.setBounds(20,370,120,25);
        frame.add(position);

        String[] positions = {"select","goalkeeper","defender","midfielder","striker"};
        JComboBox<String> positionBox = new JComboBox<>(positions);
        positionBox.setBounds(170,370,150,25);
        frame.add(positionBox);

        JLabel experience=new JLabel("Prior experiences:");
        experience.setBounds(20,405,150,50);
        frame.add(experience);

        JTextField expField=new JTextField();
        expField.setBounds(170,405,250,50);
        frame.add(expField);

        //button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(200, 480, 120, 30);
        frame.add(registerButton);

        registerButton.addActionListener(e->{
            String user=nameField.getText();
            String number=phoneField.getText();
            String gmail= emailField.getText();
            String vill=villageField.getText();
            String thana=upzillaField.getText();
            String zilla=districtField.getText();
            String desh=countryField.getText();
            String genders = male.isSelected() ? "Male" : (female.isSelected() ? "Female": "Not selected");
            String deg= bsc.isSelected() ? "Bachelor's" : msc.isSelected() ? "Master's" : "Not selected";
            String dob = dayBox.getSelectedItem() + "/" + monthBox.getSelectedItem() + "/" + yearBox.getSelectedItem();
            Object day=dayBox.getSelectedItem();
            Object month=monthBox.getSelectedItem();
            Object year=yearBox.getSelectedItem();
            Object preferredPosition = positionBox.getSelectedItem()+" ";
            String exp= expField.getText();

            if(user.isEmpty() || number.isEmpty() || gmail.isEmpty() || vill.isEmpty() || thana.isEmpty() || zilla.isEmpty() ||
                    desh.isEmpty() || genders.equals("Not selected") || deg.equals("Not selected")|| day.equals("select") || month.equals("select") || year.equals("select")
                    || selectedFilePath[0].isEmpty() || preferredPosition.equals("select") || exp.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else{
                try {
                    FileWriter file = new FileWriter("fl_reg.txt",true);
                    file.write("Name:"+user+"\nPhone number:"+number+"\nEmail:"+gmail+"\nAddress:\n\tVillage:"+vill+"; Upzilla:"+thana
                            +"; District:"+zilla+"; Country:"+desh+"\nGender:"+genders+"\nDegree:"+deg+"\nDOB:"+dob+"\nPicture path:"+
                            selectedFilePath+"\nPreferred positon:"+ preferredPosition+"\nExperience:"+exp);
                    file.close();
                    JOptionPane.showMessageDialog(frame,"Registration Successful","Success",JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error writing to file!", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }


            }
        });
        frame.setVisible(true);
    }
}