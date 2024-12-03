-- Insérer un fournisseur (provider) dans la table "provider"
INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(3, 'John', 'Doe','DoeU', 'johndoe@example.com', 'password123', '75001', 'Paris', '1 rue de Paris', '0123456789', NOW(), NOW(), FALSE, '', 'French, English', 'Experienced provider specializing in beauty services', 4, 18, "1111100");

-- Insérer un autre fournisseur
INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(4, 'Jane', 'Smith', 'SmithU', 'janesmith@example.com', 'password456', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, '', 'Spanish, English', 'Beauty expert offering a wide range of services', 4.5, 10, "0110100");


-- Insérer un client (client) dans la table "client"
INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image)
VALUES
(5, 'Alice', 'Brown','BrownU', 'alicebrown@example.com', 'password123', '75001', 'Paris', '5 rue de Paris', '0123456789', NOW(), NOW(), FALSE, '');

-- Insérer un autre client
INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image)
VALUES
(6, 'Bob', 'Green','GreenU', 'bobgreen@example.com', 'password456', '75002', 'Paris', '10 rue de Paris', '0987654321', NOW(), NOW(), FALSE, '');


INSERT INTO categorie (id, categorie_service, url_image) VALUES
(1, 'Manucure', ''),
(2, 'Épilation', ''),
(3, 'Coiffure', ''),
(4, 'Maquillage', ''),
(5, 'Extension de cils', ''),
(6, 'Soin', '');


INSERT INTO beauty_service (id, name, price, category_id, user_id) VALUES
(1, 'Manicure', '25.00', 1, 1),
(2, 'Pedicure', '30.00', 1, 1),
(3, 'Haircut', '40.00',  2, 2),
(4, 'Hair coloring', '70.00', 2, 2);

INSERT INTO reservation (id, client_id, provider_id, reservation_date)
VALUES (1, 1, 2, '2024-11-29');

INSERT INTO reservation (id, client_id, provider_id, reservation_date)
VALUES (2, 2, 1, '2024-11-30');

INSERT INTO reservation (id, client_id, provider_id, reservation_date)
VALUES (3, 1, 1, '2024-12-01');

INSERT INTO user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO user_role (user_id, role_id) VALUES (4, 1);
INSERT INTO user_role (user_id, role_id) VALUES (5, 2);
INSERT INTO user_role (user_id, role_id) VALUES (6, 2);
