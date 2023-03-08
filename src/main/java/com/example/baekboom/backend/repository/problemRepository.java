package com.example.baekboom.backend.repository;

import com.example.baekboom.backend.entity.ProblemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface problemRepository extends JpaRepository<ProblemEntity, Long> {

    List<ProblemEntity> findAllByLevelAndUser(Long level, String user_id); // 크롤링할 때 사용하여 동일한 level을 제거

    // start와 end 사이에 이벤트를 검색한다.
    List<ProblemEntity> findByUserIdAndEventTimeBetween(String user_id, LocalDateTime startTime, LocalDateTime endTime);
}
