/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.filmoteka;

import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class Main extends javax.swing.JFrame {
    static String tytulFilmu;
    static int ocenaFilmu;
    static String oF;
    static String[] opisyFilmu = {
        "Legenda to biograficzny thriller kryminalny z 2015 roku, napisany i wyreżyserowany przez amerykańskiego reżysera Briana Helgelanda.",
        "amerykański dramat sportowy z 2023 roku w reżyserii Michaela B. Jordana. Dziewiąta produkcja z serii filmów o Rockym oraz kontynuacja filmu Creed II z 2018 roku. W głównych rolach wystąpili Michael B. Jordan, Tessa Thompson i Jonathan Majors. Film miał premierę 1 marca 2023 roku.",
        "amerykański monster movie w reżyserii Adama Wingarda. Piąty film należący do franczyzy MonsterVerse studia Legendary Pictures. Jest to piąty w historii film o Godzilli realizowany przez amerykańskie studia filmowe oraz trzeci, w którym wspólnie występuje z King Kongiem.",
        "amerykański film animowany studia DreamWorks z 2024. Jest to czwarta odsłona serii i kontynuacja filmu Kung Fu Panda 3",
        "amerykański superbohaterski serial dramatyczny na podstawie historii o tym samym tytule z komiksów wydawnictwa Marvel Comics. Twórcą serialu był Kyle Bradstreet, który odpowiadał za scenariusz. Reżyserią zajął się Ali Selim. Główne role zagrali: Samuel L.",
        "Fantasmas to amerykański serial komediowy stworzony, wyreżyserowany i napisany przez Julio Torresa, który także w nim występuje. Podąża za Torresem w poszukiwaniu kolczyka ze złotą ostrygą i ludźmi, których spotyka po drodze. Światową premierę miał 30 maja 2024 roku na Festiwalu Telewizyjnym ATX.",
        "postapokaliptyczny serial przygodowy Netfliksa, na podstawie serii komiksów imprintu Vertigo, o tym samym tytule, stworzonej przez Jeffa Lemire'a. Pierwsza seria pojawiła się w czerwcu 2021 roku. W kolejnym miesiącu ogłoszono zamówienie kolejnej, która pojawiła się 27 kwietnia 2023.",
        "amerykański superbohaterski serial dramatyczny na podstawie postaci o tym samym pseudonimie z komiksów wydawnictwa Marvel Comics. Twórcą serialu był Jeremy Slater, który odpowiadał za scenariusz, reżyserią zajęli się Mohamed Diab, Justin Benson i Aaron Moorhead.",
        "amerykański dramatyczny serial superbohaterski z lat 2015–2018 na podstawie komiksów o postaci o tym samym imieniu wydawnictwa Marvel Comics. Twórcą serialu był Drew Goddard, a został on wyprodukowany przez ABC Studios, Marvel Television, DeKnight Productions i Goddard Textiles."
    };
    static ImageIcon iconCreed3 = new ImageIcon("./images/creed3.jpg");
    static ImageIcon iconDaredevil = new ImageIcon("./images/daredevil.jpg");
    static ImageIcon iconFantasmas = new ImageIcon("./images/fantasmas.jpg");
    static ImageIcon iconGodzillaikong = new ImageIcon("./images/godzillaikong.jpg");
    static ImageIcon iconKungFuPanda = new ImageIcon("./images/kungfupanda.jpg");
    static ImageIcon iconLasuch = new ImageIcon("./images/lasuch.jpg");
    static Icon iconLegend = new ImageIcon("legend.jpg");
    static ImageIcon iconMoonKnight = new ImageIcon("./images/moonknight.jpg");
    static ImageIcon iconTajnaInwazja = new ImageIcon("../images/tajnainwazja.jpg");
    
        static {
        // Używanie ścieżki względnej do ładowania obrazu
        Path imagePath = Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "tajnainwazja.jpg");
        iconTajnaInwazja = new ImageIcon(imagePath.toString());

        // Sprawdzenie poprawności ładowania obrazu
        if (iconTajnaInwazja.getImageLoadStatus() == java.awt.MediaTracker.ERRORED) {
            System.err.println("Nie można znaleźć obrazu: " + imagePath);
        }

        // Podobnie dla innych obrazów
        iconCreed3 = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "creed3.jpg").toString());
        iconGodzillaikong = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "godzillaikong.jpg").toString());
        iconKungFuPanda = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "kungfupanda.jpg").toString());
        iconLegend = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "legend.jpg").toString());
        iconFantasmas = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "fantasmas.jpg").toString());
        iconLasuch = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "lasuch.jpg").toString());
        iconMoonKnight = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "moonknight.jpg").toString());
        iconDaredevil = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "daredevil.jpg").toString());
        iconTajnaInwazja = new ImageIcon(Paths.get("src", "main", "java", "com", "mycompany", "filmoteka", "images", "tajnainwazja.png").toString());
    }

    /**
     * Creates new form Main
     */
    public Main() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jL_NazwaLegend = new javax.swing.JLabel();
        jCB_OcenaLegend = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jB_PodgladLegend = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jL_NazwaCreed3 = new javax.swing.JLabel();
        jCB_OcenaCreed3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jB_Creed3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jL_NazwaGodzilla = new javax.swing.JLabel();
        jCB_OcenaGodzilla = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jB_PodgladGodzilla = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jL_NazwaKungFuPanda4 = new javax.swing.JLabel();
        jCB_OcenaKungFuPanda4 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jB_PodgladKungFuPanda4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jL_NazwaTajnaInwazja = new javax.swing.JLabel();
        jCB_OcenaTajnaInwazja = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jB_PodgladTajnaInwazja = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jL_NazwaFantasmas = new javax.swing.JLabel();
        jCB_OcenaFantasmas = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jB_PodgladFantasmas = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jL_NazwaLasuch = new javax.swing.JLabel();
        jCB_OcenaLasuch = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jB_PodgladLasuch = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jL_NazwaMoonKnight = new javax.swing.JLabel();
        jCB_OcenaMoonKnight = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jB_PodgladMoonKnight = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jL_NazwaDaredevil = new javax.swing.JLabel();
        jCB_OcenaDaredevil = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jB_PodgladDaredevil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jL_IloscSeriali = new javax.swing.JLabel();
        jL_IloscFilmow = new javax.swing.JLabel();
        jL_SredniaOcena = new javax.swing.JLabel();
        jP_PodgladFilmu = new javax.swing.JPanel();
        jL_OcenaFilmu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_OpisFilmu = new javax.swing.JTextArea();
        jL_ZdjecieFilmu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaLegend.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaLegend.setForeground(java.awt.Color.black);
        jL_NazwaLegend.setText("Legend");

        jCB_OcenaLegend.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaLegend.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaLegend.setForeground(java.awt.Color.black);
        jCB_OcenaLegend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(java.awt.Color.black);
        jLabel12.setText("Ocena:");

        jB_PodgladLegend.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladLegend.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladLegend.setForeground(java.awt.Color.black);
        jB_PodgladLegend.setText("Podgląd");
        jB_PodgladLegend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladLegendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaLegend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladLegend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaLegend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaLegend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaLegend)
                        .addComponent(jB_PodgladLegend))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaCreed3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaCreed3.setForeground(java.awt.Color.black);
        jL_NazwaCreed3.setText("Creed III");

        jCB_OcenaCreed3.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaCreed3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaCreed3.setForeground(java.awt.Color.black);
        jCB_OcenaCreed3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(java.awt.Color.black);
        jLabel14.setText("Ocena:");

        jB_Creed3.setBackground(new java.awt.Color(204, 204, 204));
        jB_Creed3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_Creed3.setForeground(java.awt.Color.black);
        jB_Creed3.setText("Podgląd");
        jB_Creed3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_Creed3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaCreed3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Creed3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaCreed3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaCreed3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaCreed3)
                        .addComponent(jB_Creed3))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaGodzilla.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaGodzilla.setForeground(java.awt.Color.black);
        jL_NazwaGodzilla.setText("Godzilla i Kong: Nowe imperium ");

        jCB_OcenaGodzilla.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaGodzilla.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaGodzilla.setForeground(java.awt.Color.black);
        jCB_OcenaGodzilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(java.awt.Color.black);
        jLabel16.setText("Ocena:");

        jB_PodgladGodzilla.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladGodzilla.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladGodzilla.setForeground(java.awt.Color.black);
        jB_PodgladGodzilla.setText("Podgląd");
        jB_PodgladGodzilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladGodzillaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaGodzilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladGodzilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaGodzilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaGodzilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaGodzilla)
                        .addComponent(jB_PodgladGodzilla))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaKungFuPanda4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaKungFuPanda4.setForeground(java.awt.Color.black);
        jL_NazwaKungFuPanda4.setText("Kung Fu Panda 4 ");

        jCB_OcenaKungFuPanda4.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaKungFuPanda4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaKungFuPanda4.setForeground(java.awt.Color.black);
        jCB_OcenaKungFuPanda4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setForeground(java.awt.Color.black);
        jLabel18.setText("Ocena:");

        jB_PodgladKungFuPanda4.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladKungFuPanda4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladKungFuPanda4.setForeground(java.awt.Color.black);
        jB_PodgladKungFuPanda4.setText("Podgląd");
        jB_PodgladKungFuPanda4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladKungFuPanda4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaKungFuPanda4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladKungFuPanda4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaKungFuPanda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaKungFuPanda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaKungFuPanda4)
                        .addComponent(jB_PodgladKungFuPanda4))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaTajnaInwazja.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaTajnaInwazja.setForeground(java.awt.Color.black);
        jL_NazwaTajnaInwazja.setText("Tajna inwazja ");

        jCB_OcenaTajnaInwazja.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaTajnaInwazja.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaTajnaInwazja.setForeground(java.awt.Color.black);
        jCB_OcenaTajnaInwazja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(java.awt.Color.black);
        jLabel20.setText("Ocena:");

        jB_PodgladTajnaInwazja.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladTajnaInwazja.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladTajnaInwazja.setForeground(java.awt.Color.black);
        jB_PodgladTajnaInwazja.setText("Podgląd");
        jB_PodgladTajnaInwazja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladTajnaInwazjaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaTajnaInwazja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladTajnaInwazja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaTajnaInwazja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaTajnaInwazja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaTajnaInwazja)
                        .addComponent(jB_PodgladTajnaInwazja))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaFantasmas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaFantasmas.setForeground(java.awt.Color.black);
        jL_NazwaFantasmas.setText("Fantasmas");

        jCB_OcenaFantasmas.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaFantasmas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaFantasmas.setForeground(java.awt.Color.black);
        jCB_OcenaFantasmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(java.awt.Color.black);
        jLabel22.setText("Ocena:");

        jB_PodgladFantasmas.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladFantasmas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladFantasmas.setForeground(java.awt.Color.black);
        jB_PodgladFantasmas.setText("Podgląd");
        jB_PodgladFantasmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladFantasmasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaFantasmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladFantasmas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaFantasmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaFantasmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaFantasmas)
                        .addComponent(jB_PodgladFantasmas))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaLasuch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaLasuch.setForeground(java.awt.Color.black);
        jL_NazwaLasuch.setText("Łasuch");

        jCB_OcenaLasuch.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaLasuch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaLasuch.setForeground(java.awt.Color.black);
        jCB_OcenaLasuch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setForeground(java.awt.Color.black);
        jLabel24.setText("Ocena:");

        jB_PodgladLasuch.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladLasuch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladLasuch.setForeground(java.awt.Color.black);
        jB_PodgladLasuch.setText("Podgląd");
        jB_PodgladLasuch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladLasuchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaLasuch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladLasuch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaLasuch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaLasuch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaLasuch)
                        .addComponent(jB_PodgladLasuch))
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaMoonKnight.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaMoonKnight.setForeground(java.awt.Color.black);
        jL_NazwaMoonKnight.setText("Moon Knight ");

        jCB_OcenaMoonKnight.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaMoonKnight.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaMoonKnight.setForeground(java.awt.Color.black);
        jCB_OcenaMoonKnight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel26.setForeground(java.awt.Color.black);
        jLabel26.setText("Ocena:");

        jB_PodgladMoonKnight.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladMoonKnight.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladMoonKnight.setForeground(java.awt.Color.black);
        jB_PodgladMoonKnight.setText("Podgląd");
        jB_PodgladMoonKnight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladMoonKnightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaMoonKnight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladMoonKnight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaMoonKnight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaMoonKnight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_NazwaMoonKnight)
                        .addComponent(jB_PodgladMoonKnight))
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jL_NazwaDaredevil.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NazwaDaredevil.setForeground(java.awt.Color.black);
        jL_NazwaDaredevil.setText("Daredevil");

        jCB_OcenaDaredevil.setBackground(new java.awt.Color(204, 204, 204));
        jCB_OcenaDaredevil.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCB_OcenaDaredevil.setForeground(java.awt.Color.black);
        jCB_OcenaDaredevil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setForeground(java.awt.Color.black);
        jLabel28.setText("Ocena:");

        jB_PodgladDaredevil.setBackground(new java.awt.Color(204, 204, 204));
        jB_PodgladDaredevil.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jB_PodgladDaredevil.setForeground(java.awt.Color.black);
        jB_PodgladDaredevil.setText("Podgląd");
        jB_PodgladDaredevil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_PodgladDaredevilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_NazwaDaredevil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_PodgladDaredevil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_OcenaDaredevil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCB_OcenaDaredevil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_PodgladDaredevil)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_NazwaDaredevil)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Średnia ocena:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Ilość filmów:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Ilość seriali:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        jL_IloscSeriali.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_IloscSeriali.setForeground(java.awt.Color.black);
        jL_IloscSeriali.setText("5");

        jL_IloscFilmow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_IloscFilmow.setForeground(java.awt.Color.black);
        jL_IloscFilmow.setText("4");

        jL_SredniaOcena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_SredniaOcena.setForeground(java.awt.Color.black);
        jL_SredniaOcena.setText("10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_SredniaOcena)
                    .addComponent(jL_IloscFilmow)
                    .addComponent(jL_IloscSeriali))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_SredniaOcena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_IloscFilmow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_IloscSeriali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_PodgladFilmu.setBackground(new java.awt.Color(255, 255, 153));
        jP_PodgladFilmu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nazwa filmu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), java.awt.Color.black)); // NOI18N

        jL_OcenaFilmu.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jL_OcenaFilmu.setForeground(java.awt.Color.black);
        jL_OcenaFilmu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_OcenaFilmu.setText("1");

        jTA_OpisFilmu.setEditable(false);
        jTA_OpisFilmu.setBackground(new java.awt.Color(255, 255, 153));
        jTA_OpisFilmu.setColumns(20);
        jTA_OpisFilmu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTA_OpisFilmu.setForeground(java.awt.Color.black);
        jTA_OpisFilmu.setLineWrap(true);
        jTA_OpisFilmu.setRows(5);
        jTA_OpisFilmu.setText("Opis");
        jScrollPane1.setViewportView(jTA_OpisFilmu);

        javax.swing.GroupLayout jP_PodgladFilmuLayout = new javax.swing.GroupLayout(jP_PodgladFilmu);
        jP_PodgladFilmu.setLayout(jP_PodgladFilmuLayout);
        jP_PodgladFilmuLayout.setHorizontalGroup(
            jP_PodgladFilmuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_PodgladFilmuLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_OcenaFilmu, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );
        jP_PodgladFilmuLayout.setVerticalGroup(
            jP_PodgladFilmuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_OcenaFilmu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jL_ZdjecieFilmu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jL_ZdjecieFilmu.setForeground(java.awt.Color.black);
        jL_ZdjecieFilmu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_ZdjecieFilmu.setText("Zdjęcie");
        jL_ZdjecieFilmu.setToolTipText("Zdjęcie");
        jL_ZdjecieFilmu.setMaximumSize(new java.awt.Dimension(219, 162));
        jL_ZdjecieFilmu.setPreferredSize(new java.awt.Dimension(219, 162));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Spis filmów i seriali");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addComponent(jP_PodgladFilmu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_ZdjecieFilmu, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_PodgladFilmu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jL_ZdjecieFilmu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_PodgladLegendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladLegendMouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaLegend.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaLegend.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[0]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconLegend);
    }//GEN-LAST:event_jB_PodgladLegendMouseClicked

    private void jB_Creed3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Creed3MouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaCreed3.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaCreed3.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[1]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconCreed3);
    }//GEN-LAST:event_jB_Creed3MouseClicked

    private void jB_PodgladGodzillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladGodzillaMouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaGodzilla.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaGodzilla.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[2]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconGodzillaikong);
    }//GEN-LAST:event_jB_PodgladGodzillaMouseClicked

    private void jB_PodgladKungFuPanda4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladKungFuPanda4MouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaKungFuPanda4.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaKungFuPanda4.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[3]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconKungFuPanda);
    }//GEN-LAST:event_jB_PodgladKungFuPanda4MouseClicked

    private void jB_PodgladTajnaInwazjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladTajnaInwazjaMouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaTajnaInwazja.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaTajnaInwazja.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[4]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconTajnaInwazja);
    }//GEN-LAST:event_jB_PodgladTajnaInwazjaMouseClicked

    private void jB_PodgladFantasmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladFantasmasMouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaFantasmas.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaFantasmas.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[5]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconFantasmas);
    }//GEN-LAST:event_jB_PodgladFantasmasMouseClicked

    private void jB_PodgladLasuchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladLasuchMouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaLasuch.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaLasuch.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[6]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconLasuch);
    }//GEN-LAST:event_jB_PodgladLasuchMouseClicked

    private void jB_PodgladMoonKnightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladMoonKnightMouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaMoonKnight.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaMoonKnight.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[7]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconMoonKnight);
    }//GEN-LAST:event_jB_PodgladMoonKnightMouseClicked

    private void jB_PodgladDaredevilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PodgladDaredevilMouseClicked
        // TODO add your handling code here:
        tytulFilmu = jL_NazwaDaredevil.getText();
        setBorderTittle(tytulFilmu);
        ocenaFilmu = jCB_OcenaDaredevil.getSelectedIndex() + 1;
        setOcenaFilmu(ocenaFilmu);
        jTA_OpisFilmu.setText(opisyFilmu[8]);
        jL_ZdjecieFilmu.setText("");
        jL_ZdjecieFilmu.setIcon(iconDaredevil);
    }//GEN-LAST:event_jB_PodgladDaredevilMouseClicked

    public void setBorderTittle(String tytulFilmu) {
        jP_PodgladFilmu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, tytulFilmu, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), java.awt.Color.black)); // NOI18N
    }
    
    public void setOcenaFilmu(int ocenaFilmu) {
        oF = String.valueOf(ocenaFilmu);
        jL_OcenaFilmu.setText(oF);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Creed3;
    private javax.swing.JButton jB_PodgladDaredevil;
    private javax.swing.JButton jB_PodgladFantasmas;
    private javax.swing.JButton jB_PodgladGodzilla;
    private javax.swing.JButton jB_PodgladKungFuPanda4;
    private javax.swing.JButton jB_PodgladLasuch;
    private javax.swing.JButton jB_PodgladLegend;
    private javax.swing.JButton jB_PodgladMoonKnight;
    private javax.swing.JButton jB_PodgladTajnaInwazja;
    private javax.swing.JComboBox<String> jCB_OcenaCreed3;
    private javax.swing.JComboBox<String> jCB_OcenaDaredevil;
    private javax.swing.JComboBox<String> jCB_OcenaFantasmas;
    private javax.swing.JComboBox<String> jCB_OcenaGodzilla;
    private javax.swing.JComboBox<String> jCB_OcenaKungFuPanda4;
    private javax.swing.JComboBox<String> jCB_OcenaLasuch;
    private javax.swing.JComboBox<String> jCB_OcenaLegend;
    private javax.swing.JComboBox<String> jCB_OcenaMoonKnight;
    private javax.swing.JComboBox<String> jCB_OcenaTajnaInwazja;
    private javax.swing.JLabel jL_IloscFilmow;
    private javax.swing.JLabel jL_IloscSeriali;
    private javax.swing.JLabel jL_NazwaCreed3;
    private javax.swing.JLabel jL_NazwaDaredevil;
    private javax.swing.JLabel jL_NazwaFantasmas;
    private javax.swing.JLabel jL_NazwaGodzilla;
    private javax.swing.JLabel jL_NazwaKungFuPanda4;
    private javax.swing.JLabel jL_NazwaLasuch;
    private javax.swing.JLabel jL_NazwaLegend;
    private javax.swing.JLabel jL_NazwaMoonKnight;
    private javax.swing.JLabel jL_NazwaTajnaInwazja;
    private javax.swing.JLabel jL_OcenaFilmu;
    private javax.swing.JLabel jL_SredniaOcena;
    private javax.swing.JLabel jL_ZdjecieFilmu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP_PodgladFilmu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTA_OpisFilmu;
    // End of variables declaration//GEN-END:variables
}
