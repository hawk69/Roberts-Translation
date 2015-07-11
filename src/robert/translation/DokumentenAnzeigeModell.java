/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robert.translation;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stippler
 */
public class DokumentenAnzeigeModell extends AbstractTableModel
{
  private int lineCountGesamt=0;
  
  private String headder[] =
  {
    "Dokumenten-Bezeichnung", "Lines", "OriginalLines", "Wörter", "Zeichen"
  };

  private LinkedList<DokumentenAnzeige> list = new LinkedList<>();

  public DokumentenAnzeigeModell()
  {
    System.out.println("DokumentenAnzeigeModell erstellt");
  }
  
  public void add(DokumentenAnzeige da)
  {
    list.add(da);
    lineCountGesamt+=da.getLineCount();
    fireTableDataChanged();
  }
  
  @Override
  public String getColumnName(int i)
  {
    return headder[i];
  }

  @Override
  public int getRowCount()
  {
    return list.size();
  }

  @Override
  public int getColumnCount()
  {
    return headder.length;
  }

  public int getWordCountGesamt()
  {
    int wordCountGesamt=0;
    for (DokumentenAnzeige da : list)
    {
      wordCountGesamt+=da.getWordCount();
    }
    return wordCountGesamt;
  }

  public int getCharacterCountGesamt()
  {
    int characterCountGesamt=0;
    for (DokumentenAnzeige da : list)
    {
      characterCountGesamt+=da.getCharacterCount();
    }
    return characterCountGesamt;
  }

  public int getLineCountGesamt()
  {
    return lineCountGesamt;
  }
  
  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    DokumentenAnzeige dokumentenAnzeige=list.get(rowIndex);
    switch (columnIndex)
    {
      case 0:
        return dokumentenAnzeige.getDokumentenBezeichnung();
      case 1:
        return dokumentenAnzeige.getLineCount();
      case 2:
        return dokumentenAnzeige.getOriginalLineCount();
      case 3:
        return dokumentenAnzeige.getWordCount()-1;
      case 4: 
        return dokumentenAnzeige.getCharacterCount();
    }
    return "???";
  }

}
