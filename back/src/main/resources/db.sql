-- Insérer un fournisseur (provider) dans la table "provider"
INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(3, 'Stéphanie', 'Chambon','schambon', 'stéphanie@chambon.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75001', 'Paris', '1 rue de Paris', '0123456789', NOW(), NOW(), FALSE, 'images/providers/manucure/5.jpeg', 'French, English', "Bienvenue chez Rose Eclat Manucure, votre havre de beauté pour des ongles parfaits. Nous proposons des services personnalisés : manucures classiques, poses d’ongles en gel, nail art sophistiqué, et soins des mains. Dans une ambiance douce et relaxante, profitez d'un moment de bien-être avec des produits de qualité. Sublimez vos mains avec élégance et style !", 4, 18, "1111100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(4, 'Lara', 'Gondin', 'lgondin', 'lara@gondin.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/manucure/7.jpeg', 'Spanish, English', "Chez Onglissime Studio, vos mains méritent le meilleur. Spécialistes en manucure et stylisme ongulaire, nous offrons des prestations variées : vernis semi-permanent, extensions en résine, nail art créatif et soins nourrissants. Dans un cadre moderne et chaleureux, notre équipe experte transforme vos ongles en véritables œuvres d'art. Redécouvrez la beauté au bout des doigts !", 4.5, 10, "0110100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(5, 'Sylvain', 'Verzeaux', 'sverzeaux', 'sylvain@verzeaux.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/manucure/1.jpeg', 'Spanish, English', "Sylvain Nails est le salon dédié à la beauté de vos ongles. Que ce soit pour une manucure raffinée, une pose de vernis longue tenue, ou un design artistique unique, nous réalisons vos envies avec soin et précision. Dans une atmosphère chic et apaisante, offrez à vos mains un éclat irrésistible. Parce que chaque détail compte, sublimez votre style chez Sylvain Nails.", 5, 2, "1111111");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(6, 'Claire', 'Dupont', 'cdupont', 'claire@dupont.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/coiffure/4.jpeg', 'Spanish, English', "L'Atelier de la Coiffure est un espace où créativité et expertise se rencontrent pour sublimer vos cheveux. Nous vous proposons des coupes modernes, des coiffures tendances, ainsi que des soins capillaires adaptés à vos besoins. Notre équipe de coiffeurs professionnels, dirigée par Claire Dupont, met un point d'honneur à offrir une expérience personnalisée, dans une ambiance conviviale et stylée. Confiez vos cheveux à des mains expertes pour un résultat éclatant de beauté !", 3.7, 9, "0110100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(7, 'Martin', 'Slurp', 'mslurp', 'martin@slurp.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/coiffure/8.jpeg', 'Spanish, English', "Le Salon Élégance est votre destination incontournable pour des coiffures raffinées et personnalisées. Que vous souhaitiez une coupe tendance, une couleur éclatante ou une mise en forme parfaite, nos coiffeurs professionnels, dirigés par Martin Slurp, sont là pour réaliser toutes vos envies. Dans une ambiance chaleureuse et moderne, nous vous offrons des soins capillaires de qualité pour des cheveux éclatants de santé et de beauté. Venez vivre une expérience unique et laissez-nous sublimer votre coiffure !", 1.8, 64, "1010100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(8, 'Julie', 'Lefèvre', 'jlefèvre', 'julie@lefèvre.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/coiffure/9.jpeg', 'Spanish, English', "Les Ciseaux de Soie est un salon de coiffure où chaque client bénéficie d’une attention particulière et d’un service sur-mesure. Nous vous proposons des coupes élégantes, des colorations sur mesure et des coiffures stylées, adaptées à vos envies et à votre personnalité. Sous la direction de Julie Lefèvre, notre équipe de professionnels passionnés met un point d'honneur à sublimer vos cheveux tout en respectant leur nature. Venez découvrir l’art de la coiffure dans une atmosphère moderne et relaxante.", 3.8, 17, "1101100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(9, 'Amelie', 'Laurent', 'alaurent', 'amelie@laurent.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/maquillage/3.jpeg', 'Spanish, English', "Éclat et Sublime est votre salon dédié à l'art du maquillage. Que ce soit pour un maquillage de tous les jours ou pour un événement spécial, nous vous offrons des services sur mesure pour mettre en valeur votre beauté naturelle. Sous la direction de Amélie Laurent, notre équipe de maquilleurs professionnels utilise des produits de haute qualité pour un résultat impeccable et durable. Venez découvrir une expérience beauté unique dans un cadre élégant et raffiné, où chaque détail compte pour révéler votre éclat.", 5.2, 81, "0100100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(10, 'Chloé', 'Dubois', 'cdubois', 'chloé@dubois.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/maquillage/2.jpeg', 'Spanish, English', "Le Studio Glam est un lieu où la beauté prend vie à travers le maquillage. Nous vous proposons des prestations sur mesure, adaptées à toutes vos occasions : maquillage de jour, de soirée, ou pour un événement particulier. Sous la direction de Chloé Dubois, notre équipe d'experts met tout son savoir-faire à votre service pour un résultat naturel ou spectaculaire selon vos envies. Venez vivre une expérience beauté dans une ambiance moderne et stylée, et laissez-nous sublimer vos traits avec professionnalisme et élégance.", 3.6, 23, "1111100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(11, 'Valérie', 'Francesco', 'vfrancesco', 'valérie@francesco.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/extensionCils/3.jpeg', 'Spanish, English', "Boudoir du Regard est votre refuge dédié à l'art du regard. Nous vous proposons des services de maquillage permanent, extension de cils, épilation des sourcils et rehaussement de cils pour sublimer votre regard au quotidien. Sous la direction de Valérie Francesco, notre équipe d'experts met à votre disposition des techniques innovantes pour un regard intense et naturel. Plongez dans un univers raffiné et intime où chaque détail est pensé pour magnifier votre beauté et révéler la puissance de votre regard.", 2.7, 4, "1111111");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(12, 'Elodie', 'Dupuis', 'edupuis', 'elodie@dupuis.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/epilation/5.jpeg', 'Spanish, English', "Doux Éclat est votre salon spécialisé dans l'épilation, où confort et efficacité se rencontrent. Nous vous offrons des services d'épilation traditionnelle, au cire, ainsi que des épilations à la lumière pulsée, pour une peau lisse et soyeuse en toute douceur. Sous la direction de Élodie Dupuis, notre équipe de professionnelles utilise des produits de qualité pour un soin optimal. Venez vivre une expérience relaxante et sans douleur, dans une ambiance chaleureuse et apaisante. Sublimez votre peau avec Doux Éclat.", 4.1, 7, "1101100");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(13, 'Caroline', 'Martinez', 'cmartinez', 'caroline@martinez.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/epilation/5.jpeg', 'Spanish, English', "Chez Sublime Épilation, nous nous engageons à offrir une expérience d'épilation douce et efficace, adaptée à toutes vos besoins. Que ce soit pour une épilation classique, au sucre, ou à la cire chaude, notre équipe de professionnelles, dirigée par Caroline Martinez, prend soin de vous dans une ambiance chaleureuse et apaisante. Avec des produits de qualité, nous garantissons un soin minutieux pour une peau parfaitement lisse et éclatante. Venez découvrir notre expertise et profitez de moments de bien-être.", 3, 3, "0111110");

INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image, languages, description, note, nb_opinions, dispo)
VALUES
(14, 'Nathalie', 'Rousseau', 'nrousseau', 'nathalie@rousseau.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '2 rue de Paris', '0987654321', NOW(), NOW(), FALSE, 'images/providers/soins/1.jpeg', 'Spanish, English', "Essence de Soins est un véritable havre de paix où la beauté et le bien-être se rencontrent. Nous proposons une gamme complète de soins du visage, du corps, ainsi que des massages relaxants, pour répondre à vos besoins spécifiques. Sous la direction de Nathalie Rousseau, notre équipe de professionnels vous accueille dans un cadre apaisant, avec des produits haut de gamme et des techniques de soin adaptées à votre peau. Venez vivre une expérience sensorielle unique et repartez avec une sensation de fraîcheur et de sérénité.", 4.9, 19, "1111110");


-- Insérer un client (client) dans la table "client"
INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image)
VALUES
(30, 'Alice', 'Brown','abrown', 'alice@brown.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75001', 'Paris', '5 rue de Paris', '0123456789', NOW(), NOW(), FALSE, '');

-- Insérer un autre client
INSERT INTO user
(id,  firstname, lastname, username, email, password, postal_code, city, address, telephone, created_at, updated_at, blacklisted, url_image)
VALUES
(31, 'Bob', 'Green','bgreen', 'bob@green.com', '$2a$10$zcNTnu0oybHFsRja1nsrNOCq0fSAvDC5YeOkpgOvrOsWH6uShWIM2', '75002', 'Paris', '10 rue de Paris', '0987654321', NOW(), NOW(), FALSE, '');

INSERT INTO categorie (id, categorie_service, url_image) VALUES
(1, 'Manucure', 'images/categories/Manucure_Light_Mode.webp'),
(2, 'Épilation', 'images/categories/Epilation_Light_Mode.webp'),
(3, 'Coiffure', 'images/categories/Coiffure_Light_Mode.webp'),
(4, 'Maquillage', 'images/categories/Maquillage_Light_Mode.webp'),
(5, 'Extension de cils', 'images/categories/Extension_de_cils_Light_Mode.webp'),
(6, 'Soin', 'images/categories/Soins_Light_Mode.webp');

INSERT INTO beauty_service (id, name, price, category_id, user_id) VALUES
(1, 'Manucure', '25.00', 1, 3),
(2, 'Manucure', '30.00', 1, 4),
(3, 'Manucure', '30.00', 1, 5),
(4, 'Coiffure', '30.00', 3, 6),
(5, 'Coiffure', '40.00',  3, 7),
(6, 'Coiffure', '10.00',  3, 8),
(7, 'Maquillage', '10.00',  4, 9),
(8, 'Maquillage', '100.00',  4, 10),
(9, 'Extension de cils', '40.00',  5, 11),
(10, 'Épilation', '50.00',  2, 12),
(11, 'Épilation', '50.00',  2, 13),
(12, 'Soin', '50.00',  2, 14);

INSERT INTO reservation (id, client_id, provider_id, reservation_date, beauty_service_id)
VALUES (1, 30, 3, '2024-11-29 10:10', 1);

INSERT INTO reservation (id, client_id, provider_id, reservation_date, beauty_service_id)
VALUES (2, 31, 4, '2024-11-30 10:15', 4);

INSERT INTO reservation (id, client_id, provider_id, reservation_date, beauty_service_id)
VALUES (3, 31, 5, '2024-12-01 10:20', 1);

INSERT INTO user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO user_role (user_id, role_id) VALUES (4, 1);
INSERT INTO user_role (user_id, role_id) VALUES (5, 1);
INSERT INTO user_role (user_id, role_id) VALUES (6, 1);
INSERT INTO user_role (user_id, role_id) VALUES (7, 1);
INSERT INTO user_role (user_id, role_id) VALUES (8, 1);
INSERT INTO user_role (user_id, role_id) VALUES (9, 1);
INSERT INTO user_role (user_id, role_id) VALUES (10, 1);
INSERT INTO user_role (user_id, role_id) VALUES (11, 1);
INSERT INTO user_role (user_id, role_id) VALUES (12, 1);
INSERT INTO user_role (user_id, role_id) VALUES (13, 1);
INSERT INTO user_role (user_id, role_id) VALUES (14, 1);
INSERT INTO user_role (user_id, role_id) VALUES (30, 2);
INSERT INTO user_role (user_id, role_id) VALUES (31, 2);
