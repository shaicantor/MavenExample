package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class AdditionDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    return i + i;
  }

  public long doDouble2(int i) {
    return i + i;
  }

  public long doDouble3(int i) {
    return i + 3;
  }

  public long doDouble4(int i) {
    return i + 2;
  }
}

