package com.lmsProject.services;

import com.lmsProject.model.Borrowing;

public interface BorrowingService {
	
	Borrowing borrowBook(Long bookId,Long memberId);
	
	Borrowing returnBook(Long borrowingId);

}
