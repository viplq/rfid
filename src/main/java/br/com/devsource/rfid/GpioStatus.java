package br.com.devsource.rfid;

/**
 * @author Guilherme Pacheco
 */
public enum GpioStatus {

  ON,
  OFF;

  public GpioStatus reverse() {
    return equals(ON) ? OFF : ON;
  }

}