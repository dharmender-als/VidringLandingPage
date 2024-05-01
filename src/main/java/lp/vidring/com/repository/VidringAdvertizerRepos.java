package lp.vidring.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lp.vidring.com.model.VidringAdvertizerModel;

public interface VidringAdvertizerRepos extends JpaRepository<VidringAdvertizerModel, Long> {

	VidringAdvertizerModel findByAliasAndStatus(String alias, boolean b);

}
