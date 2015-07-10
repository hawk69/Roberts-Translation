
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.CharacterRun;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;


public class DocReader extends Frame implements ActionListener{
    private boolean inAnApplet = true;
    JButton view,save;
    static String newline="\n";
    JTextArea log;   
    JFileChooser fc;
    public DocReader(){
    view=new JButton("View Doc file");
    save = new JButton("Save Doc file");
    log=new JTextArea();
    fc=new JFileChooser();
    GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(gridbag);
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridx=0;
        c.gridy=0;
        c.ipadx=10;
        c.ipady=10;
        c.gridwidth=1;
        c.insets= new Insets(10,200,10,200);
        gridbag.setConstraints(view, c);
    add(view);
        c.gridx=1;
        c.gridwidth=1;
        c.insets= new Insets(10,200,10,200);
        gridbag.setConstraints(save, c);
    add(save);
    c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty=1.0;
        c.gridx=0;
        c.gridy=1;
        c.gridwidth=2;
        c.insets= new Insets(10,10,10,10);
        gridbag.setConstraints(log, c);
        log.setEditable(false);
    add(log);
    view.addActionListener(DocReader.this);
    save.addActionListener(DocReader.this);
    }
 
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == view){
           log.setText("");
       FileNameExtensionFilter filter = new FileNameExtensionFilter("DOC file","doc");
            fc.setFileFilter(filter);
       fc.setDialogTitle("Select a doc File");
            int returnVal;
            returnVal = fc.showOpenDialog(DocReader.this); 
            if(returnVal == 1){
            log.append("Select file to view");
            }
            else{
                File ff=fc.getSelectedFile();
           log.append(wordEctract(ff.toString()));
            }
            
           
       }
       if(ae.getSource() == save){
       FileNameExtensionFilter filter = new FileNameExtensionFilter("DOC file","doc");
            fc.setFileFilter(filter);
              String file="",name="";
       int returnVal;
            returnVal = fc.showSaveDialog(log);
              if(returnVal == 1){
            log.append("Select file to save");
            }
            else{
                File ff=fc.getSelectedFile();
           file=ff.toString();
           name=ff.getName();
            }
           try {
               POIFSFileSystem pfs=new POIFSFileSystem(new FileInputStream("h:\\empty.doc"));
               HWPFDocument word=new HWPFDocument(pfs);
               Range rr=word.getRange();
               Paragraph p1;
           p1 =rr.getParagraph(rr.numParagraphs()-1);
               CharacterRun cr=p1.insertBefore(log.getText());
               cr.setBold(true);
               FileOutputStream out;
               out=new FileOutputStream(file);
               word.write(out);
               out.close();
           } catch (FileNotFoundException ex) {
               Logger.getLogger(DocReader.class.getName()).log(Level.SEVERE, null, ex);
           }
           catch(IOException io){
           Logger.getLogger(DocReader.class.getName()).log(Level.SEVERE, null, io);
           }
           
       }
    }
    public String wordEctract(String word){
    FileInputStream fs;  
    WordExtractor extractor;
    HWPFDocument hdoc;
        String lword=word;
        String poip="";
        try {
    fs = new FileInputStream(lword);
    hdoc=new HWPFDocument(fs);
    extractor = new WordExtractor(hdoc);
    poip=extractor.getText();
    
    try{
       fs.close();
    extractor.close();
    }
                catch(Exception be)
                {
                    log.append(be.getMessage()+newline);
                }
        } catch(IOException se) {
            log.append(se.getMessage()+newline);
          }
        catch(Exception ee){
            log.append(ee.getMessage()+newline);
        }
     return poip;   
    }
    public boolean handleEvent(Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            if (inAnApplet) {
                dispose();
                return true;
            } else {
                System.exit(0);
            }
        }   
        return super.handleEvent(e);
    }

    public static void main(String args[]) {
        DocReader window = new DocReader();
        window.inAnApplet = false;
        window.setTitle("Doc, Docx in java");
        window.setSize(1200, 650);
        window.show();
    }
}
 