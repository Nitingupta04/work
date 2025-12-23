package com.ecommerce.repository;

import com.ecommerce.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    
    Page<Review> findByProductId(Long productId, Pageable pageable);
    
    Page<Review> findByUserId(Long userId, Pageable pageable);
    
    Page<Review> findByProductIdAndRating(Long productId, Integer rating, Pageable pageable);
    
    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.product.id = :productId")
    Double getAverageRatingByProduct(@Param("productId") Long productId);
    
    @Query("SELECT COUNT(r) FROM Review r WHERE r.product.id = :productId")
    Long getReviewCountByProduct(@Param("productId") Long productId);
    
    @Query("SELECT r FROM Review r WHERE r.product.id = :productId ORDER BY r.helpfulCount DESC")
    List<Review> findTopReviewsByProduct(@Param("productId") Long productId, Pageable pageable);
    
    @Query("SELECT r FROM Review r WHERE r.rating >= :minRating")
    Page<Review> findByMinRating(@Param("minRating") Integer minRating, Pageable pageable);
    
    @Query("SELECT r FROM Review r WHERE r.isVerifiedPurchase = true")
    Page<Review> findVerifiedReviews(Pageable pageable);
    
    List<Review> findTop10ByOrderByCreatedAtDesc();
}
