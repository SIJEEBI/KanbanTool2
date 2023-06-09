package com.projectkanban.kanbantool.KanbanTool2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsernameAlreadyExistsException extends RuntimeException {

	public UsernameAlreadyExistsException(String message) {
        super(message);
    }
	
}
