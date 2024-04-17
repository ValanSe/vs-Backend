package com.valanse.valanse.redis.repository;

import com.valanse.valanse.redis.entity.RefreshToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByAccessToken(String accessToken);

    Optional<RefreshToken> findByUserIdx(Integer userIdx);

}
