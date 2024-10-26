package com.bijuli.whatsappClone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SendMessageRequest {

  private Integer userId;
  private Integer chatId;
  private String content;

}
