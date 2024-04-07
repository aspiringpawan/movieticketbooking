CREATE TABLE IF NOT EXISTS `movie` (
  `movie_id` int AUTO_INCREMENT  PRIMARY KEY,
  `title` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `audio` varchar(20) NOT NULL,
  `release_date` DATE NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS `booking` (
  `booking_id` int AUTO_INCREMENT  PRIMARY KEY,
  `amount` int NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS `city` (
  `city_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `zipcode` int NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS `screen` (
  `screen_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(20) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS `seat` (
  `seat_id` int AUTO_INCREMENT  PRIMARY KEY,
  `seat_number` varchar(20) NOT NULL,
  `is_booked` boolean NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS `show` (
  `show_id` int AUTO_INCREMENT  PRIMARY KEY,
  `show_data` DATE NOT NULL,
  `start_time` TIME NOT NULL,
  `end_time` TIME NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS `theatre` (
  `theatre_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `total_screens` int NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile_number` int NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date DEFAULT NULL
);