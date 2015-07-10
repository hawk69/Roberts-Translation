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
public class Kunde
{
  private String kkz;
  private String KName;
  private String KName2;
  private String KAdr1;
  private String KAdr2;
  private String PLZOrt;
  private String Land;
  private String Tel;
  private String UID;

  public Kunde(String kkz, String KName, String KName2, String KAdr1, String KAdr2, String PLZOrt, String Land, String Tel, String UID)
  {
    this.kkz = kkz;
    this.KName = KName;
    this.KName2 = KName2;
    this.KAdr1 = KAdr1;
    this.KAdr2 = KAdr2;
    this.PLZOrt = PLZOrt;
    this.Land = Land;
    this.Tel = Tel;
    this.UID = UID;
  }

  public String getKkz()
  {
    return kkz;
  }

  public void setKkz(String kkz)
  {
    this.kkz = kkz;
  }

  public String getKName()
  {
    return KName;
  }

  public void setKName(String KName)
  {
    this.KName = KName;
  }

  public String getKName2()
  {
    return KName2;
  }

  public void setKName2(String KName2)
  {
    this.KName2 = KName2;
  }

  public String getKAdr1()
  {
    return KAdr1;
  }

  public void setKAdr1(String KAdr1)
  {
    this.KAdr1 = KAdr1;
  }

  public String getKAdr2()
  {
    return KAdr2;
  }

  public void setKAdr2(String KAdr2)
  {
    this.KAdr2 = KAdr2;
  }

  public String getPLZOrt()
  {
    return PLZOrt;
  }

  public void setPLZOrt(String PLZOrt)
  {
    this.PLZOrt = PLZOrt;
  }

  public String getLand()
  {
    return Land;
  }

  public void setLand(String Land)
  {
    this.Land = Land;
  }

  public String getTel()
  {
    return Tel;
  }

  public void setTel(String Tel)
  {
    this.Tel = Tel;
  }

  public String getUID()
  {
    return UID;
  }

  public void setUID(String UID)
  {
    this.UID = UID;
  }

}
