
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.models;

import com.rapleaf.jack.ModelIdWrapper;

public class CommentId implements ModelIdWrapper<CommentId>{
  private final Long id;

  public CommentId(Long id){
    this.id = id;
  }

  public Long getId(){
    return this.id;
  }

  public int compareTo(CommentId other){
    return this.getId().compareTo(other.getId());
  }
}
