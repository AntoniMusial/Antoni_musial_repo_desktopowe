/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kantorwalut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.SwingUtilities;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author hp
 */
public class Main extends javax.swing.JFrame {
    static String urlAdress;
    static String kursEur;
    static String kursUsd;
    static String kursChf;
    static String kursJpy;
    static String kursGbp;
    static double kEur;
    static double kUsd;
    static double kChf;
    static double kJpy;
    static double kGbp;
    static double iMKEur; // ileMoznaKupic
    static double iMKUsd;
    static double iMKChf;
    static double iMKJpy;
    static double iMKGbp;
    static String iMoznaKupicEur;
    static String iMoznaKupicUsd;
    static String iMoznaKupicChf;
    static String iMoznaKupicJpy;
    static String iMoznaKupicGbp;

public void GetEuro(String urlAdress) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(new Runnable() {
        @Override
        public void run() {
            String result = "";
            
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(urlAdress);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                result = stringBuilder.toString();

                JSONObject zmienna = new JSONObject(result);
                double mid = zmienna.getJSONArray("rates").getJSONObject(0).getDouble("mid");
                result = String.valueOf(mid);

                // Tutaj możesz wykonać operacje na wyniku
                System.out.println("Kurs Euro: " + result);

                // Aktualizacja komponentu Swing musi odbywać się w wątku Event Dispatch Thread
                final String finalResult = result;
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jLKursEur.setText(finalResult);
                        kursEur = finalResult;
                        kEur = Double.parseDouble(kursEur);
                    }
                });
            } catch (IOException e) {
                System.err.println("Error downloading data: " + e.getMessage());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }
    });
}

public void GetUsd(String urlAdress) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(new Runnable() {
        @Override
        public void run() {
            String result = "";
            
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(urlAdress);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                result = stringBuilder.toString();

                JSONObject zmienna = new JSONObject(result);
                double mid = zmienna.getJSONArray("rates").getJSONObject(0).getDouble("mid");
                result = String.valueOf(mid);

                // Tutaj możesz wykonać operacje na wyniku
                System.out.println("Kurs Dolara Amerykańskiego: " + result);

                // Aktualizacja komponentu Swing musi odbywać się w wątku Event Dispatch Thread
                final String finalResult = result;
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jLKursUsd.setText(finalResult);
                        kursUsd = finalResult;
                        kUsd = Double.parseDouble(kursUsd);
                    }
                });
            } catch (IOException e) {
                System.err.println("Error downloading data: " + e.getMessage());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }
    });
}

public void GetGbp(String urlAdress) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(new Runnable() {
        @Override
        public void run() {
            String result = "";
            
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(urlAdress);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                result = stringBuilder.toString();

                JSONObject zmienna = new JSONObject(result);
                double mid = zmienna.getJSONArray("rates").getJSONObject(0).getDouble("mid");
                result = String.valueOf(mid);

                // Tutaj możesz wykonać operacje na wyniku
                System.out.println("Kurs Funta Brytyjskiego: " + result);

                // Aktualizacja komponentu Swing musi odbywać się w wątku Event Dispatch Thread
                final String finalResult = result;
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jLKursGbp.setText(finalResult);
                        kursGbp = finalResult;
                        kGbp = Double.parseDouble(kursGbp);
                    }
                });
            } catch (IOException e) {
                System.err.println("Error downloading data: " + e.getMessage());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }
    });
}

public void GetChf(String urlAdress) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(new Runnable() {
        @Override
        public void run() {
            String result = "";
            
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(urlAdress);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                result = stringBuilder.toString();

                JSONObject zmienna = new JSONObject(result);
                double mid = zmienna.getJSONArray("rates").getJSONObject(0).getDouble("mid");
                result = String.valueOf(mid);

                // Tutaj możesz wykonać operacje na wyniku
                System.out.println("Kurs Franka Szwajcarskiego: " + result);

                // Aktualizacja komponentu Swing musi odbywać się w wątku Event Dispatch Thread
                final String finalResult = result;
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jLKursChr.setText(finalResult);
                        kursChf = finalResult;
                        kChf = Double.parseDouble(kursChf);
                    }
                });
            } catch (IOException e) {
                System.err.println("Error downloading data: " + e.getMessage());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }
    });
}

public void GetJpy(String urlAdress) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(new Runnable() {
        @Override
        public void run() {
            String result = "";
            
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(urlAdress);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                result = stringBuilder.toString();

                JSONObject zmienna = new JSONObject(result);
                double mid = zmienna.getJSONArray("rates").getJSONObject(0).getDouble("mid");
                result = String.valueOf(mid);

                // Tutaj możesz wykonać operacje na wyniku
                System.out.println("Kurs Jena: " + result);

                // Aktualizacja komponentu Swing musi odbywać się w wątku Event Dispatch Thread
                final String finalResult = result;
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jLKursJpy.setText(finalResult);
                        kursJpy = finalResult;
                        kJpy = Double.parseDouble(kursJpy);
                    }
                });
            } catch (IOException e) {
                System.err.println("Error downloading data: " + e.getMessage());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }
    });
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLKursUsd = new javax.swing.JLabel();
        jLKursJpy = new javax.swing.JLabel();
        jLKursChr = new javax.swing.JLabel();
        jLKursGbp = new javax.swing.JLabel();
        jLKursEur = new javax.swing.JLabel();
        jTF_IleKupicUsd = new javax.swing.JTextField();
        jTF_IleKupicEur = new javax.swing.JTextField();
        jTF_IleKupicGbp = new javax.swing.JTextField();
        jTF_IleKupicChr = new javax.swing.JTextField();
        jTF_IleKupicJpy = new javax.swing.JTextField();
        jB_KupUsd = new javax.swing.JButton();
        jB_KupJpy = new javax.swing.JButton();
        jB_KupChr = new javax.swing.JButton();
        jB_KupGbp = new javax.swing.JButton();
        jB_KupEur = new javax.swing.JButton();
        jB_SprzedajUsd = new javax.swing.JButton();
        jB_SprzedajJpy = new javax.swing.JButton();
        jB_SprzedajChr = new javax.swing.JButton();
        jB_SprzedajGbp = new javax.swing.JButton();
        jB_SprzedajEur = new javax.swing.JButton();
        jTF_IleMaszKasy = new javax.swing.JTextField();
        jB_Oblicz = new javax.swing.JButton();
        jBPobierzKursy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("USD");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("JPY");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("CHR");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("GBP");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("EUR");

        jLKursUsd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLKursUsd.setText("Kurs");

        jLKursJpy.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLKursJpy.setText("Kurs");

        jLKursChr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLKursChr.setText("Kurs");

        jLKursGbp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLKursGbp.setText("Kurs");

        jLKursEur.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLKursEur.setText("Kurs");

        jTF_IleKupicUsd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTF_IleKupicUsd.setText("Ile można kupić");
        jTF_IleKupicUsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_IleKupicUsdActionPerformed(evt);
            }
        });

        jTF_IleKupicEur.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTF_IleKupicEur.setText("Ile można kupić");

        jTF_IleKupicGbp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTF_IleKupicGbp.setText("Ile można kupić");
        jTF_IleKupicGbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_IleKupicGbpActionPerformed(evt);
            }
        });

        jTF_IleKupicChr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTF_IleKupicChr.setText("Ile można kupić");
        jTF_IleKupicChr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_IleKupicChrActionPerformed(evt);
            }
        });

        jTF_IleKupicJpy.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTF_IleKupicJpy.setText("Ile można kupić");
        jTF_IleKupicJpy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_IleKupicJpyActionPerformed(evt);
            }
        });

        jB_KupUsd.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_KupUsd.setText("Kup");

        jB_KupJpy.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_KupJpy.setText("Kup");

        jB_KupChr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_KupChr.setText("Kup");

        jB_KupGbp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_KupGbp.setText("Kup");

        jB_KupEur.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_KupEur.setText("Kup");

        jB_SprzedajUsd.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_SprzedajUsd.setText("Sprzedaj");

        jB_SprzedajJpy.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_SprzedajJpy.setText("Sprzedaj");

        jB_SprzedajChr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_SprzedajChr.setText("Sprzedaj");

        jB_SprzedajGbp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_SprzedajGbp.setText("Sprzedaj");

        jB_SprzedajEur.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jB_SprzedajEur.setText("Sprzedaj");
        jB_SprzedajEur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SprzedajEurActionPerformed(evt);
            }
        });

        jTF_IleMaszKasy.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTF_IleMaszKasy.setText("Ile masz zł");

        jB_Oblicz.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jB_Oblicz.setText("Oblicz");
        jB_Oblicz.setEnabled(false);
        jB_Oblicz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_ObliczMouseClicked(evt);
            }
        });

        jBPobierzKursy.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBPobierzKursy.setText("Pobierz kursy");
        jBPobierzKursy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPobierzKursyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLKursUsd, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLKursEur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTF_IleKupicEur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_KupEur))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTF_IleKupicUsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_KupUsd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_SprzedajUsd)
                            .addComponent(jB_SprzedajEur)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLKursGbp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_IleKupicGbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_KupGbp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_SprzedajGbp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLKursChr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_IleKupicChr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_KupChr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_SprzedajChr))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(jLKursJpy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_IleKupicJpy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_KupJpy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_SprzedajJpy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTF_IleMaszKasy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPobierzKursy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Oblicz)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_KupUsd)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLKursUsd)
                            .addComponent(jTF_IleKupicUsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLKursEur)
                            .addComponent(jTF_IleKupicEur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_KupEur)
                            .addComponent(jB_SprzedajEur)))
                    .addComponent(jB_SprzedajUsd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTF_IleKupicGbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_KupGbp))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLKursGbp))
                    .addComponent(jB_SprzedajGbp))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTF_IleKupicChr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_KupChr)
                        .addComponent(jB_SprzedajChr))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLKursChr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLKursJpy)
                    .addComponent(jTF_IleKupicJpy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_KupJpy)
                    .addComponent(jB_SprzedajJpy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_IleMaszKasy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Oblicz)
                    .addComponent(jBPobierzKursy))
                .addGap(11, 11, 11))
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

    private void jTF_IleKupicGbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_IleKupicGbpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_IleKupicGbpActionPerformed

    private void jTF_IleKupicUsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_IleKupicUsdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_IleKupicUsdActionPerformed

    private void jTF_IleKupicChrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_IleKupicChrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_IleKupicChrActionPerformed

    private void jTF_IleKupicJpyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_IleKupicJpyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_IleKupicJpyActionPerformed

    private void jB_SprzedajEurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SprzedajEurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_SprzedajEurActionPerformed

    private void jB_ObliczMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ObliczMouseClicked
        // Obliczanie możliwości zakupu po naciśnięciu przycisku "Oblicz"
        String pieniadzeUzytkownika = jTF_IleMaszKasy.getText();
        double pU = Double.parseDouble(pieniadzeUzytkownika);
        System.out.println("Pieniadze uzytkownika: " + pU);

        if (kEur != 0 && kUsd != 0 && kGbp != 0 && kChf != 0 && kJpy != 0) {
            iMKEur = pU / kEur;
            iMKUsd = pU / kUsd;
            iMKGbp = pU / kGbp;
            iMKChf = pU / kChf;
            iMKJpy = pU / kJpy;

            // Zaokrąglenie wartości możliwości do kupienia do trzech miejsc po przecinku
            DecimalFormat df = new DecimalFormat("#.###");
            iMoznaKupicEur = df.format(iMKEur);
            jTF_IleKupicEur.setText(iMoznaKupicEur);

            iMoznaKupicUsd = df.format(iMKUsd);
            jTF_IleKupicUsd.setText(iMoznaKupicUsd);

            iMoznaKupicGbp = df.format(iMKGbp);
            jTF_IleKupicGbp.setText(iMoznaKupicGbp);

            iMoznaKupicJpy = df.format(iMKJpy);
            jTF_IleKupicJpy.setText(iMoznaKupicJpy);

            iMoznaKupicChf = df.format(iMKChf);
            jTF_IleKupicChr.setText(iMoznaKupicChf);

            System.out.println("można kupić " + iMoznaKupicEur + " EUR");
            System.out.println("można kupić " + iMoznaKupicUsd + " USD");
            System.out.println("można kupić " + iMoznaKupicChf + " CHF");
            System.out.println("można kupić " + iMoznaKupicGbp + " GBP");
            System.out.println("można kupić " + iMoznaKupicJpy + " JPY");
        } else {
            System.out.println("Nie udało się pobrać kursów walut.");
        }
    }//GEN-LAST:event_jB_ObliczMouseClicked

    private void jBPobierzKursyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPobierzKursyMouseClicked
        urlAdress = "https://api.nbp.pl/api/exchangerates/rates/A/EUR/?format=JSON";
        GetEuro(urlAdress);

        urlAdress = "https://api.nbp.pl/api/exchangerates/rates/A/USD/?format=JSON";
        GetUsd(urlAdress);

        urlAdress = "https://api.nbp.pl/api/exchangerates/rates/A/GBP/?format=JSON";
        GetGbp(urlAdress);

        urlAdress = "https://api.nbp.pl/api/exchangerates/rates/A/CHF/?format=JSON";
        GetChf(urlAdress);

        urlAdress = "https://api.nbp.pl/api/exchangerates/rates/A/JPY/?format=JSON";
        GetJpy(urlAdress);
        
        jB_Oblicz.setEnabled(true);
    }//GEN-LAST:event_jBPobierzKursyMouseClicked

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
    private javax.swing.JButton jBPobierzKursy;
    private javax.swing.JButton jB_KupChr;
    private javax.swing.JButton jB_KupEur;
    private javax.swing.JButton jB_KupGbp;
    private javax.swing.JButton jB_KupJpy;
    private javax.swing.JButton jB_KupUsd;
    private javax.swing.JButton jB_Oblicz;
    private javax.swing.JButton jB_SprzedajChr;
    private javax.swing.JButton jB_SprzedajEur;
    private javax.swing.JButton jB_SprzedajGbp;
    private javax.swing.JButton jB_SprzedajJpy;
    private javax.swing.JButton jB_SprzedajUsd;
    private javax.swing.JLabel jLKursChr;
    private javax.swing.JLabel jLKursEur;
    private javax.swing.JLabel jLKursGbp;
    private javax.swing.JLabel jLKursJpy;
    private javax.swing.JLabel jLKursUsd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_IleKupicChr;
    private javax.swing.JTextField jTF_IleKupicEur;
    private javax.swing.JTextField jTF_IleKupicGbp;
    private javax.swing.JTextField jTF_IleKupicJpy;
    private javax.swing.JTextField jTF_IleKupicUsd;
    private javax.swing.JTextField jTF_IleMaszKasy;
    // End of variables declaration//GEN-END:variables
}
