package dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO

//METHOD TO HANDLE ALL DATABASE RELATED OPERATIONS
{
	static List<Skill> list=new ArrayList<Skill>();

	public List< Skill > listAllSkills() throws Exception
	{
		Connection con = ConnectionManager.getConnection();

		Statement statement=  con.createStatement();

		ResultSet resultset =statement.executeQuery("select * from SKILL ");
		
		while(resultset.next())
		{

			long id=resultset.getLong(1);
			String name=resultset.getString(2);
			Skill skill=new Skill(id,name);
			
			list.add(skill);

		}

		return list;


	}




}


