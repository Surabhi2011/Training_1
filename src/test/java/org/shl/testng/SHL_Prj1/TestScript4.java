package org.shl.testng.SHL_Prj1;

import org.testng.annotations.Test;

import ExcelUtilities.Scenario4;

public class TestScript4 {
  @Test
  public void readExcel() {
	  Scenario4 scenario=new Scenario4();
	  scenario.read_Excel();
  }
}
