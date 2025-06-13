package com.studycrew.studyBoard.repository;

import com.studycrew.studyBoard.entity.StudyPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyPostRepository extends JpaRepository<StudyPost, Long> {
}
