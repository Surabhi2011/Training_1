package org.shl.testng.SHL_Prj1;

import org.testng.annotations.Test;

import ExcelUtilities.Scenario5;

public class TestScript5 {
  @Test
  public void readExcel() {
  Scenario5 scenario=new Scenario5();
  scenario.read_Excel();
  }
}
