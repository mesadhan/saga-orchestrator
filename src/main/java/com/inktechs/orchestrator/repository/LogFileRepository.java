package com.inktechs.orchestrator.repository;

import com.inktechs.orchestrator.model.LogFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogFileRepository extends JpaRepository<LogFile, Integer> {
}
