INSERT INTO "user" (id, name, email, password)
VALUES (1, 'umur', 'uinan@miu.edu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO "user" (id, name, email, password)
VALUES (2, 'vj', 'vj@miu.edu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO role (id, role)
VALUES (1, 'ADMIN');
INSERT INTO role (id, role)
VALUES (2, 'CLIENT');

INSERT INTO user_roles (user_id, roles_id)
VALUES (1, 1);
INSERT INTO user_roles (user_id, roles_id)
VALUES (2, 2);

-- INSERT INTO post (id, title, author, content, user_id)
-- VALUES (1, 'Marvel', 'Stan Lee', 'Iron man and Spider-man will visit the park.', 1);
-- INSERT INTO post (id, title, author, content, user_id)
-- VALUES (2, 'Disney', 'Smith Ran', 'Massive fight scene in Florida airport.', 1);
-- INSERT INTO post (id, title, author, content, user_id)
-- VALUES (3, 'LALA land', 'Tom Slik', 'all cartoon character play in concert stage', 2);
--
-- INSERT INTO comment (id,comment, name, post_id)
-- VALUES (1, 'Smith Ran','great', 1);
-- INSERT INTO comment (id,comment, name, post_id)
-- VALUES (2, 'Tom Slik', 'Gonna be a great event', 2);
-- INSERT INTO comment (id,comment, name, post_id)
-- VALUES (3, 'Smith Ran','Too exited to play', 3);