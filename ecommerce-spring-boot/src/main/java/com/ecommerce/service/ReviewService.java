package com.ecommerce.service;

import com.ecommerce.entity.Review;
import com.ecommerce.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService {
    
    private final ReviewRepository reviewRepository;
    
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
    
    public Page<Review> getAllReviews(Pageable pageable) {
        return reviewRepository.findAll(pageable);
    }
    
    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }
    
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }
    
    public Review updateReview(Long id, Review reviewDetails) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found"));
        
        review.setRating(reviewDetails.getRating());
        review.setTitle(reviewDetails.getTitle());
        review.setComment(reviewDetails.getComment());
        review.setHelpfulCount(reviewDetails.getHelpfulCount());
        
        return reviewRepository.save(review);
    }
    
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
    
    public Page<Review> getReviewsByProduct(Long productId, Pageable pageable) {
        return reviewRepository.findByProductId(productId, pageable);
    }
    
    public Page<Review> getReviewsByUser(Long userId, Pageable pageable) {
        return reviewRepository.findByUserId(userId, pageable);
    }
    
    public Page<Review> getReviewsByProductAndRating(Long productId, Integer rating, Pageable pageable) {
        return reviewRepository.findByProductIdAndRating(productId, rating, pageable);
    }
    
    public Double getAverageRatingByProduct(Long productId) {
        return reviewRepository.getAverageRatingByProduct(productId);
    }
    
    public Long getReviewCountByProduct(Long productId) {
        return reviewRepository.getReviewCountByProduct(productId);
    }
    
    public List<Review> getTopReviewsByProduct(Long productId, Pageable pageable) {
        return reviewRepository.findTopReviewsByProduct(productId, pageable);
    }
    
    public Page<Review> getReviewsByMinRating(Integer minRating, Pageable pageable) {
        return reviewRepository.findByMinRating(minRating, pageable);
    }
    
    public Page<Review> getVerifiedReviews(Pageable pageable) {
        return reviewRepository.findVerifiedReviews(pageable);
    }
    
    public List<Review> getLatestReviews() {
        return reviewRepository.findTop10ByOrderByCreatedAtDesc();
    }
}
