package lp.vidring.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lp.vidring.com.model.VidringLpTransactionModel;

public interface VidringLpTransactionRepos extends JpaRepository<VidringLpTransactionModel, Long> {

}
