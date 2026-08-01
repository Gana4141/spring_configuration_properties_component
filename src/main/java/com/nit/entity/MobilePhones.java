package com.nit.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "com.nit")
public class MobilePhones
{
  private long laptopPrice;
  private String laptopCompany;
  private String laptopHardisk;
}
