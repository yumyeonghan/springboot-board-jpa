package com.programmers.domain.post.application;

import com.programmers.domain.post.ui.dto.PostCreateDto;
import com.programmers.domain.post.ui.dto.PostResponseDto;
import com.programmers.domain.post.ui.dto.PostUpdateDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {

    Long createPost(PostCreateDto postCreateDto);

    PostResponseDto findPost(Long postId);

    List<PostResponseDto> findAll(Pageable pageable);

    PostResponseDto updatePost(PostUpdateDto postUpdateDto, Long postId);
}
