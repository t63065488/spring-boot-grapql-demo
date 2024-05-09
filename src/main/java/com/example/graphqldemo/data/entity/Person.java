package com.example.graphqldemo.data.entity;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
@Builder
public class Person {
  @Id private UUID id;

  private String name;
}
