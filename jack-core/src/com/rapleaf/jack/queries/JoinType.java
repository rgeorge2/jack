package com.rapleaf.jack.queries;

public enum JoinType {
  LEFT_JOIN("LEFT JOIN"), RIGHT_JOIN("RIGHT JOIN"), INNER_JOIN("INNER JOIN");

  private String joinType;

  private JoinType(String joinType) {
    this.joinType = joinType;
  }

  public String getSqlKeyword() {
    return this.joinType;
  }
}
