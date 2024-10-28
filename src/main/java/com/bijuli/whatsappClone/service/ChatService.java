package com.bijuli.whatsappClone.service;

import java.util.List;

import com.bijuli.whatsappClone.dto.GroupChatRequest;
import com.bijuli.whatsappClone.exception.ChatException;
import com.bijuli.whatsappClone.exception.UserException;
import com.bijuli.whatsappClone.model.Chat;
import com.bijuli.whatsappClone.model.User;

public interface ChatService {

  public Chat createChat(User reqUser, Integer userId) throws UserException;

  public Chat findChatById(Integer chatId) throws ChatException;

  public List<Chat> findAllChatByUserId(Integer userId) throws UserException;

  public Chat createGroup(GroupChatRequest req, User reqUser) throws UserException;

  public Chat addUserToGroup(Integer userId, Integer chatId, User reqUser) throws UserException, ChatException;

  public Chat renameGroup(Integer chatId, String groupName, User reqUser) throws ChatException, UserException;

  public Chat removeFromGroup(Integer chatId, Integer userId, User reqUser) throws UserException, ChatException;

  public void deleteChat(Integer chatId, Integer userId) throws ChatException, UserException;

}