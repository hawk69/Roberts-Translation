/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robert.translation;

/**
 *
 * @author Stippler
 */
public class DokumentenAnzeige
{
  private String dokumentenBezeichnung;
  private int originalLineCount;
  private int lineCount;
  private int wordCount;
  private int characterCount;

  public DokumentenAnzeige(String dokumentenBezeichnung, int originalLineCount, int lineCount, int wordCount, int characterCount)
  {
    this.dokumentenBezeichnung = dokumentenBezeichnung;
    this.originalLineCount = originalLineCount;
    this.lineCount = lineCount;
    this.wordCount = wordCount;
    this.characterCount = characterCount;
  }

  public String getDokumentenBezeichnung()
  {
    return dokumentenBezeichnung;
  }

  public void setDokumentenBezeichnung(String dokumentenBezeichnung)
  {
    this.dokumentenBezeichnung = dokumentenBezeichnung;
  }

  public int getOriginalLineCount()
  {
    return originalLineCount;
  }

  public void setOriginalLineCount(int originalLineCount)
  {
    this.originalLineCount = originalLineCount;
  }

  public int getLineCount()
  {
    return lineCount;
  }

  public void setLineCount(int lineCount)
  {
    this.lineCount = lineCount;
  }

  public int getWordCount()
  {
    return wordCount;
  }

  public void setWordCount(int wordCount)
  {
    this.wordCount = wordCount;
  }

  public int getCharacterCount()
  {
    return characterCount;
  }

  public void setCharacterCount(int characterCount)
  {
    this.characterCount = characterCount;
  }
}
