package kudangkoding.gamifikasi.repositories;

import kudangkoding.gamifikasi.models.VwPlaylistUserViewVideoWithTotalRuntime;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VwPlaylistUserViewVideoRepository extends PagingAndSortingRepository<VwPlaylistUserViewVideoWithTotalRuntime, String>, QuerydslPredicateExecutor<VwPlaylistUserViewVideoWithTotalRuntime> {
}