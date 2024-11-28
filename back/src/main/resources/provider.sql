-- Insérer un fournisseur (provider) dans la table "provider"
INSERT INTO provider
(id, name, surname, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, profile_photo, languages, description)
VALUES
(1, 'John', 'Doe', 'johndoe@example.com', 'password123', '75001', 'Paris', '1 rue de Paris', '0123456789', NOW(), NOW(), FALSE, NULL, 'French, English', 'Experienced provider specializing in beauty services');

-- Insérer un autre fournisseur
INSERT INTO provider
(id, name, surname, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, profile_photo, languages, description)
VALUES
(2, 'Jane', 'Smith', 'janesmith@example.com', 'password456', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, NULL, 'Spanish, English', 'Beauty expert offering a wide range of services');
