-- Insérer un client (client) dans la table "client"
INSERT INTO client
(id, name, surname, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, profile_photo)
VALUES
(1, 'Alice', 'Brown', 'alicebrown@example.com', 'password123', '75001', 'Paris', '5 rue de Paris', '0123456789', NOW(), NOW(), FALSE, NULL);

-- Insérer un autre client
INSERT INTO client
(id, name, surname, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, profile_photo)
VALUES
(2, 'Bob', 'Green', 'bobgreen@example.com', 'password456', '75002', 'Paris', '10 rue de Paris', '0987654321', NOW(), NOW(), FALSE, NULL);
