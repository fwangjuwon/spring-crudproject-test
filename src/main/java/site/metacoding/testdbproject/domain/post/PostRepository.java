package site.metacoding.testdbproject.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//POSTREPOSITORY는 POST오브젝트만 리턴받을 수 있다. (DB로부터)
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}