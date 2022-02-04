package favoritebooks;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login extends javax.swing.JFrame {
    private static int bookID = 0;
    FileWriter fileWriter;
    public Login() {
                 initComponents();
                 this.setLocationRelativeTo(null);
                 mainPanel.setVisible(false);
                 addBookPanel.setVisible(false);
                 deletePanel.setVisible(false);
                 displayInfoPanel.setVisible(false);
                 displayImagePanel.setVisible(false);
                 listBookPanel.setVisible(false);
                 displayNumberPanel.setVisible(false);
                 loginPanel.setVisible(true);
   
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        addBook = new javax.swing.JButton();
        deleteBook = new javax.swing.JButton();
        displayInformation = new javax.swing.JButton();
        displayImage = new javax.swing.JButton();
        listBook = new javax.swing.JButton();
        displayNumber = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        addBookPanel = new javax.swing.JPanel();
        backPageAddBook1 = new javax.swing.JButton();
        addBookButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textTitle = new javax.swing.JTextField();
        textCategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textAuthorNameSurname = new javax.swing.JTextField();
        textAwardWinner = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        textPageNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ratingComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        deletePanel = new javax.swing.JPanel();
        backPageDelete = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        textDeleteBookID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        displayInfoPanel = new javax.swing.JPanel();
        textDisplayInfoTitle = new javax.swing.JTextField();
        textDisplayInfoKeyword = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayInfoDescription = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        displayInfoTitleButton = new javax.swing.JRadioButton();
        displayInfoKeywordButton = new javax.swing.JRadioButton();
        displayInfoBackPage = new javax.swing.JButton();
        displayInfoButton = new javax.swing.JButton();
        clearInformation = new javax.swing.JButton();
        displayImagePanel = new javax.swing.JPanel();
        displayImageButton = new javax.swing.JButton();
        displayImageIdText = new javax.swing.JTextField();
        displayImageBackButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        listBookPanel = new javax.swing.JPanel();
        listAuthorRadioButton = new javax.swing.JRadioButton();
        listCategoryRadioButton = new javax.swing.JRadioButton();
        textListbyAuthor = new javax.swing.JTextField();
        textListByCategory = new javax.swing.JTextField();
        sortByRatingRadioButton = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textListedBooks = new javax.swing.JTextArea();
        listBookBackButton = new javax.swing.JButton();
        listBookButton = new javax.swing.JButton();
        clearListBookButton = new javax.swing.JButton();
        displayNumberPanel = new javax.swing.JPanel();
        dispNumberBackPageButton = new javax.swing.JButton();
        dispNumberButton = new javax.swing.JButton();
        textYearInput = new javax.swing.JTextField();
        textYearOutPut = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        textUsername = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        deleteBook.setText("Delete Book");
        deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookActionPerformed(evt);
            }
        });

        displayInformation.setText("Display Information");
        displayInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInformationActionPerformed(evt);
            }
        });

        displayImage.setText("Display Image");
        displayImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayImageActionPerformed(evt);
            }
        });

        listBook.setText("List Books");
        listBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBookActionPerformed(evt);
            }
        });

        displayNumber.setText("Display Number of Books");
        displayNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayNumberActionPerformed(evt);
            }
        });

        exitButton.setText("Log Out");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addComponent(listBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listBook, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        backPageAddBook1.setText("Back Page");
        backPageAddBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backPageAddBook1ActionPerformed(evt);
            }
        });

        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Title");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Category");

        textTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTitleActionPerformed(evt);
            }
        });

        textCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCategoryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Author Name And Surname");

        textAuthorNameSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAuthorNameSurnameActionPerformed(evt);
            }
        });

        textAwardWinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAwardWinnerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Award Winner");

        textDescription.setColumns(20);
        textDescription.setRows(5);
        jScrollPane1.setViewportView(textDescription);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Description");

        textPageNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPageNumberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Number of Pages");

        ratingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        ratingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Rating");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Year");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBookPanelLayout = new javax.swing.GroupLayout(addBookPanel);
        addBookPanel.setLayout(addBookPanelLayout);
        addBookPanelLayout.setHorizontalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookPanelLayout.createSequentialGroup()
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addBookPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookPanelLayout.createSequentialGroup()
                                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addBookPanelLayout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(addBookPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(textPageNumber)
                            .addComponent(textAwardWinner)
                            .addComponent(textAuthorNameSurname)
                            .addComponent(textCategory)))
                    .addGroup(addBookPanelLayout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addBookPanelLayout.createSequentialGroup()
                                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addBookPanelLayout.createSequentialGroup()
                                        .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(addBookPanelLayout.createSequentialGroup()
                                .addComponent(backPageAddBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(58, 58, 58))
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookPanelLayout.createSequentialGroup()
                        .addComponent(textCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAuthorNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAwardWinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addBookPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backPageAddBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        deletePanel.setPreferredSize(new java.awt.Dimension(543, 477));

        backPageDelete.setText("Back Page");
        backPageDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backPageDeleteActionPerformed(evt);
            }
        });

        deleteBookButton.setText("Delete Book");
        deleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookButtonActionPerformed(evt);
            }
        });

        textDeleteBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDeleteBookIDActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("ID : ");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Please enter  an ID to delete a book from the list.");

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(47, 47, 47)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(deletePanelLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(36, 36, 36)
                            .addComponent(textDeleteBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(deletePanelLayout.createSequentialGroup()
                            .addComponent(backPageDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addComponent(deleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textDeleteBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backPageDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        textDisplayInfoTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDisplayInfoTitleActionPerformed(evt);
            }
        });

        displayInfoDescription.setEditable(false);
        displayInfoDescription.setColumns(20);
        displayInfoDescription.setLineWrap(true);
        displayInfoDescription.setRows(5);
        displayInfoDescription.setWrapStyleWord(true);
        jScrollPane2.setViewportView(displayInfoDescription);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Information");

        buttonGroup.add(displayInfoTitleButton);
        displayInfoTitleButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        displayInfoTitleButton.setSelected(true);
        displayInfoTitleButton.setText("Title");
        displayInfoTitleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInfoTitleButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(displayInfoKeywordButton);
        displayInfoKeywordButton.setText("Keyword");
        displayInfoKeywordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInfoKeywordButtonActionPerformed(evt);
            }
        });

        displayInfoBackPage.setText("Back Page");
        displayInfoBackPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInfoBackPageActionPerformed(evt);
            }
        });

        displayInfoButton.setText("Display Information");
        displayInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInfoButtonActionPerformed(evt);
            }
        });

        clearInformation.setText("Clear");
        clearInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayInfoPanelLayout = new javax.swing.GroupLayout(displayInfoPanel);
        displayInfoPanel.setLayout(displayInfoPanelLayout);
        displayInfoPanelLayout.setHorizontalGroup(
            displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayInfoPanelLayout.createSequentialGroup()
                .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(displayInfoPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(displayInfoBackPage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearInformation)
                        .addGap(41, 41, 41)
                        .addComponent(displayInfoButton))
                    .addGroup(displayInfoPanelLayout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(displayInfoPanelLayout.createSequentialGroup()
                                .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(displayInfoTitleButton)
                                    .addComponent(displayInfoKeywordButton))
                                .addGap(18, 18, 18)
                                .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textDisplayInfoTitle)
                                    .addComponent(textDisplayInfoKeyword, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                            .addGroup(displayInfoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(63, 63, 63))
        );
        displayInfoPanelLayout.setVerticalGroup(
            displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayInfoPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDisplayInfoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayInfoTitleButton))
                .addGap(59, 59, 59)
                .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDisplayInfoKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayInfoKeywordButton))
                .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayInfoPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayInfoPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(displayInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayInfoBackPage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearInformation))
                .addGap(45, 45, 45))
        );

        displayImageButton.setText("View");
        displayImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayImageButtonActionPerformed(evt);
            }
        });

        displayImageIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayImageIdTextActionPerformed(evt);
            }
        });

        displayImageBackButton.setText("Back Page");
        displayImageBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayImageBackButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Please enter a valid ID to view the book.");

        javax.swing.GroupLayout displayImagePanelLayout = new javax.swing.GroupLayout(displayImagePanel);
        displayImagePanel.setLayout(displayImagePanelLayout);
        displayImagePanelLayout.setHorizontalGroup(
            displayImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayImagePanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(displayImageBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayImagePanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(displayImageIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(displayImagePanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayImagePanelLayout.setVerticalGroup(
            displayImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayImagePanelLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(displayImageIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(displayImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayImageBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        buttonGroup1.add(listAuthorRadioButton);
        listAuthorRadioButton.setSelected(true);
        listAuthorRadioButton.setText("List by Author");
        listAuthorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAuthorRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(listCategoryRadioButton);
        listCategoryRadioButton.setText("List by Category");
        listCategoryRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCategoryRadioButtonActionPerformed(evt);
            }
        });

        sortByRatingRadioButton.setText("Sort by Rating");
        sortByRatingRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByRatingRadioButtonActionPerformed(evt);
            }
        });

        textListedBooks.setEditable(false);
        textListedBooks.setColumns(20);
        textListedBooks.setLineWrap(true);
        textListedBooks.setRows(5);
        textListedBooks.setWrapStyleWord(true);
        jScrollPane3.setViewportView(textListedBooks);

        listBookBackButton.setText("Back Page");
        listBookBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBookBackButtonActionPerformed(evt);
            }
        });

        listBookButton.setText("List Books");
        listBookButton.setToolTipText("");
        listBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBookButtonActionPerformed(evt);
            }
        });

        clearListBookButton.setText("Clear");
        clearListBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listBookPanelLayout = new javax.swing.GroupLayout(listBookPanel);
        listBookPanel.setLayout(listBookPanelLayout);
        listBookPanelLayout.setHorizontalGroup(
            listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listBookPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(listBookPanelLayout.createSequentialGroup()
                            .addComponent(listBookBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearListBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(listBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listBookPanelLayout.createSequentialGroup()
                        .addGroup(listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listCategoryRadioButton)
                            .addComponent(listAuthorRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortByRatingRadioButton)
                            .addGroup(listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textListByCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                .addComponent(textListbyAuthor)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        listBookPanelLayout.setVerticalGroup(
            listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listBookPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listAuthorRadioButton)
                    .addComponent(textListbyAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listCategoryRadioButton)
                    .addComponent(textListByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortByRatingRadioButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(listBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBookBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearListBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        dispNumberBackPageButton.setText("Back Page");
        dispNumberBackPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispNumberBackPageButtonActionPerformed(evt);
            }
        });

        dispNumberButton.setText("Display Number");
        dispNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispNumberButtonActionPerformed(evt);
            }
        });

        textYearOutPut.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Year");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setText("Enter a year to see how many books have been read in given year.");

        javax.swing.GroupLayout displayNumberPanelLayout = new javax.swing.GroupLayout(displayNumberPanel);
        displayNumberPanel.setLayout(displayNumberPanelLayout);
        displayNumberPanelLayout.setHorizontalGroup(
            displayNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayNumberPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(dispNumberBackPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayNumberPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(displayNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayNumberPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayNumberPanelLayout.createSequentialGroup()
                        .addGroup(displayNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textYearOutPut, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(displayNumberPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(displayNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dispNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71))))
        );
        displayNumberPanelLayout.setVerticalGroup(
            displayNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayNumberPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel15)
                .addGap(57, 57, 57)
                .addGroup(displayNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(72, 72, 72)
                .addComponent(textYearOutPut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(displayNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dispNumberBackPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dispNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Username");

        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(37, 37, 37)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(90, 90, 90)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayNumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayNumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayNumberActionPerformed
        mainPanel.setVisible(false);
        displayNumberPanel.setVisible(true);        
    }//GEN-LAST:event_displayNumberActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        mainPanel.setVisible(false);
        addBookPanel.setVisible(true);
    }//GEN-LAST:event_addBookActionPerformed

    private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookActionPerformed
        mainPanel.setVisible(false);
        deletePanel.setVisible(true);
    }//GEN-LAST:event_deleteBookActionPerformed

    private void displayInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInformationActionPerformed
        mainPanel.setVisible(false);
        displayInfoPanel.setVisible(true);
        textDisplayInfoTitle.setEditable(true);
        textDisplayInfoKeyword.setEditable(false);
               
    }//GEN-LAST:event_displayInformationActionPerformed

    private void displayImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayImageActionPerformed
        mainPanel.setVisible(false);
        displayImagePanel.setVisible(true);
    }//GEN-LAST:event_displayImageActionPerformed

    private void listBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBookActionPerformed
        listBookPanel.setVisible(true);
        mainPanel.setVisible(false);
        textListbyAuthor.setEditable(true);
        textListByCategory.setEditable(false);
        sortByRatingRadioButton.setEnabled(false);
      
    }//GEN-LAST:event_listBookActionPerformed

    private void textAuthorNameSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAuthorNameSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAuthorNameSurnameActionPerformed

    private void textCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCategoryActionPerformed

    private void textTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTitleActionPerformed

    private void backPageAddBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageAddBook1ActionPerformed
        addBookPanel.setVisible(false);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_backPageAddBook1ActionPerformed

    private void ratingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingComboBoxActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void textAwardWinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAwardWinnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAwardWinnerActionPerformed

    private void textPageNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPageNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPageNumberActionPerformed

    private void backPageDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageDeleteActionPerformed
        deletePanel.setVisible(false);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_backPageDeleteActionPerformed

    private void deleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookButtonActionPerformed
               
      if (!isNumber(textDeleteBookID.getText()) || !idIsExist(textDeleteBookID.getText())) {
            JOptionPane.showMessageDialog(null, "An error has been occured during delete process. Please try again.");
            textDeleteBookID.setText("");
            return;
        }
        ArrayList<String> books = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader("books.txt"));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                if (!currentLine.split(", ")[0].equals(textDeleteBookID.getText())) {                    
                     books.add(currentLine + "\n");
                }
               
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }

        try {
            File file = new File("books.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            for (String line : books) {
                fileOutputStream.write(line.getBytes());
            }

            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "The book has been deleted successfully");
        textDeleteBookID.setText(null);   
    }//GEN-LAST:event_deleteBookButtonActionPerformed

    private void textDeleteBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDeleteBookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDeleteBookIDActionPerformed

    private void displayInfoTitleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfoTitleButtonActionPerformed
        textDisplayInfoTitle.setEditable(true);
        textDisplayInfoKeyword.setEditable(false);
        textDisplayInfoKeyword.setText(null);
    }//GEN-LAST:event_displayInfoTitleButtonActionPerformed

    private void displayInfoKeywordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfoKeywordButtonActionPerformed
         textDisplayInfoTitle.setEditable(false);
        textDisplayInfoKeyword.setEditable(true);
        textDisplayInfoTitle.setText(null);
    }//GEN-LAST:event_displayInfoKeywordButtonActionPerformed

    private void displayInfoBackPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfoBackPageActionPerformed
        mainPanel.setVisible(true);
        displayInfoPanel.setVisible(false);
    }//GEN-LAST:event_displayInfoBackPageActionPerformed

    private void displayInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfoButtonActionPerformed
      displayInfoDescription.setText(null);
        if (textDisplayInfoTitle.getText().isEmpty() && textDisplayInfoKeyword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill one of text fields.");
            return;
        }
        
            if (!textDisplayInfoTitle.getText().isEmpty()){
                
                try {
            BufferedReader fileInputStream = new BufferedReader(new FileReader("books.txt"));
            String currentLine;

            while ((currentLine = fileInputStream.readLine()) != null) {
                if (currentLine.split(", ")[1].equals(textDisplayInfoTitle.getText())) {                    
                    for(int i = 0; i<=8;i++){
                         displayInfoDescription.append(currentLine.split(", ")[i] + " / ");
                    }
                }     
            
            }
           
                } catch (FileNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }              
        
                }
            
            
             if (!textDisplayInfoKeyword.getText().isEmpty()){
                  try {
                BufferedReader br = new BufferedReader(new FileReader("books.txt"));
                String currentLine;                
                
                while ((currentLine = br.readLine()) != null) {
                    String words = currentLine.split(", ")[8].toLowerCase();
                    if (words.contains(textDisplayInfoKeyword.getText().trim().toLowerCase())) {
                        for(int i = 0; i<=8;i++){
                         displayInfoDescription.append(currentLine.split(", ")[i] + " / ");
                         if(i==8){
                             displayInfoDescription.append("\n"+"**********************************************************************"+"\n");
                         }
                                       
                        
                    }
                        }
                }

                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IOException");
            }  
             
             
             }            
            
    }//GEN-LAST:event_displayInfoButtonActionPerformed

    private void clearInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInformationActionPerformed
        
        if(displayInfoTitleButton.isSelected()){
        textDisplayInfoTitle.setText(null);
        }
        if(displayInfoKeywordButton.isSelected()){
        textDisplayInfoKeyword.setText(null);
        }
        displayInfoDescription.setText(null);
    }//GEN-LAST:event_clearInformationActionPerformed

    private void displayImageBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayImageBackButtonActionPerformed
        mainPanel.setVisible(true);
        displayImagePanel.setVisible(false);
    }//GEN-LAST:event_displayImageBackButtonActionPerformed

    private void displayImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayImageButtonActionPerformed
         if (!isNumber(displayImageIdText.getText()) || !idIsExist(displayImageIdText.getText())) {
            JOptionPane.showMessageDialog(null, "An error has been occured during display image process. Please try again.");
            displayImageIdText.setText(null);
            return;            
        }                  
        
       BufferedImage img = null; 
       
        switch(displayImageIdText.getText()){           
            case "1":
                 try{
        img = ImageIO.read(getClass().getResource("1.jpg"));
        ImageIcon imgIcon = new ImageIcon(img);
        JLabel lb1 = new JLabel();
        lb1.setIcon(imgIcon);
        JFrame frame1 = new JFrame();        
        frame1.getContentPane().add(lb1, BorderLayout.CENTER);
        frame1.pack();
        frame1.setSize(img.getWidth(),img.getHeight());
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
                    
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
                 break;
        case "2":
        try{
        img = ImageIO.read(getClass().getResource("2.jpg"));
        ImageIcon imgIcon = new ImageIcon(img);
        JLabel lb1 = new JLabel();
        lb1.setIcon(imgIcon);
        JFrame frame1 = new JFrame();        
        frame1.getContentPane().add(lb1, BorderLayout.CENTER);
        frame1.pack();
        frame1.setSize(img.getWidth(),img.getHeight());
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
                    
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
        case "3":
             try{
        img = ImageIO.read(getClass().getResource("3.jpg"));
        ImageIcon imgIcon = new ImageIcon(img);
        JLabel lb1 = new JLabel();
        lb1.setIcon(imgIcon);
        JFrame frame1 = new JFrame();        
        frame1.getContentPane().add(lb1, BorderLayout.CENTER);
        frame1.pack();
        frame1.setSize(img.getWidth(),img.getHeight());
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
                    
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
             break;
        case "4":
             try{
        img = ImageIO.read(getClass().getResource("4.jpg"));
        ImageIcon imgIcon = new ImageIcon(img);
        JLabel lb1 = new JLabel();
        lb1.setIcon(imgIcon);
        JFrame frame1 = new JFrame();
        frame1.getContentPane().add(lb1, BorderLayout.CENTER);
        frame1.pack();
        frame1.setSize(img.getWidth(),img.getHeight());
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
                    
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
             break;
             case "5":
             try{
        img = ImageIO.read(getClass().getResource("5.jpg"));
        ImageIcon imgIcon = new ImageIcon(img);
        JLabel lb1 = new JLabel();
        lb1.setIcon(imgIcon);
        JFrame frame1 = new JFrame();
        frame1.getContentPane().add(lb1, BorderLayout.CENTER);
        frame1.pack();
        frame1.setSize(img.getWidth(),img.getHeight());
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
                    
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
             break;        
             default:
                 JOptionPane.showMessageDialog(null, "Image has not defined for that book yet.");                 
        }
        displayImageIdText.setText(null);
    }//GEN-LAST:event_displayImageButtonActionPerformed

    private void displayImageIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayImageIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayImageIdTextActionPerformed

    private void listBookBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBookBackButtonActionPerformed
        mainPanel.setVisible(true);
        listBookPanel.setVisible(false);
    }//GEN-LAST:event_listBookBackButtonActionPerformed

    private void clearListBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListBookButtonActionPerformed
        textListbyAuthor.setText(null);
        textListByCategory.setText(null);
        textListedBooks.setText(null);
    }//GEN-LAST:event_clearListBookButtonActionPerformed

    private void listBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBookButtonActionPerformed
        if(listAuthorRadioButton.isSelected() && textListbyAuthor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter an author.");
                return;
        }
        if(listCategoryRadioButton.isSelected() && textListByCategory.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a category.");
                return;
        }
        textListedBooks.setText(null);
        
        if (!textListbyAuthor.getText().isEmpty()){
            textListedBooks.setText(null);
                  try {
                BufferedReader br = new BufferedReader(new FileReader("books.txt"));
                String currentLine;                
                
                while ((currentLine = br.readLine()) != null) {
                    String words = currentLine.split(", ")[3].toLowerCase();
                    if (words.contains(textListbyAuthor.getText().trim().toLowerCase())) {

                         textListedBooks.append(currentLine.split(", ")[1] + " / ");
                         textListedBooks.append(currentLine.split(", ")[8]);
                         
                             textListedBooks.append("\n"+"**************************************************************************************************"+"\n");                  
                    
                        }
                }

                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IOException");
            }  
             
             
             }
        if (!textListByCategory.getText().isEmpty() && !sortByRatingRadioButton.isSelected()){
                  try {
                BufferedReader br = new BufferedReader(new FileReader("books.txt"));
                String currentLine;                
                
                while ((currentLine = br.readLine()) != null) {
                    String words = currentLine.split(", ")[2].toLowerCase();
                    if (words.contains(textListByCategory.getText().trim().toLowerCase())) {
                       textListedBooks.append(currentLine.split(", ")[1]);
                       textListedBooks.append("\n"+"**************************************************************************************************"+"\n");   
                        }
                }

                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IOException");
            }
             }
        if(sortByRatingRadioButton.isSelected()){
            textListedBooks.setText(null);
            try {
                BufferedReader br = new BufferedReader(new FileReader("books.txt"));
                String currentLine;                
                ArrayList<String> lines = new ArrayList();
                
                while ((currentLine = br.readLine()) != null) {
                    String words = currentLine.split(", ")[2].toLowerCase();
                    if (words.contains(textListByCategory.getText().trim().toLowerCase())) {
                        lines.add(currentLine.split(", ")[5] + currentLine.split(", ")[1]);
                        }
                }
                
                String[] books = new String[lines.size()];
                
                for (int index = 0; index < lines.size(); index++) {
                    books[index] = lines.get(index);
                }                
                sortLargeToSmall(books);
                
                for (String element : books) {
                    textListedBooks.append(element.substring(1));
                    textListedBooks.append("\n"+"**************************************************************************************************"+"\n");  
                }
                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IOException");
            }
        
        }
    
        
    }//GEN-LAST:event_listBookButtonActionPerformed

    private void listAuthorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAuthorRadioButtonActionPerformed
        textListbyAuthor.setEditable(true);
        textListByCategory.setEditable(false);
        textListByCategory.setText(null);
        sortByRatingRadioButton.setSelected(false);
        sortByRatingRadioButton.setEnabled(false);
    }//GEN-LAST:event_listAuthorRadioButtonActionPerformed

    private void listCategoryRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCategoryRadioButtonActionPerformed
        textListbyAuthor.setEditable(false);
        textListByCategory.setEditable(true);
        textListbyAuthor.setText(null);
        sortByRatingRadioButton.setEnabled(true);
    }//GEN-LAST:event_listCategoryRadioButtonActionPerformed

    private void sortByRatingRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByRatingRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortByRatingRadioButtonActionPerformed

    private void dispNumberBackPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispNumberBackPageButtonActionPerformed
        displayNumberPanel.setVisible(false);
        mainPanel.setVisible(true);
        
    }//GEN-LAST:event_dispNumberBackPageButtonActionPerformed

    private void dispNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispNumberButtonActionPerformed
        if(!textYearInput.getText().isEmpty() && isNumber(textYearInput.getText()) &&  Integer.parseInt(textYearInput.getText())>=1970 && Integer.parseInt(textYearInput.getText())<= 2021 ){
        int bookQuantity = 0;
                
        try {
            BufferedReader br = new BufferedReader(new FileReader("books.txt"));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                if (currentLine.split(", ")[6].equals(textYearInput.getText())) {
                    bookQuantity++;
                }
            }
            if(bookQuantity == 0 || bookQuantity == 1){
             textYearOutPut.setText(bookQuantity+" book has been found.");
            }
            else textYearOutPut.setText(bookQuantity+" books have been found");
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }
        
        
        }else JOptionPane.showMessageDialog(null, "An error has been occured during display year process. Please try again.");{
        textYearInput.setText(null);
    
    }
        
    }//GEN-LAST:event_dispNumberButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if(textUsername.getText().equals("oguzhan123")){
        loginPanel.setVisible(false);
        mainPanel.setVisible(true);
           
        }
       else  JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
        textUsername.setText(null);
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        loginPanel.setVisible(true);
        mainPanel.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void textDisplayInfoTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDisplayInfoTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDisplayInfoTitleActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        if (isFilled() && isNumber(textPageNumber.getText()) && !textPageNumber.getText().equals("0")) {
            try {
                fileWriter = new FileWriter("books.txt",true);

                fileWriter.write(lastIndex()+", ");
                fileWriter.write(textTitle.getText()+", ");
                fileWriter.write(textCategory.getText()+", ");
                fileWriter.write(textAuthorNameSurname.getText()+", ");
                fileWriter.write(textAwardWinner.getText()+", ");
                fileWriter.write((String) ratingComboBox.getSelectedItem()+", ");
                fileWriter.write((String) yearComboBox.getSelectedItem()+", ");
                fileWriter.write(textPageNumber.getText()+", ");
                fileWriter.write(textDescription.getText()+"\n");
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "The book has been added successfully!");
                textTitle.setText(null);
                textCategory.setText(null);
                textAuthorNameSurname.setText(null);
                textAwardWinner.setText(null);
                textPageNumber.setText(null);
                textDescription.setText(null);

            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please provide valid input.");
            textTitle.setText(null);
            textCategory.setText(null);
            textAuthorNameSurname.setText(null);
            textAwardWinner.setText(null);
            textPageNumber.setText(null);
            textDescription.setText(null);
        }
    }//GEN-LAST:event_addBookButtonActionPerformed

    private boolean idIsExist(String id) {
        
            try {
            BufferedReader br = new BufferedReader(new FileReader("books.txt"));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                if (currentLine.split(", ")[0].equals(id)) {
                    return true;
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }
        return false;
        
    }
    private String lastIndex(){

        String newLine = "0";
        String idString = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("books.txt"));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                newLine = currentLine;
            }
            newLine = newLine.split(",")[0];
            int id = Integer.parseInt(newLine) + 1;
            idString = String.valueOf(id);
            br.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found.");
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("IOException");
        }
        return idString;
    }

    
    private boolean isNumber(String str) {
        for (char myChar : str.toCharArray()) {
            if (!(myChar >= 48 && myChar <= 57)) {
                return false;
            }
        }
        return true;
    }
private boolean isFilled() {
        return !(textTitle.getText().isEmpty()|| textCategory.getText().isEmpty() || textAuthorNameSurname.getText().isEmpty()
                || textAwardWinner.getText().isEmpty() || textPageNumber.getText().isEmpty() || textDescription.getText().isEmpty());
}

 private void sortLargeToSmall(String[] strArray) {
  
        for (int index1 = 1; index1 < strArray.length; ++index1) {
            String value = strArray[index1];
            int index2 = index1 - 1;
 
            while (index2 >= 0 && strArray[index2].charAt(0) < value.charAt(0)) {
                strArray[index2 + 1] = strArray[index2];
                index2 = index2 - 1;
            }
            strArray[index2 + 1] = value;
        }   
    }
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JButton addBookButton;
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JButton backPageAddBook1;
    private javax.swing.JButton backPageDelete;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearInformation;
    private javax.swing.JButton clearListBookButton;
    private javax.swing.JButton deleteBook;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JButton dispNumberBackPageButton;
    private javax.swing.JButton dispNumberButton;
    private javax.swing.JButton displayImage;
    private javax.swing.JButton displayImageBackButton;
    private javax.swing.JButton displayImageButton;
    private javax.swing.JTextField displayImageIdText;
    private javax.swing.JPanel displayImagePanel;
    private javax.swing.JButton displayInfoBackPage;
    private javax.swing.JButton displayInfoButton;
    private javax.swing.JTextArea displayInfoDescription;
    private javax.swing.JRadioButton displayInfoKeywordButton;
    private javax.swing.JPanel displayInfoPanel;
    private javax.swing.JRadioButton displayInfoTitleButton;
    private javax.swing.JButton displayInformation;
    private javax.swing.JButton displayNumber;
    private javax.swing.JPanel displayNumberPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton listAuthorRadioButton;
    private javax.swing.JButton listBook;
    private javax.swing.JButton listBookBackButton;
    private javax.swing.JButton listBookButton;
    private javax.swing.JPanel listBookPanel;
    private javax.swing.JRadioButton listCategoryRadioButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> ratingComboBox;
    private javax.swing.JRadioButton sortByRatingRadioButton;
    private javax.swing.JTextField textAuthorNameSurname;
    private javax.swing.JTextField textAwardWinner;
    private javax.swing.JTextField textCategory;
    private javax.swing.JTextField textDeleteBookID;
    private javax.swing.JTextArea textDescription;
    private javax.swing.JTextField textDisplayInfoKeyword;
    private javax.swing.JTextField textDisplayInfoTitle;
    private javax.swing.JTextField textListByCategory;
    private javax.swing.JTextField textListbyAuthor;
    private javax.swing.JTextArea textListedBooks;
    private javax.swing.JTextField textPageNumber;
    private javax.swing.JTextField textTitle;
    private javax.swing.JTextField textUsername;
    private javax.swing.JTextField textYearInput;
    private javax.swing.JTextField textYearOutPut;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
