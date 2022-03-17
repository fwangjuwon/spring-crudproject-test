package site.metacoding.testdbproject.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testdbproject.domain.post.Post;
import site.metacoding.testdbproject.domain.post.PostRepository;
import site.metacoding.testdbproject.domain.user.User;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public Page<Post> 글목록보기(Integer page) {
        PageRequest pq = PageRequest.of(page, 3);
        return postRepository.findAll(pq);
    }

    public Post 글상세보기(Integer id) {
        Optional<Post> postOp = postRepository.findById(id);

        if (postOp.isPresent()) {
            Post postEntity = postOp.get();
            return postEntity;
        } else {
            return null;
        }
    }

    public void 글수정하기() {

    }

    public void 글삭제하기() {

    }

    public void 글쓰기(Post post, User principal) {
        post.setUser(principal);
        postRepository.save(post);
    }
}
