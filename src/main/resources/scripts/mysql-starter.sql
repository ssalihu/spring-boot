create database myapp; -- Create the new database
create user 'springuser'@'localhost' identified by 'spring123'; -- Creates the user
grant all privileges on myapp.* to 'springuser'@'localhost' with grant option -- Gives all the privileges to the new user on the newly created database