-- -------------------------------------------------------------
-- TablePlus 5.5.2(512)
--
-- https://tableplus.com/
--
-- Database: mvc
-- Generation Time: 2024-04-17 11:14:23.4270
-- -------------------------------------------------------------


DROP TABLE IF EXISTS [dbo].[users];
-- This script only contains the table creation statements and does not fully represent the table in the database. It's still missing: sequences, indices, triggers. Do not use it as a backup.

CREATE TABLE [dbo].[users] (
    [id] bigint,
    [username] varchar(255),
    [password] varchar(255),
    [description] text,
    [registeredAt] datetime,
    [avatar] varchar(255),
    PRIMARY KEY ([id])
);

INSERT INTO [dbo].[users] ([id], [username], [password], [description], [registeredAt], [avatar]) VALUES
('1', N'xtj7', N'$2a$12$qq5Qd2AvUSC/7rHpM6ptMOh4oqz1cl8veKeIZQJkbHMrSFK7lbKL6', N'this is a description', '2024-04-17 02:12:32.350', N'https://cdn.discordapp.com/avatars/425413610223697921/7c6ae8e20eaa383ab725e2c136d21186.webp?size=128'),
('2', N'pods', N'$2a$12$Uk2gGI/GHeO8zQZg0l7MeOUfBzH4rWkmSQbdU9i4Ogr6IATEJyRwW', N'another description', '2024-04-17 02:12:32.350', N'https://cdn.discordapp.com/avatars/584098451260833845/c1ba0f77b2879b2e6cb7668a147b28f8.webp?size=128');
