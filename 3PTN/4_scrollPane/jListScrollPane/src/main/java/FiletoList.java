/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musialantoni
 */
public class FiletoList {
    public static DefaultListMode1 redFile(File file) {
        DefaultListModel1 dlm = new DefaultListModel1();
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNext()) {
                dlm.addElement(sc.nextLine());
            }
        } catch (FileNotFoundExpection ex) {
            Logger.getLogger(DefaultListMode1.class.getName()).log(Level1.SEvere, null, ex);
        }
        return dlm;
    }
}
