/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robert.translation.database;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stippler
 */
public abstract class Modell extends AbstractTableModel
{
  protected String[] headder;
  
  protected LinkedList<Kunde> kunden=new LinkedList();
  
  public Modell()
  {
    setHeadder();
  }
  
  public abstract void setHeadder();
  
  @Override
  public String getColumnName(int i)
  {
    return headder[i];
  }
  
  @Override
  public int getRowCount()
  {
    return kunden.size();
  }

  @Override
  public int getColumnCount()
  {
    return headder.length;
  }
  
}
