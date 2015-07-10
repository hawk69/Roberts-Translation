/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robert.translation.database;

/**
 *
 * @author Stippler
 */
public class SysValuesModell extends Modell
{

  @Override
  public void setHeadder()
  {
    String[] headder={"KKZ","KName","KName2","KAdr1","Kadr2","PLZOrt","Land","Tel","UID"};
    super.headder=headder;
  }
  

  @Override
  public Object getValueAt(int i, int i1)
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
