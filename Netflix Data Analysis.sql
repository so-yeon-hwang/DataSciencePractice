-- Netflix Project 

CREATE TABLE TABLE netflix
(
show_id 	
type	
title	
director	
cast	
country	date_added	
release_year	
rating	
duration	
listed_in	
description
)

SELECT * FROM Netflix;

SELECT COUNT(*) AS total_content FROM Netflix;

-- 1. Count the number of Movies and TV shows

SELECT type, COUNT(*)
FROM Netflix
GROUP BY type

-- 2. Find the most common rating for movies and TV shows

SELECT * FROM Netflix

WITH sub AS (SELECT type, rating, COUNT(*) AS count,
		RANK() OVER (PARTITION BY type ORDER BY COUNT(*) DESC) AS ranking
		FROM Netflix
		GROUP BY type, rating)
		
SELECT type, rating, count 
FROM sub 
WHERE ranking = 1 


-- 3. List all movies released in 2015

SELECT * FROM Netflix

SELECT title -- ,type, release_year
FROM Netflix
WHERE type = 'Movie' AND release_year = 2015

-- 4. Find the top 5 countries with the most content on Netflix 

SELECT * FROM Netflix

SELECT country, COUNT(*) AS count
FROM Netflix 
GROUP BY country
ORDER BY count DESC
LIMIT 5

SELECT COUNT(*) FROM Netflix -- 8807

-- 6. Find the content added in the last 5 years

SELECT * FROM Netflix

SELECT title, type, release_year
FROM Netflix
WHERE release_year BETWEEN 2020 AND 2025
ORDER BY releas











