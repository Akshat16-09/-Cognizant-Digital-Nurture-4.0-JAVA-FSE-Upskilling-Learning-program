SELECT e.title AS event_title, COUNT(s.session_id) AS session_count
FROM Events e
JOIN Sessions s ON e.event_id = s.event_id
WHERE TIME(s.start_time) BETWEEN '10:00:00' AND '11:59:59'
GROUP BY e.event_id;
