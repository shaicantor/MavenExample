package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class BitShiftDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    i++;
    return 0;
  }

  public long doDouble2(int i) {
    return 0;
  }

  public long doDouble3(int i) {
    return 2;
  }
}
