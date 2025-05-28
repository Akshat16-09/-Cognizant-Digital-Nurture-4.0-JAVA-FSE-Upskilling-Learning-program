SELECT e.title, AVG(f.rating) AS avg_rating, COUNT(f.feedback_id) AS total_feedbacks
FROM Events e
JOIN Feedback f ON e.event_id = f.event_id
GROUP BY e.event_id
HAVING COUNT(f.feedback_id) >= 10
ORDER BY avg_rating DESC;
