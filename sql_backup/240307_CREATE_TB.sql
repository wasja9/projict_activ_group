

USE [invest_nv]
GO

/****** Object:  Table [dbo].[post]    Script Date: 07.03.2024 16:46:20 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[post](
	[userId] [int] NULL,
	[id] [int] NULL,
	[title] [varchar](50) NULL,
	[body] [varchar](3000) NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO




*****************************************************************************************
*****************************************************************************************
*****************************************************************************************


USE [invest_nv]
GO

/****** Object:  Table [dbo].[users]    Script Date: 07.03.2024 16:48:38 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[users](
	[id] [int] NOT NULL,
	[firstname] [varchar](50) NULL,
	[lastname] [varchar](50) NULL,
	[status] [varchar](50) NULL,
 CONSTRAINT [PK_users] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO



*****************************************************************************************
*****************************************************************************************
*****************************************************************************************


USE [invest_nv]
GO

/****** Object:  Table [dbo].[us]    Script Date: 07.03.2024 16:49:22 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[us](
	[id] [float] NULL,
	[first_name] [varchar](50) NULL,
	[last_name] [varchar](50) NULL,
	[middle_name] [varchar](50) NULL,
	[status] [varchar](50) NULL,
	[data] [varchar](50) NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO




